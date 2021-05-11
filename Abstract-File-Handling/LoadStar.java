package file.handling.java.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class LoadStar extends FileReaderab

{
	static Logger log = Logger.getLogger(LoadStar.class.getName());

	@Override
	public void fileread(File file) {

		// Store validated Records in ArrayList

		ArrayList<String> lserror = new ArrayList<>();
		ArrayList<String> lsvalid = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			String[] arr = new String[25];
			int i = 0;

			while ((line = br.readLine()) != null) {
				arr[i] = line;
				i++;

			}

			for (i = 0; i < arr.length; i++) {

				String[] aline;
				try {
					aline = arr[i].split("-");

					if (aline.length < 4) {

						lserror.add(arr[i]);

						FileWriter writer = new FileWriter(
								"C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\filehandling\\Loadstar_error.csv");

						for (String s : lserror) {

							String[] split2 = s.split(",");
							writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
							writer.write("\n");

						}

						writer.close();

					} else {

						lsvalid.add(arr[i]);

						FileWriter writer = new FileWriter("C:\\Users\\HP\\Desktop\\SRMWORK\\Java\\filehandling\\Loadstar_valid.csv");

						for (String s : lsvalid) {

							String[] split2 = s.split(",");
							writer.write(Arrays.asList(split2).stream().collect(Collectors.joining(",")));
							writer.write("\n");

						}

						writer.close();

					}
				} catch (NullPointerException e) {
					log.info("null exception");

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

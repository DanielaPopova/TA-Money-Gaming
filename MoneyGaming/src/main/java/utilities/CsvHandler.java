package utilities;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

public class CsvHandler {

	public static <T> List<T> parseToObjectList(String filePath, Class<T> clazz) throws Exception {
		var path = Paths.get(ClassLoader.getSystemResource(filePath).toURI()); 
		Reader reader = Files.newBufferedReader(path);
		
		var beans = new CsvToBeanBuilder(reader)
			       .withType(clazz)
			       .build()
			       .parse();
		reader.close();
		
		return beans;
	}
}

package dataObjects;

import com.opencsv.bean.CsvBindByName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	@CsvBindByName
	private String title;
	@CsvBindByName
	private String firstName;
	@CsvBindByName
	private String surname;
	@CsvBindByName
	private String emailAddress;
	@CsvBindByName
	private String telephone;
	@CsvBindByName
	private String mobile;
	@CsvBindByName
	private String dateOfBirth;
}

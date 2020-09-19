package dataObjects;

import com.opencsv.bean.CsvBindByName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
	@CsvBindByName
	private String username;
	@CsvBindByName
	private String password;
	@CsvBindByName
	private String securityQuestion1;
	@CsvBindByName
	private String answer1;
	@CsvBindByName
	private String securityQuestion2;
	@CsvBindByName
	private String answer2;
}

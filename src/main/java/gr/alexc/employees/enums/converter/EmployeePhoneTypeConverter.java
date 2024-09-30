package gr.alexc.employees.enums.converter;

import gr.alexc.employees.enums.EmployeePhoneType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmployeePhoneTypeConverter implements AttributeConverter<EmployeePhoneType, String> {

    @Override
    public String convertToDatabaseColumn(EmployeePhoneType employeePhoneType) {
        if (employeePhoneType == null) {
            return null;
        }
        return employeePhoneType.toString();
    }

    @Override
    public EmployeePhoneType convertToEntityAttribute(String typeString) {
        if (typeString == null) {
            return null;
        }

        return EmployeePhoneType.valueOf(typeString);
    }


}

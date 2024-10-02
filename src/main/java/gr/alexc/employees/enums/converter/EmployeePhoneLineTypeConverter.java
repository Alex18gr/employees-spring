package gr.alexc.employees.enums.converter;

import gr.alexc.employees.enums.EmployeePhoneLineType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmployeePhoneLineTypeConverter implements AttributeConverter<EmployeePhoneLineType, String> {


    @Override
    public String convertToDatabaseColumn(EmployeePhoneLineType employeePhoneLIneType) {
        if (employeePhoneLIneType == null) {
            return null;
        }
        return employeePhoneLIneType.toString();
    }

    @Override
    public EmployeePhoneLineType convertToEntityAttribute(String typeString) {
        if (typeString == null) {
            return null;
        }
        return EmployeePhoneLineType.valueOf(typeString);
    }
}

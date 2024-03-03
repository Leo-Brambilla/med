package med.control.api.doctor;

import med.control.api.address.AddressData;

public record DoctorRegistrationData(String name, String email, String crm, Specialty specialty, AddressData address) {
}

package med.control.api.controller;

import med.control.api.doctor.DoctorRegistrationData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class DoctorController {
    @PostMapping
    public void registration(@RequestBody DoctorRegistrationData data){

    }

}

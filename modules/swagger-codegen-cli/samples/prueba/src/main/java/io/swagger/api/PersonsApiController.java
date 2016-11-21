package io.swagger.api;

import com.hive.Person;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;



@Controller
public class PersonsApiController implements PersonsApi {

    public ResponseEntity<List<Person>> personsGet(@ApiParam(value = "Size of array", required = true) @RequestParam(value = "CUERPO", required = true) Double CUERPO) {
        // do some magic!
        return new ResponseEntity<List<Person>>(HttpStatus.OK);
    }

}

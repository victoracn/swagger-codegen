package io.swagger.api;

import com.hive.Person;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Api(value = "persons", description = "the persons API")
public interface PersonsApi {

    @ApiOperation(value = "", notes = "Gets `Person` objects. Optional query param of **size** determines size of returned array ", response = Person.class, responseContainer = "List", authorizations = {
        @Authorization(value = "marca"),
        @Authorization(value = "OauthSecurity", scopes = {
            
            }),
        @Authorization(value = "DNI"),
        @Authorization(value = "pais")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Person.class) })
    @RequestMapping(value = "/persons",
        method = RequestMethod.GET)
    ResponseEntity<List<Person>> personsGet(@ApiParam(value = "Size of array", required = true) @RequestParam(value = "CUERPO", required = true) Double CUERPO);

}

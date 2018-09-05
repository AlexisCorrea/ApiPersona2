/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ApiPersona.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import ApiPersona.model.DeleteRequest;
import ApiPersona.model.JsonApiBodyRequest;
import ApiPersona.model.JsonApiBodyRequestDelete;
import ApiPersona.model.JsonApiBodyRequestLogin;
import ApiPersona.model.JsonApiBodyResponseErrors;
import ApiPersona.model.JsonApiBodyResponseSuccess;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-27T15:31:23.413Z")

@Api(value = "registrar", description = "the registrar API")
public interface RegistrarApi {

    @ApiOperation(value = "registro de personas", nickname = "registrarPost", notes = "registro de personas clientes y administradores", response = JsonApiBodyResponseSuccess.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "persona registrada correctamente", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 400, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/registrar",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<?> registrarPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequest body);
    
    @ApiOperation(value = "obtener persona", nickname = "obtenerPost", notes = "obtener personas para la conexion de con la tabla negocio", response = JsonApiBodyResponseSuccess.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "persona registrada correctamente", response = JsonApiBodyResponseSuccess.class),
        @ApiResponse(code = 400, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/getPersona",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<?> obtenerPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestDelete body);
    
    @ApiOperation(value = "login", nickname = "loginPost", notes = "login para validar una persona", response = JsonApiBodyResponseSuccess.class, tags={ "personas", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "persona registrada correctamente", response = JsonApiBodyRequest.class),
        @ApiResponse(code = 400, message = "datos imcompletos o incorrectos", response = JsonApiBodyResponseErrors.class) })
    @RequestMapping(value = "/getLogin",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<?> loginPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody JsonApiBodyRequestLogin body);

}
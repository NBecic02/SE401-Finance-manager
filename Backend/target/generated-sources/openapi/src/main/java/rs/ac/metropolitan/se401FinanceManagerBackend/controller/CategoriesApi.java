/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package rs.ac.metropolitan.se401FinanceManagerBackend.controller;

import rs.ac.metropolitan.se401FinanceManagerBackend.model.ErrorResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetCategoriesResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Categories", description = "the Categories API")
public interface CategoriesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "List of Categories", nickname = "getCategories", notes = "Get a list of categories", response = GetCategoriesResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Categories", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all categories", response = GetCategoriesResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/categories",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetCategoriesResponse> _getCategories() {
        return getCategories();
    }

    // Override this method
    default ResponseEntity<GetCategoriesResponse> getCategories() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"categoryList\" : [ {    \"category_description\" : \"House\",    \"category_name\" : \"House\",    \"category_id\" : 1  }, {    \"category_description\" : \"House\",    \"category_name\" : \"House\",    \"category_id\" : 1  } ]}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
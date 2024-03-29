/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package rs.ac.metropolitan.se401FinanceManagerBackend.controller;

import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateIncomeRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateIncomeResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.ErrorResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetIncomeByIdResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetIncomesResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.IncomeRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateIncomeRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateIncomeResponse;
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
@Api(value = "Incomes", description = "the Incomes API")
public interface IncomesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Add new income", nickname = "createIncome", notes = "Create a new income", response = CreateIncomeResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Income created successfully", response = CreateIncomeResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CreateIncomeResponse> _createIncome(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateIncomeRequest createIncomeRequest) {
        return createIncome(createIncomeRequest);
    }

    // Override this method
    default ResponseEntity<CreateIncomeResponse> createIncome(CreateIncomeRequest createIncomeRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Delete Income By ID", nickname = "deleteIncome", notes = "Delete income by its Id value.", authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Income with specified ID is deleted"),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes/{incomeId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _deleteIncome(@ApiParam(value = "Income Id",required=true) @PathVariable("incomeId") Integer incomeId) {
        return deleteIncome(incomeId);
    }

    // Override this method
    default ResponseEntity<Void> deleteIncome(Integer incomeId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get Income By ID", nickname = "getIncomeById", notes = "Get a single **Income** by its Id value.", response = GetIncomeByIdResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Found income with specified ID", response = GetIncomeByIdResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes/{incomeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetIncomeByIdResponse> _getIncomeById(@ApiParam(value = "Income Id",required=true) @PathVariable("incomeId") Integer incomeId) {
        return getIncomeById(incomeId);
    }

    // Override this method
    default ResponseEntity<GetIncomeByIdResponse> getIncomeById(Integer incomeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "List of Incomes", nickname = "getIncomes", notes = "Get a list of all incomes", response = GetIncomesResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all incomes", response = GetIncomesResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetIncomesResponse> _getIncomes(@ApiParam(value = "Page Number", defaultValue = "1") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber,@ApiParam(value = "Page Size", defaultValue = "10") @Valid @RequestParam(value = "pageSize", required = false, defaultValue="10") Integer pageSize,@ApiParam(value = "Sorting") @Valid @RequestParam(value = "sort", required = false) String sort) {
        return getIncomes(pageNumber, pageSize, sort);
    }

    // Override this method
    default ResponseEntity<GetIncomesResponse> getIncomes(Integer pageNumber,Integer pageSize,String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "List of Incomes for specified source", nickname = "getIncomesBySource", notes = "Get a list of incomes for specified source", response = GetIncomesResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all incomes", response = GetIncomesResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetIncomesResponse> _getIncomesBySource(@NotNull @ApiParam(value = "Full name of the source or first few charactes", required = true) @Valid @RequestParam(value = "source", required = true) String source,@ApiParam(value = "Page Number", defaultValue = "1") @Valid @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber,@ApiParam(value = "Page Size", defaultValue = "10") @Valid @RequestParam(value = "pageSize", required = false, defaultValue="10") Integer pageSize,@ApiParam(value = "Sorting") @Valid @RequestParam(value = "sort", required = false) String sort) {
        return getIncomesBySource(source, pageNumber, pageSize, sort);
    }

    // Override this method
    default ResponseEntity<GetIncomesResponse> getIncomesBySource(String source,Integer pageNumber,Integer pageSize,String sort) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Update Income", nickname = "updateIncome", notes = "Update income by id.", response = UpdateIncomeResponse.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={ "Incomes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated income with specified id", response = UpdateIncomeResponse.class),
        @ApiResponse(code = 200, message = "Error response", response = ErrorResponse.class) })
    @RequestMapping(value = "/incomes/{incomeId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<UpdateIncomeResponse> _updateIncome(@ApiParam(value = "Income Id",required=true) @PathVariable("incomeId") Integer incomeId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UpdateIncomeRequest updateIncomeRequest) {
        return updateIncome(incomeId, updateIncomeRequest);
    }

    // Override this method
    default ResponseEntity<UpdateIncomeResponse> updateIncome(Integer incomeId,UpdateIncomeRequest updateIncomeRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "null");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

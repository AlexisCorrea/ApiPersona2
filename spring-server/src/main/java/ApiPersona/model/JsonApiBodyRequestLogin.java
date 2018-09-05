package ApiPersona.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JsonApiBodyRequestLogin
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-27T15:31:23.413Z")

public class JsonApiBodyRequestLogin {
	  @JsonProperty("persona")
	  @Valid
	  private List<LoginRequest> persona = new ArrayList<LoginRequest>();

	  public JsonApiBodyRequestLogin persona(List<LoginRequest> persona) {
	    this.persona = persona;
	    return this;
	  }

	  public JsonApiBodyRequestLogin addPersonaItem(LoginRequest personaItem) {
	    this.persona.add(personaItem);
	    return this;
	  }

	  /**
	   * Get persona
	   * @return persona
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull

	  @Valid

	  public List<LoginRequest> getPersona() {
	    return persona;
	  }

	  public void setPersona(List<LoginRequest> persona) {
	    this.persona = persona;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    JsonApiBodyRequestLogin jsonApiBodyRequestLogin = (JsonApiBodyRequestLogin) o;
	    return Objects.equals(this.persona, jsonApiBodyRequestLogin.persona);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(persona);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class JsonApiBodyRequestLogin {\n");
	    
	    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }

}

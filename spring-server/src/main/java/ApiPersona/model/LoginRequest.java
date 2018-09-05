package ApiPersona.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LoginRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-27T15:31:23.413Z")

public class LoginRequest {
	  @JsonProperty("correo")
	  private String correo = null;

	  @JsonProperty("contrasena")
	  private String contrasena = null;

	  public LoginRequest id(String correo) {
	    this.correo = correo;
	    return this;
	  }

	  /**
	   * Get id
	   * @return id
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull


	  public String getCorreo() {
	    return correo;
	  }

	  public void setCorreo(String correo) {
	    this.correo = correo;
	  }

	  public LoginRequest contrasena(String contrasena) {
	    this.contrasena = contrasena;
	    return this;
	  }

	  /**
	   * Get token
	   * @return token
	  **/
	  @ApiModelProperty(required = true, value = "")
	  @NotNull


	  public String getContrasena() {
	    return contrasena;
	  }

	  public void setContrasena(String contrasena) {
	    this.contrasena = contrasena;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    LoginRequest loginRequest = (LoginRequest) o;
	    return Objects.equals(this.correo, loginRequest.correo) &&
	        Objects.equals(this.contrasena, loginRequest.contrasena);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(correo, contrasena);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class DeleteRequest {\n");
	    
	    sb.append("    correo: ").append(toIndentedString(correo)).append("\n");
	    sb.append("    cotrasena: ").append(toIndentedString(contrasena)).append("\n");
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

package br.com.mateusdornellascf.projeto_api_rest.data.dto.v1;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.mateusdornellascf.projeto_api_rest.serializer.GenderSerializer;

/**
 * DTO LEGADO (V1)
 *
 * Versão utilizada para fins didáticos e experimentação com:
 * - Customização de serialização Jackson
 * - @JsonIgnore, @JsonInclude, @JsonFormat
 * - Serializadores customizados
 *
 * Não deve ser utilizado para novas evoluções da API.
 * Utilize a versão V3.
 */

@Deprecated(since = "v3", forRemoval = false)
@JsonFilter("PersonFilter")
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String firstName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastName;

    @JsonIgnore
    private String phoneNumber;

    @JsonIgnore
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDay;

    private String address;

    @JsonSerialize(using = GenderSerializer.class)
    private String gender;

    @JsonIgnore
    private String sensitiveData;

    public PersonDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSensitiveData() {
        return sensitiveData;
    }

    public void setSensitiveData(String sensitiveData) {
        this.sensitiveData = sensitiveData;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO that = (PersonDTO) o;
        return Objects.equals(id, that.id)
                && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName)
                && Objects.equals(phoneNumber, that.phoneNumber)
                && Objects.equals(birthDay, that.birthDay)
                && Objects.equals(address, that.address)
                && Objects.equals(gender, that.gender)
                && Objects.equals(sensitiveData, that.sensitiveData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, birthDay, address, gender, sensitiveData);
    }
}

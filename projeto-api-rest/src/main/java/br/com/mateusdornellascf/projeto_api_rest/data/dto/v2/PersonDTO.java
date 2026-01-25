package br.com.mateusdornellascf.projeto_api_rest.data.dto.v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @deprecated
 *             DTO DA API v2 — DESCONTINUADO.
 *
 *             Motivo:
 *             - Utilizado apenas para demonstrar versionamento de API.
 *             
 *
 *             Status:
 *             - NÃO deve ser utilizado em novos desenvolvimentos.
 *             - Mantido apenas para documentação e compatibilidade histórica.
 */
@Deprecated
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String address;
    private String gender;

    public PersonDTO() {
        // construtor mantido apenas por compatibilidade
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PersonDTO that = (PersonDTO) o;
        return Objects.equals(id, that.id)
                && Objects.equals(firstName, that.firstName)
                && Objects.equals(lastName, that.lastName)
                && Objects.equals(address, that.address)
                && Objects.equals(gender, that.gender)
                && Objects.equals(birthDay, that.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender, birthDay);
    }
}

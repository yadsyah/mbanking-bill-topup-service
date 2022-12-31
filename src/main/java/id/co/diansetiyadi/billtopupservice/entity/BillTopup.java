package id.co.diansetiyadi.billtopupservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table
public class BillTopup extends BaseEntity {

    @Column(name = "institution_code", length = 20)
    private String institutionCode;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "idDenom")
    private String idDenom;
    private String minVersion;
    private String maxVersion;
    private boolean isActive;

}

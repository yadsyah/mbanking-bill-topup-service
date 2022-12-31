package id.co.diansetiyadi.billtopupservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class Denom extends BaseEntity {

    @Column(name = "desc", length = 50)
    private String desc;
    @Column(name = "amount")
    private long amount;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "code", length = 20)
    private String code;
    @Column(name = "min_version", length = 20)
    private String minVersion;
    @Column(name = "max_vwersion", length = 20)
    private String maxVersion;
}

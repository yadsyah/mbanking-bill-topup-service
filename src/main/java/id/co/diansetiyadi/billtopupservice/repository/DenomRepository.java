package id.co.diansetiyadi.billtopupservice.repository;

import id.co.diansetiyadi.billtopupservice.entity.BillTopup;
import id.co.diansetiyadi.billtopupservice.entity.Denom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenomRepository extends JpaRepository<Denom, String> {
}

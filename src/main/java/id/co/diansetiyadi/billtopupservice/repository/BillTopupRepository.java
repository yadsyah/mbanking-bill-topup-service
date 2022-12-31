package id.co.diansetiyadi.billtopupservice.repository;

import id.co.diansetiyadi.billtopupservice.entity.BillTopup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillTopupRepository extends JpaRepository<BillTopup, String> {
}

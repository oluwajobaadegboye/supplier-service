package edu.cs.mum.gdmstore.supplierservice.repository;


import edu.cs.mum.gdmstore.supplierservice.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    public Supplier findBySupplierId(int supplierId);
}

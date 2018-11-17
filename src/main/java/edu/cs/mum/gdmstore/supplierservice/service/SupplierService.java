package edu.cs.mum.gdmstore.supplierservice.service;

import edu.cs.mum.gdmstore.supplierservice.model.Supplier;

import java.util.List;

public interface SupplierService {
    public List<Supplier> getAllSupplier();
    public Supplier getSupplierById(int id);
    public Supplier createSupplier(Supplier supplier);
    public void deleteSupplier(Supplier supplier);
    public Supplier updateSupplier(Supplier supplier);
}

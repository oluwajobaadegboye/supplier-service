package edu.cs.mum.gdmstore.supplierservice.service.impl;

import edu.cs.mum.gdmstore.supplierservice.model.Supplier;
import edu.cs.mum.gdmstore.supplierservice.repository.SupplierRepository;
import edu.cs.mum.gdmstore.supplierservice.service.SupplierService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    private final SupplierRepository repository;

    public SupplierServiceImpl(SupplierRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Supplier> getAllSupplier() {
        return repository.findAll();
    }

    @Override
    public Supplier getSupplierById(int id) {
        return repository.findBySupplierId(id);
    }

    @Override
    public Supplier createSupplier(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public void deleteSupplier(Supplier supplier) {
        repository.delete(supplier);
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) {
        return repository.save(supplier);
    }
}

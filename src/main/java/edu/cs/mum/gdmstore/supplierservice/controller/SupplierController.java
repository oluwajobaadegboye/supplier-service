package edu.cs.mum.gdmstore.supplierservice.controller;

import edu.cs.mum.gdmstore.supplierservice.model.Supplier;
import edu.cs.mum.gdmstore.supplierservice.service.SupplierService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
    private final SupplierService service;

    public SupplierController(SupplierService service){
        this.service = service;
    }

    @GetMapping
    public List<Supplier> getAllSupplier(){
        return service.getAllSupplier();
    }

    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable int id){
        return service.getSupplierById(id);
    }

    @PostMapping
    public Supplier createSupplier(@RequestBody Supplier supplier){
        return service.createSupplier(supplier);
    }

    @DeleteMapping
    public void deleteSupplier(@RequestBody Supplier supplier){
        service.deleteSupplier(supplier);
    }

    @PutMapping
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return service.updateSupplier(supplier);
    }
}

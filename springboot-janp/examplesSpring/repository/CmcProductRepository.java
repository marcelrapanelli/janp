package com.janp.justanormalperson.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmcProductRepository extends MongoRepository<String, String> {

//    Page<CmcProduct> findBySellerIdOrderByProductTitle(String sellerId, Pageable page);
//    Page<CmcProduct> findBySellerIdAndStatusOrderByProductTitle(String sellerId, ImportStatus importStatus, Pageable page);
//    Page<CmcProduct> findBySellerIdAndCategoryCodeOrderByProductTitle(String sellerId, String category, Pageable page);
//    CmcProduct findByProductSku(String productSku);
//    List<CmcProduct> findBySellerIdAndProductSkuAndStatusIn(String sellerId, String productSku, List<ImportStatus> status);
//    List<CmcProduct> findByStatus(ImportStatus status);
}
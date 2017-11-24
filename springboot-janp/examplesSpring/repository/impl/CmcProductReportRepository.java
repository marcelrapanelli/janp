package com.janp.justanormalperson.repository.impl;

import org.springframework.stereotype.Repository;

@Repository
public class CmcProductReportRepository {
//
//    private static final Logger LOG = LoggerFactory.getLogger(CmcProductReportRepository.class);
//
//    @Autowired
//    private MongoTemplate mongoTemplate;
//    private static final String COLLECTION_NAME = "marketplaceProduct";
//
//    public List<ProductsGroupedBySellerDto> countProductsBySeller(ImportStatus importStatus){
//        TypedAggregation<CmcProduct> query = newAggregation(CmcProduct.class,
//                match(Criteria.where("status").is(importStatus)),
//                group("sellerId").count().as("quantity"),
//                sort(Sort.Direction.DESC, "quantity"));
//
//        return mongoTemplate.aggregate(query, CmcProduct.class, ProductsGroupedBySellerDto.class).getMappedResults();
//    }
//
//    public List<CategoryToImportGroupedBySellerDto> countCategoriesToImportGroupedBySeller(String sellerId) {
//        TypedAggregation<CmcProduct> query = newAggregation(CmcProduct.class,
//                match(Criteria.where("status").is(ImportStatus.WAIT_REFINE).and("sellerId").is(sellerId)),
//                group("categoryCode").count().as("quantity"),
//                sort(Sort.Direction.DESC, "quantity"));
//
//        return mongoTemplate.aggregate(query, CmcProduct.class, CategoryToImportGroupedBySellerDto.class).getMappedResults();
//    }
//
//    public List<CategoryToImportGroupedBySellerDto> countCategoriesToImportGroupedByGold(String sellerId) {
//        TypedAggregation<CmcProduct> query = newAggregation(CmcProduct.class,
//                match(Criteria.where("status").is(ImportStatus.WAIT_CATEGORY).and("sellerId").is(sellerId)),
//                group("goldCategoryLevels").count().as("quantity"),
//                sort(Sort.Direction.DESC, "quantity"));
//
//        return mongoTemplate.aggregate(query, CmcProduct.class, CategoryToImportGroupedBySellerDto.class).getMappedResults();
//    }
//
//    public List<ProductsGroupByCategoryDto> findByCategoryCode(String categoryCode) {
//        Query query = query(Criteria.where("categoryCode").is(categoryCode).and("status").is(ImportStatus.WAIT_CATEGORY));
//        return mongoTemplate.find(query, ProductsGroupByCategoryDto.class, COLLECTION_NAME);
//    }
//
//    public List<ProductsGroupByCategoryDto> findByImportStatus(ImportStatus importStatus) {
//        Query query = query(Criteria.where("importStatus").is(importStatus));
//        return mongoTemplate.find(query, ProductsGroupByCategoryDto.class, COLLECTION_NAME);
//    }
//
//    public List<CmcProduct> findByProductSkuIn(String sellerId, ImportStatus importStatus, List<String> skus){
//        Criteria criteria = Criteria.where("sellerId").is(sellerId).and("status").is(importStatus.toString()).and("productSku").in(skus);
//        Query query = new Query();
//        query.addCriteria(criteria);
//        LOG.debug("Executing query: {}", query);
//        return mongoTemplate.find(query, CmcProduct.class);
//    }
//
//    public List<CmcProduct> findByProductSkuNotIn(String sellerId, ImportStatus importStatus, List<String> skus){
//        Criteria criteria = Criteria.where("sellerId").is(sellerId).and("status").is(importStatus.toString()).and("productSku").nin(skus);
//        Query query = new Query();
//        query.addCriteria(criteria);
//        LOG.debug("Executing query: {}", query);
//        return mongoTemplate.find(query, CmcProduct.class);
//    }
}

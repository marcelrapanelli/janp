package com.janp.justanormalperson.repository.impl;

import com.janp.justanormalperson.models.AccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
public interface AccountRepository extends MongoRepository<AccountModel, String> {

//    Page<AccountModel> findBySellerIdAndCategoryCodeOrderByProductTitle(String sellerId, String category, Pageable page);
//    AccountModel findBySellerIdAndProductSku(String sellerId, String productSku);
//    List<AccountModel> findBySellerIdAndProductSkuAndStatusIn(String sellerId, String productSku, List<ImportStatus> status);

    AccountModel findByEmailAndPassword(String email, String password);
    AccountModel findByEmail(String email);
}

package com.janp.justanormalperson.services.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CmcProductAttributeService {
	
	private static final Logger LOG = LoggerFactory.getLogger(CmcProductAttributeService.class);
		
//	@Autowired
//	private br.com.carrefour.cmc.services.products.CmcProductService cmcProductService;
//
//	@Autowired
//	private AttributeService attributeService;
//
//	@Autowired
//	private HybrisRestTemplate hybrisRestTemplate;
//
//	@Value("${hybris.update.attribute.values.endpoint}")
//	private String updateAttributeValuesEndpoint;
//
//	public List<AttributeWithErrorDto> updateProductsByAttribute(final List<AttributeWithErrorDto> attributesToCheck, boolean isIgnored) {
//
//		List<AttributeWithErrorDto> attributesToUpdate = attributeService.getAttributesByIgnore(attributesToCheck, isIgnored);
//		updateAttributesFromProducts(attributesToUpdate, isIgnored);
//		attributeService.updateSolvedAttributes(attributesToUpdate);
//
//		return attributesToUpdate;
//	}
//
//	public List<CmcProduct> updateHybris(List<AttributeWithErrorDto> attributesToSend, List<AttributeWithErrorDto> attributesToIgnore){
//
//		List<CmcProduct> result = new ArrayList<>();
//
//		LOG.info("Sending attribute values to import in hybris.");
//
//		AttributeWithErrorDtoCollection collection = new AttributeWithErrorDtoCollection();
//		collection.setAttributes(attributesToSend);
//
//		hybrisRestTemplate.exchange(updateAttributeValuesEndpoint, HttpMethod.POST,
//				new HttpEntity<AttributeWithErrorDtoCollection>(collection), AttributeWithErrorDtoCollection.class);
//
//		LOG.info("All [" + attributesToSend.size() + "] attribute values were imported with success!");
//
//		CmcProducts productsToImport = getProductsToImport(attributesToSend, attributesToIgnore);
//
//		if (haveProductsToImport(productsToImport)) {
//			CmcProductsResponse importProductsToHybris = cmcProductService.sendProducts(productsToImport);
//			result = cmcProductService.updateProductFromImport(importProductsToHybris).getErrorList();
//		}
//
//		return result;
//	}
//
//	private void updateAttributesFromProducts(List<AttributeWithErrorDto> attributesToCheck, boolean isIgnoredAttributes) {
//
//		for (AttributeWithErrorDto attribute : attributesToCheck) {
//
//			List<CmcProduct> cmcProducts = cmcProductService.getProductsBySolvedAttribute(attribute);
//
//			LOG.info("Found [" + cmcProducts.size() + "] products with the attribute. [" + attribute.getName() + "] [" + attribute.getValue() + "]");
//
//			for (CmcProduct cmcProduct : cmcProducts) {
//				cmcProductService.updateProductAttributes(cmcProduct, attribute, isIgnoredAttributes);
//			}
//		}
//	}
//
//	private CmcProducts getProductsToImport(List<AttributeWithErrorDto> attributesToSend, List<AttributeWithErrorDto> attributesToIgnore) {
//		CmcProducts result = new CmcProducts();
//
//		List<CmcProduct> productsWithUpdatedAttributes = cmcProductService.getProductsWithUpdatedAttributes(attributesToSend);
//		productsWithUpdatedAttributes.addAll(cmcProductService.getProductsWithUpdatedAttributes(attributesToIgnore));
//
//		result.setCmcProducts(productsWithUpdatedAttributes);
//
//		return result;
//	}
//
//	private boolean haveProductsToImport(CmcProducts productsToImport) {
//		return !productsToImport.getCmcProducts().isEmpty();
//	}
}

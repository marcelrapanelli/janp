package com.janp.justanormalperson.services.attribute;

import org.springframework.stereotype.Component;

@Component
public class HybrisAttributteService {

//	@Autowired
//    private HybrisRestTemplate hybrisRestTemplate;
//
//    @Value("${hybris.attribute.sync.endpoint}")
//    private String endpoint;
//
//	public List<ClassificationClassDto> getClassificationClassFromHybris(CatalogVersion catalogVersion) {
//
//		final String url = endpoint + "/classification/" + "?catalogVersion=" + catalogVersion.getCode();
//		ResponseEntity<ClassificationListDto> result = hybrisRestTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, ClassificationListDto.class);
//		return result.getBody().getClassifications();
//
//	}
//
//	public List<ClassificationClassDto> getClassificationClassFromHybris(LocalDateTime lastSuccessEndDate,
//			CatalogVersion catalogVersion) {
//		final String date = lastSuccessEndDate.atZone(ZoneOffset.UTC).toString();
//		final String url = endpoint + "/classification?catalogVersion=" + catalogVersion.getCode() + "&updateDate=" + date;
//		ResponseEntity<ClassificationListDto> result = hybrisRestTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, ClassificationListDto.class);
//
//		return result.getBody().getClassifications();
//	}
//	public List<ClassificationAttributeDto> getClassificationAttributeFromHybris() {
//		final String url = endpoint + "/classification-attribute/";
//		ResponseEntity<ClassificationAttributeListDto> result = hybrisRestTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, ClassificationAttributeListDto.class);
//
//		return result.getBody().getAttributes();
//	}
//
//	public List<ClassificationAttributeDto> getClassificationAttributeFromHybris(LocalDateTime lastSuccessEndDate) {
//		final String date = lastSuccessEndDate.atZone(ZoneOffset.UTC).toString();
//		final String url = endpoint + "/classification-attribute?updateDate=" + date;
//		ResponseEntity<ClassificationAttributeListDto> result = hybrisRestTemplate.exchange(url, HttpMethod.GET, HttpEntity.EMPTY, ClassificationAttributeListDto.class);
//
//		return result.getBody().getAttributes();
//	}
	
}

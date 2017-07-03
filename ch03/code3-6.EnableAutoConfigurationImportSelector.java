// 코드 3-6 EnableAutoConfigurationImportSelector 클래스 중에서

//...
protected List<String> getCandidateConfiguration(AnnotationMetadata metadata,
						 AnnotationAttributes attributes) {

  return SpringFactoriesLoader.loadFactoryNames(
						getSpringFactoriesLoaderFactoryClass(), getBeanClassLoader());
}
//...

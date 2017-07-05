// 코드 7-10 org.springframework.data.jpa.repository.JpaRepository 클래스

public interface JpaRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, Id> {

  List<T> findAll();

  List<T> findAll(Sort sort);

  List<T> findAll(Iterable<ID> ids);

  <S extends T> List<S> save(Iterable<S> entities);

  void flush();

  <S extends T> S saveAndFlush(S entity);

  void deleteInBatch(Iterable<T> entities);

  void deleteAllInBatch();

  T getOne(Id id);
}

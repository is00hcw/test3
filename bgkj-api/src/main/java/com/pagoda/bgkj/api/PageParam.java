package com.pagoda.bgkj.api;

import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * 分页查询的参数，实现Pageable接口
 *
 * @author PagodaGenerator
 * @generated
 */
@Data
public class PageParam implements Pageable, Serializable {

  @Min(value = 0, message = "Page index must not be less than zero!")
  private int pageNumber;

  @Min(value = 1, message = "Page size must not be less than one!")
  private int pageSize;

  private Sort sort;

  /**
   * Creates a new {@link PageParam}. Pages are zero indexed, thus providing 0 for {@code page} will
   * return the first page.
   *
   * @param pageNumber must not be less than zero.
   * @param pageSize must not be less than one.
   */
  public PageParam(int pageNumber, int pageSize) {
    this(pageNumber, pageSize, null);
  }

  /**
   * Creates a new {@link PageParam} with sort parameters applied.
   *
   * @param pageNumber zero-based page index.
   * @param pageSize the size of the page to be returned.
   * @param sort can be {@literal null}.
   */
  public PageParam(int pageNumber, int pageSize, SortParam sort) {
    this.pageNumber = pageNumber;
    this.pageSize = pageSize;
    this.sort = sort;
  }

  public void setSort(SortParam sort) {
    this.sort = sort;
  }

  public void validate() {
    if (pageNumber < 0) {
      throw new IllegalArgumentException("Page index must not be less than zero!");
    }

    if (pageSize < 1) {
      throw new IllegalArgumentException("Page size must not be less than one!");
    }
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#getOffset()
   */
  @Override
  public int getOffset() {
    return pageNumber * pageSize;
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#hasPrevious()
   */
  @Override
  public boolean hasPrevious() {
    return pageNumber > 0;
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#previousOrFirst()
   */
  @Override
  public Pageable previousOrFirst() {
    return hasPrevious() ? previous() : first();
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#getSort()
   */
  @Override
  public Sort getSort() {
    return sort;
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#next()
   */
  @Override
  public Pageable next() {
    return new PageParam(getPageNumber() + 1, getPageSize(), (SortParam) getSort());
  }

  public Pageable previous() {
    return getPageNumber() == 0
        ? this
        : new PageParam(getPageNumber() - 1, getPageSize(), (SortParam) getSort());
  }

  /*
   * (non-Javadoc)
   * @see org.springframework.data.domain.Pageable#first()
   */
  @Override
  public Pageable first() {
    return new PageParam(0, getPageSize(), (SortParam) getSort());
  }
}

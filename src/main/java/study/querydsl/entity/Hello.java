
package study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 검증용 엔티티 생성
 */
@Entity
@Getter
@Setter
public class Hello {
    @Id
    @GeneratedValue
    private Long id;
}
package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum FREQUENCE {
    DAY, WEEK, MONTH, TRIMESTER, SEMESTER, YEAR
}

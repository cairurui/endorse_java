### 1. 用jpa时要记得写上 @Id 
   类名要跟数据库表明一致（驼峰写法），成员变量也是驼峰写法

```java 
@Entity
public class ProductCategory {

    /**
     * 类目id
     */
    @Id
    @GeneratedValue
    private Integer categoryId;
    
}
```










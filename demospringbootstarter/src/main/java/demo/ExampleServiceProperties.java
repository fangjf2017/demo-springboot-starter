package demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by fan on 2018/12/6.
 */
@ConfigurationProperties("example.service")
@Setter
@Getter
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;


}

package example;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;

@Configuration
public class ExampleConfig {
    @Bean
    public ListeningExecutorService executor() {
        return MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(1, new ThreadFactoryBuilder()
                .setNameFormat("my-pool-1-%d")
                .build()));
    }
}

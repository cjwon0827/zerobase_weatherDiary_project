package zerobase.weather.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "날씨 일기 프로젝트",
                description = "날씨 일기를 CRUD 할 수 있는 벡엔드 API 입니다.",
                version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
}

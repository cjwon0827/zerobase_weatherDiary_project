package zerobase.weather;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zerobase.weather.domain.Memo;
import zerobase.weather.repository.JdbcMemoRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class JdbcMemoRepositoryTest {
    @Autowired
    JdbcMemoRepository jdbcMemoRepository;

    @Test
        void insertTest(){
        //given
        Memo newMemo = new Memo(2, "insert memo test");
        //when
        jdbcMemoRepository.save(newMemo);
        //then
        Optional<Memo> result = jdbcMemoRepository.findById(2);
        assertEquals(result.get().getText(), "insert memo test");
    }

    @Test
        void findAllMemoTest(){
        //given
        List<Memo> memoList = jdbcMemoRepository.findAll();
        //when
        //then
    }
}

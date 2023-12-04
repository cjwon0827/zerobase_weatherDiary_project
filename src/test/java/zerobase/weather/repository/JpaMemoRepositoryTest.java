package zerobase.weather.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {
    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
        void insertMemoTest(){
        //given
        Memo memo = new Memo(10, "this is jpa memo");
        //when
        jpaMemoRepository.save(memo);
        //then
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertTrue(memoList.size() > 0);
    }

    @Test
        void findByIdTest(){
        //given
        Memo memo = new Memo(11, "jpa");
        //when
        Memo memo1 = jpaMemoRepository.save(memo);
        System.out.println(memo1.getId());
        //then
        Optional<Memo> id = jpaMemoRepository.findById(memo1.getId());
        assertEquals(id.get().getText(), "jpa");
    }
}
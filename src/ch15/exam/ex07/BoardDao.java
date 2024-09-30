package ch15.exam.ex07;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList(){
        List<Board> boardList = new ArrayList<>();
        for(int i = 1; i<=3; i++){
            boardList.add(new Board("제목"+i,"내용"+i));
        }
        return boardList;
    }
}

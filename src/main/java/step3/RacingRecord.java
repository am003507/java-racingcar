package step3;

import java.util.Collections;
import java.util.List;

public class RacingRecord {

    private List<Integer> record;

    public RacingRecord(List<Integer> record) {
        this.record = Collections.unmodifiableList(record);
    }

    //엄.. 일급 컬렉션의 리스트를 추출 한다는 의미로 export 라고 했는데.. 그냥 getRecord가 나으려나요..? (이러면 게터사용..?)
    public List<Integer> export() {
        return record;
    }

}

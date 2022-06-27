package greeng00se.effectivejava.chapter06.item49;

import java.util.Date;

public final class Period {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        // 방어적 복사본 생성
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException("시작 시간이 끝 시간보다 늦습니다.");
        }
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}

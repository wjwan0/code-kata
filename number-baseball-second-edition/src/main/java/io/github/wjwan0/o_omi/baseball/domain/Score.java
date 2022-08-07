package io.github.wjwan0.o_omi.baseball.domain;

public class Score {
    private final int strikeCount;
    private final int ballCount;

    Score(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public boolean threeStrike() {
        return this.strikeCount == 3;
    }

    @Override
    public String toString() {

        if (ballCount == 0 && strikeCount == 0) {
            return "낫싱";
        }
        if (ballCount == 0 && strikeCount > 0) {
            return "%s 스트라이크".formatted(strikeCount);
        }
        if (ballCount > 0 && strikeCount == 0) {
            return "%s 볼".formatted(ballCount);
        }

        return "%s 스트라이크 %s 볼".formatted(strikeCount, ballCount);
    }
}

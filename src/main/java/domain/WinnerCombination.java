package domain;

public class WinnerCombination {

    private final LottoTicket winnerTicket;
    private final LottoBall bonusBall;

    public WinnerCombination(LottoTicket winnerTicket, LottoBall bonusBall) {
        validateWinnerCombination(winnerTicket, bonusBall);
        this.winnerTicket = winnerTicket;
        this.bonusBall = bonusBall;
    }

    private void validateWinnerCombination(LottoTicket winnerTicket, LottoBall bonusBall) {
        if (winnerTicket.contains(bonusBall)) {
            throw new IllegalArgumentException("보너스볼은 당첨번호와 중복될 수 없습니다.");
        }
    }

    public LottoResult compare(LottoTicket lottoTicket) {
        if (lottoTicket.equals(winnerTicket)) {
            return LottoResult.SIX_MATCH;
        }

        int matchCount = lottoTicket.countMatch(winnerTicket);
        boolean bonusBallMatch = lottoTicket.contains(bonusBall);

        return LottoResult.findResult(matchCount, bonusBallMatch);
    }
}
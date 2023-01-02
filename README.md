# java-lotto-kakao

## 기능 요구사항
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다. 
- 로또 1장의 가격은 1000원이다. 
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```
### 힌트
- 로또 자동 생성은 Collections.shuffle() 메소드 활용한다. 
- Collections.sort() 메소드를 활용해 정렬 가능하다. 
- ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.

---

## 기능 정의

### View 요구사항
- [ ] 구입 금액을 입력받는다
- [ ] 구매한 로또 갯수를 출력한다
- [ ] 생성된 로또 번호를 출력한다
- [ ] 지난 주 당첨 번호를 입력받는다
  - [ ] 유효하지 않은 당첨번호를 입력하는 경우 안내 메시지 출력 후 다시 받는다
- [ ] 당첨 통계를 출력한다

### Domain 요구사항
- [x] 1부터 45 사이의 중복되지 않는 6개의 LottoBall을 뽑는다
  - [x] LottoBall은 1~45 사이의 숫자만 가질 수 있다
- [x] 입력받은 금액의 유효성을 검증한다
- [x] 입력받은 금액만큼의 로또를 생성한다
- [x] 당첨번호에 대한 정보를 저장한다
  - [x] 당첨번호의 유효성을 검증한다
- [ ] 당첨 통계를 계산하여 저장한다
  - [ ] 하나의 로또와 당첨 번호를 비교하여 일치하는 번호의 갯수를 계산한다

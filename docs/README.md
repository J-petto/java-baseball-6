## 2024 프로젝트 - 우아한 코스 다시 풀어보기
### 기능 요구 사항 정리
#### 1 ~ 9까지 서로 다른 수로 이루어진 3자리 수 맞추기
1. 컴퓨터는 1 ~ 9 까지 서로 다른 임의의 숫자 선택
2. 플레이어는 서로 다른 임의의 숫자 3개 입력
3. 같은 수가 같은 자리 일때 : 스트라이크
4. 같은 수가 다른 자리 일때 : 볼
5. 같은 수가 없을 때 : 낫싱
6. 숫자를 모두 맞힐 때까지 반복
7. 게임 종료 후 게임을 다시 시작하거나 완전히 종료되어야 함
8. 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException` 발생 후 종료

### 프로그래밍 요구사항
- [ ] 컴퓨터가 3자리 숫자를 선택 가능한가 
- [ ] 컴퓨터의 3자리 숫자가 모두 다른 숫자인가
- [ ] 플레이어의 3자리 숫자를 입력 받는가
- [ ] 플레이어의 3자리 숫자가 모두 다른 숫자인가
- [ ] 플레이어가 입력한 값이 3자리가 맞는가
- [ ] 플레이어가 입력한 값이 숫자 외의 값인가
- [ ] 플레이어가 입력한 값이 형식을 벗어날 경우 `IllegalArgumentException` 발생 후 종료 되는가
- [ ] 각 3개의 숫자를 비교 할 수 있는가
- [ ] 3개의 숫자 비교 후 결과에 맞게 출력되는가
- [ ] n개의 볼 일 경우 결과가 정상적으로 노출되는가
- [ ] n개의 볼, n개의 스트라이크 일 경우 결과가 정상적으로 노출되는가
- [ ] n개의 스트라이크 인 경우 결과가 정상적으로 노출되는가
- [ ] 낫싱 인 경우 결과가 정상적으로 노출되는가
- [ ] 3스트라이크가 아니라면 숫자를 재입력 받는가
- [ ] 3스트라이크가 맞다면 게임이 종료되는가
- [ ] 게임 종료 후 새로 시작 할 수 있는가
- [ ] 게임 종료 후 프로그램을 완전 종료 할 수 있는가
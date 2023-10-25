package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public void playGame(){
        List<Integer> computer = new ArrayList<>();
        while (true){
            //컴퓨터 랜덤 숫자 뽑기 및 리스트에 담기
            while (computer.size() < 3) {
                int randomNum = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNum)) {
                    computer.add(randomNum);
                }
            }

            //플레이어 숫자 입력 받기
            List<Integer> player = new ArrayList<>();
            System.out.print("숫자를 입력해주세요 : ");
            String playerNum = Console.readLine();

            //플레이어에게 받은 값이 잘못된 값일 경우
            try{
                if (playerNum.length() != 3) {
                    throw new IllegalAccessException();
                }
            } catch (IllegalAccessException e){
                System.out.println("3자리 숫자를 입력해주세요.");
            }

            // 3자리 수 리스트에 넣기
            while (player.size() < 3){
                player.add(player.size(),
                        Integer.parseInt(playerNum.substring(player.size(),player.size()+1)));
                //System.out.println(player);
            }

            int strike = 0;
            if(computer.get(0) == player.get(0)) strike += 1;
            if(computer.get(1) == player.get(1)) strike += 1;
            if(computer.get(2) == player.get(2)) strike += 1;

            int ball = 0;
            if(computer.get(1) == player.get(0) || computer.get(2) == player.get(0)) ball += 1;
            if(computer.get(0) == player.get(1) || computer.get(2) == player.get(1)) ball += 1;
            if(computer.get(0) == player.get(2) || computer.get(1) == player.get(2)) ball += 1;

            if(strike == 3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int continued = Integer.parseInt(Console.readLine());

                if (continued == 1){
                    if (!computer.isEmpty()) {
                        computer.subList(0, computer.size()).clear();
                    }
                }else if (continued == 2){
                    playGame();
                }else {
                    try{
                        if (playerNum.length() != 3) {
                            throw new IllegalAccessException();
                        }
                    } catch (IllegalAccessException e){
                        System.out.println("1과 2만 입력해주세요.");
                    }
                }
            } else if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            } else if (ball == 0) {
                System.out.println(strike + "스트라이크");
            } else if (strike == 0) {
                System.out.println(ball + "볼");
            }else System.out.println(ball + "볼" + strike + "스트라이크");
        }
    }

}

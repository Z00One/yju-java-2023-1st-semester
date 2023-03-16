package Unit5;

public class Box {
  private int width;                  // 가로
  private int length;                 // 세로
  private int height;                 // 높이
  private int volume;                 // 부피

  // 생성자
  Box(int width, int length, int height){
    this.width = width;
    this.length = length;
    this.height = height;

    volume = width * length * height;
  }

  // 부피 가져오게 하기
  int getVolume() {
    return volume;
  }
}
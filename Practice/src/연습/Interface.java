package 연습;

// 인터페이스 통합 인터페이스
public interface Interface {
  // 인증된 key 값인지 확인
  abstract boolean isAuthenticable(String keyA, String keyB);
}

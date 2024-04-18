package kr.co.careerwry.common.utils;

import java.util.UUID;

public class TokenGenerator {
  public static String generateToken() {
	return UUID.randomUUID().toString();
  }

  public static String randomCharacterWithPrefix(String prefix) {
	return prefix + generateToken();
  }
}
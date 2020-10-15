package com.halfhex.fluffy;

import io.vertx.core.Vertx;

/**
 * @author Syuan
 * @time 2020/10/14 5:45 下午
 */
public class Application {
  public static void main(String[] args) {
    MainVerticle verticle = new MainVerticle();
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(verticle);
  }
}

package com.pedro.aprendizado.Services;

import org.springframework.stereotype.Service;

import com.pedro.aprendizado.Services.calc.calcResolve;

@Service
public class CalcServices {

  public static double resolve(String eqc) {
    return calcResolve.resolve(eqc);
  }
}

package com.designpatterns.gof;

import com.designpatterns.gof.facade.Facade;
import com.designpatterns.gof.singleton.SingletonEager;
import com.designpatterns.gof.singleton.SingletonLazy;
import com.designpatterns.gof.singleton.SingletonLazyHolder;
import com.designpatterns.gof.strategy.Comportamento;
import com.designpatterns.gof.strategy.ComportamentoAgressivo;
import com.designpatterns.gof.strategy.ComportamentoDefensivo;
import com.designpatterns.gof.strategy.ComportamentoNormal;
import com.designpatterns.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder + "\n");
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Luiz", "08808808");
	}

}
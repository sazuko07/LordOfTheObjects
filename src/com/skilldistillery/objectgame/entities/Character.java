package com.skilldistillery.objectgame.entities;

import java.util.Objects;

public abstract class Character {
		private String name;
		private int HP;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHP() {
			return HP;
		}
		public void setHP(int hP) {
			HP = hP;
		}
}


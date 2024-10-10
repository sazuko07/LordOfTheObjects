package com.skilldistillery.objectgame.entities;

import java.util.Objects;

public class HeroFroZone extends Character{
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
		@Override
		public int hashCode() {
			return Objects.hash(HP, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			HeroFroZone other = (HeroFroZone) obj;
			return HP == other.HP && Objects.equals(name, other.name);
		}
}

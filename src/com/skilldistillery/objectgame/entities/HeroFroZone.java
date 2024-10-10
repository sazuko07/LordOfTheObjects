package com.skilldistillery.objectgame.entities;

import java.util.Objects;

public class HeroFroZone extends Character {
// <<<<<<< HEAD
	private String name = "FroZone";

	int FroZoneHP[] = new int[1];
	{
		FroZoneHP[0] = 3;
	}

	private int[] HP = FroZoneHP;

	public int[] getFroZoneHP() {
		return FroZoneHP;
	}

	public void setFroZoneHP(int[] froZoneHP) {
		FroZoneHP = froZoneHP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FroZoneHP, name);
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
			return FroZoneHP == other.FroZoneHP && Objects.equals(name, other.name);
		}
}

=======

// >>>>>>> aeca28db012fec952ddb48cdd693acf19e54d51b

package prac;

class DropShip extends Unit implements Repairable,Boardable
{

 DropShip() {
  super(100);
  
 }
 
 
 public void move_sound() {
  System.out.println("");
 }

 public void attack_sound() {
  System.out.println("");

 }

 public void mode_sound() {
  System.out.println("");
 }
 
 public void tab(Boardable b)
 {
  System.out.println("ÅÂ¿üÁ´");
 }
 }

package com.mycompany.com.game.engine;
/**
 * Guerrero especializado con ventajas en combate cuerpo a cuerpo.
 * <p>
 * Esta clase es representada por su fuerza en el ataque, un 
 * warrior aplica un incremento del daño en +5
 * </p>
 * @author Yeray Trejo Sánchez
 * @version 2.0
 * @since 2.0
 */
public class Warrior extends CombatEngine {

    /**
     * Construye un nuevo guerrero con valores iniciales.
     * <p>
     * El guerrero es como un personaje normal con los mismos
     * parametros pero sus stats son mayores por la clase 
     * warrior
     * </p>
     * 
     * @param hp Puntos de vida del warrior
     * @param mp Puntos de maná del warrior
     */
    public Warrior(int hp, int mp) {
        super(hp, mp);
    }

    /**(@inheritDoc)
     * <p>
     * <b>Nota:</b> El guerrero aplica un +5 por fuerza física.
     * Este incremento representa el valor de la clase warrior.
     * </p>
     * <p>
     * el daño del warrior siempre va a ser mayor que un personaje
     * destacando entre los personajes normales.
     * </p>
     * 
     * @param attackPower Poder de ataque base del warrior
     * @param enemyDefense Defensa del enemigo objetivo
     * @return Daño total calculado con el incremento de guerrero incluido (+5)
     * @throws IllegalStateException Si el guerrero está derrotado (HP ≤ 0)
     */
    @Override
    public int calculateDamage(int attackPower, int enemyDefense) {
        int baseDamage = super.calculateDamage(attackPower, enemyDefense);
        return baseDamage + 5;
    }
}


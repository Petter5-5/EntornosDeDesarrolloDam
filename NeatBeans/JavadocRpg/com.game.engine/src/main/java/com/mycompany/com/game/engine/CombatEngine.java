package com.mycompany.com.game.engine;

/**
 *<b>Clase motor del combate.</b>
 * <p>
 * Clase que nos permite simular un combate con la gestion del hp y el mp
 * de los personajes tambien algunas ejemplos Deprecated para cambiar a futuro
 * y el motor de combate que decide quien gana y quien pierde.
 * </p>
 * 
 * <p>Ejemplo de uso: </p>
 * 
 * <pre>
 * CombatEngine personaje = new CombatEngine(80, 100);
 * personaje.calculateDamage(int 20, int 5);
 * </pre>
 * @author ytresan889
 * @version 1.0
 * @since 2026-02
 */
public class CombatEngine 
{
    /**
    *<b>Atributo hp</b>
    * <p>Asigna el valor de la vida del personaje creado</p>
    **/
    private int hp;
    /**
    *<b>Atributo mp</b>
    * <p>Asigna el valor de los magic points del personaje creado</p>
    **/
    private int mp;
    /**
    *<b>CombatEngine</b>
    * <p>
    * El constructor necesita el valor int hp y el valor int mp 
    * y se lo ponemos al objeto
    * </p>
    * @param hp da la vida al personaje
    * @param mp da la magia al personaje
    **/
    public CombatEngine(int hp, int mp) 
    {
        this.hp = hp;
        this.mp = mp;
    }
    /**
     * <b>calculateDamage</b>
     * <p>
     * Calculamos el daño que le hacemos al enemigo teniendo en cuenta nuestra potencia y la defensa del enemigo tambien
     * controlamos que le ataque no sea negativo.
     * </p>
     * 
     * @param attackPower parametro que nos indica con la potencia que atacamos al enemigo
     * @param enemyDefense parametro que nos indica la defensa del enemigo
     * @return devuelve el daño hecho y controla con el Math.max que el daño no sea negativo
     * @throws IllegalStateException nos devuelve si un personaje tiene vida negativa o si su vida es igual a 0
     * @see #heal(int)
     **/
    public int calculateDamage(int attackPower, int enemyDefense) 
    {
        if (this.hp <= 0) {
            throw new IllegalStateException("Un personaje derrotado no puede atacar.");
    }
        int damage = attackPower - enemyDefense;
        return Math.max(0, damage);
    }
    
    /**
     * Restaura los puntos  de vida del personaje
     * <p>
     * Este metodo sirve para curar la vida del personaje
     * sin pasar el maximo de 100.
     * </p>
     * <p>
     * Solo los personajes vivos pueden ser curados un muerto
     * no puede ser revivido con este metodo.
     * </p>
     * 
     * @param amount Cantidad de puntos para curar
     * @throws IllegalStateException. Si el personaje esta muerto.
     * @see #calculateDamage(int, int)
     **/
    public void heal(int amount) {
        if (this.hp <= 0) {
            throw new IllegalStateException("No se puede curar a un muerto.");
        }
        this.hp = Math.min(100, this.hp + amount);
    } 

    /**
     * <b>oldAttack</b>
     * <p>
     * Metodo viejo para calcular el ataque que le hacemos al enemigo
     * y que debe ser removido
     * </p>
     * @deprecated attackPower parametro que nos indica con la potencia que atacamos al enemigo
     */
    public void oldAttack() 
    {
        System.out.println("Ejecutando ataque del sistema antiguo...");
    } 
}

package com.radthorne.KillHeal;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.security.PublicKey;

/**
 * Created with IntelliJ IDEA.
 * User: luuk
 * Date: 3/6/13
 * Time: 8:38 AM
 * To change this template use File | Settings | File Templates.
 */
public
class KillHeal extends JavaPlugin implements Listener
{
    @Override
    public
    void onEnable( )
    {
        this.getServer().getPluginManager().registerEvents( this, this );
    }

    @Override
    public
    void onDisable( )
    {

    }
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        Player player = event.getEntity();
        Player killer = player.getKiller();
        killer.setHealth( 20 );
        killer.setFoodLevel( 20 );
    }
}

package unwrittenfun.bukkit.lukkit.world;

import org.bukkit.Location;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.VarArgFunction;


public class SpawnFallingBlockFunction extends VarArgFunction {

	@Override
	public Varargs invoke(Varargs args) {
		Location loc = new Location(((WorldObject) args.arg(1)).world, args.todouble(2), args.todouble(3), args.todouble(4));
		((WorldObject) args.arg(1)).world.spawnFallingBlock(loc, args.toint(5), args.tobyte(6));
		return LuaValue.NIL;
	}
	
}

package net.alphaatom.wirebot.commands;

import java.util.Map;

import net.alphaatom.wirebot.Command;
import net.alphaatom.wirebot.WireBot;

public class Bot extends Command {

	private String[] aliases = { "wirebot", "bot", "info", "inf", "who" };
	
	/*
	 * (non-Javadoc)
	 * @see net.alphaatom.wirebot.Command#exec(java.lang.String[], java.lang.String[], net.alphaatom.wirebot.WireBot)
	 */
	@Override
	public void exec(Map<String, String> cmdinfo, String[] args, WireBot wireBot) {
		wireBot.sendMessage(cmdinfo.get("channel"), "Hi! I'm WireBot and I was programmed in Java.");
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.alphaatom.wirebot.Command#getAliases()
	 */
	@Override
	public String[] getAliases() {
		return aliases;
	}
	
	

}

package com.jd.quickChat.interfacer;
import com.jd.quickChat.typo.InfoOfFriend;
import com.jd.quickChat.typo.InfoOfMessage;


public interface Updater {
	public void updateData(InfoOfMessage[] messages, InfoOfFriend[] friends, InfoOfFriend[] unApprovedFriends, String userKey);

}

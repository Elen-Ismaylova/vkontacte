package domain;

public class CommentsInfo {
    private int count;
    private boolean canPostAllUsers;
    private boolean canPostGroups;
    private boolean canPostFriends;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPostAllUsers() {
        return canPostAllUsers;
    }

    public void setCanPostAllUsers(boolean canPostAllUsers) {
        this.canPostAllUsers = canPostAllUsers;
    }

    public boolean isCanPostGroups() {
        return canPostGroups;
    }

    public void setCanPostGroups(boolean canPostGroups) {
        this.canPostGroups = canPostGroups;
    }

    public boolean isCanPostFriends() {
        return canPostFriends;
    }

    public void setCanPostFriends(boolean canPostFriends) {
        this.canPostFriends = canPostFriends;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}

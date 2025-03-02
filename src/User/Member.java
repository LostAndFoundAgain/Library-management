package User;

import Membership.Membership;

public class Member extends User{
    private Membership membership;

    public Member(String name, Membership membership) {
        super(name);
        this.membership = membership;
    }
}

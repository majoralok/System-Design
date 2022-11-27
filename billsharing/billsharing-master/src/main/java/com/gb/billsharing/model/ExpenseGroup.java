package com.gb.billsharing.model;

import java.util.*;

public class ExpenseGroup {
    private Set<User> groupMembers = new HashSet<>();
    private String expenseGroupId;
    private Map<String, UserShare> userContributions;

    public ExpenseGroup() {
        this.expenseGroupId = UUID.randomUUID().toString();
        this.groupMembers = new HashSet<>();
        this.userContributions = new HashMap<>();
    }

    public void ExpenseGroup() {

    }
}
package com.meijer.mobile.meijer.activity.find.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public class RecentSearchList extends ArrayList<String> {

    /* renamed from: a, reason: collision with root package name */
    int f107842a;

    public RecentSearchList(Collection<String> collection, int i10) {
        super(collection);
        this.f107842a = i10;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(String str) {
        ListIterator<String> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equalsIgnoreCase(str)) {
                listIterator.remove();
            }
        }
        super.add(0, str);
        while (size() > this.f107842a) {
            super.remove(size() - 1);
        }
        return true;
    }

    public RecentSearchList(int i10) {
        this.f107842a = i10;
    }
}

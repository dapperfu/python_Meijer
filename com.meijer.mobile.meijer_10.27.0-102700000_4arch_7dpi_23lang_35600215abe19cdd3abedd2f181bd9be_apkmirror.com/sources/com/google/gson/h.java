package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<k> f89449a = new ArrayList<>();

    private k q() {
        int size = this.f89449a.size();
        if (size == 1) {
            return this.f89449a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof h) && ((h) obj).f89449a.equals(this.f89449a);
        }
        return true;
    }

    public int hashCode() {
        return this.f89449a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f89449a.iterator();
    }

    public void o(k kVar) {
        if (kVar == null) {
            kVar = l.f89694a;
        }
        this.f89449a.add(kVar);
    }

    public void p(String str) {
        this.f89449a.add(str == null ? l.f89694a : new n(str));
    }

    @Override // com.google.gson.k
    public String h() {
        return q().h();
    }
}

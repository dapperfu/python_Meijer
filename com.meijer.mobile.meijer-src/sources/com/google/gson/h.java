package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class h extends k implements Iterable<k> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<k> f90291a = new ArrayList<>();

    private k q() {
        int size = this.f90291a.size();
        if (size == 1) {
            return this.f90291a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof h) && ((h) obj).f90291a.equals(this.f90291a);
        }
        return true;
    }

    public int hashCode() {
        return this.f90291a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<k> iterator() {
        return this.f90291a.iterator();
    }

    public void o(k kVar) {
        if (kVar == null) {
            kVar = l.f90536a;
        }
        this.f90291a.add(kVar);
    }

    public void p(String str) {
        this.f90291a.add(str == null ? l.f90536a : new n(str));
    }

    @Override // com.google.gson.k
    public String h() {
        return q().h();
    }
}

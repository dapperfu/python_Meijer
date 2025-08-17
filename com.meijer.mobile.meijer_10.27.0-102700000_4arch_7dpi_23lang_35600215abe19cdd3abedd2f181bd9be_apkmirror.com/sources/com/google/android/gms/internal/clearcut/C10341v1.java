package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10341v1 extends AbstractList<String> implements InterfaceC10331s0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10331s0 f81580a;

    public C10341v1(InterfaceC10331s0 interfaceC10331s0) {
        this.f81580a = interfaceC10331s0;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final List<?> A() {
        return this.f81580a.A();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final InterfaceC10331s0 C3() {
        return this;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final Object c(int i10) {
        return this.f81580a.c(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f81580a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C10347x1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new C10344w1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81580a.size();
    }
}

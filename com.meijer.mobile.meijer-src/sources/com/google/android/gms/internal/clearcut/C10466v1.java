package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10466v1 extends AbstractList<String> implements InterfaceC10456s0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10456s0 f82420a;

    public C10466v1(InterfaceC10456s0 interfaceC10456s0) {
        this.f82420a = interfaceC10456s0;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10456s0
    public final List<?> A() {
        return this.f82420a.A();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10456s0
    public final InterfaceC10456s0 B3() {
        return this;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10456s0
    public final Object c(int i10) {
        return this.f82420a.c(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f82420a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C10472x1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new C10469w1(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82420a.size();
    }
}

package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class uf implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    vf f84921a;

    /* renamed from: b, reason: collision with root package name */
    vf f84922b = null;

    /* renamed from: c, reason: collision with root package name */
    int f84923c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ wf f84924d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84921a != this.f84924d.f85034e;
    }

    uf(wf wfVar) {
        this.f84924d = wfVar;
        this.f84921a = wfVar.f85034e.f84998d;
        this.f84923c = wfVar.f85033d;
    }

    final vf a() {
        vf vfVar = this.f84921a;
        wf wfVar = this.f84924d;
        if (vfVar == wfVar.f85034e) {
            throw new NoSuchElementException();
        }
        if (wfVar.f85033d != this.f84923c) {
            throw new ConcurrentModificationException();
        }
        this.f84921a = vfVar.f84998d;
        this.f84922b = vfVar;
        return vfVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        vf vfVar = this.f84922b;
        if (vfVar == null) {
            throw new IllegalStateException();
        }
        this.f84924d.f(vfVar, true);
        this.f84922b = null;
        this.f84923c = this.f84924d.f85033d;
    }
}

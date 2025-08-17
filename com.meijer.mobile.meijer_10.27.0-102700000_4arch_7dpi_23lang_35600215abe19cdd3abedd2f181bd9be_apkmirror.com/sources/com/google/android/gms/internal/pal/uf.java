package com.google.android.gms.internal.pal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
abstract class uf implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    vf f84081a;

    /* renamed from: b, reason: collision with root package name */
    vf f84082b = null;

    /* renamed from: c, reason: collision with root package name */
    int f84083c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ wf f84084d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84081a != this.f84084d.f84194e;
    }

    uf(wf wfVar) {
        this.f84084d = wfVar;
        this.f84081a = wfVar.f84194e.f84158d;
        this.f84083c = wfVar.f84193d;
    }

    final vf a() {
        vf vfVar = this.f84081a;
        wf wfVar = this.f84084d;
        if (vfVar == wfVar.f84194e) {
            throw new NoSuchElementException();
        }
        if (wfVar.f84193d != this.f84083c) {
            throw new ConcurrentModificationException();
        }
        this.f84081a = vfVar.f84158d;
        this.f84082b = vfVar;
        return vfVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        vf vfVar = this.f84082b;
        if (vfVar == null) {
            throw new IllegalStateException();
        }
        this.f84084d.f(vfVar, true);
        this.f84082b = null;
        this.f84083c = this.f84084d.f84193d;
    }
}

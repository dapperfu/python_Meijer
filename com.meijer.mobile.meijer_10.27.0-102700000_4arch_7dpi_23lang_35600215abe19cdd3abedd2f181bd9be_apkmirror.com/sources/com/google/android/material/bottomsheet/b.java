package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.i;
import androidx.core.view.j;
import be.C6230a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class b extends i.b {

    /* renamed from: c, reason: collision with root package name */
    private final View f86480c;

    /* renamed from: d, reason: collision with root package name */
    private int f86481d;

    /* renamed from: e, reason: collision with root package name */
    private int f86482e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f86483f;

    public b(View view) {
        super(0);
        this.f86483f = new int[2];
        this.f86480c = view;
    }

    @Override // androidx.core.view.i.b
    public void b(i iVar) {
        this.f86480c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.i.b
    public void c(i iVar) {
        this.f86480c.getLocationOnScreen(this.f86483f);
        this.f86481d = this.f86483f[1];
    }

    @Override // androidx.core.view.i.b
    public i.a e(i iVar, i.a aVar) {
        this.f86480c.getLocationOnScreen(this.f86483f);
        int i10 = this.f86481d - this.f86483f[1];
        this.f86482e = i10;
        this.f86480c.setTranslationY(i10);
        return aVar;
    }

    @Override // androidx.core.view.i.b
    public j d(j jVar, List<i> list) {
        Iterator<i> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & j.n.d()) != 0) {
                this.f86480c.setTranslationY(C6230a.c(this.f86482e, 0, r0.b()));
                break;
            }
        }
        return jVar;
    }
}

package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.i;
import androidx.core.view.j;
import de.C13661a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class b extends i.b {

    /* renamed from: c, reason: collision with root package name */
    private final View f87320c;

    /* renamed from: d, reason: collision with root package name */
    private int f87321d;

    /* renamed from: e, reason: collision with root package name */
    private int f87322e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f87323f;

    public b(View view) {
        super(0);
        this.f87323f = new int[2];
        this.f87320c = view;
    }

    @Override // androidx.core.view.i.b
    public void b(i iVar) {
        this.f87320c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.i.b
    public void c(i iVar) {
        this.f87320c.getLocationOnScreen(this.f87323f);
        this.f87321d = this.f87323f[1];
    }

    @Override // androidx.core.view.i.b
    public i.a e(i iVar, i.a aVar) {
        this.f87320c.getLocationOnScreen(this.f87323f);
        int i10 = this.f87321d - this.f87323f[1];
        this.f87322e = i10;
        this.f87320c.setTranslationY(i10);
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
                this.f87320c.setTranslationY(C13661a.c(this.f87322e, 0, r0.b()));
                break;
            }
        }
        return jVar;
    }
}

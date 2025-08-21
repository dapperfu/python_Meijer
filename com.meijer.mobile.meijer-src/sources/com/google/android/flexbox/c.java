package com.google.android.flexbox;

import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    int f65361e;

    /* renamed from: f, reason: collision with root package name */
    int f65362f;

    /* renamed from: g, reason: collision with root package name */
    int f65363g;

    /* renamed from: h, reason: collision with root package name */
    int f65364h;

    /* renamed from: i, reason: collision with root package name */
    int f65365i;

    /* renamed from: j, reason: collision with root package name */
    float f65366j;

    /* renamed from: k, reason: collision with root package name */
    float f65367k;

    /* renamed from: l, reason: collision with root package name */
    int f65368l;

    /* renamed from: m, reason: collision with root package name */
    int f65369m;

    /* renamed from: o, reason: collision with root package name */
    int f65371o;

    /* renamed from: p, reason: collision with root package name */
    int f65372p;

    /* renamed from: q, reason: collision with root package name */
    boolean f65373q;

    /* renamed from: r, reason: collision with root package name */
    boolean f65374r;

    /* renamed from: a, reason: collision with root package name */
    int f65357a = a.e.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    int f65358b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    int f65359c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    int f65360d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    List<Integer> f65370n = new ArrayList();

    public int a() {
        return this.f65363g;
    }

    public int b() {
        return this.f65364h;
    }

    public int c() {
        return this.f65364h - this.f65365i;
    }

    c() {
    }

    void d(View view, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        this.f65357a = Math.min(this.f65357a, (view.getLeft() - bVar.A2()) - i10);
        this.f65358b = Math.min(this.f65358b, (view.getTop() - bVar.J0()) - i11);
        this.f65359c = Math.max(this.f65359c, view.getRight() + bVar.t3() + i12);
        this.f65360d = Math.max(this.f65360d, view.getBottom() + bVar.w2() + i13);
    }
}

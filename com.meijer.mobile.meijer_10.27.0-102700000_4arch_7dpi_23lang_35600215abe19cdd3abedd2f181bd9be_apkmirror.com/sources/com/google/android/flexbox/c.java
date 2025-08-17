package com.google.android.flexbox;

import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    int f64521e;

    /* renamed from: f, reason: collision with root package name */
    int f64522f;

    /* renamed from: g, reason: collision with root package name */
    int f64523g;

    /* renamed from: h, reason: collision with root package name */
    int f64524h;

    /* renamed from: i, reason: collision with root package name */
    int f64525i;

    /* renamed from: j, reason: collision with root package name */
    float f64526j;

    /* renamed from: k, reason: collision with root package name */
    float f64527k;

    /* renamed from: l, reason: collision with root package name */
    int f64528l;

    /* renamed from: m, reason: collision with root package name */
    int f64529m;

    /* renamed from: o, reason: collision with root package name */
    int f64531o;

    /* renamed from: p, reason: collision with root package name */
    int f64532p;

    /* renamed from: q, reason: collision with root package name */
    boolean f64533q;

    /* renamed from: r, reason: collision with root package name */
    boolean f64534r;

    /* renamed from: a, reason: collision with root package name */
    int f64517a = a.e.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    int f64518b = a.e.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    int f64519c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    int f64520d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    List<Integer> f64530n = new ArrayList();

    public int a() {
        return this.f64523g;
    }

    public int b() {
        return this.f64524h;
    }

    public int c() {
        return this.f64524h - this.f64525i;
    }

    c() {
    }

    void d(View view, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        this.f64517a = Math.min(this.f64517a, (view.getLeft() - bVar.B2()) - i10);
        this.f64518b = Math.min(this.f64518b, (view.getTop() - bVar.L0()) - i11);
        this.f64519c = Math.max(this.f64519c, view.getRight() + bVar.t3() + i12);
        this.f64520d = Math.max(this.f64520d, view.getBottom() + bVar.x2() + i13);
    }
}

package com.google.android.gms.internal.ads;

import Oc.C4413m0;
import Oc.InterfaceC4401i0;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.s60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9481s60 {

    /* renamed from: a, reason: collision with root package name */
    private Oc.Y1 f78994a;

    /* renamed from: b, reason: collision with root package name */
    private Oc.d2 f78995b;

    /* renamed from: c, reason: collision with root package name */
    private String f78996c;

    /* renamed from: d, reason: collision with root package name */
    private Oc.R1 f78997d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f78998e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f78999f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f79000g;

    /* renamed from: h, reason: collision with root package name */
    private C7088Mg f79001h;

    /* renamed from: i, reason: collision with root package name */
    private Oc.j2 f79002i;

    /* renamed from: j, reason: collision with root package name */
    private Jc.a f79003j;

    /* renamed from: k, reason: collision with root package name */
    private Jc.e f79004k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC4401i0 f79005l;

    /* renamed from: n, reason: collision with root package name */
    private C7364Uj f79007n;

    /* renamed from: r, reason: collision with root package name */
    private C8024eX f79011r;

    /* renamed from: t, reason: collision with root package name */
    private Bundle f79013t;

    /* renamed from: u, reason: collision with root package name */
    private C4413m0 f79014u;

    /* renamed from: m, reason: collision with root package name */
    private int f79006m = 1;

    /* renamed from: o, reason: collision with root package name */
    private final C7986e60 f79008o = new C7986e60();

    /* renamed from: p, reason: collision with root package name */
    private boolean f79009p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f79010q = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f79012s = false;

    public final C7986e60 L() {
        return this.f79008o;
    }

    public final C9481s60 P(String str) {
        this.f78996c = str;
        return this;
    }

    public final C9481s60 R(C8024eX c8024eX) {
        this.f79011r = c8024eX;
        return this;
    }

    public final C9481s60 T(boolean z10) {
        this.f79009p = z10;
        return this;
    }

    public final C9481s60 U(boolean z10) {
        this.f79010q = z10;
        return this;
    }

    public final C9481s60 V(boolean z10) {
        this.f79012s = true;
        return this;
    }

    public final C9481s60 a(Bundle bundle) {
        this.f79013t = bundle;
        return this;
    }

    public final C9481s60 b(boolean z10) {
        this.f78998e = z10;
        return this;
    }

    public final C9481s60 c(int i10) {
        this.f79006m = i10;
        return this;
    }

    public final C9481s60 d(C7088Mg c7088Mg) {
        this.f79001h = c7088Mg;
        return this;
    }

    public final C9481s60 e(ArrayList arrayList) {
        this.f78999f = arrayList;
        return this;
    }

    public final C9481s60 f(ArrayList arrayList) {
        this.f79000g = arrayList;
        return this;
    }

    public final String l() {
        return this.f78996c;
    }

    public final boolean s() {
        return this.f79009p;
    }

    public final boolean t() {
        return this.f79010q;
    }

    public final Oc.Y1 B() {
        return this.f78994a;
    }

    public final Oc.d2 D() {
        return this.f78995b;
    }

    public final C9481s60 M(C9695u60 c9695u60) {
        this.f79008o.a(c9695u60.f79589o.f75082a);
        this.f78994a = c9695u60.f79578d;
        this.f78995b = c9695u60.f79579e;
        this.f79014u = c9695u60.f79594t;
        this.f78996c = c9695u60.f79580f;
        this.f78997d = c9695u60.f79575a;
        this.f78999f = c9695u60.f79581g;
        this.f79000g = c9695u60.f79582h;
        this.f79001h = c9695u60.f79583i;
        this.f79002i = c9695u60.f79584j;
        N(c9695u60.f79586l);
        g(c9695u60.f79587m);
        this.f79009p = c9695u60.f79590p;
        this.f79010q = c9695u60.f79591q;
        this.f79011r = c9695u60.f79577c;
        this.f79012s = c9695u60.f79592r;
        this.f79013t = c9695u60.f79593s;
        return this;
    }

    public final C9481s60 N(Jc.a aVar) {
        this.f79003j = aVar;
        if (aVar != null) {
            this.f78998e = aVar.B();
        }
        return this;
    }

    public final C9481s60 O(Oc.d2 d2Var) {
        this.f78995b = d2Var;
        return this;
    }

    public final C9481s60 Q(Oc.j2 j2Var) {
        this.f79002i = j2Var;
        return this;
    }

    public final C9481s60 S(C7364Uj c7364Uj) {
        this.f79007n = c7364Uj;
        this.f78997d = new Oc.R1(false, true, false);
        return this;
    }

    public final C9481s60 g(Jc.e eVar) {
        this.f79004k = eVar;
        if (eVar != null) {
            this.f78998e = eVar.zzc();
            this.f79005l = eVar.B();
        }
        return this;
    }

    public final C9481s60 h(Oc.Y1 y12) {
        this.f78994a = y12;
        return this;
    }

    public final C9481s60 i(Oc.R1 r12) {
        this.f78997d = r12;
        return this;
    }

    public final C9695u60 j() {
        com.google.android.gms.common.internal.r.m(this.f78996c, "ad unit must not be null");
        com.google.android.gms.common.internal.r.m(this.f78995b, "ad size must not be null");
        com.google.android.gms.common.internal.r.m(this.f78994a, "ad request must not be null");
        return new C9695u60(this, null);
    }

    public final C9481s60 v(C4413m0 c4413m0) {
        this.f79014u = c4413m0;
        return this;
    }
}

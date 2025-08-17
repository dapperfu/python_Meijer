package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6704Eq implements InterfaceC7089Qb {

    /* renamed from: b, reason: collision with root package name */
    private final Pc.r0 f66525b;

    /* renamed from: d, reason: collision with root package name */
    final C6602Bq f66527d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f66524a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet f66528e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    final HashSet f66529f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private boolean f66530g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C6636Cq f66526c = new C6636Cq();

    public final String d() {
        return this.f66526c.b();
    }

    public final boolean m() {
        return this.f66530g;
    }

    public final int b() {
        int iA;
        synchronized (this.f66524a) {
            iA = this.f66527d.a();
        }
        return iA;
    }

    public final C9536tq c(com.google.android.gms.common.util.f fVar, String str) {
        return new C9536tq(fVar, this, this.f66526c.a(), str);
    }

    public final void e(C9536tq c9536tq) {
        synchronized (this.f66524a) {
            this.f66528e.add(c9536tq);
        }
    }

    public final void f() {
        synchronized (this.f66524a) {
            this.f66527d.c();
        }
    }

    public final void g() {
        synchronized (this.f66524a) {
            this.f66527d.d();
        }
    }

    public final void h() {
        synchronized (this.f66524a) {
            this.f66527d.e();
        }
    }

    public final void i() {
        synchronized (this.f66524a) {
            this.f66527d.f();
        }
    }

    public final void j(Mc.Y1 y12, long j10) {
        synchronized (this.f66524a) {
            this.f66527d.g(y12, j10);
        }
    }

    public final void k() {
        synchronized (this.f66524a) {
            this.f66527d.h();
        }
    }

    public final void l(HashSet hashSet) {
        synchronized (this.f66524a) {
            this.f66528e.addAll(hashSet);
        }
    }

    public final Bundle n(Context context, C7544b70 c7544b70) {
        HashSet hashSet = new HashSet();
        synchronized (this.f66524a) {
            hashSet.addAll(this.f66528e);
            this.f66528e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f66527d.b(context, this.f66526c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f66529f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C9536tq) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c7544b70.b(hashSet);
        return bundle;
    }

    public C6704Eq(String str, Pc.r0 r0Var) {
        this.f66527d = new C6602Bq(str, r0Var);
        this.f66525b = r0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7089Qb
    public final void a(boolean z10) {
        long jA = Lc.v.c().a();
        if (z10) {
            if (jA - this.f66525b.zzd() > ((Long) Mc.A.c().a(C8659lf.f76293d1)).longValue()) {
                this.f66527d.f65592d = -1;
            } else {
                this.f66527d.f65592d = this.f66525b.zzc();
            }
            this.f66530g = true;
            return;
        }
        this.f66525b.zzr(jA);
        this.f66525b.v(this.f66527d.f65592d);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6829Eq implements InterfaceC7214Qb {

    /* renamed from: b, reason: collision with root package name */
    private final Rc.r0 f67365b;

    /* renamed from: d, reason: collision with root package name */
    final C6727Bq f67367d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f67364a = new Object();

    /* renamed from: e, reason: collision with root package name */
    final HashSet f67368e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    final HashSet f67369f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private boolean f67370g = false;

    /* renamed from: c, reason: collision with root package name */
    private final C6761Cq f67366c = new C6761Cq();

    public final String d() {
        return this.f67366c.b();
    }

    public final boolean m() {
        return this.f67370g;
    }

    public final int b() {
        int iA;
        synchronized (this.f67364a) {
            iA = this.f67367d.a();
        }
        return iA;
    }

    public final C9661tq c(com.google.android.gms.common.util.f fVar, String str) {
        return new C9661tq(fVar, this, this.f67366c.a(), str);
    }

    public final void e(C9661tq c9661tq) {
        synchronized (this.f67364a) {
            this.f67368e.add(c9661tq);
        }
    }

    public final void f() {
        synchronized (this.f67364a) {
            this.f67367d.c();
        }
    }

    public final void g() {
        synchronized (this.f67364a) {
            this.f67367d.d();
        }
    }

    public final void h() {
        synchronized (this.f67364a) {
            this.f67367d.e();
        }
    }

    public final void i() {
        synchronized (this.f67364a) {
            this.f67367d.f();
        }
    }

    public final void j(Oc.Y1 y12, long j10) {
        synchronized (this.f67364a) {
            this.f67367d.g(y12, j10);
        }
    }

    public final void k() {
        synchronized (this.f67364a) {
            this.f67367d.h();
        }
    }

    public final void l(HashSet hashSet) {
        synchronized (this.f67364a) {
            this.f67368e.addAll(hashSet);
        }
    }

    public final Bundle n(Context context, C7669b70 c7669b70) {
        HashSet hashSet = new HashSet();
        synchronized (this.f67364a) {
            hashSet.addAll(this.f67368e);
            this.f67368e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f67367d.b(context, this.f67366c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f67369f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C9661tq) it2.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c7669b70.b(hashSet);
        return bundle;
    }

    public C6829Eq(String str, Rc.r0 r0Var) {
        this.f67367d = new C6727Bq(str, r0Var);
        this.f67365b = r0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7214Qb
    public final void a(boolean z10) {
        long jA = Nc.v.c().a();
        if (z10) {
            if (jA - this.f67365b.zzd() > ((Long) Oc.A.c().a(C8784lf.f77133d1)).longValue()) {
                this.f67367d.f66432d = -1;
            } else {
                this.f67367d.f66432d = this.f67365b.zzc();
            }
            this.f67370g = true;
            return;
        }
        this.f67365b.zzr(jA);
        this.f67365b.v(this.f67367d.f66432d);
    }
}

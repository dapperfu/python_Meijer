package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9661tq {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f79475a;

    /* renamed from: b, reason: collision with root package name */
    private final C6829Eq f79476b;

    /* renamed from: e, reason: collision with root package name */
    private final String f79479e;

    /* renamed from: f, reason: collision with root package name */
    private final String f79480f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f79478d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f79481g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f79482h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f79483i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f79484j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f79485k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f79477c = new LinkedList();

    public final String c() {
        return this.f79479e;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f79478d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f79479e);
                bundle.putString("slotid", this.f79480f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f79484j);
                bundle.putLong("tresponse", this.f79485k);
                bundle.putLong("timp", this.f79481g);
                bundle.putLong("tload", this.f79482h);
                bundle.putLong("pcc", this.f79483i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f79477c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C9554sq) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final void d() {
        synchronized (this.f79478d) {
            try {
                if (this.f79485k != -1) {
                    C9554sq c9554sq = new C9554sq(this);
                    c9554sq.d();
                    this.f79477c.add(c9554sq);
                    this.f79483i++;
                    this.f79476b.f();
                    this.f79476b.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f79478d) {
            try {
                if (this.f79485k != -1 && !this.f79477c.isEmpty()) {
                    C9554sq c9554sq = (C9554sq) this.f79477c.getLast();
                    if (c9554sq.a() == -1) {
                        c9554sq.c();
                        this.f79476b.e(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f79478d) {
            try {
                if (this.f79485k != -1 && this.f79481g == -1) {
                    this.f79481g = this.f79475a.c();
                    this.f79476b.e(this);
                }
                this.f79476b.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f79478d) {
            this.f79476b.h();
        }
    }

    public final void h(boolean z10) {
        synchronized (this.f79478d) {
            try {
                if (this.f79485k != -1) {
                    this.f79482h = this.f79475a.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        synchronized (this.f79478d) {
            this.f79476b.i();
        }
    }

    public final void j(Oc.Y1 y12) {
        synchronized (this.f79478d) {
            long jC = this.f79475a.c();
            this.f79484j = jC;
            this.f79476b.j(y12, jC);
        }
    }

    public final void k(long j10) {
        synchronized (this.f79478d) {
            try {
                this.f79485k = j10;
                if (j10 != -1) {
                    this.f79476b.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    C9661tq(com.google.android.gms.common.util.f fVar, C6829Eq c6829Eq, String str, String str2) {
        this.f79475a = fVar;
        this.f79476b = c6829Eq;
        this.f79479e = str;
        this.f79480f = str2;
    }
}

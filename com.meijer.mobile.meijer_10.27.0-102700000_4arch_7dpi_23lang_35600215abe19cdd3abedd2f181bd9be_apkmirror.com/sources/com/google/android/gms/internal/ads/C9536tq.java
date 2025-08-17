package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9536tq {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f78635a;

    /* renamed from: b, reason: collision with root package name */
    private final C6704Eq f78636b;

    /* renamed from: e, reason: collision with root package name */
    private final String f78639e;

    /* renamed from: f, reason: collision with root package name */
    private final String f78640f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f78638d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f78641g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f78642h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f78643i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f78644j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f78645k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f78637c = new LinkedList();

    public final String c() {
        return this.f78639e;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f78638d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f78639e);
                bundle.putString("slotid", this.f78640f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f78644j);
                bundle.putLong("tresponse", this.f78645k);
                bundle.putLong("timp", this.f78641g);
                bundle.putLong("tload", this.f78642h);
                bundle.putLong("pcc", this.f78643i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.f78637c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C9429sq) it.next()).b());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final void d() {
        synchronized (this.f78638d) {
            try {
                if (this.f78645k != -1) {
                    C9429sq c9429sq = new C9429sq(this);
                    c9429sq.d();
                    this.f78637c.add(c9429sq);
                    this.f78643i++;
                    this.f78636b.f();
                    this.f78636b.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f78638d) {
            try {
                if (this.f78645k != -1 && !this.f78637c.isEmpty()) {
                    C9429sq c9429sq = (C9429sq) this.f78637c.getLast();
                    if (c9429sq.a() == -1) {
                        c9429sq.c();
                        this.f78636b.e(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.f78638d) {
            try {
                if (this.f78645k != -1 && this.f78641g == -1) {
                    this.f78641g = this.f78635a.c();
                    this.f78636b.e(this);
                }
                this.f78636b.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f78638d) {
            this.f78636b.h();
        }
    }

    public final void h(boolean z10) {
        synchronized (this.f78638d) {
            try {
                if (this.f78645k != -1) {
                    this.f78642h = this.f78635a.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        synchronized (this.f78638d) {
            this.f78636b.i();
        }
    }

    public final void j(Mc.Y1 y12) {
        synchronized (this.f78638d) {
            long jC = this.f78635a.c();
            this.f78644j = jC;
            this.f78636b.j(y12, jC);
        }
    }

    public final void k(long j10) {
        synchronized (this.f78638d) {
            try {
                this.f78645k = j10;
                if (j10 != -1) {
                    this.f78636b.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    C9536tq(com.google.android.gms.common.util.f fVar, C6704Eq c6704Eq, String str, String str2) {
        this.f78635a = fVar;
        this.f78636b = c6704Eq;
        this.f78639e = str;
        this.f78640f = str2;
    }
}

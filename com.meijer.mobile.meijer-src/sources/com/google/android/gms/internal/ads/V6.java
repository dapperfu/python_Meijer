package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class V6 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final C7881d7 f71635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71636b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71637c;

    /* renamed from: d, reason: collision with root package name */
    private final int f71638d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f71639e;

    /* renamed from: f, reason: collision with root package name */
    private final Z6 f71640f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f71641g;

    /* renamed from: h, reason: collision with root package name */
    private Y6 f71642h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71643i;

    /* renamed from: j, reason: collision with root package name */
    private G6 f71644j;

    /* renamed from: k, reason: collision with root package name */
    private U6 f71645k;

    /* renamed from: l, reason: collision with root package name */
    private final L6 f71646l;

    protected abstract void C(Object obj);

    public byte[] L() throws zzaou {
        return null;
    }

    public final L6 M() {
        return this.f71646l;
    }

    public final int a() {
        return this.f71646l.b();
    }

    public final G6 b() {
        return this.f71644j;
    }

    public final V6 e(G6 g62) {
        this.f71644j = g62;
        return this;
    }

    public final V6 l(Y6 y62) {
        this.f71642h = y62;
        return this;
    }

    protected abstract C7668b7 o(S6 s62);

    public final String u() {
        return this.f71637c;
    }

    public final int zza() {
        return this.f71636b;
    }

    public final int zzc() {
        return this.f71638d;
    }

    public final void B(zzapv zzapvVar) {
        Z6 z62;
        synchronized (this.f71639e) {
            z62 = this.f71640f;
        }
        z62.a(zzapvVar);
    }

    final void D(String str) {
        Y6 y62 = this.f71642h;
        if (y62 != null) {
            y62.b(this);
        }
        if (C7881d7.f74207c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new T6(this, str, id2));
            } else {
                this.f71635a.a(str, id2);
                this.f71635a.b(toString());
            }
        }
    }

    public final void E() {
        synchronized (this.f71639e) {
            this.f71643i = true;
        }
    }

    final void F() {
        U6 u62;
        synchronized (this.f71639e) {
            u62 = this.f71645k;
        }
        if (u62 != null) {
            u62.a(this);
        }
    }

    final void G(C7668b7 c7668b7) {
        U6 u62;
        synchronized (this.f71639e) {
            u62 = this.f71645k;
        }
        if (u62 != null) {
            u62.b(this, c7668b7);
        }
    }

    final void H(int i10) {
        Y6 y62 = this.f71642h;
        if (y62 != null) {
            y62.c(this, i10);
        }
    }

    final void I(U6 u62) {
        synchronized (this.f71639e) {
            this.f71645k = u62;
        }
    }

    public final boolean J() {
        boolean z10;
        synchronized (this.f71639e) {
            z10 = this.f71643i;
        }
        return z10;
    }

    public final boolean K() {
        synchronized (this.f71639e) {
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f71641g.intValue() - ((V6) obj).f71641g.intValue();
    }

    public final String t() {
        int i10 = this.f71636b;
        String str = this.f71637c;
        if (i10 == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f71638d));
        K();
        return "[ ] " + this.f71637c + " " + "0x".concat(strValueOf) + " NORMAL " + this.f71641g;
    }

    public Map w() throws zzaou {
        return Collections.EMPTY_MAP;
    }

    public final void z(String str) {
        if (C7881d7.f74207c) {
            this.f71635a.a(str, Thread.currentThread().getId());
        }
    }

    public V6(int i10, String str, Z6 z62) {
        C7881d7 c7881d7;
        Uri uri;
        String host;
        if (C7881d7.f74207c) {
            c7881d7 = new C7881d7();
        } else {
            c7881d7 = null;
        }
        this.f71635a = c7881d7;
        this.f71639e = new Object();
        int iHashCode = 0;
        this.f71643i = false;
        this.f71644j = null;
        this.f71636b = i10;
        this.f71637c = str;
        this.f71640f = z62;
        this.f71646l = new L6();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f71638d = iHashCode;
    }

    public final V6 m(int i10) {
        this.f71641g = Integer.valueOf(i10);
        return this;
    }
}

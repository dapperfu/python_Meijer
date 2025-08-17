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
    private final C7756d7 f70795a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70796b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70797c;

    /* renamed from: d, reason: collision with root package name */
    private final int f70798d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f70799e;

    /* renamed from: f, reason: collision with root package name */
    private final Z6 f70800f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f70801g;

    /* renamed from: h, reason: collision with root package name */
    private Y6 f70802h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70803i;

    /* renamed from: j, reason: collision with root package name */
    private G6 f70804j;

    /* renamed from: k, reason: collision with root package name */
    private U6 f70805k;

    /* renamed from: l, reason: collision with root package name */
    private final L6 f70806l;

    protected abstract void C(Object obj);

    public byte[] L() throws zzaou {
        return null;
    }

    public final L6 M() {
        return this.f70806l;
    }

    public final int a() {
        return this.f70806l.b();
    }

    public final G6 b() {
        return this.f70804j;
    }

    public final V6 e(G6 g62) {
        this.f70804j = g62;
        return this;
    }

    public final V6 l(Y6 y62) {
        this.f70802h = y62;
        return this;
    }

    protected abstract C7543b7 o(S6 s62);

    public final String u() {
        return this.f70797c;
    }

    public final int zza() {
        return this.f70796b;
    }

    public final int zzc() {
        return this.f70798d;
    }

    public final void B(zzapv zzapvVar) {
        Z6 z62;
        synchronized (this.f70799e) {
            z62 = this.f70800f;
        }
        z62.a(zzapvVar);
    }

    final void D(String str) {
        Y6 y62 = this.f70802h;
        if (y62 != null) {
            y62.b(this);
        }
        if (C7756d7.f73367c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new T6(this, str, id2));
            } else {
                this.f70795a.a(str, id2);
                this.f70795a.b(toString());
            }
        }
    }

    public final void E() {
        synchronized (this.f70799e) {
            this.f70803i = true;
        }
    }

    final void F() {
        U6 u62;
        synchronized (this.f70799e) {
            u62 = this.f70805k;
        }
        if (u62 != null) {
            u62.a(this);
        }
    }

    final void G(C7543b7 c7543b7) {
        U6 u62;
        synchronized (this.f70799e) {
            u62 = this.f70805k;
        }
        if (u62 != null) {
            u62.b(this, c7543b7);
        }
    }

    final void H(int i10) {
        Y6 y62 = this.f70802h;
        if (y62 != null) {
            y62.c(this, i10);
        }
    }

    final void I(U6 u62) {
        synchronized (this.f70799e) {
            this.f70805k = u62;
        }
    }

    public final boolean J() {
        boolean z10;
        synchronized (this.f70799e) {
            z10 = this.f70803i;
        }
        return z10;
    }

    public final boolean K() {
        synchronized (this.f70799e) {
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f70801g.intValue() - ((V6) obj).f70801g.intValue();
    }

    public final String t() {
        int i10 = this.f70796b;
        String str = this.f70797c;
        if (i10 == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f70798d));
        K();
        return "[ ] " + this.f70797c + " " + "0x".concat(strValueOf) + " NORMAL " + this.f70801g;
    }

    public Map w() throws zzaou {
        return Collections.EMPTY_MAP;
    }

    public final void z(String str) {
        if (C7756d7.f73367c) {
            this.f70795a.a(str, Thread.currentThread().getId());
        }
    }

    public V6(int i10, String str, Z6 z62) {
        C7756d7 c7756d7;
        Uri uri;
        String host;
        if (C7756d7.f73367c) {
            c7756d7 = new C7756d7();
        } else {
            c7756d7 = null;
        }
        this.f70795a = c7756d7;
        this.f70799e = new Object();
        int iHashCode = 0;
        this.f70803i = false;
        this.f70804j = null;
        this.f70796b = i10;
        this.f70797c = str;
        this.f70800f = z62;
        this.f70806l = new L6();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f70798d = iHashCode;
    }

    public final V6 m(int i10) {
        this.f70801g = Integer.valueOf(i10);
        return this;
    }
}

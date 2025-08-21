package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.bs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7744bs implements InterfaceC9430rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f73720a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9430rh0 f73721b;

    /* renamed from: c, reason: collision with root package name */
    private final String f73722c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73723d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f73724e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f73725f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f73726g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f73727h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C7013Kc f73728i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f73729j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f73730k = false;

    /* renamed from: l, reason: collision with root package name */
    private C8155fk0 f73731l;

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void d(Pu0 pu0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f73727h;
    }

    private final boolean h() {
        if (!this.f73724e) {
            return false;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f77360t4)).booleanValue() || this.f73729j) {
            return ((Boolean) Oc.A.c().a(C8784lf.f77374u4)).booleanValue() && !this.f73730k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        Long l10;
        if (this.f73726g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f73726g = true;
        Uri uri = c8155fk0.f74991a;
        this.f73727h = uri;
        this.f73731l = c8155fk0;
        this.f73728i = C7013Kc.B(uri);
        C6911Hc c6911HcB = null;
        if (!((Boolean) Oc.A.c().a(C8784lf.f77318q4)).booleanValue()) {
            if (this.f73728i != null) {
                this.f73728i.f68969h = c8155fk0.f74995e;
                this.f73728i.f68970i = C7392Vf0.c(this.f73722c);
                this.f73728i.f68971j = this.f73723d;
                c6911HcB = Nc.v.f().b(this.f73728i);
            }
            if (c6911HcB != null && c6911HcB.I0()) {
                this.f73729j = c6911HcB.U0();
                this.f73730k = c6911HcB.zzf();
                if (!h()) {
                    this.f73725f = c6911HcB.b0();
                    return -1L;
                }
            }
        } else if (this.f73728i != null) {
            this.f73728i.f68969h = c8155fk0.f74995e;
            this.f73728i.f68970i = C7392Vf0.c(this.f73722c);
            this.f73728i.f68971j = this.f73723d;
            if (this.f73728i.f68968g) {
                l10 = (Long) Oc.A.c().a(C8784lf.f77346s4);
            } else {
                l10 = (Long) Oc.A.c().a(C8784lf.f77332r4);
            }
            long jLongValue = l10.longValue();
            Nc.v.c().c();
            Nc.v.g();
            Future futureA = C7418Wc.a(this.f73720a, this.f73728i);
            try {
                try {
                    C7451Xc c7451Xc = (C7451Xc) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                    c7451Xc.d();
                    this.f73729j = c7451Xc.f();
                    this.f73730k = c7451Xc.e();
                    c7451Xc.a();
                    if (!h()) {
                        this.f73725f = c7451Xc.c();
                    }
                } catch (InterruptedException unused) {
                    futureA.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureA.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            Nc.v.c().c();
            throw null;
        }
        if (this.f73728i != null) {
            C7940dj0 c7940dj0A = c8155fk0.a();
            c7940dj0A.d(Uri.parse(this.f73728i.f68962a));
            this.f73731l = c7940dj0A.e();
        }
        return this.f73721b.a(this.f73731l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f73726g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f73725f;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.f73721b.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        if (!this.f73726g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f73726g = false;
        this.f73727h = null;
        InputStream inputStream = this.f73725f;
        if (inputStream == null) {
            this.f73721b.zzd();
        } else {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f73725f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    public C7744bs(Context context, InterfaceC9430rh0 interfaceC9430rh0, String str, int i10, Pu0 pu0, InterfaceC7637as interfaceC7637as) {
        this.f73720a = context;
        this.f73721b = interfaceC9430rh0;
        this.f73722c = str;
        this.f73723d = i10;
        new AtomicLong(-1L);
        this.f73724e = ((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue();
    }
}

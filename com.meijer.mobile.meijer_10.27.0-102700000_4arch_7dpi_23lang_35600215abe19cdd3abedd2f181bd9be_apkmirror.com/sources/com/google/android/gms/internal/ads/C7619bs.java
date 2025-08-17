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
public final class C7619bs implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72880a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9305rh0 f72881b;

    /* renamed from: c, reason: collision with root package name */
    private final String f72882c;

    /* renamed from: d, reason: collision with root package name */
    private final int f72883d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f72884e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f72885f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72886g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f72887h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C6888Kc f72888i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f72889j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f72890k = false;

    /* renamed from: l, reason: collision with root package name */
    private C8030fk0 f72891l;

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f72887h;
    }

    private final boolean h() {
        if (!this.f72884e) {
            return false;
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76520t4)).booleanValue() || this.f72889j) {
            return ((Boolean) Mc.A.c().a(C8659lf.f76534u4)).booleanValue() && !this.f72890k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        Long l10;
        if (this.f72886g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f72886g = true;
        Uri uri = c8030fk0.f74151a;
        this.f72887h = uri;
        this.f72891l = c8030fk0;
        this.f72888i = C6888Kc.B(uri);
        C6786Hc c6786HcB = null;
        if (!((Boolean) Mc.A.c().a(C8659lf.f76478q4)).booleanValue()) {
            if (this.f72888i != null) {
                this.f72888i.f68129h = c8030fk0.f74155e;
                this.f72888i.f68130i = C7267Vf0.c(this.f72882c);
                this.f72888i.f68131j = this.f72883d;
                c6786HcB = Lc.v.f().b(this.f72888i);
            }
            if (c6786HcB != null && c6786HcB.K0()) {
                this.f72889j = c6786HcB.W0();
                this.f72890k = c6786HcB.zzf();
                if (!h()) {
                    this.f72885f = c6786HcB.c0();
                    return -1L;
                }
            }
        } else if (this.f72888i != null) {
            this.f72888i.f68129h = c8030fk0.f74155e;
            this.f72888i.f68130i = C7267Vf0.c(this.f72882c);
            this.f72888i.f68131j = this.f72883d;
            if (this.f72888i.f68128g) {
                l10 = (Long) Mc.A.c().a(C8659lf.f76506s4);
            } else {
                l10 = (Long) Mc.A.c().a(C8659lf.f76492r4);
            }
            long jLongValue = l10.longValue();
            Lc.v.c().c();
            Lc.v.g();
            Future futureA = C7293Wc.a(this.f72880a, this.f72888i);
            try {
                try {
                    C7326Xc c7326Xc = (C7326Xc) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                    c7326Xc.d();
                    this.f72889j = c7326Xc.f();
                    this.f72890k = c7326Xc.e();
                    c7326Xc.a();
                    if (!h()) {
                        this.f72885f = c7326Xc.c();
                    }
                } catch (InterruptedException unused) {
                    futureA.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureA.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            Lc.v.c().c();
            throw null;
        }
        if (this.f72888i != null) {
            C7815dj0 c7815dj0A = c8030fk0.a();
            c7815dj0A.d(Uri.parse(this.f72888i.f68122a));
            this.f72891l = c7815dj0A.e();
        }
        return this.f72881b.a(this.f72891l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f72886g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f72885f;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.f72881b.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        if (!this.f72886g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f72886g = false;
        this.f72887h = null;
        InputStream inputStream = this.f72885f;
        if (inputStream == null) {
            this.f72881b.zzd();
        } else {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f72885f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    public C7619bs(Context context, InterfaceC9305rh0 interfaceC9305rh0, String str, int i10, Pu0 pu0, InterfaceC7512as interfaceC7512as) {
        this.f72880a = context;
        this.f72881b = interfaceC9305rh0;
        this.f72882c = str;
        this.f72883d = i10;
        new AtomicLong(-1L);
        this.f72884e = ((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue();
    }
}

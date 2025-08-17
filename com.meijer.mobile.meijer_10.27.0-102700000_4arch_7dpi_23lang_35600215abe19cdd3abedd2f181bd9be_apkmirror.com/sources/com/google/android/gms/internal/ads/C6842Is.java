package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.Is, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6842Is extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f67709e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9305rh0 f67710f;

    /* renamed from: g, reason: collision with root package name */
    private final String f67711g;

    /* renamed from: h, reason: collision with root package name */
    private final int f67712h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f67713i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f67714j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f67715k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f67716l;

    /* renamed from: m, reason: collision with root package name */
    private volatile C6888Kc f67717m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f67718n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f67719o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f67720p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f67721q;

    /* renamed from: r, reason: collision with root package name */
    private long f67722r;

    /* renamed from: s, reason: collision with root package name */
    private com.google.common.util.concurrent.q f67723s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicLong f67724t;

    /* renamed from: u, reason: collision with root package name */
    private final C7215Ts f67725u;

    public C6842Is(Context context, InterfaceC9305rh0 interfaceC9305rh0, String str, int i10, Pu0 pu0, C7215Ts c7215Ts) {
        super(false);
        this.f67709e = context;
        this.f67710f = interfaceC9305rh0;
        this.f67725u = c7215Ts;
        this.f67711g = str;
        this.f67712h = i10;
        this.f67718n = false;
        this.f67719o = false;
        this.f67720p = false;
        this.f67721q = false;
        this.f67722r = 0L;
        this.f67724t = new AtomicLong(-1L);
        this.f67723s = null;
        this.f67713i = ((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue();
        d(pu0);
    }

    public final long k() {
        return this.f67722r;
    }

    public final boolean n() {
        return this.f67718n;
    }

    public final boolean o() {
        return this.f67721q;
    }

    public final boolean p() {
        return this.f67720p;
    }

    public final boolean q() {
        return this.f67719o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f67716l;
    }

    private final boolean r() {
        if (!this.f67713i) {
            return false;
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f76520t4)).booleanValue() || this.f67720p) {
            return ((Boolean) Mc.A.c().a(C8659lf.f76534u4)).booleanValue() && !this.f67721q;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.C8030fk0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6842Is.a(com.google.android.gms.internal.ads.fk0):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        if (this.f67717m != null) {
            if (this.f67724t.get() != -1) {
                return this.f67724t.get();
            }
            synchronized (this) {
                try {
                    if (this.f67723s == null) {
                        this.f67723s = C6908Kq.f68174a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.Hs
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f67512a.m();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f67723s.isDone()) {
                try {
                    this.f67724t.compareAndSet(-1L, ((Long) this.f67723s.get()).longValue());
                    return this.f67724t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f67715k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f67714j;
        int iZza = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f67710f.zza(bArr, i10, i11);
        if (this.f67713i && this.f67714j == null) {
            return iZza;
        }
        zzg(iZza);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        if (!this.f67715k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f67715k = false;
        this.f67716l = null;
        boolean z10 = (this.f67713i && this.f67714j == null) ? false : true;
        InputStream inputStream = this.f67714j;
        if (inputStream != null) {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f67714j = null;
        } else {
            this.f67710f.zzd();
        }
        if (z10) {
            h();
        }
    }

    final /* synthetic */ Long m() throws Exception {
        return Long.valueOf(Lc.v.f().a(this.f67717m));
    }
}

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
public final class C6967Is extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f68549e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9430rh0 f68550f;

    /* renamed from: g, reason: collision with root package name */
    private final String f68551g;

    /* renamed from: h, reason: collision with root package name */
    private final int f68552h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f68553i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f68554j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f68555k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f68556l;

    /* renamed from: m, reason: collision with root package name */
    private volatile C7013Kc f68557m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f68558n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68559o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f68560p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f68561q;

    /* renamed from: r, reason: collision with root package name */
    private long f68562r;

    /* renamed from: s, reason: collision with root package name */
    private com.google.common.util.concurrent.q f68563s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicLong f68564t;

    /* renamed from: u, reason: collision with root package name */
    private final C7340Ts f68565u;

    public C6967Is(Context context, InterfaceC9430rh0 interfaceC9430rh0, String str, int i10, Pu0 pu0, C7340Ts c7340Ts) {
        super(false);
        this.f68549e = context;
        this.f68550f = interfaceC9430rh0;
        this.f68565u = c7340Ts;
        this.f68551g = str;
        this.f68552h = i10;
        this.f68558n = false;
        this.f68559o = false;
        this.f68560p = false;
        this.f68561q = false;
        this.f68562r = 0L;
        this.f68564t = new AtomicLong(-1L);
        this.f68563s = null;
        this.f68553i = ((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue();
        d(pu0);
    }

    public final long k() {
        return this.f68562r;
    }

    public final boolean n() {
        return this.f68558n;
    }

    public final boolean o() {
        return this.f68561q;
    }

    public final boolean p() {
        return this.f68560p;
    }

    public final boolean q() {
        return this.f68559o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f68556l;
    }

    private final boolean r() {
        if (!this.f68553i) {
            return false;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f77360t4)).booleanValue() || this.f68560p) {
            return ((Boolean) Oc.A.c().a(C8784lf.f77374u4)).booleanValue() && !this.f68561q;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.C8155fk0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6967Is.a(com.google.android.gms.internal.ads.fk0):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        if (this.f68557m != null) {
            if (this.f68564t.get() != -1) {
                return this.f68564t.get();
            }
            synchronized (this) {
                try {
                    if (this.f68563s == null) {
                        this.f68563s = C7033Kq.f69014a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.Hs
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f68352a.m();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f68563s.isDone()) {
                try {
                    this.f68564t.compareAndSet(-1L, ((Long) this.f68563s.get()).longValue());
                    return this.f68564t.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f68555k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f68554j;
        int iZza = inputStream != null ? inputStream.read(bArr, i10, i11) : this.f68550f.zza(bArr, i10, i11);
        if (this.f68553i && this.f68554j == null) {
            return iZza;
        }
        zzg(iZza);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        if (!this.f68555k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f68555k = false;
        this.f68556l = null;
        boolean z10 = (this.f68553i && this.f68554j == null) ? false : true;
        InputStream inputStream = this.f68554j;
        if (inputStream != null) {
            com.google.android.gms.common.util.l.a(inputStream);
            this.f68554j = null;
        } else {
            this.f68550f.zzd();
        }
        if (z10) {
            h();
        }
    }

    final /* synthetic */ Long m() throws Exception {
        return Long.valueOf(Nc.v.f().a(this.f68557m));
    }
}

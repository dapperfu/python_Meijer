package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ou0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9136ou0 implements InterfaceC9430rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9430rh0 f78281a;

    /* renamed from: b, reason: collision with root package name */
    private long f78282b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f78283c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f78284d = Collections.EMPTY_MAP;

    public final long h() {
        return this.f78282b;
    }

    public final Uri i() {
        return this.f78283c;
    }

    public final Map j() {
        return this.f78284d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        this.f78283c = c8155fk0.f74991a;
        this.f78284d = Collections.EMPTY_MAP;
        try {
            long jA = this.f78281a.a(c8155fk0);
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.f78283c = uriZzc;
            }
            this.f78284d = zze();
            return jA;
        } catch (Throwable th2) {
            Uri uriZzc2 = zzc();
            if (uriZzc2 != null) {
                this.f78283c = uriZzc2;
            }
            this.f78284d = zze();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iZza = this.f78281a.zza(bArr, i10, i11);
        if (iZza != -1) {
            this.f78282b += iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f78281a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        this.f78281a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        return this.f78281a.zze();
    }

    public C9136ou0(InterfaceC9430rh0 interfaceC9430rh0) {
        this.f78281a = interfaceC9430rh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        this.f78281a.d(pu0);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ou0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9011ou0 implements InterfaceC9305rh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9305rh0 f77441a;

    /* renamed from: b, reason: collision with root package name */
    private long f77442b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f77443c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f77444d = Collections.EMPTY_MAP;

    public final long h() {
        return this.f77442b;
    }

    public final Uri i() {
        return this.f77443c;
    }

    public final Map j() {
        return this.f77444d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        this.f77443c = c8030fk0.f74151a;
        this.f77444d = Collections.EMPTY_MAP;
        try {
            long jA = this.f77441a.a(c8030fk0);
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.f77443c = uriZzc;
            }
            this.f77444d = zze();
            return jA;
        } catch (Throwable th2) {
            Uri uriZzc2 = zzc();
            if (uriZzc2 != null) {
                this.f77443c = uriZzc2;
            }
            this.f77444d = zze();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int iZza = this.f77441a.zza(bArr, i10, i11);
        if (iZza != -1) {
            this.f77442b += iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f77441a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        this.f77441a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final Map zze() {
        return this.f77441a.zze();
    }

    public C9011ou0(InterfaceC9305rh0 interfaceC9305rh0) {
        this.f77441a = interfaceC9305rh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void d(Pu0 pu0) {
        pu0.getClass();
        this.f77441a.d(pu0);
    }
}

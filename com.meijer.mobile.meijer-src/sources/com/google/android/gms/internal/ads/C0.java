package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public class C0 implements InterfaceC9361r0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9361r0 f66516a;

    public C0(InterfaceC9361r0 interfaceC9361r0) {
        this.f66516a = interfaceC9361r0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public long zzd() {
        return this.f66516a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public long zze() {
        return this.f66516a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public long zzf() {
        return this.f66516a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f66516a.b(bArr, 0, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f66516a.c(bArr, 0, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void e(int i10) throws IOException {
        this.f66516a.e(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final int f(byte[] bArr, int i10, int i11) throws IOException {
        return this.f66516a.f(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void g(byte[] bArr, int i10, int i11) throws IOException {
        this.f66516a.g(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0, com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        return this.f66516a.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final int zzc(int i10) throws IOException {
        return this.f66516a.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzg(int i10) throws IOException {
        this.f66516a.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        this.f66516a.zzi(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9361r0
    public final void zzj() {
        this.f66516a.zzj();
    }
}

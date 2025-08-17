package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public class C0 implements InterfaceC9236r0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9236r0 f65676a;

    public C0(InterfaceC9236r0 interfaceC9236r0) {
        this.f65676a = interfaceC9236r0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public long zzd() {
        return this.f65676a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public long zze() {
        return this.f65676a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public long zzf() {
        return this.f65676a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f65676a.b(bArr, 0, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        return this.f65676a.c(bArr, 0, i11, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void e(int i10) throws IOException {
        this.f65676a.e(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final int f(byte[] bArr, int i10, int i11) throws IOException {
        return this.f65676a.f(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void g(byte[] bArr, int i10, int i11) throws IOException {
        this.f65676a.g(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0, com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        return this.f65676a.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final int zzc(int i10) throws IOException {
        return this.f65676a.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzg(int i10) throws IOException {
        this.f65676a.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzi(byte[] bArr, int i10, int i11) throws IOException {
        this.f65676a.zzi(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9236r0
    public final void zzj() {
        this.f65676a.zzj();
    }
}

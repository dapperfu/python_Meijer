package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8840nF0 implements PG0 {

    /* renamed from: a, reason: collision with root package name */
    private final PG0 f77019a;

    /* renamed from: b, reason: collision with root package name */
    private final C9742vm f77020b;

    public C8840nF0(PG0 pg0, C9742vm c9742vm) {
        this.f77019a = pg0;
        this.f77020b = c9742vm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8840nF0)) {
            return false;
        }
        C8840nF0 c8840nF0 = (C8840nF0) obj;
        return this.f77019a.equals(c8840nF0.f77019a) && this.f77020b.equals(c8840nF0.f77020b);
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzd() {
        return this.f77019a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C9742vm zzg() {
        return this.f77020b;
    }

    public final int hashCode() {
        return ((this.f77020b.hashCode() + 527) * 31) + this.f77019a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zza(int i10) {
        return this.f77019a.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final int zzb() {
        return this.f77019a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzc(int i10) {
        return this.f77019a.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C zze(int i10) {
        return this.f77020b.b(this.f77019a.zza(i10));
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final C zzf() {
        return this.f77020b.b(this.f77019a.zzb());
    }
}

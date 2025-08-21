package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8965nF0 implements PG0 {

    /* renamed from: a, reason: collision with root package name */
    private final PG0 f77859a;

    /* renamed from: b, reason: collision with root package name */
    private final C9867vm f77860b;

    public C8965nF0(PG0 pg0, C9867vm c9867vm) {
        this.f77859a = pg0;
        this.f77860b = c9867vm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8965nF0)) {
            return false;
        }
        C8965nF0 c8965nF0 = (C8965nF0) obj;
        return this.f77859a.equals(c8965nF0.f77859a) && this.f77860b.equals(c8965nF0.f77860b);
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzd() {
        return this.f77859a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C9867vm zzg() {
        return this.f77860b;
    }

    public final int hashCode() {
        return ((this.f77860b.hashCode() + 527) * 31) + this.f77859a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zza(int i10) {
        return this.f77859a.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final int zzb() {
        return this.f77859a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final int zzc(int i10) {
        return this.f77859a.zzc(i10);
    }

    @Override // com.google.android.gms.internal.ads.TG0
    public final C zze(int i10) {
        return this.f77860b.b(this.f77859a.zza(i10));
    }

    @Override // com.google.android.gms.internal.ads.PG0
    public final C zzf() {
        return this.f77860b.b(this.f77859a.zzb());
    }
}

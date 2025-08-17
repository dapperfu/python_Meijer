package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class A5 implements I5 {

    /* renamed from: a, reason: collision with root package name */
    private final I5[] f81657a;

    A5(I5... i5Arr) {
        this.f81657a = i5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f81657a[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final H5 zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            I5 i52 = this.f81657a[i10];
            if (i52.zzb(cls)) {
                return i52.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}

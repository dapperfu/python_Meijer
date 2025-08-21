package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class B5 implements W5 {

    /* renamed from: b, reason: collision with root package name */
    private static final I5 f82502b = new C10709z5();

    /* renamed from: a, reason: collision with root package name */
    private final I5 f82503a;

    public B5() {
        Z4 z4A = Z4.a();
        int i10 = S5.f82822d;
        A5 a52 = new A5(z4A, f82502b);
        byte[] bArr = C10611o5.f83156b;
        this.f82503a = a52;
    }

    @Override // com.google.android.gms.internal.measurement.W5
    public final V5 zza(Class cls) {
        int i10 = X5.f82937b;
        if (!AbstractC10521e5.class.isAssignableFrom(cls)) {
            int i11 = S5.f82822d;
        }
        H5 h5Zzc = this.f82503a.zzc(cls);
        if (h5Zzc.zza()) {
            int i12 = S5.f82822d;
            return O5.e(X5.a(), S4.a(), h5Zzc.zzb());
        }
        int i13 = S5.f82822d;
        return N5.w(cls, h5Zzc, Q5.a(), C10682w5.a(), X5.a(), h5Zzc.zzc() + (-1) != 1 ? S4.a() : null, G5.a());
    }
}

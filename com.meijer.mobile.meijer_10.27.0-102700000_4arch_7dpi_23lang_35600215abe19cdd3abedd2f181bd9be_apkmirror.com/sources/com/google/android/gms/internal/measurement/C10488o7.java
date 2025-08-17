package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10488o7 implements InterfaceC10479n7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82317a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f82318b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC10449k4 f82319c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC10449k4 f82320d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC10449k4 f82321e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC10449k4 f82322f;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82317a = c10395e4B.d("measurement.test.boolean_flag", false);
        f82318b = c10395e4B.c("measurement.test.cached_long_flag", -1L);
        f82319c = c10395e4B.e("measurement.test.double_flag", -3.0d);
        f82320d = c10395e4B.c("measurement.test.int_flag", -2L);
        f82321e = c10395e4B.c("measurement.test.long_flag", -1L);
        f82322f = c10395e4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final boolean zza() {
        return ((Boolean) f82317a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final long zzb() {
        return ((Long) f82318b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final double zzc() {
        return ((Double) f82319c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final long zzd() {
        return ((Long) f82320d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final long zze() {
        return ((Long) f82321e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10479n7
    public final String zzf() {
        return (String) f82322f.d();
    }
}

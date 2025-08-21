package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10613o7 implements InterfaceC10604n7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83157a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10574k4 f83158b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC10574k4 f83159c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC10574k4 f83160d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC10574k4 f83161e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC10574k4 f83162f;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f83157a = c10520e4B.d("measurement.test.boolean_flag", false);
        f83158b = c10520e4B.c("measurement.test.cached_long_flag", -1L);
        f83159c = c10520e4B.e("measurement.test.double_flag", -3.0d);
        f83160d = c10520e4B.c("measurement.test.int_flag", -2L);
        f83161e = c10520e4B.c("measurement.test.long_flag", -1L);
        f83162f = c10520e4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final boolean zza() {
        return ((Boolean) f83157a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final long zzb() {
        return ((Long) f83158b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final double zzc() {
        return ((Double) f83159c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final long zzd() {
        return ((Long) f83160d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final long zze() {
        return ((Long) f83161e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10604n7
    public final String zzf() {
        return (String) f83162f.d();
    }
}

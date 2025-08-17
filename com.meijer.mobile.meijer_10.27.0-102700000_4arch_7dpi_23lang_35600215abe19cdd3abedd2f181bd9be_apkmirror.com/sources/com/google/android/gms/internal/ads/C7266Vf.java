package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7266Vf {

    /* renamed from: a, reason: collision with root package name */
    private final String f70900a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f70901b;

    /* renamed from: c, reason: collision with root package name */
    private final int f70902c;

    protected C7266Vf(String str, Object obj, int i10) {
        this.f70900a = str;
        this.f70901b = obj;
        this.f70902c = i10;
    }

    public static C7266Vf c(String str, String str2) {
        return new C7266Vf("gad:dynamite_module:experiment_id", "", 4);
    }

    public static C7266Vf a(String str, double d10) {
        return new C7266Vf(str, Double.valueOf(d10), 3);
    }

    public static C7266Vf b(String str, long j10) {
        return new C7266Vf(str, Long.valueOf(j10), 2);
    }

    public static C7266Vf d(String str, boolean z10) {
        return new C7266Vf(str, Boolean.valueOf(z10), 1);
    }

    public final Object e() {
        InterfaceC6624Cg interfaceC6624CgA = C6692Eg.a();
        if (interfaceC6624CgA == null) {
            if (C6692Eg.b() != null) {
                C6692Eg.b().zza();
            }
            return this.f70901b;
        }
        int i10 = this.f70902c - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return interfaceC6624CgA.a(this.f70900a, (String) this.f70901b);
                }
                return interfaceC6624CgA.b(this.f70900a, ((Double) this.f70901b).doubleValue());
            }
            return interfaceC6624CgA.c(this.f70900a, ((Long) this.f70901b).longValue());
        }
        return interfaceC6624CgA.zza(this.f70900a, ((Boolean) this.f70901b).booleanValue());
    }
}

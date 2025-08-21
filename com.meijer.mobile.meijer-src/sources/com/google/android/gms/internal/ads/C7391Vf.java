package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7391Vf {

    /* renamed from: a, reason: collision with root package name */
    private final String f71740a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f71741b;

    /* renamed from: c, reason: collision with root package name */
    private final int f71742c;

    protected C7391Vf(String str, Object obj, int i10) {
        this.f71740a = str;
        this.f71741b = obj;
        this.f71742c = i10;
    }

    public static C7391Vf c(String str, String str2) {
        return new C7391Vf("gad:dynamite_module:experiment_id", "", 4);
    }

    public static C7391Vf a(String str, double d10) {
        return new C7391Vf(str, Double.valueOf(d10), 3);
    }

    public static C7391Vf b(String str, long j10) {
        return new C7391Vf(str, Long.valueOf(j10), 2);
    }

    public static C7391Vf d(String str, boolean z10) {
        return new C7391Vf(str, Boolean.valueOf(z10), 1);
    }

    public final Object e() {
        InterfaceC6749Cg interfaceC6749CgA = C6817Eg.a();
        if (interfaceC6749CgA == null) {
            if (C6817Eg.b() != null) {
                C6817Eg.b().zza();
            }
            return this.f71741b;
        }
        int i10 = this.f71742c - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return interfaceC6749CgA.a(this.f71740a, (String) this.f71741b);
                }
                return interfaceC6749CgA.b(this.f71740a, ((Double) this.f71741b).doubleValue());
            }
            return interfaceC6749CgA.c(this.f71740a, ((Long) this.f71741b).longValue());
        }
        return interfaceC6749CgA.zza(this.f71740a, ((Boolean) this.f71741b).booleanValue());
    }
}

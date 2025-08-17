package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10885s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f84038a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f84039b;

    protected C10885s5(String str, Object obj, int i10) {
        this.f84038a = str;
        this.f84039b = obj;
    }

    public static C10885s5 a(String str, boolean z10) {
        return new C10885s5(str, Boolean.valueOf(z10), 1);
    }

    public final Object b() {
        InterfaceC10933v5 interfaceC10933v5A = C10965x5.a();
        if (interfaceC10933v5A == null) {
            if (C10965x5.b() != null) {
                C10965x5.b().zza();
            }
            return this.f84039b;
        }
        return interfaceC10933v5A.zza(this.f84038a, ((Boolean) this.f84039b).booleanValue());
    }
}

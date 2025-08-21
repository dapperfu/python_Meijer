package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11010s5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f84878a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f84879b;

    protected C11010s5(String str, Object obj, int i10) {
        this.f84878a = str;
        this.f84879b = obj;
    }

    public static C11010s5 a(String str, boolean z10) {
        return new C11010s5(str, Boolean.valueOf(z10), 1);
    }

    public final Object b() {
        InterfaceC11058v5 interfaceC11058v5A = C11090x5.a();
        if (interfaceC11058v5A == null) {
            if (C11090x5.b() != null) {
                C11090x5.b().zza();
            }
            return this.f84879b;
        }
        return interfaceC11058v5A.zza(this.f84878a, ((Boolean) this.f84879b).booleanValue());
    }
}

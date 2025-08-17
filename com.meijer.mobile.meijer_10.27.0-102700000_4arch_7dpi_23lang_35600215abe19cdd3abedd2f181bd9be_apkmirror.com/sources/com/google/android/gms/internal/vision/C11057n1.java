package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11057n1 implements Q1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC11086x1 f84602b = new C11054m1();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11086x1 f84603a;

    public C11057n1() {
        this(new C11063p1(P0.a(), a()));
    }

    private static InterfaceC11086x1 a() {
        try {
            return (InterfaceC11086x1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f84602b;
        }
    }

    private static boolean b(InterfaceC11077u1 interfaceC11077u1) {
        if (interfaceC11077u1.zza() == K1.f84388a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.Q1
    public final <T> O1<T> zza(Class<T> cls) {
        P1.p(cls);
        InterfaceC11077u1 interfaceC11077u1Zzb = this.f84603a.zzb(cls);
        if (interfaceC11077u1Zzb.zzb()) {
            if (O0.class.isAssignableFrom(cls)) {
                return C1.e(P1.B(), D0.a(), interfaceC11077u1Zzb.zzc());
            }
            return C1.e(P1.f(), D0.b(), interfaceC11077u1Zzb.zzc());
        }
        if (O0.class.isAssignableFrom(cls)) {
            if (b(interfaceC11077u1Zzb)) {
                return A1.k(cls, interfaceC11077u1Zzb, F1.b(), AbstractC11029f1.c(), P1.B(), D0.a(), C11080v1.b());
            }
            return A1.k(cls, interfaceC11077u1Zzb, F1.b(), AbstractC11029f1.c(), P1.B(), null, C11080v1.b());
        }
        if (b(interfaceC11077u1Zzb)) {
            return A1.k(cls, interfaceC11077u1Zzb, F1.a(), AbstractC11029f1.a(), P1.f(), D0.b(), C11080v1.a());
        }
        return A1.k(cls, interfaceC11077u1Zzb, F1.a(), AbstractC11029f1.a(), P1.v(), null, C11080v1.a());
    }

    private C11057n1(InterfaceC11086x1 interfaceC11086x1) {
        this.f84603a = (InterfaceC11086x1) S0.f(interfaceC11086x1, "messageInfoFactory");
    }
}

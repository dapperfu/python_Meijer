package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11182n1 implements Q1 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC11211x1 f85442b = new C11179m1();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11211x1 f85443a;

    public C11182n1() {
        this(new C11188p1(P0.a(), a()));
    }

    private static InterfaceC11211x1 a() {
        try {
            return (InterfaceC11211x1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f85442b;
        }
    }

    private static boolean b(InterfaceC11202u1 interfaceC11202u1) {
        if (interfaceC11202u1.zza() == K1.f85228a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.Q1
    public final <T> O1<T> zza(Class<T> cls) {
        P1.p(cls);
        InterfaceC11202u1 interfaceC11202u1Zzb = this.f85443a.zzb(cls);
        if (interfaceC11202u1Zzb.zzb()) {
            if (O0.class.isAssignableFrom(cls)) {
                return C1.e(P1.B(), D0.a(), interfaceC11202u1Zzb.zzc());
            }
            return C1.e(P1.f(), D0.b(), interfaceC11202u1Zzb.zzc());
        }
        if (O0.class.isAssignableFrom(cls)) {
            if (b(interfaceC11202u1Zzb)) {
                return A1.k(cls, interfaceC11202u1Zzb, F1.b(), AbstractC11154f1.c(), P1.B(), D0.a(), C11205v1.b());
            }
            return A1.k(cls, interfaceC11202u1Zzb, F1.b(), AbstractC11154f1.c(), P1.B(), null, C11205v1.b());
        }
        if (b(interfaceC11202u1Zzb)) {
            return A1.k(cls, interfaceC11202u1Zzb, F1.a(), AbstractC11154f1.a(), P1.f(), D0.b(), C11205v1.a());
        }
        return A1.k(cls, interfaceC11202u1Zzb, F1.a(), AbstractC11154f1.a(), P1.v(), null, C11205v1.a());
    }

    private C11182n1(InterfaceC11211x1 interfaceC11211x1) {
        this.f85443a = (InterfaceC11211x1) S0.f(interfaceC11211x1, "messageInfoFactory");
    }
}

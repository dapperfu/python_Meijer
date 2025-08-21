package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9342qq0 implements InterfaceC9767up0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C9342qq0 f78690a = new C9342qq0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8698kp0 f78691b = AbstractC8698kp0.b(new InterfaceC8485ip0() { // from class: com.google.android.gms.internal.ads.nq0
        @Override // com.google.android.gms.internal.ads.InterfaceC8485ip0
        public final Object a(Ck0 ck0) {
            return Kq0.a((C10086xo0) ck0);
        }
    }, C10086xo0.class, Pk0.class);

    C9342qq0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9767up0
    public final Class zza() {
        return Pk0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9767up0
    public final Class zzb() {
        return Pk0.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9767up0
    public final /* synthetic */ Object a(C9660tp0 c9660tp0) throws GeneralSecurityException {
        return new C9128oq0(c9660tp0, null);
    }

    static void b() throws GeneralSecurityException {
        Uo0.a().f(f78690a);
        Uo0.a().e(f78691b);
    }
}

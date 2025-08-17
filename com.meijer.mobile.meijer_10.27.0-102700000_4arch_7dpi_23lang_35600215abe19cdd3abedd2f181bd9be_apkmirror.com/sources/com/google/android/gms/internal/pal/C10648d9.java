package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.pal.d9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10648d9 implements W7 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f83085a = Logger.getLogger(C10648d9.class.getName());

    C10648d9() {
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final Class zza() {
        return InterfaceC10824o7.class;
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final Class zzb() {
        return InterfaceC10824o7.class;
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final /* synthetic */ Object a(V7 v72) throws GeneralSecurityException {
        return new C10631c9(v72);
    }
}

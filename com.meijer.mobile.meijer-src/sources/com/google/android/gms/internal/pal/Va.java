package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class Va implements W7 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f83769a = Logger.getLogger(Va.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f83770b = {0};

    Va() {
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final Class zza() {
        return J7.class;
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final Class zzb() {
        return J7.class;
    }

    @Override // com.google.android.gms.internal.pal.W7
    public final /* synthetic */ Object a(V7 v72) throws GeneralSecurityException {
        return new Ua(v72, null);
    }
}

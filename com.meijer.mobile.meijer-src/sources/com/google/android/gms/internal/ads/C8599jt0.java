package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.jt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8599jt0 implements InterfaceC8706kt0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9775ut0 f76369a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8706kt0
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = C8920mt0.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f76369a.a(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}

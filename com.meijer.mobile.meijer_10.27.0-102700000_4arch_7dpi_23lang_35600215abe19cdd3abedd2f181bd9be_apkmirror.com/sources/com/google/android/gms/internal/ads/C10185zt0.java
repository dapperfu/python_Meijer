package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.zt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10185zt0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ At0 f80541a;

    C10185zt0(At0 at0) {
        this.f80541a = at0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) C8795mt0.f76916c.a(this.f80541a.f65232b);
            mac.init(this.f80541a.f65233c);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

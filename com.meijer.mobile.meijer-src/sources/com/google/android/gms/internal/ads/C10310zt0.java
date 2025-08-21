package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.zt0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10310zt0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ At0 f81381a;

    C10310zt0(At0 at0) {
        this.f81381a = at0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) C8920mt0.f77756c.a(this.f81381a.f66072b);
            mac.init(this.f81381a.f66073c);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* loaded from: classes6.dex */
final class Se extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Te f82874a;

    Se(Te te2) {
        this.f82874a = te2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) Ee.f82585f.a(this.f82874a.f82893b);
            mac.init(this.f82874a.f82894c);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}

package com.google.android.gms.internal.pal;

import android.util.Base64;
import com.fullstory.FS;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
final class F2 implements E2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10856q7 f82605a;

    F2(InterfaceC10856q7 interfaceC10856q7) {
        this.f82605a = interfaceC10856q7;
    }

    @Override // com.google.android.gms.internal.pal.E2
    public final String zza(String str) throws NonceLoaderException {
        try {
            return Base64.encodeToString(this.f82605a.zza(str.getBytes("UTF-8"), new byte[0]), 10);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e10) {
            FS.log_e("NonceGenerator", "Failed to encrypt the string.", e10);
            throw new NonceLoaderException(HttpResponseStatus.SUCCESS_NO_CONTENT, e10);
        }
    }
}

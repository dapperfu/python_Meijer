package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class I60 {
    public static final String b(byte[] bArr, byte[] bArr2, String str, C9171qN c9171qN) {
        Mk0 mk0C;
        if (str != null && (mk0C = c(str)) != null) {
            try {
                byte[] bArrZza = ((InterfaceC9418sk0) mk0C.d(C10177zp0.d(), InterfaceC9418sk0.class)).zza(bArr, bArr2);
                c9171qN.b().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
                Pc.p0.k("Failed to decrypt ".concat(e10.toString()));
                Lc.v.s().x(e10, "CryptoUtils.decrypt");
                c9171qN.b().put("dsf", e10.toString());
            }
        }
        return null;
    }

    public static final String a() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            Mk0 mk0B = Mk0.b(Gk0.a(To0.b().a("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C9739vk0.b(mk0B, C9632uk0.b(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            Pc.p0.k("Failed to generate key".concat(e10.toString()));
            Lc.v.s().x(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    private static final Mk0 c(String str) throws GeneralSecurityException {
        try {
            try {
                return C9739vk0.a(C9525tk0.b(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            Pc.p0.k("Failed to get keysethandle".concat(e10.toString()));
            Lc.v.s().x(e10, "CryptoUtils.getHandle");
            return null;
        }
    }

    public I60() {
        try {
            Yk0.a();
        } catch (GeneralSecurityException e10) {
            Pc.p0.k("Failed to Configure Aead. ".concat(e10.toString()));
            Lc.v.s().x(e10, "CryptoUtils.registerAead");
        }
    }
}

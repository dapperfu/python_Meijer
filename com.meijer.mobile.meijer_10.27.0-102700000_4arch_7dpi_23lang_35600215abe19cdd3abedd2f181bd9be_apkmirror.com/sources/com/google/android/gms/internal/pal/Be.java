package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Be {

    /* renamed from: a, reason: collision with root package name */
    private final ECPublicKey f82493a;

    public Be(ECPublicKey eCPublicKey) {
        this.f82493a = eCPublicKey;
    }

    public final Ae a(String str, byte[] bArr, byte[] bArr2, int i10, int i11) throws IllegalStateException, GeneralSecurityException {
        KeyPair keyPairC = Ce.c(this.f82493a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairC.getPublic();
        byte[] bArrG = Ce.g((ECPrivateKey) keyPairC.getPrivate(), this.f82493a);
        byte[] bArrL = Ce.l(eCPublicKey.getParams().getCurve(), i11, eCPublicKey.getW());
        byte[] bArrC = C10910te.c(bArrL, bArrG);
        Mac mac = (Mac) Ee.f82585f.a(str);
        if (i10 > mac.getMacLength() * com.medallia.digital.mobilesdk.l3.f92484c) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] bArrDoFinal = mac.doFinal(bArrC);
        byte[] bArr3 = new byte[i10];
        mac.init(new SecretKeySpec(bArrDoFinal, str));
        byte[] bArrDoFinal2 = new byte[0];
        int i12 = 1;
        int i13 = 0;
        while (true) {
            mac.update(bArrDoFinal2);
            mac.update(bArr2);
            mac.update((byte) i12);
            bArrDoFinal2 = mac.doFinal();
            int length = bArrDoFinal2.length;
            int i14 = i13 + length;
            if (i14 >= i10) {
                System.arraycopy(bArrDoFinal2, 0, bArr3, i13, i10 - i13);
                return new Ae(bArrL, bArr3);
            }
            System.arraycopy(bArrDoFinal2, 0, bArr3, i13, length);
            i12++;
            i13 = i14;
        }
    }
}

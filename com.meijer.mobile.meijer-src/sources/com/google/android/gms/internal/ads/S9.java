package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f70878a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f70879b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f70880c = new Object();

    public S9(SecureRandom secureRandom) {
    }

    public final String a(byte[] bArr, byte[] bArr2) throws zzavh {
        byte[] bArrDoFinal;
        byte[] iv2;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f70879b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv2 = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv2.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv2).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return C7672b9.a(bArr3, false);
        } catch (InvalidKeyException e10) {
            throw new zzavh(this, e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzavh(this, e11);
        } catch (BadPaddingException e12) {
            throw new zzavh(this, e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzavh(this, e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzavh(this, e14);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws zzavh {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrB = C7672b9.b(str, false);
            int length2 = bArrB.length;
            if (length2 <= 16) {
                throw new zzavh(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrB);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f70879b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            throw new zzavh(this, e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new zzavh(this, e11);
        } catch (InvalidKeyException e12) {
            throw new zzavh(this, e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new zzavh(this, e13);
        } catch (BadPaddingException e14) {
            throw new zzavh(this, e14);
        } catch (IllegalBlockSizeException e15) {
            throw new zzavh(this, e15);
        } catch (NoSuchPaddingException e16) {
            throw new zzavh(this, e16);
        }
    }

    private static final Cipher c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f70880c) {
            try {
                if (f70878a == null) {
                    f70878a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f70878a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }
}

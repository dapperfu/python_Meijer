package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8419i9 {

    /* renamed from: a, reason: collision with root package name */
    static boolean f75733a;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f75734b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f75735c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f75736d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f75737e = new CountDownLatch(1);

    static Vector c(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / com.medallia.digital.mobilesdk.l3.f93323c; i12++) {
            int i13 = i12 * com.medallia.digital.mobilesdk.l3.f93323c;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + com.medallia.digital.mobilesdk.l3.f93323c;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] h(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z10 ? com.medallia.digital.mobilesdk.l3.f93323c : 239;
        if (length > i10) {
            bArr = g(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).j();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(f(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        InterfaceC8524j9[] interfaceC8524j9Arr = new C10128y9().f80845G2;
        int length3 = interfaceC8524j9Arr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            interfaceC8524j9Arr[i12].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new Z8(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    static W8 a(byte[] bArr, String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vectorC = c(bArr, com.medallia.digital.mobilesdk.l3.f93323c);
        if (vectorC == null || vectorC.isEmpty()) {
            return null;
        }
        W8 w8B0 = X8.b0();
        int size = vectorC.size();
        for (int i10 = 0; i10 < size; i10++) {
            w8B0.u(Zt0.z(h((byte[]) vectorC.get(i10), str, false), 0, 256));
        }
        byte[] bArrF = f(bArr);
        Zt0 zt0 = Zt0.f73122b;
        w8B0.v(Zt0.z(bArrF, 0, bArrF.length));
        return w8B0;
    }

    static void e() {
        synchronized (f75736d) {
            try {
                if (!f75733a) {
                    f75733a = true;
                    new Thread(new RunnableC8205g9(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static byte[] f(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f75735c) {
            try {
                e();
                MessageDigest messageDigest2 = null;
                try {
                    if (f75737e.await(2L, TimeUnit.SECONDS) && (messageDigest = f75734b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f75734b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    static String b(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrJ;
        W8 w8A = a(bArr, str);
        if (w8A == null) {
            bArrJ = h(g(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).j(), str, true);
        } else {
            bArrJ = ((X8) w8A.p()).j();
        }
        return C7672b9.a(bArrJ, true);
    }

    static H8 g(int i10) {
        C8736l8 c8736l8B0 = H8.B0();
        c8736l8B0.x(4096L);
        return (H8) c8736l8B0.p();
    }
}

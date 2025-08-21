package com.google.android.gms.internal.pal;

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

/* loaded from: classes6.dex */
final class R2 {

    /* renamed from: a, reason: collision with root package name */
    static boolean f83690a;

    /* renamed from: b, reason: collision with root package name */
    private static MessageDigest f83691b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f83692c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f83693d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final CountDownLatch f83694e = new CountDownLatch(1);

    static Vector b(byte[] bArr, int i10) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i11 = (length + 254) / com.medallia.digital.mobilesdk.l3.f93323c;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11; i12++) {
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
        int i10 = true != z10 ? com.medallia.digital.mobilesdk.l3.f93323c : 239;
        if (bArr.length > i10) {
            bArr = g(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).i();
        }
        int length = bArr.length;
        if (length < i10) {
            byte[] bArr2 = new byte[i10 - length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).array();
        }
        if (z10) {
            bArrArray = ByteBuffer.allocate(256).put(f(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        S2[] s2Arr = new C11008s3().f84714G2;
        int length2 = s2Arr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            s2Arr[i11].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new I(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    static void d() {
        synchronized (f83693d) {
            try {
                if (!f83690a) {
                    f83690a = true;
                    new Thread(new Q2(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static byte[] f(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f83692c) {
            try {
                d();
                MessageDigest messageDigest2 = null;
                try {
                    if (f83694e.await(2L, TimeUnit.SECONDS) && (messageDigest = f83691b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f83691b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    static String a(B1 b12, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrH;
        byte[] bytes;
        byte[] bArrI = b12.i();
        if (!((Boolean) C10718a5.c().b(C10979q5.f84607w2)).booleanValue()) {
            if (Y3.f83809a != null) {
                if (str != null) {
                    bytes = str.getBytes();
                } else {
                    bytes = new byte[0];
                }
                byte[] bArrZza = Y3.f83809a.zza(bArrI, bytes);
                C11071w2 c11071w2T = C11087x2.t();
                c11071w2T.m(AbstractC10730b0.s(bArrZza));
                c11071w2T.o(3);
                bArrH = ((C11087x2) c11071w2T.j()).i();
            } else {
                throw new GeneralSecurityException();
            }
        } else {
            Vector vectorB = b(bArrI, com.medallia.digital.mobilesdk.l3.f93323c);
            if (vectorB != null && vectorB.size() != 0) {
                C11071w2 c11071w2T2 = C11087x2.t();
                int size = vectorB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c11071w2T2.m(AbstractC10730b0.s(h((byte[]) vectorB.get(i10), str, false)));
                }
                c11071w2T2.n(AbstractC10730b0.s(f(bArrI)));
                bArrH = ((C11087x2) c11071w2T2.j()).i();
            } else {
                bArrH = h(g(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT).i(), str, true);
            }
        }
        return N2.a(bArrH, true);
    }

    static byte[] e(String str, String str2, boolean z10) throws UnsupportedEncodingException {
        byte[] bArrB;
        byte[] bArrB2;
        C10896l2 c10896l2T = C10912m2.t();
        try {
            if (str.length() < 3) {
                bArrB = str.getBytes("ISO-8859-1");
            } else {
                bArrB = N2.b(str, true);
            }
            c10896l2T.n(AbstractC10730b0.s(bArrB));
            if (str2.length() < 3) {
                bArrB2 = str2.getBytes("ISO-8859-1");
            } else {
                bArrB2 = N2.b(str2, true);
            }
            c10896l2T.m(AbstractC10730b0.s(bArrB2));
            return ((C10912m2) c10896l2T.j()).i();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    static B1 g(int i10) {
        Ya yaY = B1.Y();
        yaY.p(4096L);
        return (B1) yaY.j();
    }
}

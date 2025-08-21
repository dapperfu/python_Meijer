package androidx.camera.core.internal.compat.quirk;

import F.g0;
import android.os.Build;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class IncorrectJpegMetadataQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f47748a = new HashSet(Arrays.asList("A24"));

    private boolean c(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                return true;
            }
            i10 += (((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255)) + 2;
        }
        return false;
    }

    private int d(byte[] bArr) {
        int i10 = 2;
        while (true) {
            int i11 = i10 + 1;
            if (i11 > bArr.length) {
                return -1;
            }
            if (bArr[i10] == -1 && bArr[i11] == -40) {
                return i10;
            }
            i10 = i11;
        }
    }

    private static boolean e() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && f47748a.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    static boolean g() {
        return e();
    }

    public byte[] f(n nVar) {
        int iD = 0;
        ByteBuffer byteBufferE = nVar.getPlanes()[0].e();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        if (!c(bArr) && (iD = d(bArr)) == -1) {
            return bArr;
        }
        return Arrays.copyOfRange(bArr, iD, byteBufferE.limit());
    }
}

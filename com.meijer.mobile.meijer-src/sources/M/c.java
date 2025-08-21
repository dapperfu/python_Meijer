package M;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final LargeJpegImageQuirk f19491a = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.b(LargeJpegImageQuirk.class);

    public static int a(byte[] bArr) {
        byte b10;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b10 = bArr[i10]) == -1) {
            int i11 = i10 + 2;
            int i12 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
            if (b10 == -1 && bArr[i10 + 1] == -38) {
                while (true) {
                    int i13 = i11 + 2;
                    if (i13 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                        return i13;
                    }
                    i11++;
                }
            } else {
                i10 += i12 + 2;
            }
        }
        return -1;
    }

    public int b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f19491a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.g(bArr)) {
            return bArr.length;
        }
        int iA = a(bArr);
        return iA != -1 ? iA : bArr.length;
    }
}

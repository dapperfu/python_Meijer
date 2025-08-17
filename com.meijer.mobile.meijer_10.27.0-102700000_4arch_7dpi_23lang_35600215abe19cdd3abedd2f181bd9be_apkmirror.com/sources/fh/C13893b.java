package fh;

import android.graphics.Bitmap;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: fh.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C13893b {
    public Gg.b b(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.f, ?> map) throws WriterException {
        try {
            return new com.google.zxing.j().a(str, aVar, i10, i11, map);
        } catch (WriterException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new WriterException(e11);
        }
    }

    public Bitmap a(Gg.b bVar) {
        int i10;
        int iM = bVar.m();
        int iJ = bVar.j();
        int[] iArr = new int[iM * iJ];
        for (int i11 = 0; i11 < iJ; i11++) {
            int i12 = i11 * iM;
            for (int i13 = 0; i13 < iM; i13++) {
                int i14 = i12 + i13;
                if (bVar.f(i13, i11)) {
                    i10 = -16777216;
                } else {
                    i10 = -1;
                }
                iArr[i14] = i10;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM, iJ, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, iM, 0, 0, iM, iJ);
        return bitmapCreateBitmap;
    }
}

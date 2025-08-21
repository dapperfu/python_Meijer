package f3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: f3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13947b {
    public static Bitmap a(byte[] bArr, int i10, BitmapFactory.Options options, int i11) throws IOException {
        if (i11 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i11; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(byteArrayInputStream);
            byteArrayInputStream.close();
            int iP = aVar.p();
            if (iP == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iP);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }
}

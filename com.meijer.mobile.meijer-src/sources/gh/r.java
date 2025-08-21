package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

/* loaded from: classes8.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private n f134234a;

    /* renamed from: b, reason: collision with root package name */
    private int f134235b;

    /* renamed from: c, reason: collision with root package name */
    private int f134236c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f134237d;

    /* renamed from: e, reason: collision with root package name */
    private int f134238e = 1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f134239f;

    public Bitmap b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f134234a.d(), this.f134234a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f134234a.b(), this.f134235b, this.f134234a.d(), this.f134234a.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f134236c == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f134236c);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }

    public com.google.zxing.k a() {
        n nVarA = this.f134234a.h(this.f134236c).a(this.f134237d, this.f134238e);
        return new com.google.zxing.k(nVarA.b(), nVarA.d(), nVarA.c(), 0, 0, nVarA.d(), nVarA.c(), false);
    }

    public boolean c() {
        return this.f134236c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f134237d = rect;
    }

    public void e(boolean z10) {
        this.f134239f = z10;
    }

    public r(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f134234a = new n(bArr, i10, i11);
        this.f134236c = i13;
        this.f134235b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    public com.google.zxing.o f(com.google.zxing.o oVar) {
        float fC = (oVar.c() * this.f134238e) + this.f134237d.left;
        float fD = (oVar.d() * this.f134238e) + this.f134237d.top;
        if (this.f134239f) {
            fC = this.f134234a.d() - fC;
        }
        return new com.google.zxing.o(fC, fD);
    }
}

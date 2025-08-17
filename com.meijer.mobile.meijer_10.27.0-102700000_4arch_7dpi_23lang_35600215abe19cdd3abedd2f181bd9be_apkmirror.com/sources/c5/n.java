package c5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.InterfaceC15330g;
import q5.C16449a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lc5/n;", "", "<init>", "()V", "", "mimeType", "Lkw/g;", "source", "Lc5/m;", "policy", "Lc5/k;", "a", "(Ljava/lang/String;Lkw/g;Lc5/m;)Lc5/k;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;Lc5/k;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "PAINT", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f61498a = new n();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Paint PAINT = new Paint(3);

    private n() {
    }

    public final C6365k a(String mimeType, InterfaceC15330g source, m policy) {
        if (o.c(policy, mimeType)) {
            androidx.exifinterface.media.a aVar = new androidx.exifinterface.media.a(new l(source.peek().T3()));
            return new C6365k(aVar.y(), aVar.p());
        }
        return C6365k.f61488d;
    }

    public final Bitmap b(Bitmap inBitmap, C6365k exifData) {
        Bitmap bitmapCreateBitmap;
        if (!exifData.getIsFlipped() && !o.a(exifData)) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (o.a(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        if (o.b(exifData)) {
            bitmapCreateBitmap = Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), C16449a.c(inBitmap));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), C16449a.c(inBitmap));
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(inBitmap, matrix, PAINT);
        FS.bitmap_recycle(inBitmap);
        return bitmapCreateBitmap;
    }
}

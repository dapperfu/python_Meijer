package u6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.fullstory.FS;
import g6.C14205e;
import i6.u;
import j6.C14864d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f162757a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f162758b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f162759c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Path> f162760d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<float[]> f162761e = new d();

    /* renamed from: f, reason: collision with root package name */
    private static final float f162762f = (float) (Math.sqrt(2.0d) / 2.0d);

    class a extends ThreadLocal<PathMeasure> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }

        a() {
        }
    }

    class b extends ThreadLocal<Path> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }

        b() {
        }
    }

    class c extends ThreadLocal<Path> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }

        c() {
        }
    }

    public static int i(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (527 * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean j(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static int l(int i10, int i11) {
        return (int) ((((i10 / 255.0f) * i11) / 255.0f) * 255.0f);
    }

    class d extends ThreadLocal<float[]> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }

        d() {
        }
    }

    public static void b(Path path, u uVar) {
        if (uVar == null || uVar.l()) {
            return;
        }
        a(path, ((C14864d) uVar.j()).r() / 100.0f, ((C14864d) uVar.h()).r() / 100.0f, ((C14864d) uVar.i()).r() / 360.0f);
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f10 = pointF.x + pointF3.x;
        float f11 = pointF.y + pointF3.y;
        float f12 = pointF2.x;
        float f13 = f12 + pointF4.x;
        float f14 = pointF2.y;
        path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        return path;
    }

    public static float g(Matrix matrix) {
        float[] fArr = f162761e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f162762f;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f162761e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static boolean k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint) {
        o(canvas, rectF, paint, 31);
    }

    public static void a(Path path, float f10, float f11, float f12) {
        if (C14205e.h()) {
            C14205e.b("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f162758b.get();
        Path path2 = f162759c.get();
        Path path3 = f162760d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            if (C14205e.h()) {
                C14205e.c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = l.f(fMin, length);
                fMax = l.f(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = l.f(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = l.f(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                if (C14205e.h()) {
                    C14205e.c("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (C14205e.h()) {
                C14205e.c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (C14205e.h()) {
            C14205e.c("applyTrimPathIfNeeded");
        }
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap m(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        FS.bitmap_recycle(bitmap);
        return bitmapCreateScaledBitmap;
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (C14205e.h()) {
            C14205e.b("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (C14205e.h()) {
            C14205e.c("Utils#saveLayer");
        }
    }
}

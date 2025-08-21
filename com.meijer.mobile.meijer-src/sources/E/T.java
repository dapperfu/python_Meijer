package E;

import F.x0;
import G.h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T implements androidx.camera.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6869a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6870b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6871c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6872d;

    /* renamed from: e, reason: collision with root package name */
    n.a[] f6873e;

    /* renamed from: f, reason: collision with root package name */
    private final C.I f6874f;

    class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6875a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6876b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f6877c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f6875a = i10;
            this.f6876b = i11;
            this.f6877c = byteBuffer;
        }

        @Override // androidx.camera.core.n.a
        public ByteBuffer e() {
            return this.f6877c;
        }

        @Override // androidx.camera.core.n.a
        public int f() {
            return this.f6875a;
        }

        @Override // androidx.camera.core.n.a
        public int g() {
            return this.f6876b;
        }
    }

    class b implements C.I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6878a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f6880c;

        b(long j10, int i10, Matrix matrix) {
            this.f6878a = j10;
            this.f6879b = i10;
            this.f6880c = matrix;
        }

        @Override // C.I
        public x0 a() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // C.I
        public void b(h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // C.I
        public int c() {
            return this.f6879b;
        }

        @Override // C.I
        public long getTimestamp() {
            return this.f6878a;
        }
    }

    public T(O.B<Bitmap> b10) {
        this(b10.c(), b10.b(), b10.f(), b10.g(), b10.a().getTimestamp());
    }

    private void a() {
        synchronized (this.f6869a) {
            o2.i.j(this.f6873e != null, "The image is closed.");
        }
    }

    private static C.I b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static n.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.n
    public void R0(Rect rect) {
        synchronized (this.f6869a) {
            try {
                a();
                if (rect != null) {
                    this.f6872d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.n
    public C.I S2() {
        C.I i10;
        synchronized (this.f6869a) {
            a();
            i10 = this.f6874f;
        }
        return i10;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f6869a) {
            a();
            this.f6873e = null;
        }
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        synchronized (this.f6869a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        int i10;
        synchronized (this.f6869a) {
            a();
            i10 = this.f6871c;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public n.a[] getPlanes() {
        n.a[] aVarArr;
        synchronized (this.f6869a) {
            a();
            n.a[] aVarArr2 = this.f6873e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        int i10;
        synchronized (this.f6869a) {
            a();
            i10 = this.f6870b;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public Image m3() {
        synchronized (this.f6869a) {
            a();
        }
        return null;
    }

    public T(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(ImageUtil.e(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public T(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f6869a = new Object();
        this.f6870b = i11;
        this.f6871c = i12;
        this.f6872d = rect;
        this.f6874f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f6873e = new n.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}

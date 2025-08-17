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
    private final Object f7462a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7463b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7464c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f7465d;

    /* renamed from: e, reason: collision with root package name */
    n.a[] f7466e;

    /* renamed from: f, reason: collision with root package name */
    private final C.I f7467f;

    class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7468a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f7470c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f7468a = i10;
            this.f7469b = i11;
            this.f7470c = byteBuffer;
        }

        @Override // androidx.camera.core.n.a
        public ByteBuffer e() {
            return this.f7470c;
        }

        @Override // androidx.camera.core.n.a
        public int f() {
            return this.f7468a;
        }

        @Override // androidx.camera.core.n.a
        public int g() {
            return this.f7469b;
        }
    }

    class b implements C.I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f7471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7472b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f7473c;

        b(long j10, int i10, Matrix matrix) {
            this.f7471a = j10;
            this.f7472b = i10;
            this.f7473c = matrix;
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
            return this.f7472b;
        }

        @Override // C.I
        public long getTimestamp() {
            return this.f7471a;
        }
    }

    public T(O.B<Bitmap> b10) {
        this(b10.c(), b10.b(), b10.f(), b10.g(), b10.a().getTimestamp());
    }

    private void a() {
        synchronized (this.f7462a) {
            o2.i.j(this.f7466e != null, "The image is closed.");
        }
    }

    private static C.I b(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static n.a c(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    @Override // androidx.camera.core.n
    public C.I S2() {
        C.I i10;
        synchronized (this.f7462a) {
            a();
            i10 = this.f7467f;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public void T0(Rect rect) {
        synchronized (this.f7462a) {
            try {
                a();
                if (rect != null) {
                    this.f7465d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f7462a) {
            a();
            this.f7466e = null;
        }
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        synchronized (this.f7462a) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        int i10;
        synchronized (this.f7462a) {
            a();
            i10 = this.f7464c;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public n.a[] getPlanes() {
        n.a[] aVarArr;
        synchronized (this.f7462a) {
            a();
            n.a[] aVarArr2 = this.f7466e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        int i10;
        synchronized (this.f7462a) {
            a();
            i10 = this.f7463b;
        }
        return i10;
    }

    @Override // androidx.camera.core.n
    public Image m3() {
        synchronized (this.f7462a) {
            a();
        }
        return null;
    }

    public T(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(ImageUtil.e(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public T(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f7462a = new Object();
        this.f7463b = i11;
        this.f7464c = i12;
        this.f7465d = rect;
        this.f7467f = b(j10, i13, matrix);
        byteBuffer.rewind();
        this.f7466e = new n.a[]{c(byteBuffer, i11 * i10, i10)};
    }
}

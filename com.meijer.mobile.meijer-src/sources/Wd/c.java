package Wd;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f40929a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f40930b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f40931c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f40932a = new c();

        @RecentlyNonNull
        public c a() {
            if (this.f40932a.f40930b != null || this.f40932a.f40931c != null) {
                return this.f40932a;
            }
            c.h(this.f40932a);
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f40932a.c().f40935c = i10;
            return this;
        }

        @RecentlyNonNull
        public a c(@RecentlyNonNull ByteBuffer byteBuffer, int i10, int i11, int i12) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            }
            if (byteBuffer.capacity() < i10 * i11) {
                throw new IllegalArgumentException("Invalid image data size.");
            }
            if (i12 != 16 && i12 != 17 && i12 != 842094169) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f40932a.f40930b = byteBuffer;
            b bVarC = this.f40932a.c();
            bVarC.f40933a = i10;
            bVarC.f40934b = i11;
            bVarC.f40938f = i12;
            return this;
        }

        @RecentlyNonNull
        public a d(int i10) {
            this.f40932a.c().f40937e = i10;
            return this;
        }

        @RecentlyNonNull
        public a e(long j10) {
            this.f40932a.c().f40936d = j10;
            return this;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f40933a;

        /* renamed from: b, reason: collision with root package name */
        private int f40934b;

        /* renamed from: c, reason: collision with root package name */
        private int f40935c;

        /* renamed from: d, reason: collision with root package name */
        private long f40936d;

        /* renamed from: e, reason: collision with root package name */
        private int f40937e;

        /* renamed from: f, reason: collision with root package name */
        private int f40938f;

        public b() {
            this.f40938f = -1;
        }

        public int a() {
            return this.f40938f;
        }

        public int b() {
            return this.f40934b;
        }

        public int c() {
            return this.f40935c;
        }

        public int d() {
            return this.f40937e;
        }

        public long e() {
            return this.f40936d;
        }

        public int f() {
            return this.f40933a;
        }

        public final void i() {
            if (this.f40937e % 2 != 0) {
                int i10 = this.f40933a;
                this.f40933a = this.f40934b;
                this.f40934b = i10;
            }
            this.f40937e = 0;
        }

        public b(@RecentlyNonNull b bVar) {
            this.f40938f = -1;
            this.f40933a = bVar.f();
            this.f40934b = bVar.b();
            this.f40935c = bVar.c();
            this.f40936d = bVar.e();
            this.f40937e = bVar.d();
            this.f40938f = bVar.a();
        }
    }

    /* renamed from: Wd.c$c, reason: collision with other inner class name */
    private static class C0881c {
    }

    private c() {
        this.f40929a = new b();
        this.f40930b = null;
        this.f40931c = null;
    }

    @RecentlyNullable
    public Image.Plane[] d() {
        return null;
    }

    @RecentlyNullable
    public Bitmap a() {
        return this.f40931c;
    }

    @RecentlyNullable
    public ByteBuffer b() {
        Bitmap bitmap = this.f40931c;
        if (bitmap == null) {
            return this.f40930b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f40931c.getHeight();
        int i10 = width * height;
        this.f40931c.getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.red(r2[i11]) * 0.299f) + (Color.green(r2[i11]) * 0.587f) + (Color.blue(r2[i11]) * 0.114f));
        }
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public b c() {
        return this.f40929a;
    }

    static /* synthetic */ C0881c h(c cVar) {
        cVar.getClass();
        return null;
    }
}

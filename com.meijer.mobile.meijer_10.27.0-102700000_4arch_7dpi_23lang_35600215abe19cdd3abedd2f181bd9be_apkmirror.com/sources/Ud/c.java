package Ud;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f35904a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f35905b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f35906c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f35907a = new c();

        @RecentlyNonNull
        public c a() {
            if (this.f35907a.f35905b != null || this.f35907a.f35906c != null) {
                return this.f35907a;
            }
            c.h(this.f35907a);
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        @RecentlyNonNull
        public a b(int i10) {
            this.f35907a.c().f35910c = i10;
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
            this.f35907a.f35905b = byteBuffer;
            b bVarC = this.f35907a.c();
            bVarC.f35908a = i10;
            bVarC.f35909b = i11;
            bVarC.f35913f = i12;
            return this;
        }

        @RecentlyNonNull
        public a d(int i10) {
            this.f35907a.c().f35912e = i10;
            return this;
        }

        @RecentlyNonNull
        public a e(long j10) {
            this.f35907a.c().f35911d = j10;
            return this;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f35908a;

        /* renamed from: b, reason: collision with root package name */
        private int f35909b;

        /* renamed from: c, reason: collision with root package name */
        private int f35910c;

        /* renamed from: d, reason: collision with root package name */
        private long f35911d;

        /* renamed from: e, reason: collision with root package name */
        private int f35912e;

        /* renamed from: f, reason: collision with root package name */
        private int f35913f;

        public b() {
            this.f35913f = -1;
        }

        public int a() {
            return this.f35913f;
        }

        public int b() {
            return this.f35909b;
        }

        public int c() {
            return this.f35910c;
        }

        public int d() {
            return this.f35912e;
        }

        public long e() {
            return this.f35911d;
        }

        public int f() {
            return this.f35908a;
        }

        public final void i() {
            if (this.f35912e % 2 != 0) {
                int i10 = this.f35908a;
                this.f35908a = this.f35909b;
                this.f35909b = i10;
            }
            this.f35912e = 0;
        }

        public b(@RecentlyNonNull b bVar) {
            this.f35913f = -1;
            this.f35908a = bVar.f();
            this.f35909b = bVar.b();
            this.f35910c = bVar.c();
            this.f35911d = bVar.e();
            this.f35912e = bVar.d();
            this.f35913f = bVar.a();
        }
    }

    /* renamed from: Ud.c$c, reason: collision with other inner class name */
    private static class C0788c {
    }

    private c() {
        this.f35904a = new b();
        this.f35905b = null;
        this.f35906c = null;
    }

    @RecentlyNullable
    public Image.Plane[] d() {
        return null;
    }

    @RecentlyNullable
    public Bitmap a() {
        return this.f35906c;
    }

    @RecentlyNullable
    public ByteBuffer b() {
        Bitmap bitmap = this.f35906c;
        if (bitmap == null) {
            return this.f35905b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f35906c.getHeight();
        int i10 = width * height;
        this.f35906c.getPixels(new int[i10], 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((Color.red(r2[i11]) * 0.299f) + (Color.green(r2[i11]) * 0.587f) + (Color.blue(r2[i11]) * 0.114f));
        }
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public b c() {
        return this.f35904a;
    }

    static /* synthetic */ C0788c h(c cVar) {
        cVar.getClass();
        return null;
    }
}

package f7;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p7.C16264a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f130820a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.b f130821b;

    private static final class a implements X6.c<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f130822a;

        @Override // X6.c
        public void a() {
            this.f130822a.stop();
            this.f130822a.clearAnimationCallbacks();
        }

        @Override // X6.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f130822a;
        }

        @Override // X6.c
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // X6.c
        public int getSize() {
            return this.f130822a.getIntrinsicWidth() * this.f130822a.getIntrinsicHeight() * p7.l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f130822a = animatedImageDrawable;
        }
    }

    private static final class b implements V6.i<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f130823a;

        @Override // V6.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, V6.g gVar) throws IOException {
            return this.f130823a.d(byteBuffer);
        }

        b(h hVar) {
            this.f130823a = hVar;
        }

        @Override // V6.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public X6.c<Drawable> b(ByteBuffer byteBuffer, int i10, int i11, V6.g gVar) throws IOException {
            return this.f130823a.b(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
        }
    }

    private static final class c implements V6.i<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f130824a;

        @Override // V6.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, V6.g gVar) throws IOException {
            return this.f130824a.c(inputStream);
        }

        c(h hVar) {
            this.f130824a = hVar;
        }

        @Override // V6.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public X6.c<Drawable> b(InputStream inputStream, int i10, int i11, V6.g gVar) throws IOException {
            return this.f130824a.b(ImageDecoder.createSource(C16264a.b(inputStream)), i10, i11, gVar);
        }
    }

    public static V6.i<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, Y6.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static V6.i<InputStream, Drawable> f(List<ImageHeaderParser> list, Y6.b bVar) {
        return new c(new h(list, bVar));
    }

    X6.c<Drawable> b(ImageDecoder.Source source, int i10, int i11, V6.g gVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new d7.i(i10, i11, gVar));
        if (C13854b.a(drawableDecodeDrawable)) {
            return new a(C13855c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.f130820a, inputStream, this.f130821b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.f130820a, byteBuffer));
    }

    private h(List<ImageHeaderParser> list, Y6.b bVar) {
        this.f130820a = list;
        this.f130821b = bVar;
    }
}

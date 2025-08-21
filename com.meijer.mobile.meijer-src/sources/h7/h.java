package h7;

import a7.InterfaceC5665b;
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
import r7.C16868a;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f135166a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5665b f135167b;

    private static final class a implements Z6.c<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f135168a;

        @Override // Z6.c
        public void a() {
            this.f135168a.stop();
            this.f135168a.clearAnimationCallbacks();
        }

        @Override // Z6.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f135168a;
        }

        @Override // Z6.c
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // Z6.c
        public int getSize() {
            return this.f135168a.getIntrinsicWidth() * this.f135168a.getIntrinsicHeight() * r7.l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f135168a = animatedImageDrawable;
        }
    }

    private static final class b implements X6.i<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f135169a;

        @Override // X6.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, X6.g gVar) throws IOException {
            return this.f135169a.d(byteBuffer);
        }

        b(h hVar) {
            this.f135169a = hVar;
        }

        @Override // X6.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Z6.c<Drawable> b(ByteBuffer byteBuffer, int i10, int i11, X6.g gVar) throws IOException {
            return this.f135169a.b(ImageDecoder.createSource(byteBuffer), i10, i11, gVar);
        }
    }

    private static final class c implements X6.i<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f135170a;

        @Override // X6.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, X6.g gVar) throws IOException {
            return this.f135170a.c(inputStream);
        }

        c(h hVar) {
            this.f135170a = hVar;
        }

        @Override // X6.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Z6.c<Drawable> b(InputStream inputStream, int i10, int i11, X6.g gVar) throws IOException {
            return this.f135170a.b(ImageDecoder.createSource(C16868a.b(inputStream)), i10, i11, gVar);
        }
    }

    public static X6.i<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
        return new b(new h(list, interfaceC5665b));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static X6.i<InputStream, Drawable> f(List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
        return new c(new h(list, interfaceC5665b));
    }

    Z6.c<Drawable> b(ImageDecoder.Source source, int i10, int i11, X6.g gVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new f7.i(i10, i11, gVar));
        if (C14484b.a(drawableDecodeDrawable)) {
            return new a(C14485c.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.a.f(this.f135166a, inputStream, this.f135167b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.a.g(this.f135166a, byteBuffer));
    }

    private h(List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
        this.f135166a = list;
        this.f135167b = interfaceC5665b;
    }
}

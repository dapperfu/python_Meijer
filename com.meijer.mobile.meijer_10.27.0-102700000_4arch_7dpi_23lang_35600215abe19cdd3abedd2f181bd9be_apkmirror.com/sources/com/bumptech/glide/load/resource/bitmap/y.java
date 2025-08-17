package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p7.C16264a;

/* loaded from: classes4.dex */
interface y {

    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f64108a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f64109b;

        /* renamed from: c, reason: collision with root package name */
        private final Y6.b f64110c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
        }

        private InputStream e() {
            return C16264a.g(C16264a.d(this.f64108a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.c(this.f64109b, C16264a.d(this.f64108a), this.f64110c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.f64109b, C16264a.d(this.f64108a));
        }

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, Y6.b bVar) {
            this.f64108a = byteBuffer;
            this.f64109b = list;
            this.f64110c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }
    }

    public static final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f64111a;

        /* renamed from: b, reason: collision with root package name */
        private final Y6.b f64112b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f64113c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f64111a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
            this.f64111a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.f64113c, this.f64111a.a(), this.f64112b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.f64113c, this.f64111a.a(), this.f64112b);
        }

        b(InputStream inputStream, List<ImageHeaderParser> list, Y6.b bVar) {
            this.f64112b = (Y6.b) p7.k.d(bVar);
            this.f64113c = (List) p7.k.d(list);
            this.f64111a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }
    }

    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        private final Y6.b f64114a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f64115b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f64116c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f64116c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.f64115b, this.f64116c, this.f64114a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f64115b, this.f64116c, this.f64114a);
        }

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, Y6.b bVar) {
            this.f64114a = (Y6.b) p7.k.d(bVar);
            this.f64115b = (List) p7.k.d(list);
            this.f64116c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}

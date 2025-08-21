package com.bumptech.glide.load.resource.bitmap;

import a7.InterfaceC5665b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import r7.C16868a;

/* loaded from: classes4.dex */
interface y {

    public static final class a implements y {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f64948a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f64949b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5665b f64950c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
        }

        private InputStream e() {
            return C16868a.g(C16868a.d(this.f64948a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.c(this.f64949b, C16868a.d(this.f64948a), this.f64950c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.g(this.f64949b, C16868a.d(this.f64948a));
        }

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
            this.f64948a = byteBuffer;
            this.f64949b = list;
            this.f64950c = interfaceC5665b;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }
    }

    public static final class b implements y {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f64951a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC5665b f64952b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f64953c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f64951a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
            this.f64951a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.b(this.f64953c, this.f64951a.a(), this.f64952b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.f(this.f64953c, this.f64951a.a(), this.f64952b);
        }

        b(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
            this.f64952b = (InterfaceC5665b) r7.k.d(interfaceC5665b);
            this.f64953c = (List) r7.k.d(list);
            this.f64951a = new com.bumptech.glide.load.data.k(inputStream, interfaceC5665b);
        }
    }

    public static final class c implements y {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5665b f64954a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f64955b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f64956c;

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f64956c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public int c() throws IOException {
            return com.bumptech.glide.load.a.a(this.f64955b, this.f64956c, this.f64954a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.y
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.e(this.f64955b, this.f64956c, this.f64954a);
        }

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC5665b interfaceC5665b) {
            this.f64954a = (InterfaceC5665b) r7.k.d(interfaceC5665b);
            this.f64955b = (List) r7.k.d(list);
            this.f64956c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}

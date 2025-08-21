package com.bumptech.glide.load;

import a7.InterfaceC5665b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import r7.C16868a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C1253a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f64590a;

        C1253a(InputStream inputStream) {
            this.f64590a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f64590a);
            } finally {
                this.f64590a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f64591a;

        b(ByteBuffer byteBuffer) {
            this.f64591a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f64591a);
            } finally {
                C16868a.d(this.f64591a);
            }
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f64592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5665b f64593b;

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f64592a.a().getFileDescriptor()), this.f64593b);
                try {
                    ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(c11);
                    c11.c();
                    this.f64592a.a();
                    return imageTypeD;
                } catch (Throwable th2) {
                    th = th2;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f64592a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5665b interfaceC5665b) {
            this.f64592a = parcelFileDescriptorRewinder;
            this.f64593b = interfaceC5665b;
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f64594a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5665b f64595b;

        d(ByteBuffer byteBuffer, InterfaceC5665b interfaceC5665b) {
            this.f64594a = byteBuffer;
            this.f64595b = interfaceC5665b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f64594a, this.f64595b);
            } finally {
                C16868a.d(this.f64594a);
            }
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f64596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5665b f64597b;

        e(InputStream inputStream, InterfaceC5665b interfaceC5665b) {
            this.f64596a = inputStream;
            this.f64597b = interfaceC5665b;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f64596a, this.f64597b);
            } finally {
                this.f64596a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f64598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5665b f64599b;

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f64598a.a().getFileDescriptor()), this.f64599b);
                try {
                    int iB = imageHeaderParser.b(c11, this.f64599b);
                    c11.c();
                    this.f64598a.a();
                    return iB;
                } catch (Throwable th2) {
                    th = th2;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f64598a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5665b interfaceC5665b) {
            this.f64598a = parcelFileDescriptorRewinder;
            this.f64599b = interfaceC5665b;
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5665b interfaceC5665b) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, interfaceC5665b));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5665b interfaceC5665b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, interfaceC5665b);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, interfaceC5665b));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC5665b interfaceC5665b) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, interfaceC5665b));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC5665b interfaceC5665b) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, interfaceC5665b));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5665b interfaceC5665b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, interfaceC5665b);
        }
        inputStream.mark(5242880);
        return h(list, new C1253a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static int d(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a(list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    private static ImageHeaderParser.ImageType h(List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a(list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

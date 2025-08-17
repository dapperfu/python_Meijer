package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p7.C16264a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C1244a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f63750a;

        C1244a(InputStream inputStream) {
            this.f63750a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f63750a);
            } finally {
                this.f63750a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f63751a;

        b(ByteBuffer byteBuffer) {
            this.f63751a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f63751a);
            } finally {
                C16264a.d(this.f63751a);
            }
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f63752a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y6.b f63753b;

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f63752a.a().getFileDescriptor()), this.f63753b);
                try {
                    ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(c11);
                    c11.c();
                    this.f63752a.a();
                    return imageTypeC;
                } catch (Throwable th2) {
                    th = th2;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f63752a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Y6.b bVar) {
            this.f63752a = parcelFileDescriptorRewinder;
            this.f63753b = bVar;
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f63754a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y6.b f63755b;

        d(ByteBuffer byteBuffer, Y6.b bVar) {
            this.f63754a = byteBuffer;
            this.f63755b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f63754a, this.f63755b);
            } finally {
                C16264a.d(this.f63754a);
            }
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f63756a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y6.b f63757b;

        e(InputStream inputStream, Y6.b bVar) {
            this.f63756a = inputStream;
            this.f63757b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f63756a, this.f63757b);
            } finally {
                this.f63756a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f63758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y6.b f63759b;

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            C c10 = null;
            try {
                C c11 = new C(new FileInputStream(this.f63758a.a().getFileDescriptor()), this.f63759b);
                try {
                    int iB = imageHeaderParser.b(c11, this.f63759b);
                    c11.c();
                    this.f63758a.a();
                    return iB;
                } catch (Throwable th2) {
                    th = th2;
                    c10 = c11;
                    if (c10 != null) {
                        c10.c();
                    }
                    this.f63758a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Y6.b bVar) {
            this.f63758a = parcelFileDescriptorRewinder;
            this.f63759b = bVar;
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Y6.b bVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, Y6.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, Y6.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Y6.b bVar) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, InputStream inputStream, Y6.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C1244a(inputStream));
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

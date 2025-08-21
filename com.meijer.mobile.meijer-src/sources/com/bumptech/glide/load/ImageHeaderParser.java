package com.bumptech.glide.load;

import a7.InterfaceC5665b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f64588a;

        public boolean hasAlpha() {
            return this.f64588a;
        }

        public boolean isWebp() {
            int i10 = a.f64589a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }

        ImageType(boolean z10) {
            this.f64588a = z10;
        }
    }

    int a(ByteBuffer byteBuffer, InterfaceC5665b interfaceC5665b) throws IOException;

    int b(InputStream inputStream, InterfaceC5665b interfaceC5665b) throws IOException;

    ImageType c(ByteBuffer byteBuffer) throws IOException;

    ImageType d(InputStream inputStream) throws IOException;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64589a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f64589a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64589a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64589a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}

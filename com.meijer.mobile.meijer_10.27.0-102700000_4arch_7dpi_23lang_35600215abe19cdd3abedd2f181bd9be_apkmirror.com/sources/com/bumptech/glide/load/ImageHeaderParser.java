package com.bumptech.glide.load;

import Y6.b;
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
        private final boolean f63748a;

        public boolean hasAlpha() {
            return this.f63748a;
        }

        public boolean isWebp() {
            int i10 = a.f63749a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }

        ImageType(boolean z10) {
            this.f63748a = z10;
        }
    }

    ImageType a(ByteBuffer byteBuffer) throws IOException;

    int b(InputStream inputStream, b bVar) throws IOException;

    ImageType c(InputStream inputStream) throws IOException;

    int d(ByteBuffer byteBuffer, b bVar) throws IOException;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63749a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f63749a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63749a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63749a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}

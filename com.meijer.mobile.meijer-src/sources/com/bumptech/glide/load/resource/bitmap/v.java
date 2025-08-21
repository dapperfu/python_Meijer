package com.bumptech.glide.load.resource.bitmap;

import a7.InterfaceC5665b;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import r7.C16868a;

/* loaded from: classes4.dex */
public final class v implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, InterfaceC5665b interfaceC5665b) throws IOException {
        int iF = new androidx.exifinterface.media.a(inputStream).f("Orientation", 1);
        if (iF == 0) {
            return -1;
        }
        return iF;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(ByteBuffer byteBuffer, InterfaceC5665b interfaceC5665b) throws IOException {
        return b(C16868a.g(byteBuffer), interfaceC5665b);
    }
}

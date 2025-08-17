package h7;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.fullstory.FS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public class j implements V6.i<InputStream, C14383c> {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f134497a;

    /* renamed from: b, reason: collision with root package name */
    private final V6.i<ByteBuffer, C14383c> f134498b;

    /* renamed from: c, reason: collision with root package name */
    private final Y6.b f134499c;

    private static byte[] e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            FS.log_w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, V6.g gVar) throws IOException {
        return !((Boolean) gVar.a(i.f134496b)).booleanValue() && com.bumptech.glide.load.a.f(this.f134497a, inputStream, this.f134499c) == ImageHeaderParser.ImageType.GIF;
    }

    public j(List<ImageHeaderParser> list, V6.i<ByteBuffer, C14383c> iVar, Y6.b bVar) {
        this.f134497a = list;
        this.f134498b = iVar;
        this.f134499c = bVar;
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<C14383c> b(InputStream inputStream, int i10, int i11, V6.g gVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f134498b.b(ByteBuffer.wrap(bArrE), i10, i11, gVar);
    }
}

package j7;

import a7.InterfaceC5665b;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.fullstory.FS;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public class j implements X6.i<InputStream, C14961c> {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f140184a;

    /* renamed from: b, reason: collision with root package name */
    private final X6.i<ByteBuffer, C14961c> f140185b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5665b f140186c;

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

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, X6.g gVar) throws IOException {
        return !((Boolean) gVar.a(i.f140183b)).booleanValue() && com.bumptech.glide.load.a.f(this.f140184a, inputStream, this.f140186c) == ImageHeaderParser.ImageType.GIF;
    }

    public j(List<ImageHeaderParser> list, X6.i<ByteBuffer, C14961c> iVar, InterfaceC5665b interfaceC5665b) {
        this.f140184a = list;
        this.f140185b = iVar;
        this.f140186c = interfaceC5665b;
    }

    @Override // X6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Z6.c<C14961c> b(InputStream inputStream, int i10, int i11, X6.g gVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f140185b.b(ByteBuffer.wrap(bArrE), i10, i11, gVar);
    }
}

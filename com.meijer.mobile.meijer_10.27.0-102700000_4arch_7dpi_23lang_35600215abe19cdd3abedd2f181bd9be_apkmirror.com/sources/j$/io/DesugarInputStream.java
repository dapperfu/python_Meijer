package j$.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) throws IOException {
        Objects.requireNonNull(outputStream, "out");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr, 0, 8192);
            if (i10 < 0) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }
}

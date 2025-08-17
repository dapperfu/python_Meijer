package of;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes7.dex */
class O {
    private static void a(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        C16041i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    C16041i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void b(File file, List<N> list) throws IOException {
        for (N n10 : list) {
            InputStream inputStreamI = null;
            try {
                inputStreamI = n10.i();
                if (inputStreamI != null) {
                    a(inputStreamI, new File(file, n10.b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                C16041i.g(null);
                throw th2;
            }
            C16041i.g(inputStreamI);
        }
    }
}

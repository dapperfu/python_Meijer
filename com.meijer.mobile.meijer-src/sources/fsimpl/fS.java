package fsimpl;

import com.fullstory.rust.RustInterface;
import java.net.HttpURLConnection;

/* loaded from: classes15.dex */
public class fS {
    public static long a(long j10) {
        double dNanoTime = System.nanoTime() - j10;
        Double.isNaN(dNanoTime);
        return Math.round(dNanoTime / 1000000.0d);
    }

    public static void a(RustInterface rustInterface, HttpURLConnection httpURLConnection, long j10, long j11, int i10) {
        if (C14118br.d()) {
            rustInterface.a(new C14218fk(httpURLConnection.getURL().toString(), httpURLConnection.getRequestMethod(), a(j11), i10, j10, httpURLConnection.getContentLengthLong(), 1));
        }
    }
}

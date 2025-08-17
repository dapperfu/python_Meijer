package androidx.media3.datasource;

import Be.C2957c;
import f3.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: b, reason: collision with root package name */
    public final g f55441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55442c;

    public HttpDataSource$HttpDataSourceException(g gVar, int i10, int i11) {
        super(b(i10, i11));
        this.f55441b = gVar;
        this.f55442c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final g gVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && C2957c.e(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            };
        }
        return new HttpDataSource$HttpDataSourceException(iOException, gVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f55441b = gVar;
        this.f55442c = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f55441b = gVar;
        this.f55442c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f55441b = gVar;
        this.f55442c = i11;
    }
}

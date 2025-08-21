package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f55660a;

    public DataSourceException(int i10) {
        this.f55660a = i10;
    }

    public static boolean a(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f55660a == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th2, int i10) {
        super(th2);
        this.f55660a = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f55660a = i10;
    }

    public DataSourceException(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f55660a = i10;
    }
}

package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import d3.C13599a;
import d3.P;
import f3.AbstractC13946a;
import f3.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class FileDataSource extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f55661e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f55662f;

    /* renamed from: g, reason: collision with root package name */
    private long f55663g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55664h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }

        public FileDataSourceException(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // f3.InterfaceC13949d
    public void close() throws FileDataSourceException {
        this.f55662f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f55661e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } finally {
            this.f55661e = null;
            if (this.f55664h) {
                this.f55664h = false;
                o();
            }
        }
    }

    private static RandomAccessFile r(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) C13599a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f55662f;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        Uri uri = gVar.f131472a;
        this.f55662f = uri;
        p(gVar);
        RandomAccessFile randomAccessFileR = r(uri);
        this.f55661e = randomAccessFileR;
        try {
            randomAccessFileR.seek(gVar.f131478g);
            long length = gVar.f131479h;
            if (length == -1) {
                length = this.f55661e.length() - gVar.f131478g;
            }
            this.f55663g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f55664h = true;
            q(gVar);
            return this.f55663g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f55663g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) P.h(this.f55661e)).read(bArr, i10, (int) Math.min(this.f55663g, i11));
            if (i12 > 0) {
                this.f55663g -= i12;
                n(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}

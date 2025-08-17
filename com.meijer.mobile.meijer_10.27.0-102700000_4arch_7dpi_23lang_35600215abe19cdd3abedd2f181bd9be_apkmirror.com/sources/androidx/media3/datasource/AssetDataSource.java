package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.medallia.digital.mobilesdk.q2;
import d3.C13466a;
import d3.P;
import f3.AbstractC13836a;
import f3.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AssetDataSource extends AbstractC13836a {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f55425e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f55426f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f55427g;

    /* renamed from: h, reason: collision with root package name */
    private long f55428h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f55429i;

    public AssetDataSource(Context context) {
        super(false);
        this.f55425e = context.getAssets();
    }

    @Override // f3.InterfaceC13839d
    public void close() throws AssetDataSourceException {
        this.f55426f = null;
        try {
            try {
                InputStream inputStream = this.f55427g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } finally {
            this.f55427g = null;
            if (this.f55429i) {
                this.f55429i = false;
                o();
            }
        }
    }

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        return this.f55426f;
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        try {
            Uri uri = gVar.f130638a;
            this.f55426f = uri;
            String strSubstring = (String) C13466a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(q2.f92724c)) {
                strSubstring = strSubstring.substring(1);
            }
            p(gVar);
            InputStream inputStreamOpen = this.f55425e.open(strSubstring, 1);
            this.f55427g = inputStreamOpen;
            if (inputStreamOpen.skip(gVar.f130644g) < gVar.f130644g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = gVar.f130645h;
            if (j10 != -1) {
                this.f55428h = j10;
            } else {
                long jAvailable = this.f55427g.available();
                this.f55428h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f55428h = -1L;
                }
            }
            this.f55429i = true;
            q(gVar);
            return this.f55428h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55428h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) P.h(this.f55427g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f55428h;
        if (j11 != -1) {
            this.f55428h = j11 - i12;
        }
        n(i12);
        return i12;
    }
}

package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.medallia.digital.mobilesdk.q2;
import d3.C13599a;
import d3.P;
import f3.AbstractC13946a;
import f3.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AssetDataSource extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f55649e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f55650f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f55651g;

    /* renamed from: h, reason: collision with root package name */
    private long f55652h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f55653i;

    public AssetDataSource(Context context) {
        super(false);
        this.f55649e = context.getAssets();
    }

    @Override // f3.InterfaceC13949d
    public void close() throws AssetDataSourceException {
        this.f55650f = null;
        try {
            try {
                InputStream inputStream = this.f55651g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } finally {
            this.f55651g = null;
            if (this.f55653i) {
                this.f55653i = false;
                o();
            }
        }
    }

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f55650f;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        try {
            Uri uri = gVar.f131472a;
            this.f55650f = uri;
            String strSubstring = (String) C13599a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith(q2.f93563c)) {
                strSubstring = strSubstring.substring(1);
            }
            p(gVar);
            InputStream inputStreamOpen = this.f55649e.open(strSubstring, 1);
            this.f55651g = inputStreamOpen;
            if (inputStreamOpen.skip(gVar.f131478g) < gVar.f131478g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = gVar.f131479h;
            if (j10 != -1) {
                this.f55652h = j10;
            } else {
                long jAvailable = this.f55651g.available();
                this.f55652h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f55652h = -1L;
                }
            }
            this.f55653i = true;
            q(gVar);
            return this.f55652h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f55652h;
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
        int i12 = ((InputStream) P.h(this.f55651g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f55652h;
        if (j11 != -1) {
            this.f55652h = j11 - i12;
        }
        n(i12);
        return i12;
    }
}

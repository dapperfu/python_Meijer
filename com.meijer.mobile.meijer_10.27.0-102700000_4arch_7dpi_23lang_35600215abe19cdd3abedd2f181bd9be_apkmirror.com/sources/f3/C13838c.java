package f3;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import d3.C13466a;
import d3.P;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13838c extends AbstractC13836a {

    /* renamed from: e, reason: collision with root package name */
    private g f130628e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f130629f;

    /* renamed from: g, reason: collision with root package name */
    private int f130630g;

    /* renamed from: h, reason: collision with root package name */
    private int f130631h;

    public C13838c() {
        super(false);
    }

    @Override // f3.InterfaceC13839d
    public void close() {
        if (this.f130629f != null) {
            this.f130629f = null;
            o();
        }
        this.f130628e = null;
    }

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        g gVar = this.f130628e;
        if (gVar != null) {
            return gVar.f130638a;
        }
        return null;
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f130631h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(P.h(this.f130629f), this.f130630g, bArr, i10, iMin);
        this.f130630g += iMin;
        this.f130631h -= iMin;
        n(iMin);
        return iMin;
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        p(gVar);
        this.f130628e = gVar;
        Uri uriNormalizeScheme = gVar.f130638a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C13466a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrC1 = P.c1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrC1.length == 2) {
            String str = strArrC1[1];
            if (strArrC1[0].contains(";base64")) {
                try {
                    this.f130629f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw ParserException.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f130629f = P.q0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
            }
            long j10 = gVar.f130644g;
            byte[] bArr = this.f130629f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f130630g = i10;
                int length = bArr.length - i10;
                this.f130631h = length;
                long j11 = gVar.f130645h;
                if (j11 != -1) {
                    this.f130631h = (int) Math.min(length, j11);
                }
                q(gVar);
                long j12 = gVar.f130645h;
                if (j12 != -1) {
                    return j12;
                }
                return this.f130631h;
            }
            this.f130629f = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
    }
}

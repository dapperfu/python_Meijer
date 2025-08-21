package f3;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import d3.C13599a;
import d3.P;
import j$.net.URLDecoder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* renamed from: f3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13948c extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private g f131462e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f131463f;

    /* renamed from: g, reason: collision with root package name */
    private int f131464g;

    /* renamed from: h, reason: collision with root package name */
    private int f131465h;

    public C13948c() {
        super(false);
    }

    @Override // f3.InterfaceC13949d
    public void close() {
        if (this.f131463f != null) {
            this.f131463f = null;
            o();
        }
        this.f131462e = null;
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        g gVar = this.f131462e;
        if (gVar != null) {
            return gVar.f131472a;
        }
        return null;
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f131465h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(P.h(this.f131463f), this.f131464g, bArr, i10, iMin);
        this.f131464g += iMin;
        this.f131465h -= iMin;
        n(iMin);
        return iMin;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        p(gVar);
        this.f131462e = gVar;
        Uri uriNormalizeScheme = gVar.f131472a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C13599a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrC1 = P.c1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrC1.length == 2) {
            String str = strArrC1[1];
            if (strArrC1[0].contains(";base64")) {
                try {
                    this.f131463f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw ParserException.b("Error while parsing Base64 encoded string: " + str, e10);
                }
            } else {
                this.f131463f = P.q0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
            }
            long j10 = gVar.f131478g;
            byte[] bArr = this.f131463f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f131464g = i10;
                int length = bArr.length - i10;
                this.f131465h = length;
                long j11 = gVar.f131479h;
                if (j11 != -1) {
                    this.f131465h = (int) Math.min(length, j11);
                }
                q(gVar);
                long j12 = gVar.f131479h;
                if (j12 != -1) {
                    return j12;
                }
                return this.f131465h;
            }
            this.f131463f = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
    }
}

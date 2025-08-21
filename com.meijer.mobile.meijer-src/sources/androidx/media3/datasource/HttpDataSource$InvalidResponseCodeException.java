package androidx.media3.datasource;

import f3.g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: d, reason: collision with root package name */
    public final int f55668d;

    /* renamed from: e, reason: collision with root package name */
    public final String f55669e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f55670f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f55671g;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map<String, List<String>> map, g gVar, byte[] bArr) {
        super("Response code: " + i10, iOException, gVar, 2004, 1);
        this.f55668d = i10;
        this.f55669e = str;
        this.f55670f = map;
        this.f55671g = bArr;
    }
}

package androidx.media3.datasource;

import f3.g;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: d, reason: collision with root package name */
    public final int f55444d;

    /* renamed from: e, reason: collision with root package name */
    public final String f55445e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, List<String>> f55446f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f55447g;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map<String, List<String>> map, g gVar, byte[] bArr) {
        super("Response code: " + i10, iOException, gVar, 2004, 1);
        this.f55444d = i10;
        this.f55445e = str;
        this.f55446f = map;
        this.f55447g = bArr;
    }
}

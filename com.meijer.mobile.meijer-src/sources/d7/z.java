package d7;

import android.net.Uri;
import d7.o;
import io.constructor.BuildConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f128287b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.SERVICE_SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    private final o<h, Data> f128288a;

    public static class a implements p<Uri, InputStream> {
        @Override // d7.p
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, X6.g gVar) {
        return this.f128288a.b(new h(uri.toString()), i10, i11, gVar);
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f128287b.contains(uri.getScheme());
    }

    public z(o<h, Data> oVar) {
        this.f128288a = oVar;
    }
}

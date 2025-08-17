package b7;

import android.net.Uri;
import b7.o;
import io.constructor.BuildConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f60052b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.SERVICE_SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    private final o<h, Data> f60053a;

    public static class a implements p<Uri, InputStream> {
        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, V6.g gVar) {
        return this.f60053a.b(new h(uri.toString()), i10, i11, gVar);
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f60052b.contains(uri.getScheme());
    }

    public z(o<h, Data> oVar) {
        this.f60053a = oVar;
    }
}

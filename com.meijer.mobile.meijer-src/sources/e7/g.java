package e7;

import d7.h;
import d7.o;
import d7.p;
import d7.s;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes4.dex */
public class g implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final o<h, InputStream> f130022a;

    public static class a implements p<URL, InputStream> {
        @Override // d7.p
        public o<URL, InputStream> d(s sVar) {
            return new g(sVar.d(h.class, InputStream.class));
        }
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(URL url, int i10, int i11, X6.g gVar) {
        return this.f130022a.b(new h(url), i10, i11, gVar);
    }

    public g(o<h, InputStream> oVar) {
        this.f130022a = oVar;
    }
}

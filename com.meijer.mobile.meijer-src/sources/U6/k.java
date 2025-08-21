package U6;

import U6.i;
import U6.j;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    static final i.f<URI> f37277a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final j.a<URI> f37278b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final i.f<InetAddress> f37279c = new c();

    /* renamed from: d, reason: collision with root package name */
    static final j.a<InetAddress> f37280d = new d();

    class a implements i.f<URI> {
        a() {
        }

        @Override // U6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public URI a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return k.b(iVar);
        }
    }

    class b implements j.a<URI> {
        b() {
        }

        @Override // U6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, URI uri) throws IOException {
            k.f(uri, jVar);
        }
    }

    class c implements i.f<InetAddress> {
        c() {
        }

        @Override // U6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InetAddress a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return k.a(iVar);
        }
    }

    class d implements j.a<InetAddress> {
        d() {
        }

        @Override // U6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, InetAddress inetAddress) throws IOException {
            k.e(inetAddress, jVar);
        }
    }

    public static void c(InetAddress inetAddress, j jVar) throws IOException {
        jVar.l((byte) 34);
        jVar.i(inetAddress.getHostAddress());
        jVar.l((byte) 34);
    }

    public static void e(InetAddress inetAddress, j jVar) throws IOException {
        if (inetAddress == null) {
            jVar.n();
        } else {
            c(inetAddress, jVar);
        }
    }

    public static void f(URI uri, j jVar) throws IOException {
        if (uri == null) {
            jVar.n();
        } else {
            d(uri, jVar);
        }
    }

    public static InetAddress a(i iVar) throws IOException {
        return InetAddress.getByName(iVar.H());
    }

    public static URI b(i iVar) throws IOException {
        return URI.create(iVar.I());
    }

    public static void d(URI uri, j jVar) throws IOException {
        o.c(uri.toString(), jVar);
    }
}

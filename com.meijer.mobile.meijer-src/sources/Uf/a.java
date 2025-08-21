package Uf;

import Lf.e;
import Tf.d;
import Vf.g;
import Vf.h;
import com.google.firebase.f;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import rc.InterfaceC16890j;
import xu.C18223a;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class a {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Vf.a f37479a;

        private b() {
        }

        public Uf.b a() {
            C18225c.a(this.f37479a, Vf.a.class);
            return new c(this.f37479a);
        }

        public b b(Vf.a aVar) {
            this.f37479a = (Vf.a) C18225c.b(aVar);
            return this;
        }
    }

    private static final class c implements Uf.b {

        /* renamed from: a, reason: collision with root package name */
        private final c f37480a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC18226d<f> f37481b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC18226d<Kf.b<com.google.firebase.remoteconfig.c>> f37482c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC18226d<e> f37483d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC18226d<Kf.b<InterfaceC16890j>> f37484e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC18226d<RemoteConfigManager> f37485f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC18226d<com.google.firebase.perf.config.a> f37486g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC18226d<SessionManager> f37487h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC18226d<d> f37488i;

        private c(Vf.a aVar) {
            this.f37480a = this;
            b(aVar);
        }

        @Override // Uf.b
        public d a() {
            return this.f37488i.get();
        }

        private void b(Vf.a aVar) {
            this.f37481b = Vf.c.a(aVar);
            this.f37482c = Vf.e.a(aVar);
            this.f37483d = Vf.d.a(aVar);
            this.f37484e = h.a(aVar);
            this.f37485f = Vf.f.a(aVar);
            this.f37486g = Vf.b.a(aVar);
            g gVarA = g.a(aVar);
            this.f37487h = gVarA;
            this.f37488i = C18223a.c(Tf.f.a(this.f37481b, this.f37482c, this.f37483d, this.f37484e, this.f37485f, this.f37486g, gVarA));
        }
    }

    public static b a() {
        return new b();
    }
}

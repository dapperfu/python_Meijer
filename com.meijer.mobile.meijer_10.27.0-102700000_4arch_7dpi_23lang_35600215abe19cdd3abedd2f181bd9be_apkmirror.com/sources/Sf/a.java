package Sf;

import Bu.d;
import Jf.e;
import Tf.g;
import Tf.h;
import com.google.firebase.f;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public final class a {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Tf.a f33603a;

        private b() {
        }

        public Sf.b a() {
            Bu.c.a(this.f33603a, Tf.a.class);
            return new c(this.f33603a);
        }

        public b b(Tf.a aVar) {
            this.f33603a = (Tf.a) Bu.c.b(aVar);
            return this;
        }
    }

    private static final class c implements Sf.b {

        /* renamed from: a, reason: collision with root package name */
        private final c f33604a;

        /* renamed from: b, reason: collision with root package name */
        private d<f> f33605b;

        /* renamed from: c, reason: collision with root package name */
        private d<If.b<com.google.firebase.remoteconfig.c>> f33606c;

        /* renamed from: d, reason: collision with root package name */
        private d<e> f33607d;

        /* renamed from: e, reason: collision with root package name */
        private d<If.b<InterfaceC16286j>> f33608e;

        /* renamed from: f, reason: collision with root package name */
        private d<RemoteConfigManager> f33609f;

        /* renamed from: g, reason: collision with root package name */
        private d<com.google.firebase.perf.config.a> f33610g;

        /* renamed from: h, reason: collision with root package name */
        private d<SessionManager> f33611h;

        /* renamed from: i, reason: collision with root package name */
        private d<Rf.d> f33612i;

        private c(Tf.a aVar) {
            this.f33604a = this;
            b(aVar);
        }

        @Override // Sf.b
        public Rf.d a() {
            return this.f33612i.get();
        }

        private void b(Tf.a aVar) {
            this.f33605b = Tf.c.a(aVar);
            this.f33606c = Tf.e.a(aVar);
            this.f33607d = Tf.d.a(aVar);
            this.f33608e = h.a(aVar);
            this.f33609f = Tf.f.a(aVar);
            this.f33610g = Tf.b.a(aVar);
            g gVarA = g.a(aVar);
            this.f33611h = gVarA;
            this.f33612i = Bu.a.b(Rf.f.a(this.f33605b, this.f33606c, this.f33607d, this.f33608e, this.f33609f, this.f33610g, gVarA));
        }
    }

    public static b a() {
        return new b();
    }
}

package tc;

import Ac.x;
import Bc.C2925g;
import Bc.C2926h;
import Bc.C2927i;
import Bc.C2928j;
import Bc.InterfaceC2922d;
import Bc.M;
import Bc.N;
import Bc.X;
import android.content.Context;
import gv.InterfaceC14411a;
import java.util.concurrent.Executor;
import tc.v;
import uc.C17377j;
import uc.C17379l;
import vc.C17652a;
import vc.C17654c;
import vc.C17655d;
import vc.InterfaceC17653b;
import zc.C18469c;

/* loaded from: classes4.dex */
final class e {

    private static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f162455a;

        private b() {
        }

        @Override // tc.v.a
        public v build() {
            C17655d.a(this.f162455a, Context.class);
            return new c(this.f162455a);
        }

        @Override // tc.v.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b setApplicationContext(Context context) {
            this.f162455a = (Context) C17655d.b(context);
            return this;
        }
    }

    private static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        private final c f162456a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC14411a<Executor> f162457b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC14411a<Context> f162458c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC14411a f162459d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC14411a f162460e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC14411a f162461f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC14411a<String> f162462g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC14411a<M> f162463h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC14411a<Ac.f> f162464i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC14411a<x> f162465j;

        /* renamed from: k, reason: collision with root package name */
        private InterfaceC14411a<C18469c> f162466k;

        /* renamed from: l, reason: collision with root package name */
        private InterfaceC14411a<Ac.r> f162467l;

        /* renamed from: m, reason: collision with root package name */
        private InterfaceC14411a<Ac.v> f162468m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC14411a<u> f162469n;

        private c(Context context) {
            this.f162456a = this;
            c(context);
        }

        @Override // tc.v
        InterfaceC2922d a() {
            return this.f162463h.get();
        }

        @Override // tc.v
        u b() {
            return this.f162469n.get();
        }

        private void c(Context context) {
            this.f162457b = C17652a.a(k.a());
            InterfaceC17653b interfaceC17653bA = C17654c.a(context);
            this.f162458c = interfaceC17653bA;
            C17377j c17377jA = C17377j.a(interfaceC17653bA, Dc.c.a(), Dc.d.a());
            this.f162459d = c17377jA;
            this.f162460e = C17652a.a(C17379l.a(this.f162458c, c17377jA));
            this.f162461f = X.a(this.f162458c, C2925g.a(), C2927i.a());
            this.f162462g = C17652a.a(C2926h.a(this.f162458c));
            this.f162463h = C17652a.a(N.a(Dc.c.a(), Dc.d.a(), C2928j.a(), this.f162461f, this.f162462g));
            zc.g gVarB = zc.g.b(Dc.c.a());
            this.f162464i = gVarB;
            zc.i iVarA = zc.i.a(this.f162458c, this.f162463h, gVarB, Dc.d.a());
            this.f162465j = iVarA;
            InterfaceC14411a<Executor> interfaceC14411a = this.f162457b;
            InterfaceC14411a interfaceC14411a2 = this.f162460e;
            InterfaceC14411a<M> interfaceC14411a3 = this.f162463h;
            this.f162466k = zc.d.a(interfaceC14411a, interfaceC14411a2, iVarA, interfaceC14411a3, interfaceC14411a3);
            InterfaceC14411a<Context> interfaceC14411a4 = this.f162458c;
            InterfaceC14411a interfaceC14411a5 = this.f162460e;
            InterfaceC14411a<M> interfaceC14411a6 = this.f162463h;
            this.f162467l = Ac.s.a(interfaceC14411a4, interfaceC14411a5, interfaceC14411a6, this.f162465j, this.f162457b, interfaceC14411a6, Dc.c.a(), Dc.d.a(), this.f162463h);
            InterfaceC14411a<Executor> interfaceC14411a7 = this.f162457b;
            InterfaceC14411a<M> interfaceC14411a8 = this.f162463h;
            this.f162468m = Ac.w.a(interfaceC14411a7, interfaceC14411a8, this.f162465j, interfaceC14411a8);
            this.f162469n = C17652a.a(w.a(Dc.c.a(), Dc.d.a(), this.f162466k, this.f162467l, this.f162468m));
        }
    }

    public static v.a a() {
        return new b();
    }
}

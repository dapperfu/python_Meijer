package rc;

import android.content.Context;
import java.util.concurrent.Executor;
import kv.InterfaceC15323a;
import rc.v;
import sc.C16930j;
import sc.C16932l;
import tc.C17077a;
import tc.C17079c;
import tc.C17080d;
import tc.InterfaceC17078b;
import xc.C18032c;
import yc.x;
import zc.C18425g;
import zc.C18426h;
import zc.C18427i;
import zc.C18428j;
import zc.InterfaceC18422d;
import zc.M;
import zc.N;
import zc.X;

/* loaded from: classes4.dex */
final class e {

    private static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f157965a;

        private b() {
        }

        @Override // rc.v.a
        public v build() {
            C17080d.a(this.f157965a, Context.class);
            return new c(this.f157965a);
        }

        @Override // rc.v.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b setApplicationContext(Context context) {
            this.f157965a = (Context) C17080d.b(context);
            return this;
        }
    }

    private static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        private final c f157966a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC15323a<Executor> f157967b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC15323a<Context> f157968c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC15323a f157969d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC15323a f157970e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC15323a f157971f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC15323a<String> f157972g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC15323a<M> f157973h;

        /* renamed from: i, reason: collision with root package name */
        private InterfaceC15323a<yc.f> f157974i;

        /* renamed from: j, reason: collision with root package name */
        private InterfaceC15323a<x> f157975j;

        /* renamed from: k, reason: collision with root package name */
        private InterfaceC15323a<C18032c> f157976k;

        /* renamed from: l, reason: collision with root package name */
        private InterfaceC15323a<yc.r> f157977l;

        /* renamed from: m, reason: collision with root package name */
        private InterfaceC15323a<yc.v> f157978m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC15323a<u> f157979n;

        private c(Context context) {
            this.f157966a = this;
            c(context);
        }

        @Override // rc.v
        InterfaceC18422d a() {
            return this.f157973h.get();
        }

        @Override // rc.v
        u b() {
            return this.f157979n.get();
        }

        private void c(Context context) {
            this.f157967b = C17077a.a(k.a());
            InterfaceC17078b interfaceC17078bA = C17079c.a(context);
            this.f157968c = interfaceC17078bA;
            C16930j c16930jA = C16930j.a(interfaceC17078bA, Bc.c.a(), Bc.d.a());
            this.f157969d = c16930jA;
            this.f157970e = C17077a.a(C16932l.a(this.f157968c, c16930jA));
            this.f157971f = X.a(this.f157968c, C18425g.a(), C18427i.a());
            this.f157972g = C17077a.a(C18426h.a(this.f157968c));
            this.f157973h = C17077a.a(N.a(Bc.c.a(), Bc.d.a(), C18428j.a(), this.f157971f, this.f157972g));
            xc.g gVarB = xc.g.b(Bc.c.a());
            this.f157974i = gVarB;
            xc.i iVarA = xc.i.a(this.f157968c, this.f157973h, gVarB, Bc.d.a());
            this.f157975j = iVarA;
            InterfaceC15323a<Executor> interfaceC15323a = this.f157967b;
            InterfaceC15323a interfaceC15323a2 = this.f157970e;
            InterfaceC15323a<M> interfaceC15323a3 = this.f157973h;
            this.f157976k = xc.d.a(interfaceC15323a, interfaceC15323a2, iVarA, interfaceC15323a3, interfaceC15323a3);
            InterfaceC15323a<Context> interfaceC15323a4 = this.f157968c;
            InterfaceC15323a interfaceC15323a5 = this.f157970e;
            InterfaceC15323a<M> interfaceC15323a6 = this.f157973h;
            this.f157977l = yc.s.a(interfaceC15323a4, interfaceC15323a5, interfaceC15323a6, this.f157975j, this.f157967b, interfaceC15323a6, Bc.c.a(), Bc.d.a(), this.f157973h);
            InterfaceC15323a<Executor> interfaceC15323a7 = this.f157967b;
            InterfaceC15323a<M> interfaceC15323a8 = this.f157973h;
            this.f157978m = yc.w.a(interfaceC15323a7, interfaceC15323a8, this.f157975j, interfaceC15323a8);
            this.f157979n = C17077a.a(w.a(Bc.c.a(), Bc.d.a(), this.f157976k, this.f157977l, this.f157978m));
        }
    }

    public static v.a a() {
        return new b();
    }
}

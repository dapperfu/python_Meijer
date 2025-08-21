package com.google.firebase.sessions;

import B2.InterfaceC2911h;
import android.content.Context;
import com.google.firebase.sessions.b;
import jg.ApplicationInfo;
import jg.C15005A;
import jg.C15006B;
import jg.C15013g;
import jg.C15015i;
import jg.C15018l;
import jg.C15024s;
import jg.F;
import jg.G;
import jg.L;
import jg.M;
import jg.N;
import jg.O;
import jg.Q;
import jg.S;
import jg.SessionData;
import jg.T;
import jg.U;
import jg.V;
import jg.X;
import jg.Z;
import kotlin.coroutines.CoroutineContext;
import lg.C15489a;
import lg.InterfaceC15490b;
import mg.C15714b;
import mg.C15715c;
import mg.C15716d;
import mg.C15717e;
import mg.SessionConfigs;
import mg.j;
import mg.k;
import mg.m;
import mg.n;
import rc.InterfaceC16890j;

/* loaded from: classes8.dex */
public final class a {

    private static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f90179a;

        /* renamed from: b, reason: collision with root package name */
        private CoroutineContext f90180b;

        /* renamed from: c, reason: collision with root package name */
        private CoroutineContext f90181c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.firebase.f f90182d;

        /* renamed from: e, reason: collision with root package name */
        private Lf.e f90183e;

        /* renamed from: f, reason: collision with root package name */
        private Kf.b<InterfaceC16890j> f90184f;

        private b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            lg.d.a(this.f90179a, Context.class);
            lg.d.a(this.f90180b, CoroutineContext.class);
            lg.d.a(this.f90181c, CoroutineContext.class);
            lg.d.a(this.f90182d, com.google.firebase.f.class);
            lg.d.a(this.f90183e, Lf.e.class);
            lg.d.a(this.f90184f, Kf.b.class);
            return new c(this.f90179a, this.f90180b, this.f90181c, this.f90182d, this.f90183e, this.f90184f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b f(Context context) {
            this.f90179a = (Context) lg.d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b a(CoroutineContext coroutineContext) {
            this.f90180b = (CoroutineContext) lg.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b e(CoroutineContext coroutineContext) {
            this.f90181c = (CoroutineContext) lg.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(com.google.firebase.f fVar) {
            this.f90182d = (com.google.firebase.f) lg.d.b(fVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b b(Lf.e eVar) {
            this.f90183e = (Lf.e) lg.d.b(eVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b d(Kf.b<InterfaceC16890j> bVar) {
            this.f90184f = (Kf.b) lg.d.b(bVar);
            return this;
        }
    }

    private static final class c implements com.google.firebase.sessions.b {

        /* renamed from: a, reason: collision with root package name */
        private final c f90185a;

        /* renamed from: b, reason: collision with root package name */
        private lg.e<com.google.firebase.f> f90186b;

        /* renamed from: c, reason: collision with root package name */
        private lg.e<Context> f90187c;

        /* renamed from: d, reason: collision with root package name */
        private lg.e<C15714b> f90188d;

        /* renamed from: e, reason: collision with root package name */
        private lg.e<X> f90189e;

        /* renamed from: f, reason: collision with root package name */
        private lg.e<Lf.e> f90190f;

        /* renamed from: g, reason: collision with root package name */
        private lg.e<ApplicationInfo> f90191g;

        /* renamed from: h, reason: collision with root package name */
        private lg.e<CoroutineContext> f90192h;

        /* renamed from: i, reason: collision with root package name */
        private lg.e<C15717e> f90193i;

        /* renamed from: j, reason: collision with root package name */
        private lg.e<CoroutineContext> f90194j;

        /* renamed from: k, reason: collision with root package name */
        private lg.e<InterfaceC2911h<SessionConfigs>> f90195k;

        /* renamed from: l, reason: collision with root package name */
        private lg.e<m> f90196l;

        /* renamed from: m, reason: collision with root package name */
        private lg.e<C15716d> f90197m;

        /* renamed from: n, reason: collision with root package name */
        private lg.e<j> f90198n;

        /* renamed from: o, reason: collision with root package name */
        private lg.e<Z> f90199o;

        /* renamed from: p, reason: collision with root package name */
        private lg.e<N> f90200p;

        /* renamed from: q, reason: collision with root package name */
        private lg.e<Kf.b<InterfaceC16890j>> f90201q;

        /* renamed from: r, reason: collision with root package name */
        private lg.e<C15013g> f90202r;

        /* renamed from: s, reason: collision with root package name */
        private lg.e<L> f90203s;

        /* renamed from: t, reason: collision with root package name */
        private lg.e<F> f90204t;

        /* renamed from: u, reason: collision with root package name */
        private lg.e<InterfaceC2911h<SessionData>> f90205u;

        /* renamed from: v, reason: collision with root package name */
        private lg.e<C15005A> f90206v;

        /* renamed from: w, reason: collision with root package name */
        private lg.e<U> f90207w;

        /* renamed from: x, reason: collision with root package name */
        private lg.e<Q> f90208x;

        /* renamed from: y, reason: collision with root package name */
        private lg.e<C15018l> f90209y;

        private c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, Lf.e eVar, Kf.b<InterfaceC16890j> bVar) {
            this.f90185a = this;
            c(context, coroutineContext, coroutineContext2, fVar, eVar, bVar);
        }

        @Override // com.google.firebase.sessions.b
        public T a() {
            return this.f90207w.get();
        }

        @Override // com.google.firebase.sessions.b
        public C15018l b() {
            return this.f90209y.get();
        }

        private void c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, Lf.e eVar, Kf.b<InterfaceC16890j> bVar) {
            this.f90186b = lg.c.a(fVar);
            InterfaceC15490b interfaceC15490bA = lg.c.a(context);
            this.f90187c = interfaceC15490bA;
            this.f90188d = C15489a.a(C15715c.a(interfaceC15490bA));
            this.f90189e = C15489a.a(f.a());
            this.f90190f = lg.c.a(eVar);
            this.f90191g = C15489a.a(com.google.firebase.sessions.c.b(this.f90186b));
            InterfaceC15490b interfaceC15490bA2 = lg.c.a(coroutineContext2);
            this.f90192h = interfaceC15490bA2;
            this.f90193i = C15489a.a(mg.f.a(this.f90191g, interfaceC15490bA2));
            this.f90194j = lg.c.a(coroutineContext);
            lg.e<InterfaceC2911h<SessionConfigs>> eVarA = C15489a.a(d.a(this.f90187c, this.f90192h));
            this.f90195k = eVarA;
            lg.e<m> eVarA2 = C15489a.a(n.a(this.f90194j, this.f90189e, eVarA));
            this.f90196l = eVarA2;
            lg.e<C15716d> eVarA3 = C15489a.a(mg.g.a(this.f90189e, this.f90190f, this.f90191g, this.f90193i, eVarA2));
            this.f90197m = eVarA3;
            this.f90198n = C15489a.a(k.a(this.f90188d, eVarA3));
            lg.e<Z> eVarA4 = C15489a.a(g.a());
            this.f90199o = eVarA4;
            this.f90200p = C15489a.a(O.a(this.f90189e, eVarA4));
            InterfaceC15490b interfaceC15490bA3 = lg.c.a(bVar);
            this.f90201q = interfaceC15490bA3;
            lg.e<C15013g> eVarA5 = C15489a.a(C15015i.a(interfaceC15490bA3));
            this.f90202r = eVarA5;
            this.f90203s = C15489a.a(M.a(this.f90186b, this.f90190f, this.f90198n, eVarA5, this.f90194j));
            lg.e<F> eVarA6 = C15489a.a(G.a(this.f90200p));
            this.f90204t = eVarA6;
            this.f90205u = C15489a.a(e.a(this.f90187c, this.f90192h, eVarA6));
            lg.e<C15005A> eVarA7 = C15489a.a(C15006B.a(this.f90187c, this.f90199o));
            this.f90206v = eVarA7;
            lg.e<U> eVarA8 = C15489a.a(V.a(this.f90198n, this.f90200p, this.f90203s, this.f90189e, this.f90205u, eVarA7, this.f90194j));
            this.f90207w = eVarA8;
            lg.e<Q> eVarA9 = C15489a.a(S.a(eVarA8));
            this.f90208x = eVarA9;
            this.f90209y = C15489a.a(C15024s.a(this.f90186b, this.f90198n, this.f90194j, eVarA9));
        }
    }

    public static b.a a() {
        return new b();
    }
}

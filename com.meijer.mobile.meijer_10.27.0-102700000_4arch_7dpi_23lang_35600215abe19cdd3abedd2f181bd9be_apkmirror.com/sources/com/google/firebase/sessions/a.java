package com.google.firebase.sessions;

import B2.InterfaceC2943h;
import android.content.Context;
import com.google.firebase.sessions.b;
import hg.ApplicationInfo;
import hg.C14427A;
import hg.C14428B;
import hg.C14435g;
import hg.C14437i;
import hg.C14440l;
import hg.C14446s;
import hg.F;
import hg.G;
import hg.L;
import hg.M;
import hg.N;
import hg.O;
import hg.Q;
import hg.S;
import hg.SessionData;
import hg.T;
import hg.U;
import hg.V;
import hg.X;
import hg.Z;
import jg.C14890a;
import jg.InterfaceC14891b;
import kg.C15143b;
import kg.C15144c;
import kg.C15145d;
import kg.C15146e;
import kg.SessionConfigs;
import kg.j;
import kg.k;
import kg.m;
import kg.n;
import kotlin.coroutines.CoroutineContext;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public final class a {

    private static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f89337a;

        /* renamed from: b, reason: collision with root package name */
        private CoroutineContext f89338b;

        /* renamed from: c, reason: collision with root package name */
        private CoroutineContext f89339c;

        /* renamed from: d, reason: collision with root package name */
        private com.google.firebase.f f89340d;

        /* renamed from: e, reason: collision with root package name */
        private Jf.e f89341e;

        /* renamed from: f, reason: collision with root package name */
        private If.b<InterfaceC16286j> f89342f;

        private b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            jg.d.a(this.f89337a, Context.class);
            jg.d.a(this.f89338b, CoroutineContext.class);
            jg.d.a(this.f89339c, CoroutineContext.class);
            jg.d.a(this.f89340d, com.google.firebase.f.class);
            jg.d.a(this.f89341e, Jf.e.class);
            jg.d.a(this.f89342f, If.b.class);
            return new c(this.f89337a, this.f89338b, this.f89339c, this.f89340d, this.f89341e, this.f89342f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b f(Context context) {
            this.f89337a = (Context) jg.d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b b(CoroutineContext coroutineContext) {
            this.f89338b = (CoroutineContext) jg.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b e(CoroutineContext coroutineContext) {
            this.f89339c = (CoroutineContext) jg.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(com.google.firebase.f fVar) {
            this.f89340d = (com.google.firebase.f) jg.d.b(fVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(Jf.e eVar) {
            this.f89341e = (Jf.e) jg.d.b(eVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b a(If.b<InterfaceC16286j> bVar) {
            this.f89342f = (If.b) jg.d.b(bVar);
            return this;
        }
    }

    private static final class c implements com.google.firebase.sessions.b {

        /* renamed from: a, reason: collision with root package name */
        private final c f89343a;

        /* renamed from: b, reason: collision with root package name */
        private jg.e<com.google.firebase.f> f89344b;

        /* renamed from: c, reason: collision with root package name */
        private jg.e<Context> f89345c;

        /* renamed from: d, reason: collision with root package name */
        private jg.e<C15143b> f89346d;

        /* renamed from: e, reason: collision with root package name */
        private jg.e<X> f89347e;

        /* renamed from: f, reason: collision with root package name */
        private jg.e<Jf.e> f89348f;

        /* renamed from: g, reason: collision with root package name */
        private jg.e<ApplicationInfo> f89349g;

        /* renamed from: h, reason: collision with root package name */
        private jg.e<CoroutineContext> f89350h;

        /* renamed from: i, reason: collision with root package name */
        private jg.e<C15146e> f89351i;

        /* renamed from: j, reason: collision with root package name */
        private jg.e<CoroutineContext> f89352j;

        /* renamed from: k, reason: collision with root package name */
        private jg.e<InterfaceC2943h<SessionConfigs>> f89353k;

        /* renamed from: l, reason: collision with root package name */
        private jg.e<m> f89354l;

        /* renamed from: m, reason: collision with root package name */
        private jg.e<C15145d> f89355m;

        /* renamed from: n, reason: collision with root package name */
        private jg.e<j> f89356n;

        /* renamed from: o, reason: collision with root package name */
        private jg.e<Z> f89357o;

        /* renamed from: p, reason: collision with root package name */
        private jg.e<N> f89358p;

        /* renamed from: q, reason: collision with root package name */
        private jg.e<If.b<InterfaceC16286j>> f89359q;

        /* renamed from: r, reason: collision with root package name */
        private jg.e<C14435g> f89360r;

        /* renamed from: s, reason: collision with root package name */
        private jg.e<L> f89361s;

        /* renamed from: t, reason: collision with root package name */
        private jg.e<F> f89362t;

        /* renamed from: u, reason: collision with root package name */
        private jg.e<InterfaceC2943h<SessionData>> f89363u;

        /* renamed from: v, reason: collision with root package name */
        private jg.e<C14427A> f89364v;

        /* renamed from: w, reason: collision with root package name */
        private jg.e<U> f89365w;

        /* renamed from: x, reason: collision with root package name */
        private jg.e<Q> f89366x;

        /* renamed from: y, reason: collision with root package name */
        private jg.e<C14440l> f89367y;

        private c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, Jf.e eVar, If.b<InterfaceC16286j> bVar) {
            this.f89343a = this;
            c(context, coroutineContext, coroutineContext2, fVar, eVar, bVar);
        }

        @Override // com.google.firebase.sessions.b
        public T a() {
            return this.f89365w.get();
        }

        @Override // com.google.firebase.sessions.b
        public C14440l b() {
            return this.f89367y.get();
        }

        private void c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, Jf.e eVar, If.b<InterfaceC16286j> bVar) {
            this.f89344b = jg.c.a(fVar);
            InterfaceC14891b interfaceC14891bA = jg.c.a(context);
            this.f89345c = interfaceC14891bA;
            this.f89346d = C14890a.a(C15144c.a(interfaceC14891bA));
            this.f89347e = C14890a.a(f.a());
            this.f89348f = jg.c.a(eVar);
            this.f89349g = C14890a.a(com.google.firebase.sessions.c.b(this.f89344b));
            InterfaceC14891b interfaceC14891bA2 = jg.c.a(coroutineContext2);
            this.f89350h = interfaceC14891bA2;
            this.f89351i = C14890a.a(kg.f.a(this.f89349g, interfaceC14891bA2));
            this.f89352j = jg.c.a(coroutineContext);
            jg.e<InterfaceC2943h<SessionConfigs>> eVarA = C14890a.a(d.a(this.f89345c, this.f89350h));
            this.f89353k = eVarA;
            jg.e<m> eVarA2 = C14890a.a(n.a(this.f89352j, this.f89347e, eVarA));
            this.f89354l = eVarA2;
            jg.e<C15145d> eVarA3 = C14890a.a(kg.g.a(this.f89347e, this.f89348f, this.f89349g, this.f89351i, eVarA2));
            this.f89355m = eVarA3;
            this.f89356n = C14890a.a(k.a(this.f89346d, eVarA3));
            jg.e<Z> eVarA4 = C14890a.a(g.a());
            this.f89357o = eVarA4;
            this.f89358p = C14890a.a(O.a(this.f89347e, eVarA4));
            InterfaceC14891b interfaceC14891bA3 = jg.c.a(bVar);
            this.f89359q = interfaceC14891bA3;
            jg.e<C14435g> eVarA5 = C14890a.a(C14437i.a(interfaceC14891bA3));
            this.f89360r = eVarA5;
            this.f89361s = C14890a.a(M.a(this.f89344b, this.f89348f, this.f89356n, eVarA5, this.f89352j));
            jg.e<F> eVarA6 = C14890a.a(G.a(this.f89358p));
            this.f89362t = eVarA6;
            this.f89363u = C14890a.a(e.a(this.f89345c, this.f89350h, eVarA6));
            jg.e<C14427A> eVarA7 = C14890a.a(C14428B.a(this.f89345c, this.f89357o));
            this.f89364v = eVarA7;
            jg.e<U> eVarA8 = C14890a.a(V.a(this.f89356n, this.f89358p, this.f89361s, this.f89347e, this.f89363u, eVarA7, this.f89352j));
            this.f89365w = eVarA8;
            jg.e<Q> eVarA9 = C14890a.a(S.a(eVarA8));
            this.f89366x = eVarA9;
            this.f89367y = C14890a.a(C14446s.a(this.f89344b, this.f89356n, this.f89352j, eVarA9));
        }
    }

    public static b.a a() {
        return new b();
    }
}

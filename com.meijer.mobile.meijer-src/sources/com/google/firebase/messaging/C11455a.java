package com.google.firebase.messaging;

import java.io.IOException;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11455a implements Ef.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Ef.a f89700a = new C11455a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C1292a implements Df.c<Rf.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C1292a f89701a = new C1292a();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f89702b = Df.b.a("projectNumber").b(Gf.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Df.b f89703c = Df.b.a("messageId").b(Gf.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final Df.b f89704d = Df.b.a("instanceId").b(Gf.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final Df.b f89705e = Df.b.a("messageType").b(Gf.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final Df.b f89706f = Df.b.a("sdkPlatform").b(Gf.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final Df.b f89707g = Df.b.a("packageName").b(Gf.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final Df.b f89708h = Df.b.a("collapseKey").b(Gf.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final Df.b f89709i = Df.b.a("priority").b(Gf.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final Df.b f89710j = Df.b.a("ttl").b(Gf.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final Df.b f89711k = Df.b.a("topic").b(Gf.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final Df.b f89712l = Df.b.a("bulkId").b(Gf.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final Df.b f89713m = Df.b.a("event").b(Gf.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final Df.b f89714n = Df.b.a("analyticsLabel").b(Gf.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final Df.b f89715o = Df.b.a("campaignId").b(Gf.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final Df.b f89716p = Df.b.a("composerLabel").b(Gf.a.b().c(15).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rf.a aVar, Df.d dVar) throws IOException {
            dVar.d(f89702b, aVar.l());
            dVar.a(f89703c, aVar.h());
            dVar.a(f89704d, aVar.g());
            dVar.a(f89705e, aVar.i());
            dVar.a(f89706f, aVar.m());
            dVar.a(f89707g, aVar.j());
            dVar.a(f89708h, aVar.d());
            dVar.e(f89709i, aVar.k());
            dVar.e(f89710j, aVar.o());
            dVar.a(f89711k, aVar.n());
            dVar.d(f89712l, aVar.b());
            dVar.a(f89713m, aVar.f());
            dVar.a(f89714n, aVar.a());
            dVar.d(f89715o, aVar.c());
            dVar.a(f89716p, aVar.e());
        }

        private C1292a() {
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements Df.c<Rf.b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f89717a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f89718b = Df.b.a("messagingClientEvent").b(Gf.a.b().c(1).a()).a();

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Rf.b bVar, Df.d dVar) throws IOException {
            dVar.a(f89718b, bVar.a());
        }

        private b() {
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements Df.c<M> {

        /* renamed from: a, reason: collision with root package name */
        static final c f89719a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Df.b f89720b = Df.b.d("messagingClientEventExtension");

        @Override // Df.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(M m10, Df.d dVar) throws IOException {
            dVar.a(f89720b, m10.b());
        }

        private c() {
        }
    }

    @Override // Ef.a
    public void a(Ef.b<?> bVar) {
        bVar.a(M.class, c.f89719a);
        bVar.a(Rf.b.class, b.f89717a);
        bVar.a(Rf.a.class, C1292a.f89701a);
    }

    private C11455a() {
    }
}

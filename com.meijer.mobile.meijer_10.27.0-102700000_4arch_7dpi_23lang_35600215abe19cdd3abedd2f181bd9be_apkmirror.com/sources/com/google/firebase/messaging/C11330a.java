package com.google.firebase.messaging;

import java.io.IOException;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11330a implements Cf.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Cf.a f88866a = new C11330a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C1283a implements Bf.c<Pf.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C1283a f88867a = new C1283a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f88868b = Bf.b.a("projectNumber").b(Ef.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final Bf.b f88869c = Bf.b.a("messageId").b(Ef.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final Bf.b f88870d = Bf.b.a("instanceId").b(Ef.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final Bf.b f88871e = Bf.b.a("messageType").b(Ef.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final Bf.b f88872f = Bf.b.a("sdkPlatform").b(Ef.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final Bf.b f88873g = Bf.b.a("packageName").b(Ef.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final Bf.b f88874h = Bf.b.a("collapseKey").b(Ef.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final Bf.b f88875i = Bf.b.a("priority").b(Ef.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final Bf.b f88876j = Bf.b.a("ttl").b(Ef.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final Bf.b f88877k = Bf.b.a("topic").b(Ef.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final Bf.b f88878l = Bf.b.a("bulkId").b(Ef.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final Bf.b f88879m = Bf.b.a("event").b(Ef.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final Bf.b f88880n = Bf.b.a("analyticsLabel").b(Ef.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final Bf.b f88881o = Bf.b.a("campaignId").b(Ef.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final Bf.b f88882p = Bf.b.a("composerLabel").b(Ef.a.b().c(15).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Pf.a aVar, Bf.d dVar) throws IOException {
            dVar.d(f88868b, aVar.l());
            dVar.f(f88869c, aVar.h());
            dVar.f(f88870d, aVar.g());
            dVar.f(f88871e, aVar.i());
            dVar.f(f88872f, aVar.m());
            dVar.f(f88873g, aVar.j());
            dVar.f(f88874h, aVar.d());
            dVar.e(f88875i, aVar.k());
            dVar.e(f88876j, aVar.o());
            dVar.f(f88877k, aVar.n());
            dVar.d(f88878l, aVar.b());
            dVar.f(f88879m, aVar.f());
            dVar.f(f88880n, aVar.a());
            dVar.d(f88881o, aVar.c());
            dVar.f(f88882p, aVar.e());
        }

        private C1283a() {
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements Bf.c<Pf.b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f88883a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f88884b = Bf.b.a("messagingClientEvent").b(Ef.a.b().c(1).a()).a();

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Pf.b bVar, Bf.d dVar) throws IOException {
            dVar.f(f88884b, bVar.a());
        }

        private b() {
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements Bf.c<K> {

        /* renamed from: a, reason: collision with root package name */
        static final c f88885a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final Bf.b f88886b = Bf.b.d("messagingClientEventExtension");

        @Override // Bf.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(K k10, Bf.d dVar) throws IOException {
            dVar.f(f88886b, k10.b());
        }

        private c() {
        }
    }

    @Override // Cf.a
    public void a(Cf.b<?> bVar) {
        bVar.a(K.class, c.f88885a);
        bVar.a(Pf.b.class, b.f88883a);
        bVar.a(Pf.a.class, C1283a.f88867a);
    }

    private C11330a() {
    }
}

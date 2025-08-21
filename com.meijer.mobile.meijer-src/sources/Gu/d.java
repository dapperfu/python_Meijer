package Gu;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class d {

    private static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        static final f f13248a = new b();

        @Override // Gu.f
        protected Iterator<Gu.e> a() {
            return Collections.EMPTY_SET.iterator();
        }

        private b() {
        }
    }

    private static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        static final g f13249c = new c();

        @Override // Gu.g
        public g b(h hVar, j jVar, i iVar) {
            Eu.c.c(hVar, "key");
            Eu.c.c(jVar, "value");
            Eu.c.c(iVar, "tagMetadata");
            return this;
        }

        private c() {
        }

        @Override // Gu.g
        public f a() {
            return d.a();
        }
    }

    /* renamed from: Gu.d$d, reason: collision with other inner class name */
    private static final class C0193d extends k {

        /* renamed from: a, reason: collision with root package name */
        static final k f13250a = new C0193d();

        private C0193d() {
        }

        @Override // Gu.k
        public g a() {
            return d.b();
        }
    }

    private static final class e extends m {
        private e() {
        }

        @Override // Gu.m
        public k a() {
            return d.c();
        }
    }

    static f a() {
        return b.f13248a;
    }

    static g b() {
        return c.f13249c;
    }

    static k c() {
        return C0193d.f13250a;
    }

    static m d() {
        return new e();
    }
}

package Ku;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
final class d {

    private static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        static final f f17565a = new b();

        @Override // Ku.f
        protected Iterator<Ku.e> a() {
            return Collections.EMPTY_SET.iterator();
        }

        private b() {
        }
    }

    private static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        static final g f17566c = new c();

        @Override // Ku.g
        public g b(h hVar, j jVar, i iVar) {
            Iu.c.c(hVar, "key");
            Iu.c.c(jVar, "value");
            Iu.c.c(iVar, "tagMetadata");
            return this;
        }

        private c() {
        }

        @Override // Ku.g
        public f a() {
            return d.a();
        }
    }

    /* renamed from: Ku.d$d, reason: collision with other inner class name */
    private static final class C0296d extends k {

        /* renamed from: a, reason: collision with root package name */
        static final k f17567a = new C0296d();

        private C0296d() {
        }

        @Override // Ku.k
        public g a() {
            return d.b();
        }
    }

    private static final class e extends m {
        private e() {
        }

        @Override // Ku.m
        public k a() {
            return d.c();
        }
    }

    static f a() {
        return b.f17565a;
    }

    static g b() {
        return c.f17566c;
    }

    static k c() {
        return C0296d.f17567a;
    }

    static m d() {
        return new e();
    }
}

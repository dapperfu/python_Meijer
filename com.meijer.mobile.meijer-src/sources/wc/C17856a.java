package wc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tc.m;

/* renamed from: wc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17856a {

    /* renamed from: e, reason: collision with root package name */
    private static final C17856a f167067e = new C2657a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f167068a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f167069b;

    /* renamed from: c, reason: collision with root package name */
    private final C17857b f167070c;

    /* renamed from: d, reason: collision with root package name */
    private final String f167071d;

    /* renamed from: wc.a$a, reason: collision with other inner class name */
    public static final class C2657a {

        /* renamed from: a, reason: collision with root package name */
        private f f167072a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f167073b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C17857b f167074c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f167075d = "";

        public C2657a a(d dVar) {
            this.f167073b.add(dVar);
            return this;
        }

        public C17856a b() {
            return new C17856a(this.f167072a, Collections.unmodifiableList(this.f167073b), this.f167074c, this.f167075d);
        }

        public C2657a c(String str) {
            this.f167075d = str;
            return this;
        }

        public C2657a d(C17857b c17857b) {
            this.f167074c = c17857b;
            return this;
        }

        public C2657a e(f fVar) {
            this.f167072a = fVar;
            return this;
        }

        C2657a() {
        }
    }

    public static C2657a e() {
        return new C2657a();
    }

    @Gf.d(tag = 4)
    public String a() {
        return this.f167071d;
    }

    @Gf.d(tag = 3)
    public C17857b b() {
        return this.f167070c;
    }

    @Gf.d(tag = 2)
    public List<d> c() {
        return this.f167069b;
    }

    @Gf.d(tag = 1)
    public f d() {
        return this.f167068a;
    }

    C17856a(f fVar, List<d> list, C17857b c17857b, String str) {
        this.f167068a = fVar;
        this.f167069b = list;
        this.f167070c = c17857b;
        this.f167071d = str;
    }

    public byte[] f() {
        return m.a(this);
    }
}

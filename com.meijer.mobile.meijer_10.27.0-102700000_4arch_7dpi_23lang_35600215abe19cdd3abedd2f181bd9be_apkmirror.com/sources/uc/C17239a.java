package uc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rc.m;

/* renamed from: uc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17239a {

    /* renamed from: e, reason: collision with root package name */
    private static final C17239a f162858e = new C2575a().b();

    /* renamed from: a, reason: collision with root package name */
    private final f f162859a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f162860b;

    /* renamed from: c, reason: collision with root package name */
    private final C17240b f162861c;

    /* renamed from: d, reason: collision with root package name */
    private final String f162862d;

    /* renamed from: uc.a$a, reason: collision with other inner class name */
    public static final class C2575a {

        /* renamed from: a, reason: collision with root package name */
        private f f162863a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<d> f162864b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C17240b f162865c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f162866d = "";

        public C2575a a(d dVar) {
            this.f162864b.add(dVar);
            return this;
        }

        public C17239a b() {
            return new C17239a(this.f162863a, Collections.unmodifiableList(this.f162864b), this.f162865c, this.f162866d);
        }

        public C2575a c(String str) {
            this.f162866d = str;
            return this;
        }

        public C2575a d(C17240b c17240b) {
            this.f162865c = c17240b;
            return this;
        }

        public C2575a e(f fVar) {
            this.f162863a = fVar;
            return this;
        }

        C2575a() {
        }
    }

    public static C2575a e() {
        return new C2575a();
    }

    @Ef.d(tag = 4)
    public String a() {
        return this.f162862d;
    }

    @Ef.d(tag = 3)
    public C17240b b() {
        return this.f162861c;
    }

    @Ef.d(tag = 2)
    public List<d> c() {
        return this.f162860b;
    }

    @Ef.d(tag = 1)
    public f d() {
        return this.f162859a;
    }

    C17239a(f fVar, List<d> list, C17240b c17240b, String str) {
        this.f162859a = fVar;
        this.f162860b = list;
        this.f162861c = c17240b;
        this.f162862d = str;
    }

    public byte[] f() {
        return m.a(this);
    }
}

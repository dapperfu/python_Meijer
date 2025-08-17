package qf;

import java.io.File;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final b f157226c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final uf.g f157227a;

    /* renamed from: b, reason: collision with root package name */
    private d f157228b;

    private static final class b implements d {
        private b() {
        }

        @Override // qf.d
        public void a() {
        }

        @Override // qf.d
        public String b() {
            return null;
        }

        @Override // qf.d
        public byte[] c() {
            return null;
        }

        @Override // qf.d
        public void d() {
        }

        @Override // qf.d
        public void e(long j10, String str) {
        }
    }

    public f(uf.g gVar) {
        this.f157227a = gVar;
        this.f157228b = f157226c;
    }

    private File d(String str) {
        return this.f157227a.q(str, "userlog");
    }

    public void a() {
        this.f157228b.d();
    }

    public byte[] b() {
        return this.f157228b.c();
    }

    public String c() {
        return this.f157228b.b();
    }

    public final void e(String str) {
        this.f157228b.a();
        this.f157228b = f157226c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f157228b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f157228b.e(j10, str);
    }

    public f(uf.g gVar, String str) {
        this(gVar);
        e(str);
    }
}

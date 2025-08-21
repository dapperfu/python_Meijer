package sf;

import java.io.File;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final b f160341c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final wf.g f160342a;

    /* renamed from: b, reason: collision with root package name */
    private d f160343b;

    private static final class b implements d {
        private b() {
        }

        @Override // sf.d
        public void a() {
        }

        @Override // sf.d
        public String b() {
            return null;
        }

        @Override // sf.d
        public byte[] c() {
            return null;
        }

        @Override // sf.d
        public void d() {
        }

        @Override // sf.d
        public void e(long j10, String str) {
        }
    }

    public f(wf.g gVar) {
        this.f160342a = gVar;
        this.f160343b = f160341c;
    }

    private File d(String str) {
        return this.f160342a.q(str, "userlog");
    }

    public void a() {
        this.f160343b.d();
    }

    public byte[] b() {
        return this.f160343b.c();
    }

    public String c() {
        return this.f160343b.b();
    }

    public final void e(String str) {
        this.f160343b.a();
        this.f160343b = f160341c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f160343b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f160343b.e(j10, str);
    }

    public f(wf.g gVar, String str) {
        this(gVar);
        e(str);
    }
}

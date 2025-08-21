package nf;

import Kf.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import tf.AbstractC17251F;
import tf.AbstractC17252G;

/* renamed from: nf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15941d implements InterfaceC15938a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f152424c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Kf.a<InterfaceC15938a> f152425a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<InterfaceC15938a> f152426b = new AtomicReference<>(null);

    /* renamed from: nf.d$b */
    private static final class b implements h {
        private b() {
        }

        @Override // nf.h
        public File a() {
            return null;
        }

        @Override // nf.h
        public AbstractC17251F.a b() {
            return null;
        }

        @Override // nf.h
        public File c() {
            return null;
        }

        @Override // nf.h
        public File d() {
            return null;
        }

        @Override // nf.h
        public File e() {
            return null;
        }

        @Override // nf.h
        public File f() {
            return null;
        }

        @Override // nf.h
        public File g() {
            return null;
        }
    }

    @Override // nf.InterfaceC15938a
    public h a(String str) {
        InterfaceC15938a interfaceC15938a = this.f152426b.get();
        return interfaceC15938a == null ? f152424c : interfaceC15938a.a(str);
    }

    @Override // nf.InterfaceC15938a
    public boolean b() {
        InterfaceC15938a interfaceC15938a = this.f152426b.get();
        return interfaceC15938a != null && interfaceC15938a.b();
    }

    @Override // nf.InterfaceC15938a
    public boolean d(String str) {
        InterfaceC15938a interfaceC15938a = this.f152426b.get();
        return interfaceC15938a != null && interfaceC15938a.d(str);
    }

    public C15941d(Kf.a<InterfaceC15938a> aVar) {
        this.f152425a = aVar;
        aVar.a(new a.InterfaceC0279a() { // from class: nf.b
            @Override // Kf.a.InterfaceC0279a
            public final void a(Kf.b bVar) {
                C15941d.f(this.f152419a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(C15941d c15941d, Kf.b bVar) {
        c15941d.getClass();
        g.f().b("Crashlytics native component now available.");
        c15941d.f152426b.set((InterfaceC15938a) bVar.get());
    }

    @Override // nf.InterfaceC15938a
    public void c(final String str, final String str2, final long j10, final AbstractC17252G abstractC17252G) {
        g.f().i("Deferring native open session: " + str);
        this.f152425a.a(new a.InterfaceC0279a() { // from class: nf.c
            @Override // Kf.a.InterfaceC0279a
            public final void a(Kf.b bVar) {
                ((InterfaceC15938a) bVar.get()).c(str, str2, j10, abstractC17252G);
            }
        });
    }
}

package lf;

import If.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import rf.AbstractC16777F;
import rf.AbstractC16778G;

/* renamed from: lf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15407d implements InterfaceC15404a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f148853c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final If.a<InterfaceC15404a> f148854a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<InterfaceC15404a> f148855b = new AtomicReference<>(null);

    /* renamed from: lf.d$b */
    private static final class b implements h {
        private b() {
        }

        @Override // lf.h
        public File a() {
            return null;
        }

        @Override // lf.h
        public AbstractC16777F.a b() {
            return null;
        }

        @Override // lf.h
        public File c() {
            return null;
        }

        @Override // lf.h
        public File d() {
            return null;
        }

        @Override // lf.h
        public File e() {
            return null;
        }

        @Override // lf.h
        public File f() {
            return null;
        }

        @Override // lf.h
        public File g() {
            return null;
        }
    }

    @Override // lf.InterfaceC15404a
    public h a(String str) {
        InterfaceC15404a interfaceC15404a = this.f148855b.get();
        return interfaceC15404a == null ? f148853c : interfaceC15404a.a(str);
    }

    @Override // lf.InterfaceC15404a
    public boolean b() {
        InterfaceC15404a interfaceC15404a = this.f148855b.get();
        return interfaceC15404a != null && interfaceC15404a.b();
    }

    @Override // lf.InterfaceC15404a
    public boolean d(String str) {
        InterfaceC15404a interfaceC15404a = this.f148855b.get();
        return interfaceC15404a != null && interfaceC15404a.d(str);
    }

    public C15407d(If.a<InterfaceC15404a> aVar) {
        this.f148854a = aVar;
        aVar.a(new a.InterfaceC0219a() { // from class: lf.b
            @Override // If.a.InterfaceC0219a
            public final void a(If.b bVar) {
                C15407d.f(this.f148848a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(C15407d c15407d, If.b bVar) {
        c15407d.getClass();
        g.f().b("Crashlytics native component now available.");
        c15407d.f148855b.set((InterfaceC15404a) bVar.get());
    }

    @Override // lf.InterfaceC15404a
    public void c(final String str, final String str2, final long j10, final AbstractC16778G abstractC16778G) {
        g.f().i("Deferring native open session: " + str);
        this.f148854a.a(new a.InterfaceC0219a() { // from class: lf.c
            @Override // If.a.InterfaceC0219a
            public final void a(If.b bVar) {
                ((InterfaceC15404a) bVar.get()).c(str, str2, j10, abstractC16778G);
            }
        });
    }
}

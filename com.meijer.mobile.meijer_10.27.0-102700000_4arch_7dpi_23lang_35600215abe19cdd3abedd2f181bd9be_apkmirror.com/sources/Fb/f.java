package Fb;

import Ib.i;
import Ib.j;
import Ib.l;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.io.IOException;
import kt.s;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f10374g = C6381b.a(f.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C6382c f10375h = C6383d.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f10376a;

    /* renamed from: b, reason: collision with root package name */
    final Ib.f f10377b;

    /* renamed from: c, reason: collision with root package name */
    private final l<s> f10378c;

    /* renamed from: d, reason: collision with root package name */
    final i f10379d;

    /* renamed from: e, reason: collision with root package name */
    private Fb.b f10380e;

    /* renamed from: f, reason: collision with root package name */
    Bb.e f10381f;

    final class a implements InterfaceC15945c<s> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10382a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f10383b;

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            f.f10375h.g("Failed to send push registration ID to server: {}", str);
            this.f10383b.a(i10, str);
        }

        a(String str, InterfaceC15945c interfaceC15945c) {
            this.f10382a = str;
            this.f10383b = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(s sVar) {
            f fVar = f.this;
            String str = this.f10382a;
            int iA = fVar.f10380e.a();
            Eb.d dVarL = fVar.f10381f.L();
            dVarL.f(str);
            dVarL.e(iA);
            dVarL.g(false);
            fVar.f10381f.j(dVarL);
            C6380a unused = f.f10374g;
            f.c(f.this.i());
            this.f10383b.a(null);
        }
    }

    final class b implements InterfaceC15945c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15945c f10385a;

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            f.f10375h.g("Failed to send delete registration ID to server: {}", str);
            this.f10385a.a(i10, str);
        }

        b(InterfaceC15945c interfaceC15945c) {
            this.f10385a = interfaceC15945c;
        }

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(Void r22) {
            C6380a unused = f.f10374g;
            this.f10385a.a(null);
            Eb.d dVarL = f.this.f10381f.L();
            dVarL.f(null);
            dVarL.g(false);
        }
    }

    protected static String c(String str) {
        if (str == null) {
            return "-UNKNOWN-";
        }
        return "..." + str.substring(0, Math.min(str.length(), Math.max(str.length(), 6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i() {
        return this.f10381f.L().c();
    }

    public final void d(String str, InterfaceC15945c<Void> interfaceC15945c) {
        String strB = this.f10377b.b(j.f13782a, "pushdetail");
        s sVar = new s();
        sVar.a("android");
        sVar.b(str);
        this.f10378c.i(strB, sVar, s.class, new a(str, interfaceC15945c));
    }

    public f(c cVar, Bb.e eVar, l<s> lVar, i iVar, Ib.f fVar, Fb.b bVar) {
        this.f10376a = cVar;
        this.f10381f = eVar;
        this.f10378c = lVar;
        this.f10377b = fVar;
        this.f10379d = iVar;
        this.f10380e = bVar;
    }

    public final void e(InterfaceC15945c<Void> interfaceC15945c) throws Exception {
        String strI = i();
        if (strI == null) {
            return;
        }
        if (this.f10376a.b()) {
            String strA = this.f10376a.a(strI);
            if (strA != null) {
                d(strA, interfaceC15945c);
                return;
            }
            f10375h.g("GCM registration failed for senderId starting with " + c(strI), new Object[0]);
            throw new IOException();
        }
        Exception exc = new Exception("Google Play Services not available - unable to register for push");
        f10375h.g(exc.getMessage(), new Object[0]);
        throw exc;
    }
}

package Hb;

import Kb.i;
import Kb.j;
import Kb.l;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.IOException;
import kt.s;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f13501g = C13785b.a(f.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C13786c f13502h = C13787d.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f13503a;

    /* renamed from: b, reason: collision with root package name */
    final Kb.f f13504b;

    /* renamed from: c, reason: collision with root package name */
    private final l<s> f13505c;

    /* renamed from: d, reason: collision with root package name */
    final i f13506d;

    /* renamed from: e, reason: collision with root package name */
    private Hb.b f13507e;

    /* renamed from: f, reason: collision with root package name */
    Db.e f13508f;

    final class a implements InterfaceC16021c<s> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f13510b;

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            f.f13502h.g("Failed to send push registration ID to server: {}", str);
            this.f13510b.a(i10, str);
        }

        a(String str, InterfaceC16021c interfaceC16021c) {
            this.f13509a = str;
            this.f13510b = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(s sVar) {
            f fVar = f.this;
            String str = this.f13509a;
            int iA = fVar.f13507e.a();
            Gb.d dVarL = fVar.f13508f.L();
            dVarL.f(str);
            dVarL.e(iA);
            dVarL.g(false);
            fVar.f13508f.j(dVarL);
            C13784a unused = f.f13501g;
            f.c(f.this.i());
            this.f13510b.a(null);
        }
    }

    final class b implements InterfaceC16021c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16021c f13512a;

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            f.f13502h.g("Failed to send delete registration ID to server: {}", str);
            this.f13512a.a(i10, str);
        }

        b(InterfaceC16021c interfaceC16021c) {
            this.f13512a = interfaceC16021c;
        }

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(Void r22) {
            C13784a unused = f.f13501g;
            this.f13512a.a(null);
            Gb.d dVarL = f.this.f13508f.L();
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
        return this.f13508f.L().c();
    }

    public final void d(String str, InterfaceC16021c<Void> interfaceC16021c) {
        String strB = this.f13504b.b(j.f16528a, "pushdetail");
        s sVar = new s();
        sVar.a("android");
        sVar.b(str);
        this.f13505c.i(strB, sVar, s.class, new a(str, interfaceC16021c));
    }

    public f(c cVar, Db.e eVar, l<s> lVar, i iVar, Kb.f fVar, Hb.b bVar) {
        this.f13503a = cVar;
        this.f13508f = eVar;
        this.f13505c = lVar;
        this.f13504b = fVar;
        this.f13506d = iVar;
        this.f13507e = bVar;
    }

    public final void e(InterfaceC16021c<Void> interfaceC16021c) throws Exception {
        String strI = i();
        if (strI == null) {
            return;
        }
        if (this.f13503a.b()) {
            String strA = this.f13503a.a(strI);
            if (strA != null) {
                d(strA, interfaceC16021c);
                return;
            }
            f13502h.g("GCM registration failed for senderId starting with " + c(strI), new Object[0]);
            throw new IOException();
        }
        Exception exc = new Exception("Google Play Services not available - unable to register for push");
        f13502h.g(exc.getMessage(), new Object[0]);
        throw exc;
    }
}

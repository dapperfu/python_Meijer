package xc;

import Ac.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import pc.InterfaceC16287k;
import rc.p;
import rc.u;
import sc.InterfaceC16925e;
import sc.InterfaceC16933m;
import yc.x;
import zc.InterfaceC18422d;

/* renamed from: xc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18032c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f169539f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f169540a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f169541b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC16925e f169542c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18422d f169543d;

    /* renamed from: e, reason: collision with root package name */
    private final Ac.a f169544e;

    public static /* synthetic */ Object b(C18032c c18032c, p pVar, rc.i iVar) {
        c18032c.f169543d.t0(pVar, iVar);
        c18032c.f169540a.a(pVar, 1);
        return null;
    }

    @Override // xc.e
    public void a(final p pVar, final rc.i iVar, final InterfaceC16287k interfaceC16287k) {
        this.f169541b.execute(new Runnable() { // from class: xc.a
            @Override // java.lang.Runnable
            public final void run() {
                C18032c.c(this.f169532a, pVar, interfaceC16287k, iVar);
            }
        });
    }

    public C18032c(Executor executor, InterfaceC16925e interfaceC16925e, x xVar, InterfaceC18422d interfaceC18422d, Ac.a aVar) {
        this.f169541b = executor;
        this.f169542c = interfaceC16925e;
        this.f169540a = xVar;
        this.f169543d = interfaceC18422d;
        this.f169544e = aVar;
    }

    public static /* synthetic */ void c(final C18032c c18032c, final p pVar, InterfaceC16287k interfaceC16287k, rc.i iVar) {
        c18032c.getClass();
        try {
            InterfaceC16933m interfaceC16933mA = c18032c.f169542c.a(pVar.b());
            if (interfaceC16933mA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f169539f.warning(str);
                interfaceC16287k.a(new IllegalArgumentException(str));
            } else {
                final rc.i iVarB = interfaceC16933mA.b(iVar);
                c18032c.f169544e.c(new a.InterfaceC0009a() { // from class: xc.b
                    @Override // Ac.a.InterfaceC0009a
                    public final Object execute() {
                        return C18032c.b(this.f169536a, pVar, iVarB);
                    }
                });
                interfaceC16287k.a(null);
            }
        } catch (Exception e10) {
            f169539f.warning("Error scheduling event " + e10.getMessage());
            interfaceC16287k.a(e10);
        }
    }
}

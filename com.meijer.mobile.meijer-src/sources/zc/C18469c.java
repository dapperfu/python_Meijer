package zc;

import Ac.x;
import Bc.InterfaceC2922d;
import Cc.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import rc.InterfaceC16891k;
import tc.p;
import tc.u;
import uc.InterfaceC17372e;
import uc.InterfaceC17380m;

/* renamed from: zc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18469c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f172688f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f172689a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f172690b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC17372e f172691c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2922d f172692d;

    /* renamed from: e, reason: collision with root package name */
    private final Cc.a f172693e;

    public static /* synthetic */ Object b(C18469c c18469c, p pVar, tc.i iVar) {
        c18469c.f172692d.u1(pVar, iVar);
        c18469c.f172689a.b(pVar, 1);
        return null;
    }

    @Override // zc.e
    public void a(final p pVar, final tc.i iVar, final InterfaceC16891k interfaceC16891k) {
        this.f172690b.execute(new Runnable() { // from class: zc.a
            @Override // java.lang.Runnable
            public final void run() {
                C18469c.c(this.f172681a, pVar, interfaceC16891k, iVar);
            }
        });
    }

    public C18469c(Executor executor, InterfaceC17372e interfaceC17372e, x xVar, InterfaceC2922d interfaceC2922d, Cc.a aVar) {
        this.f172690b = executor;
        this.f172691c = interfaceC17372e;
        this.f172689a = xVar;
        this.f172692d = interfaceC2922d;
        this.f172693e = aVar;
    }

    public static /* synthetic */ void c(final C18469c c18469c, final p pVar, InterfaceC16891k interfaceC16891k, tc.i iVar) {
        c18469c.getClass();
        try {
            InterfaceC17380m interfaceC17380mA = c18469c.f172691c.a(pVar.b());
            if (interfaceC17380mA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f172688f.warning(str);
                interfaceC16891k.a(new IllegalArgumentException(str));
            } else {
                final tc.i iVarA = interfaceC17380mA.a(iVar);
                c18469c.f172693e.c(new a.InterfaceC0086a() { // from class: zc.b
                    @Override // Cc.a.InterfaceC0086a
                    public final Object execute() {
                        return C18469c.b(this.f172685a, pVar, iVarA);
                    }
                });
                interfaceC16891k.a(null);
            }
        } catch (Exception e10) {
            f172688f.warning("Error scheduling event " + e10.getMessage());
            interfaceC16891k.a(e10);
        }
    }
}

package Ac;

import Bc.InterfaceC2922d;
import Cc.a;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f297a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2922d f298b;

    /* renamed from: c, reason: collision with root package name */
    private final x f299c;

    /* renamed from: d, reason: collision with root package name */
    private final Cc.a f300d;

    public static /* synthetic */ Object a(v vVar) {
        Iterator<tc.p> it = vVar.f298b.q0().iterator();
        while (it.hasNext()) {
            vVar.f299c.b(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f297a.execute(new Runnable() { // from class: Ac.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f295a;
                vVar.f300d.c(new a.InterfaceC0086a() { // from class: Ac.u
                    @Override // Cc.a.InterfaceC0086a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }

    v(Executor executor, InterfaceC2922d interfaceC2922d, x xVar, Cc.a aVar) {
        this.f297a = executor;
        this.f298b = interfaceC2922d;
        this.f299c = xVar;
        this.f300d = aVar;
    }
}

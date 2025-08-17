package yc;

import Ac.a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f170448a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18422d f170449b;

    /* renamed from: c, reason: collision with root package name */
    private final x f170450c;

    /* renamed from: d, reason: collision with root package name */
    private final Ac.a f170451d;

    public static /* synthetic */ Object a(v vVar) {
        Iterator<rc.p> it = vVar.f170449b.p0().iterator();
        while (it.hasNext()) {
            vVar.f170450c.a(it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f170448a.execute(new Runnable() { // from class: yc.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f170446a;
                vVar.f170451d.c(new a.InterfaceC0009a() { // from class: yc.u
                    @Override // Ac.a.InterfaceC0009a
                    public final Object execute() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }

    v(Executor executor, InterfaceC18422d interfaceC18422d, x xVar, Ac.a aVar) {
        this.f170448a = executor;
        this.f170449b = interfaceC18422d;
        this.f170450c = xVar;
        this.f170451d = aVar;
    }
}

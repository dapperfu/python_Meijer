package fc;

import eb.C13784a;
import eb.C13785b;
import java.util.List;
import nc.C15929a;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static C13784a f131663b = C13785b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public Tb.c f131664a = null;

    public final void a(List<C15929a> list) {
        for (C15929a c15929a : list) {
            Tb.c cVar = this.f131664a;
            if (cVar != null) {
                cVar.d(c15929a);
            }
        }
    }
}

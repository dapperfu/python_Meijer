package dc;

import cb.C6380a;
import cb.C6381b;
import java.util.List;
import lc.C15395a;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static C6380a f127334b = C6381b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public Rb.c f127335a = null;

    public final void a(List<C15395a> list) {
        for (C15395a c15395a : list) {
            Rb.c cVar = this.f127335a;
            if (cVar != null) {
                cVar.c(c15395a);
            }
        }
    }
}

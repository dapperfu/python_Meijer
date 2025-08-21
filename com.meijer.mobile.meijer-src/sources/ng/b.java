package ng;

import com.google.firebase.components.ComponentRegistrar;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class b implements i {
    @Override // df.i
    public List<C13676c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C13676c<?> c13676cR : componentRegistrar.getComponents()) {
            final String strI = c13676cR.i();
            if (strI != null) {
                c13676cR = c13676cR.r(new g() { // from class: ng.a
                    @Override // df.g
                    public final Object a(InterfaceC13677d interfaceC13677d) {
                        return b.b(strI, c13676cR, interfaceC13677d);
                    }
                });
            }
            arrayList.add(c13676cR);
        }
        return arrayList;
    }

    public static /* synthetic */ Object b(String str, C13676c c13676c, InterfaceC13677d interfaceC13677d) {
        try {
            c.b(str);
            return c13676c.h().a(interfaceC13677d);
        } finally {
            c.a();
        }
    }
}

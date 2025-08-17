package lg;

import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class b implements i {
    @Override // bf.i
    public List<C6245c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C6245c<?> c6245cR : componentRegistrar.getComponents()) {
            final String strI = c6245cR.i();
            if (strI != null) {
                c6245cR = c6245cR.r(new g() { // from class: lg.a
                    @Override // bf.g
                    public final Object a(InterfaceC6246d interfaceC6246d) {
                        return b.b(strI, c6245cR, interfaceC6246d);
                    }
                });
            }
            arrayList.add(c6245cR);
        }
        return arrayList;
    }

    public static /* synthetic */ Object b(String str, C6245c c6245c, InterfaceC6246d interfaceC6246d) {
        try {
            c.b(str);
            return c6245c.h().a(interfaceC6246d);
        } finally {
            c.a();
        }
    }
}

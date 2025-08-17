package nu;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
class f {
    static h a(Collection<? extends InterfaceC15948c> collection, int i10) {
        int i11 = 0;
        for (InterfaceC15948c interfaceC15948c : collection) {
            int iA = interfaceC15948c.a() + i11;
            if (iA > i10) {
                return interfaceC15948c.getItem(i10 - i11);
            }
            i11 = iA;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i10 + " but there are only " + i11 + " items");
    }

    static int b(Collection<? extends InterfaceC15948c> collection) {
        Iterator<? extends InterfaceC15948c> it = collection.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }
}

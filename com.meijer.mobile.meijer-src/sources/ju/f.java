package ju;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes12.dex */
class f {
    static h a(Collection<? extends InterfaceC15068c> collection, int i10) {
        int i11 = 0;
        for (InterfaceC15068c interfaceC15068c : collection) {
            int iA = interfaceC15068c.a() + i11;
            if (iA > i10) {
                return interfaceC15068c.getItem(i10 - i11);
            }
            i11 = iA;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i10 + " but there are only " + i11 + " items");
    }

    static int b(Collection<? extends InterfaceC15068c> collection) {
        Iterator<? extends InterfaceC15068c> it = collection.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }
}

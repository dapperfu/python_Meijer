package d3;

import Ce.L;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: d3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13472g {
    public static <T> ArrayList<Bundle> b(Collection<T> collection, Be.g<T, Bundle> gVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> Ce.L<T> a(Be.g<Bundle, T> gVar, List<Bundle> list) {
        L.a aVarP = Ce.L.p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarP.a(gVar.apply((Bundle) C13466a.e(list.get(i10))));
        }
        return aVarP.k();
    }
}

package I9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class k {
    public static List<String> a(A9.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar instanceof A9.a) {
            arrayList.addAll(Arrays.asList(((A9.a) cVar).getOriginalRequestIds()));
            return arrayList;
        }
        arrayList.add(cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        return arrayList;
    }
}

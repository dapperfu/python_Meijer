package G9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y9.C18190a;

/* loaded from: classes4.dex */
public class k {
    public static List<String> a(y9.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar instanceof C18190a) {
            arrayList.addAll(Arrays.asList(((C18190a) cVar).getOriginalRequestIds()));
            return arrayList;
        }
        arrayList.add(cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        return arrayList;
    }
}

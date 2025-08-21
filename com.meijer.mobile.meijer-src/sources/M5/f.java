package M5;

import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.C6576j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/h;", "", "from", "to", "Lcom/adobe/marketing/mobile/j;", "a", "(Lcom/adobe/marketing/mobile/h;JJ)Lcom/adobe/marketing/mobile/j;", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {
    public static final C6576j a(C6574h c6574h, long j10, long j11) {
        Map mapK;
        Map map;
        Intrinsics.j(c6574h, "<this>");
        Map<String, Object> mapO = c6574h.o();
        if (mapO == null || (mapK = j.b(mapO, null, false, 3, null)) == null) {
            mapK = MapsKt.k();
        }
        if (c6574h.p() != null) {
            String[] mask = c6574h.p();
            Intrinsics.i(mask, "mask");
            Set setT1 = ArraysKt.t1(mask);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapK.entrySet()) {
                if (setT1.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        } else {
            map = mapK;
        }
        return new C6576j(map, j10, j11);
    }

    public static /* synthetic */ C6576j b(C6574h c6574h, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        return a(c6574h, j10, j11);
    }
}

package x;

import C.C2979w;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Long, C2979w> f166610a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<C2979w, List<Long>> f166611b;

    static {
        HashMap map = new HashMap();
        f166610a = map;
        HashMap map2 = new HashMap();
        f166611b = map2;
        C2979w c2979w = C2979w.f3533d;
        map.put(1L, c2979w);
        map2.put(c2979w, Collections.singletonList(1L));
        map.put(2L, C2979w.f3535f);
        map2.put((C2979w) map.get(2L), Collections.singletonList(2L));
        C2979w c2979w2 = C2979w.f3536g;
        map.put(4L, c2979w2);
        map2.put(c2979w2, Collections.singletonList(4L));
        C2979w c2979w3 = C2979w.f3537h;
        map.put(8L, c2979w3);
        map2.put(c2979w3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f166610a.put(it.next(), C2979w.f3538i);
        }
        f166611b.put(C2979w.f3538i, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f166610a.put(it2.next(), C2979w.f3539j);
        }
        f166611b.put(C2979w.f3539j, listAsList2);
    }

    public static Long a(C2979w c2979w, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f166611b.get(c2979w);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static C2979w b(long j10) {
        return f166610a.get(Long.valueOf(j10));
    }
}

package x;

import C.C3037w;
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
    private static final Map<Long, C3037w> f167698a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<C3037w, List<Long>> f167699b;

    static {
        HashMap map = new HashMap();
        f167698a = map;
        HashMap map2 = new HashMap();
        f167699b = map2;
        C3037w c3037w = C3037w.f3991d;
        map.put(1L, c3037w);
        map2.put(c3037w, Collections.singletonList(1L));
        map.put(2L, C3037w.f3993f);
        map2.put((C3037w) map.get(2L), Collections.singletonList(2L));
        C3037w c3037w2 = C3037w.f3994g;
        map.put(4L, c3037w2);
        map2.put(c3037w2, Collections.singletonList(4L));
        C3037w c3037w3 = C3037w.f3995h;
        map.put(8L, c3037w3);
        map2.put(c3037w3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f167698a.put(it.next(), C3037w.f3996i);
        }
        f167699b.put(C3037w.f3996i, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f167698a.put(it2.next(), C3037w.f3997j);
        }
        f167699b.put(C3037w.f3997j, listAsList2);
    }

    public static Long a(C3037w c3037w, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f167699b.get(c3037w);
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

    public static C3037w b(long j10) {
        return f167698a.get(Long.valueOf(j10));
    }
}

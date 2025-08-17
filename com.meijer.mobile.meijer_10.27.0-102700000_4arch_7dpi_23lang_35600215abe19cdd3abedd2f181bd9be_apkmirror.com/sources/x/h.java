package x;

import C.C2979w;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x.g;

/* loaded from: classes.dex */
class h implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f166613a;

    private Long d(C2979w c2979w) {
        return d.a(c2979w, this.f166613a);
    }

    @Override // x.g.a
    public DynamicRangeProfiles a() {
        return this.f166613a;
    }

    @Override // x.g.a
    public Set<C2979w> b() {
        return e(this.f166613a.getSupportedProfiles());
    }

    h(Object obj) {
        this.f166613a = (DynamicRangeProfiles) obj;
    }

    private static Set<C2979w> e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(it.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static C2979w f(long j10) {
        return (C2979w) o2.i.h(d.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // x.g.a
    public Set<C2979w> c(C2979w c2979w) {
        boolean z10;
        Long lD = d(c2979w);
        if (lD != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.b(z10, "DynamicRange is not supported: " + c2979w);
        return e(this.f166613a.getProfileCaptureRequestConstraints(lD.longValue()));
    }
}

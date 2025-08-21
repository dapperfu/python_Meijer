package x;

import C.C3037w;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x.g;

/* loaded from: classes.dex */
class h implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f167701a;

    private Long d(C3037w c3037w) {
        return d.a(c3037w, this.f167701a);
    }

    @Override // x.g.a
    public DynamicRangeProfiles a() {
        return this.f167701a;
    }

    @Override // x.g.a
    public Set<C3037w> b() {
        return e(this.f167701a.getSupportedProfiles());
    }

    h(Object obj) {
        this.f167701a = (DynamicRangeProfiles) obj;
    }

    private static Set<C3037w> e(Set<Long> set) {
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

    private static C3037w f(long j10) {
        return (C3037w) o2.i.h(d.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // x.g.a
    public Set<C3037w> c(C3037w c3037w) {
        boolean z10;
        Long lD = d(c3037w);
        if (lD != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.b(z10, "DynamicRange is not supported: " + c3037w);
        return e(this.f167701a.getProfileCaptureRequestConstraints(lD.longValue()));
    }
}

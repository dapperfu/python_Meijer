package v;

import C.C2979w;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.impl.AbstractC5650a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: v.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17388j1 {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f164075a;

    /* renamed from: b, reason: collision with root package name */
    private final x.g f164076b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f164077c;

    /* renamed from: v.j1$a */
    static final class a {
        static C2979w a(w.B b10) {
            Long l10 = (Long) b10.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return x.d.b(l10.longValue());
            }
            return null;
        }
    }

    private static boolean e(C2979w c2979w) {
        return Objects.equals(c2979w, C2979w.f3532c);
    }

    boolean d() {
        return this.f164077c;
    }

    Map<androidx.camera.core.impl.D<?>, C2979w> g(List<AbstractC5650a> list, List<androidx.camera.core.impl.D<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AbstractC5650a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<C2979w> setC = this.f164076b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator<C2979w> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.f164076b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.D<?> d10 = list2.get(it3.next().intValue());
            C2979w c2979wH = d10.H();
            if (e(c2979wH)) {
                arrayList3.add(d10);
            } else if (f(c2979wH)) {
                arrayList2.add(d10);
            } else {
                arrayList.add(d10);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<androidx.camera.core.impl.D<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.D<?> d11 : arrayList4) {
            C2979w c2979wI = i(setC, linkedHashSet, linkedHashSet2, d11, hashSet);
            map.put(d11, c2979wI);
            if (!linkedHashSet.contains(c2979wI)) {
                linkedHashSet2.add(c2979wI);
            }
        }
        return map;
    }

    C17388j1(w.B b10) {
        this.f164075a = b10;
        this.f164076b = x.g.a(b10);
        int[] iArr = (int[]) b10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f164077c = z10;
    }

    private static boolean a(C2979w c2979w, C2979w c2979w2) {
        o2.i.j(c2979w2.e(), "Fully specified range is not actually fully specified.");
        if (c2979w.b() == 2 && c2979w2.b() == 1) {
            return false;
        }
        if (c2979w.b() != 2 && c2979w.b() != 0 && c2979w.b() != c2979w2.b()) {
            return false;
        }
        if (c2979w.a() == 0 || c2979w.a() == c2979w2.a()) {
            return true;
        }
        return false;
    }

    private static boolean b(C2979w c2979w, C2979w c2979w2, Set<C2979w> set) {
        if (!set.contains(c2979w2)) {
            C.P.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c2979w, c2979w2));
            return false;
        }
        return a(c2979w, c2979w2);
    }

    private static C2979w c(C2979w c2979w, Collection<C2979w> collection, Set<C2979w> set) {
        if (c2979w.b() == 1) {
            return null;
        }
        for (C2979w c2979w2 : collection) {
            o2.i.h(c2979w2, "Fully specified DynamicRange cannot be null.");
            int iB = c2979w2.b();
            o2.i.j(c2979w2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(c2979w, c2979w2, set)) {
                return c2979w2;
            }
        }
        return null;
    }

    private static boolean f(C2979w c2979w) {
        if (c2979w.b() != 2) {
            if (c2979w.b() == 0 || c2979w.a() != 0) {
                if (c2979w.b() != 0 || c2979w.a() == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private C2979w h(C2979w c2979w, Set<C2979w> set, Set<C2979w> set2, Set<C2979w> set3, String str) {
        C2979w c2979wA;
        String str2;
        if (c2979w.e()) {
            if (!set.contains(c2979w)) {
                return null;
            }
            return c2979w;
        }
        int iB = c2979w.b();
        int iA = c2979w.a();
        if (iB == 1 && iA == 0) {
            C2979w c2979w2 = C2979w.f3533d;
            if (!set.contains(c2979w2)) {
                return null;
            }
            return c2979w2;
        }
        C2979w c2979wC = c(c2979w, set2, set);
        if (c2979wC != null) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c2979w, c2979wC));
            return c2979wC;
        }
        C2979w c2979wC2 = c(c2979w, set3, set);
        if (c2979wC2 != null) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c2979w, c2979wC2));
            return c2979wC2;
        }
        C2979w c2979w3 = C2979w.f3533d;
        if (b(c2979w, c2979w3, set)) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c2979w, c2979w3));
            return c2979w3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c2979wA = a.a(this.f164075a);
                if (c2979wA != null) {
                    linkedHashSet.add(c2979wA);
                }
            } else {
                c2979wA = null;
            }
            linkedHashSet.add(C2979w.f3535f);
            C2979w c2979wC3 = c(c2979w, linkedHashSet, set);
            if (c2979wC3 != null) {
                if (c2979wC3.equals(c2979wA)) {
                    str2 = "recommended";
                } else {
                    str2 = "required";
                }
                C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, str2, c2979w, c2979wC3));
                return c2979wC3;
            }
        }
        for (C2979w c2979w4 : set) {
            o2.i.j(c2979w4.e(), "Candidate dynamic range must be fully specified.");
            if (!c2979w4.equals(C2979w.f3533d) && a(c2979w, c2979w4)) {
                C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c2979w, c2979w4));
                return c2979w4;
            }
        }
        return null;
    }

    private C2979w i(Set<C2979w> set, Set<C2979w> set2, Set<C2979w> set3, androidx.camera.core.impl.D<?> d10, Set<C2979w> set4) {
        C2979w c2979wH = d10.H();
        C2979w c2979wH2 = h(c2979wH, set4, set2, set3, d10.Q());
        if (c2979wH2 != null) {
            j(set4, c2979wH2, this.f164076b);
            return c2979wH2;
        }
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", d10.Q(), c2979wH, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
    }

    private static void j(Set<C2979w> set, C2979w c2979w, x.g gVar) {
        o2.i.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C2979w> setB = gVar.b(c2979w);
        if (!setB.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            set.retainAll(setB);
            if (set.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c2979w, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
            }
        }
    }
}

package v;

import C.C3037w;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.impl.AbstractC5792a;
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
final class C17527j1 {

    /* renamed from: a, reason: collision with root package name */
    private final w.B f165109a;

    /* renamed from: b, reason: collision with root package name */
    private final x.g f165110b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f165111c;

    /* renamed from: v.j1$a */
    static final class a {
        static C3037w a(w.B b10) {
            Long l10 = (Long) b10.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return x.d.b(l10.longValue());
            }
            return null;
        }
    }

    private static boolean e(C3037w c3037w) {
        return Objects.equals(c3037w, C3037w.f3990c);
    }

    boolean d() {
        return this.f165111c;
    }

    Map<androidx.camera.core.impl.D<?>, C3037w> g(List<AbstractC5792a> list, List<androidx.camera.core.impl.D<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AbstractC5792a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<C3037w> setC = this.f165110b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator<C3037w> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.f165110b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.D<?> d10 = list2.get(it3.next().intValue());
            C3037w c3037wH = d10.H();
            if (e(c3037wH)) {
                arrayList3.add(d10);
            } else if (f(c3037wH)) {
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
            C3037w c3037wI = i(setC, linkedHashSet, linkedHashSet2, d11, hashSet);
            map.put(d11, c3037wI);
            if (!linkedHashSet.contains(c3037wI)) {
                linkedHashSet2.add(c3037wI);
            }
        }
        return map;
    }

    C17527j1(w.B b10) {
        this.f165109a = b10;
        this.f165110b = x.g.a(b10);
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
        this.f165111c = z10;
    }

    private static boolean a(C3037w c3037w, C3037w c3037w2) {
        o2.i.j(c3037w2.e(), "Fully specified range is not actually fully specified.");
        if (c3037w.b() == 2 && c3037w2.b() == 1) {
            return false;
        }
        if (c3037w.b() != 2 && c3037w.b() != 0 && c3037w.b() != c3037w2.b()) {
            return false;
        }
        if (c3037w.a() == 0 || c3037w.a() == c3037w2.a()) {
            return true;
        }
        return false;
    }

    private static boolean b(C3037w c3037w, C3037w c3037w2, Set<C3037w> set) {
        if (!set.contains(c3037w2)) {
            C.P.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c3037w, c3037w2));
            return false;
        }
        return a(c3037w, c3037w2);
    }

    private static C3037w c(C3037w c3037w, Collection<C3037w> collection, Set<C3037w> set) {
        if (c3037w.b() == 1) {
            return null;
        }
        for (C3037w c3037w2 : collection) {
            o2.i.h(c3037w2, "Fully specified DynamicRange cannot be null.");
            int iB = c3037w2.b();
            o2.i.j(c3037w2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(c3037w, c3037w2, set)) {
                return c3037w2;
            }
        }
        return null;
    }

    private static boolean f(C3037w c3037w) {
        if (c3037w.b() != 2) {
            if (c3037w.b() == 0 || c3037w.a() != 0) {
                if (c3037w.b() != 0 || c3037w.a() == 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private C3037w h(C3037w c3037w, Set<C3037w> set, Set<C3037w> set2, Set<C3037w> set3, String str) {
        C3037w c3037wA;
        String str2;
        if (c3037w.e()) {
            if (!set.contains(c3037w)) {
                return null;
            }
            return c3037w;
        }
        int iB = c3037w.b();
        int iA = c3037w.a();
        if (iB == 1 && iA == 0) {
            C3037w c3037w2 = C3037w.f3991d;
            if (!set.contains(c3037w2)) {
                return null;
            }
            return c3037w2;
        }
        C3037w c3037wC = c(c3037w, set2, set);
        if (c3037wC != null) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c3037w, c3037wC));
            return c3037wC;
        }
        C3037w c3037wC2 = c(c3037w, set3, set);
        if (c3037wC2 != null) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c3037w, c3037wC2));
            return c3037wC2;
        }
        C3037w c3037w3 = C3037w.f3991d;
        if (b(c3037w, c3037w3, set)) {
            C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c3037w, c3037w3));
            return c3037w3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                c3037wA = a.a(this.f165109a);
                if (c3037wA != null) {
                    linkedHashSet.add(c3037wA);
                }
            } else {
                c3037wA = null;
            }
            linkedHashSet.add(C3037w.f3993f);
            C3037w c3037wC3 = c(c3037w, linkedHashSet, set);
            if (c3037wC3 != null) {
                if (c3037wC3.equals(c3037wA)) {
                    str2 = "recommended";
                } else {
                    str2 = "required";
                }
                C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, str2, c3037w, c3037wC3));
                return c3037wC3;
            }
        }
        for (C3037w c3037w4 : set) {
            o2.i.j(c3037w4.e(), "Candidate dynamic range must be fully specified.");
            if (!c3037w4.equals(C3037w.f3991d) && a(c3037w, c3037w4)) {
                C.P.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c3037w, c3037w4));
                return c3037w4;
            }
        }
        return null;
    }

    private C3037w i(Set<C3037w> set, Set<C3037w> set2, Set<C3037w> set3, androidx.camera.core.impl.D<?> d10, Set<C3037w> set4) {
        C3037w c3037wH = d10.H();
        C3037w c3037wH2 = h(c3037wH, set4, set2, set3, d10.Q());
        if (c3037wH2 != null) {
            j(set4, c3037wH2, this.f165110b);
            return c3037wH2;
        }
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", d10.Q(), c3037wH, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
    }

    private static void j(Set<C3037w> set, C3037w c3037w, x.g gVar) {
        o2.i.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C3037w> setB = gVar.b(c3037w);
        if (!setB.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            set.retainAll(setB);
            if (set.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c3037w, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
            }
        }
    }
}

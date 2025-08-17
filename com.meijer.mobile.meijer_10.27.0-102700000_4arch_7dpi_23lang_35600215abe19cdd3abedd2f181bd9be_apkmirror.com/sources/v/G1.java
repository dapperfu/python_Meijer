package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.AbstractC5650a;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u.C17169a;
import v.I1;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k.a<Long> f163676a = k.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Long, Set<E.b>> f163677b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Long, Set<E.b>> f163678c;

    public static boolean a(Map<Integer, AbstractC5650a> map, Map<Integer, androidx.camera.core.impl.D<?>> map2, List<F.v0> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jF = list.get(i10).f();
            if (map.containsKey(Integer.valueOf(i10))) {
                AbstractC5650a abstractC5650a = map.get(Integer.valueOf(i10));
                if (!g(abstractC5650a.b().size() == 1 ? abstractC5650a.b().get(0) : E.b.STREAM_SHARING, jF, abstractC5650a.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.D<?> d10 = map2.get(Integer.valueOf(i10));
                if (!g(d10.O(), jF, d10.O() == E.b.STREAM_SHARING ? ((S.h) d10).Y() : Collections.EMPTY_LIST)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void l(Map<androidx.camera.core.impl.D<?>, androidx.camera.core.impl.x> map, Map<AbstractC5650a, androidx.camera.core.impl.x> map2, Map<Integer, AbstractC5650a> map3, Map<Integer, androidx.camera.core.impl.D<?>> map4, List<F.v0> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long jF = list.get(i10).f();
            if (map3.containsKey(Integer.valueOf(i10))) {
                AbstractC5650a abstractC5650a = map3.get(Integer.valueOf(i10));
                androidx.camera.core.impl.k kVarF = f(abstractC5650a.e(), jF);
                if (kVarF != null) {
                    map2.put(abstractC5650a, abstractC5650a.i(kVarF));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.D<?> d10 = map4.get(Integer.valueOf(i10));
                androidx.camera.core.impl.x xVar = map.get(d10);
                androidx.camera.core.impl.k kVarF2 = f(xVar.d(), jF);
                if (kVarF2 != null) {
                    map.put(d10, xVar.g().d(kVarF2).a());
                }
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f163677b = map;
        HashMap map2 = new HashMap();
        f163678c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            E.b bVar = E.b.PREVIEW;
            hashSet.add(bVar);
            E.b bVar2 = E.b.METERING_REPEATING;
            hashSet.add(bVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(E.b.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            E.b bVar3 = E.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            E.b bVar4 = E.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean c(w.B b10, List<F.v0> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) b10.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator<F.v0> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().f()))) {
                return false;
            }
        }
        return true;
    }

    private static androidx.camera.core.impl.k f(androidx.camera.core.impl.k kVar, long j10) {
        k.a<Long> aVar = f163676a;
        if (kVar.c(aVar) && ((Long) kVar.a(aVar)).longValue() == j10) {
            return null;
        }
        androidx.camera.core.impl.s sVarC0 = androidx.camera.core.impl.s.c0(kVar);
        sVarC0.r(aVar, Long.valueOf(j10));
        return new C17169a(sVarC0);
    }

    private static boolean g(E.b bVar, long j10, List<E.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != E.b.STREAM_SHARING) {
            Map<Long, Set<E.b>> map = f163677b;
            return map.containsKey(Long.valueOf(j10)) && map.get(Long.valueOf(j10)).contains(bVar);
        }
        Map<Long, Set<E.b>> map2 = f163678c;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set<E.b> set = map2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<E.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(w.B b10) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) b10.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    private static boolean i(List<AbstractC5650a> list, List<androidx.camera.core.impl.D<?>> list2, Set<Long> set) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        Iterator<AbstractC5650a> it = list.iterator();
        if (it.hasNext()) {
            AbstractC5650a next = it.next();
            androidx.camera.core.impl.k kVarE = next.e();
            k.a<Long> aVar = C17169a.f162454K;
            if (kVarE.c(aVar) && ((Long) next.e().a(aVar)).longValue() != 0) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        for (androidx.camera.core.impl.D<?> d10 : list2) {
            k.a<?> aVar2 = C17169a.f162454K;
            if (d10.c(aVar2)) {
                Long l10 = (Long) d10.a(aVar2);
                if (l10.longValue() != 0) {
                    if (z11) {
                        o();
                    }
                    hashSet.add(l10);
                    z10 = true;
                } else if (z10) {
                    o();
                }
            } else if (z10) {
                o();
            }
            z11 = true;
        }
        return !z11 && b(set, hashSet);
    }

    private static boolean j(androidx.camera.core.impl.k kVar, E.b bVar) {
        if (((Boolean) kVar.h(androidx.camera.core.impl.D.f47322D, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        k.a<Integer> aVar = androidx.camera.core.impl.o.f47435J;
        return kVar.c(aVar) && V1.b(bVar, ((Integer) kVar.a(aVar)).intValue()) == 5;
    }

    public static boolean k(w.B b10, List<AbstractC5650a> list, Map<androidx.camera.core.impl.D<?>, androidx.camera.core.impl.x> map, Map<AbstractC5650a, androidx.camera.core.impl.x> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<androidx.camera.core.impl.D<?>> arrayList = new ArrayList(map.keySet());
        Iterator<AbstractC5650a> it = list.iterator();
        while (it.hasNext()) {
            o2.i.g(it.next().e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o2.i.g(((androidx.camera.core.impl.x) o2.i.g(map.get((androidx.camera.core.impl.D) it2.next()))).d());
        }
        long[] jArr = (long[]) b10.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (i(list, arrayList, hashSet)) {
                for (AbstractC5650a abstractC5650a : list) {
                    androidx.camera.core.impl.k kVarE = abstractC5650a.e();
                    androidx.camera.core.impl.k kVarF = f(kVarE, ((Long) kVarE.a(C17169a.f162454K)).longValue());
                    if (kVarF != null) {
                        map2.put(abstractC5650a, abstractC5650a.i(kVarF));
                    }
                }
                for (androidx.camera.core.impl.D<?> d10 : arrayList) {
                    androidx.camera.core.impl.x xVar = map.get(d10);
                    androidx.camera.core.impl.k kVarD = xVar.d();
                    androidx.camera.core.impl.k kVarF2 = f(kVarD, ((Long) kVarD.a(C17169a.f162454K)).longValue());
                    if (kVarF2 != null) {
                        map.put(d10, xVar.g().d(kVarF2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void m(Collection<androidx.camera.core.impl.w> collection, Collection<androidx.camera.core.impl.D<?>> collection2, Map<DeferrableSurface, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (androidx.camera.core.impl.w wVar : collection) {
            androidx.camera.core.impl.k kVarF = wVar.f();
            k.a<Long> aVar = f163676a;
            if (kVarF.c(aVar) && wVar.o().size() != 1) {
                C.P.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(wVar.o().size())));
                return;
            }
            if (wVar.f().c(aVar)) {
                int i10 = 0;
                for (androidx.camera.core.impl.w wVar2 : collection) {
                    if (((androidx.camera.core.impl.D) arrayList.get(i10)).O() == E.b.METERING_REPEATING) {
                        o2.i.j(!wVar2.o().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put(wVar2.o().get(0), 1L);
                    } else {
                        androidx.camera.core.impl.k kVarF2 = wVar2.f();
                        k.a<Long> aVar2 = f163676a;
                        if (kVarF2.c(aVar2) && !wVar2.o().isEmpty()) {
                            map.put(wVar2.o().get(0), (Long) wVar2.f().a(aVar2));
                        }
                    }
                    i10++;
                }
                return;
            }
        }
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    private static boolean b(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List<AbstractC5650a> list, List<androidx.camera.core.impl.D<?>> list2) {
        for (AbstractC5650a abstractC5650a : list) {
            if (j(abstractC5650a.e(), abstractC5650a.b().get(0))) {
                return true;
            }
        }
        for (androidx.camera.core.impl.D<?> d10 : list2) {
            if (j(d10, d10.O())) {
                return true;
            }
        }
        return false;
    }

    public static C17169a e(androidx.camera.core.impl.D<?> d10) {
        androidx.camera.core.impl.s sVarB0 = androidx.camera.core.impl.s.b0();
        k.a<?> aVar = C17169a.f162454K;
        if (d10.c(aVar)) {
            sVarB0.r(aVar, (Long) d10.a(aVar));
        }
        k.a<?> aVar2 = androidx.camera.core.impl.D.f47322D;
        if (d10.c(aVar2)) {
            sVarB0.r(aVar2, (Boolean) d10.a(aVar2));
        }
        k.a<?> aVar3 = androidx.camera.core.impl.o.f47435J;
        if (d10.c(aVar3)) {
            sVarB0.r(aVar3, (Integer) d10.a(aVar3));
        }
        k.a<?> aVar4 = androidx.camera.core.impl.p.f47449l;
        if (d10.c(aVar4)) {
            sVarB0.r(aVar4, (Integer) d10.a(aVar4));
        }
        return new C17169a(sVarB0);
    }

    public static boolean n(I1.b bVar) {
        if (bVar.a() == 0 && bVar.b() == 8) {
            return true;
        }
        return false;
    }
}

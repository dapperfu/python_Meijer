package M0;

import E0.f;
import M0.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"LM0/h;", "K", "V", "LM0/j;", "", "LM0/o;", "map", "<init>", "(LM0/o;)V", "element", "", "h", "(Ljava/util/Map$Entry;)Ljava/lang/Void;", "", "elements", "k", "(Ljava/util/Collection;)Ljava/lang/Void;", "", "iterator", "()Ljava/util/Iterator;", "", "o", "(Ljava/util/Map$Entry;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "n", "containsAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class h<K, V> extends j<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new s(a(), ((E0.d) a().j().j().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        E0.f<K, V> fVarJ;
        int modification;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zB;
        Collection<? extends Object> collection = elements;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = TuplesKt.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        SnapshotStateMap<K, V> snapshotStateMapA = a();
        boolean z10 = false;
        do {
            synchronized (p.f18777a) {
                y firstStateRecord = snapshotStateMapA.getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.a aVar = (SnapshotStateMap.a) androidx.compose.runtime.snapshots.j.G((SnapshotStateMap.a) firstStateRecord);
                fVarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(fVarJ);
            f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            for (Map.Entry<K, V> entry2 : snapshotStateMapA.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder2.remove(entry2.getKey());
                    z10 = true;
                }
            }
            Unit unit2 = Unit.f142422a;
            E0.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(fVarBuild2, fVarJ)) {
                break;
            }
            y firstStateRecord2 = snapshotStateMapA.getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.a aVar2 = (SnapshotStateMap.a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zB = snapshotStateMapA.b((SnapshotStateMap.a) androidx.compose.runtime.snapshots.j.h0(aVar2, snapshotStateMapA, gVarC), modification, fVarBuild2);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, snapshotStateMapA);
        } while (!zB);
        return z10;
    }

    public h(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!TypeIntrinsics.p(obj)) {
            return false;
        }
        return n((Map.Entry) obj);
    }

    public Void h(Map.Entry<K, V> element) {
        p.b();
        throw new KotlinNothingValueException();
    }

    public Void k(Collection<? extends Map.Entry<K, V>> elements) {
        p.b();
        throw new KotlinNothingValueException();
    }

    public boolean n(Map.Entry<K, V> element) {
        return Intrinsics.e(a().get(element.getKey()), element.getValue());
    }

    public boolean o(Map.Entry<K, V> element) {
        if (a().remove(element.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!TypeIntrinsics.p(obj)) {
            return false;
        }
        return o((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }
}

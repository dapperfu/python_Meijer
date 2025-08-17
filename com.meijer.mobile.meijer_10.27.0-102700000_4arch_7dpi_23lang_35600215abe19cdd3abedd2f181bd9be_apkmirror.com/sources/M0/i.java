package M0;

import E0.f;
import M0.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"LM0/i;", "K", "V", "LM0/j;", "LM0/o;", "map", "<init>", "(LM0/o;)V", "element", "", "h", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "k", "(Ljava/util/Collection;)Ljava/lang/Void;", "LM0/u;", "n", "()LM0/u;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class i<K, V> extends j<K, V, K> {
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!a().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public u<K, V> iterator() {
        return new u<>(a(), ((E0.d) a().j().j().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(it.next()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        E0.f<K, V> fVarJ;
        int modification;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zB;
        Set setO1 = CollectionsKt.o1(elements);
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
            for (Map.Entry<K, V> entry : snapshotStateMapA.entrySet()) {
                if (!setO1.contains(entry.getKey())) {
                    aVarBuilder2.remove(entry.getKey());
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

    public i(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return a().containsKey(element);
    }

    public Void h(K element) {
        p.b();
        throw new KotlinNothingValueException();
    }

    public Void k(Collection<? extends K> elements) {
        p.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        if (a().remove(element) != null) {
            return true;
        }
        return false;
    }
}

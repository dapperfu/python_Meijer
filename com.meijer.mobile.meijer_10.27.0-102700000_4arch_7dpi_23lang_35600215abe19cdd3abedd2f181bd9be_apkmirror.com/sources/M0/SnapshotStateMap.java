package M0;

import E0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b)\u0010\u0018R$\u0010/\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R,\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R \u00107\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b6\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u00028\u0001088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00109\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"LM0/o;", "K", "V", "LM0/w;", "", "<init>", "()V", "LM0/o$a;", "", "currentModification", "LE0/f;", "newMap", "", "b", "(LM0/o$a;ILE0/f;)Z", "c", "(LM0/o$a;LE0/f;)I", "LM0/y;", "value", "", "f", "(LM0/y;)V", "key", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "r", "<set-?>", "a", "LM0/y;", "v", "()LM0/y;", "firstStateRecord", "", "", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "entries", "g", "keys", "", "Ljava/util/Collection;", "q", "()Ljava/util/Collection;", "values", "n", "()I", "size", "h", "modification", "j", "()LM0/o$a;", "getReadable$runtime_release$annotations", "readable", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: M0.o, reason: from toString */
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements w, Map<K, V>, KMutableMap {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y firstStateRecord;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<Map.Entry<K, V>> entries;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<K> keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Collection<V> values;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LM0/o$a;", "K", "V", "LM0/y;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "LE0/f;", "map", "<init>", "(JLE0/f;)V", "value", "", "c", "(LM0/y;)V", "d", "()LM0/y;", "e", "(J)LM0/y;", "LE0/f;", "j", "()LE0/f;", "l", "(LE0/f;)V", "", "I", "k", "()I", "m", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: M0.o$a */
    public static final class a<K, V> extends y {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private E0.f<K, ? extends V> map;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int modification;

        @Override // M0.y
        public void c(y value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) value;
            synchronized (p.f18777a) {
                this.map = aVar.map;
                this.modification = aVar.modification;
                Unit unit = Unit.f142422a;
            }
        }

        @Override // M0.y
        public y d() {
            return new a(androidx.compose.runtime.snapshots.j.I().getSnapshotId(), this.map);
        }

        @Override // M0.y
        public y e(long snapshotId) {
            return new a(snapshotId, this.map);
        }

        public final E0.f<K, V> j() {
            return this.map;
        }

        /* renamed from: k, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void l(E0.f<K, ? extends V> fVar) {
            this.map = fVar;
        }

        public final void m(int i10) {
            this.modification = i10;
        }

        public a(long j10, E0.f<K, ? extends V> fVar) {
            super(j10);
            this.map = fVar;
        }
    }

    public Set<Map.Entry<K, V>> d() {
        return this.entries;
    }

    @Override // M0.w
    public void f(y value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (a) value;
    }

    public Set<K> g() {
        return this.keys;
    }

    public Collection<V> q() {
        return this.values;
    }

    @Override // M0.w
    /* renamed from: v, reason: from getter */
    public y getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public SnapshotStateMap() {
        E0.f fVarA = E0.a.a();
        androidx.compose.runtime.snapshots.g gVarI = androidx.compose.runtime.snapshots.j.I();
        a aVar = new a(gVarI.getSnapshotId(), fVarA);
        if (!(gVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.h(new a(g.c(1), fVarA));
        }
        this.firstStateRecord = aVar;
        this.entries = new h(this);
        this.keys = new i(this);
        this.values = new k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(a<K, V> aVar, int i10, E0.f<K, ? extends V> fVar) {
        boolean z10;
        synchronized (p.f18777a) {
            if (aVar.getModification() == i10) {
                aVar.l(fVar);
                z10 = true;
                aVar.m(aVar.getModification() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private final int c(a<K, V> aVar, E0.f<K, ? extends V> fVar) {
        int modification;
        synchronized (p.f18777a) {
            aVar.l(fVar);
            modification = aVar.getModification();
            aVar.m(modification + 1);
        }
        return modification;
    }

    @Override // java.util.Map
    public void clear() {
        androidx.compose.runtime.snapshots.g gVarC;
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
        aVar.j();
        E0.f<K, ? extends V> fVarA = E0.a.a();
        if (fVarA != aVar.j()) {
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                c((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), fVarA);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return j().j().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return j().j().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    @Override // java.util.Map
    public V get(Object key) {
        return j().j().get(key);
    }

    public final int h() {
        return j().getModification();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return j().j().isEmpty();
    }

    public final a<K, V> j() {
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) androidx.compose.runtime.snapshots.j.X((a) firstStateRecord, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return g();
    }

    public int n() {
        return j().j().size();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        E0.f<K, V> fVarJ;
        int modification;
        V vPut;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zB;
        do {
            synchronized (p.f18777a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                fVarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(fVarJ);
            f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            vPut = aVarBuilder2.put(key, value);
            E0.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(fVarBuild2, fVarJ)) {
                break;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zB = b((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, fVarBuild2);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zB);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        E0.f<K, V> fVarJ;
        int modification;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zB;
        do {
            synchronized (p.f18777a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                fVarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(fVarJ);
            f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            aVarBuilder2.putAll(from);
            E0.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (!Intrinsics.e(fVarBuild2, fVarJ)) {
                y firstStateRecord2 = getFirstStateRecord();
                Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) firstStateRecord2;
                synchronized (androidx.compose.runtime.snapshots.j.J()) {
                    gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                    zB = b((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, fVarBuild2);
                }
                androidx.compose.runtime.snapshots.j.Q(gVarC, this);
            } else {
                return;
            }
        } while (!zB);
    }

    public final boolean r(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.e(((Map.Entry) next).getValue(), value)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public V remove(Object key) {
        E0.f<K, V> fVarJ;
        int modification;
        V vRemove;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zB;
        do {
            synchronized (p.f18777a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                fVarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(fVarJ);
            f.a<K, V> aVarBuilder2 = fVarJ.builder2();
            vRemove = aVarBuilder2.remove(key);
            E0.f<K, V> fVarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(fVarBuild2, fVarJ)) {
                break;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zB = b((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, fVarBuild2);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zB);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return n();
    }

    public String toString() {
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord)).j() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return q();
    }
}

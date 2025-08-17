package M0;

import E0.e;
import androidx.compose.runtime.C5757z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001NB\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ)\u0010\u000e\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010*J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u00104J%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010!J\u001f\u0010<\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=J%\u0010>\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010>\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b>\u0010%J\u000f\u0010@\u001a\u00020\u001cH\u0016¢\u0006\u0004\b@\u0010\nJ\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010!J\u001d\u0010B\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bB\u0010%J\u0017\u0010C\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u0010(J\u001d\u0010D\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\bD\u0010%J \u0010E\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bE\u0010FJ\u001d\u0010G\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011¢\u0006\u0004\bG\u0010HJ-\u0010K\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010J\u001a\u00020\u0011H\u0000¢\u0006\u0004\bK\u0010LR$\u0010R\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00188\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR \u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108@X\u0080\u0004¢\u0006\f\u0012\u0004\bX\u0010\n\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010T¨\u0006\\"}, d2 = {"LM0/m;", "T", "LM0/w;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "LE0/e;", "persistentList", "<init>", "(LE0/e;)V", "()V", "Lkotlin/Function1;", "", "block", "q", "(Lkotlin/jvm/functions/Function1;)Z", "LM0/m$a;", "", "currentModification", "newList", "structural", "h", "(LM0/m$a;ILE0/e;Z)Z", "list", "LM0/y;", "w", "(LE0/e;)LM0/y;", "value", "", "f", "(LM0/y;)V", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "r", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(II)V", "start", "end", "t", "(Ljava/util/Collection;II)I", "<set-?>", "a", "LM0/y;", "v", "()LM0/y;", "firstStateRecord", "p", "()I", "structure", "n", "()LM0/m$a;", "getReadable$runtime_release$annotations", "readable", "o", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: M0.m, reason: from toString */
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements w, List<T>, RandomAccess, KMutableList {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y firstStateRecord;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00022\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"LM0/m$a;", "T", "LM0/y;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "LE0/e;", "list", "<init>", "(JLE0/e;)V", "value", "", "c", "(LM0/y;)V", "d", "()LM0/y;", "e", "(J)LM0/y;", "LE0/e;", "j", "()LE0/e;", "m", "(LE0/e;)V", "", "I", "k", "()I", "n", "(I)V", "modification", "l", "o", "structuralChange", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: M0.m$a */
    public static final class a<T> extends y {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private E0.e<? extends T> list;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int modification;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int structuralChange;

        @Override // M0.y
        public y e(long snapshotId) {
            return new a(snapshotId, this.list);
        }

        public final E0.e<T> j() {
            return this.list;
        }

        /* renamed from: k, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* renamed from: l, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void m(E0.e<? extends T> eVar) {
            this.list = eVar;
        }

        public final void n(int i10) {
            this.modification = i10;
        }

        public final void o(int i10) {
            this.structuralChange = i10;
        }

        public a(long j10, E0.e<? extends T> eVar) {
            super(j10);
            this.list = eVar;
        }

        @Override // M0.y
        public void c(y value) {
            synchronized (n.f18770a) {
                Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.list = ((a) value).list;
                this.modification = ((a) value).modification;
                this.structuralChange = ((a) value).structuralChange;
                Unit unit = Unit.f142422a;
            }
        }

        @Override // M0.y
        public y d() {
            return e(androidx.compose.runtime.snapshots.j.I().getSnapshotId());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: M0.m$b */
    static final class b extends Lambda implements Function1<List<T>, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Collection<T> f18768g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f18767f = i10;
            this.f18768g = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.addAll(this.f18767f, this.f18768g));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: M0.m$c */
    static final class c extends Lambda implements Function1<List<T>, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Collection<T> f18769f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f18769f = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f18769f));
        }
    }

    public SnapshotStateList(E0.e<? extends T> eVar) {
        this.firstStateRecord = w(eVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarAdd = eVarJ.add((E0.e<T>) element);
            if (Intrinsics.e(eVarAdd, eVarJ)) {
                return false;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarAdd, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        return q(new b(index, elements));
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new r(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return r(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarAddAll = eVarJ.addAll(elements);
            if (Intrinsics.e(eVarAddAll, eVarJ)) {
                return false;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarAddAll, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new r(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarRemove = eVarJ.remove((E0.e<T>) element);
            if (Intrinsics.e(eVarRemove, eVarJ)) {
                return false;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarRemove, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return q(new c(elements));
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            C5757z0.a("fromIndex or toIndex are out of bounds");
        }
        return new z(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    @Override // M0.w
    /* renamed from: v, reason: from getter */
    public y getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public SnapshotStateList() {
        this(E0.a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h(a<T> aVar, int i10, E0.e<? extends T> eVar, boolean z10) {
        boolean z11;
        synchronized (n.f18770a) {
            try {
                if (aVar.getModification() == i10) {
                    aVar.m(eVar);
                    z11 = true;
                    if (z10) {
                        aVar.o(aVar.getStructuralChange() + 1);
                    }
                    aVar.n(aVar.getModification() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    private final boolean q(Function1<? super List<T>, Boolean> block) {
        int modification;
        E0.e<T> eVarJ;
        Boolean boolInvoke;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            e.a<T> aVarBuilder = eVarJ.builder();
            boolInvoke = block.invoke(aVarBuilder);
            E0.e<? extends T> eVarBuild = aVarBuilder.build();
            if (Intrinsics.e(eVarBuild, eVarJ)) {
                break;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarBuild, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return boolInvoke.booleanValue();
    }

    private final y w(E0.e<? extends T> list) {
        androidx.compose.runtime.snapshots.g gVarI = androidx.compose.runtime.snapshots.j.I();
        a aVar = new a(gVarI.getSnapshotId(), list);
        if (!(gVarI instanceof androidx.compose.runtime.snapshots.a)) {
            aVar.h(new a(g.c(1), list));
        }
        return aVar;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        androidx.compose.runtime.snapshots.g gVarC;
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) firstStateRecord;
        synchronized (androidx.compose.runtime.snapshots.j.J()) {
            gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
            a aVar2 = (a) androidx.compose.runtime.snapshots.j.h0(aVar, this, gVarC);
            synchronized (n.f18770a) {
                aVar2.m(E0.a.b());
                aVar2.n(aVar2.getModification() + 1);
                aVar2.o(aVar2.getStructuralChange() + 1);
            }
        }
        androidx.compose.runtime.snapshots.j.Q(gVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return n().j().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return n().j().containsAll(elements);
    }

    @Override // M0.w
    public void f(y value) {
        value.h(getFirstStateRecord());
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (a) value;
    }

    @Override // java.util.List
    public T get(int index) {
        return n().j().get(index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return n().j().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return n().j().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return n().j().lastIndexOf(element);
    }

    public final a<T> n() {
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) androidx.compose.runtime.snapshots.j.X((a) firstStateRecord, this);
    }

    public int o() {
        return n().j().size();
    }

    public final int p() {
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord)).getStructuralChange();
    }

    public T r(int index) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        T t10 = get(index);
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarV0 = eVarJ.v0(index);
            if (Intrinsics.e(eVarV0, eVarJ)) {
                return t10;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarV0, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarRemoveAll = eVarJ.removeAll((Collection<? extends T>) elements);
            if (Intrinsics.e(eVarRemoveAll, eVarJ)) {
                return false;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarRemoveAll, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return true;
    }

    public final void s(int fromIndex, int toIndex) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            e.a<T> aVarBuilder = eVarJ.builder();
            aVarBuilder.subList(fromIndex, toIndex).clear();
            E0.e<? extends T> eVarBuild = aVarBuilder.build();
            if (!Intrinsics.e(eVarBuild, eVarJ)) {
                y firstStateRecord2 = getFirstStateRecord();
                Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar2 = (a) firstStateRecord2;
                synchronized (androidx.compose.runtime.snapshots.j.J()) {
                    gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                    zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarBuild, true);
                }
                androidx.compose.runtime.snapshots.j.Q(gVarC, this);
            } else {
                return;
            }
        } while (!zH);
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        T t10 = get(index);
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVar = eVarJ.set(index, (int) element);
            if (Intrinsics.e(eVar, eVarJ)) {
                return t10;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVar, false);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return o();
    }

    public final int t(Collection<? extends T> elements, int start, int end) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        int size = size();
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            e.a<T> aVarBuilder = eVarJ.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            E0.e<? extends T> eVarBuild = aVarBuilder.build();
            if (Intrinsics.e(eVarBuild, eVarJ)) {
                break;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarBuild, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
        return size - size();
    }

    public String toString() {
        y firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord)).j() + ")@" + hashCode();
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        E0.e<T> eVarJ;
        androidx.compose.runtime.snapshots.g gVarC;
        boolean zH;
        do {
            synchronized (n.f18770a) {
                y firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) androidx.compose.runtime.snapshots.j.G((a) firstStateRecord);
                modification = aVar.getModification();
                eVarJ = aVar.j();
                Unit unit = Unit.f142422a;
            }
            Intrinsics.g(eVarJ);
            E0.e<T> eVarAdd = eVarJ.add(index, (int) element);
            if (Intrinsics.e(eVarAdd, eVarJ)) {
                return;
            }
            y firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
                zH = h((a) androidx.compose.runtime.snapshots.j.h0(aVar2, this, gVarC), modification, eVarAdd, true);
            }
            androidx.compose.runtime.snapshots.j.Q(gVarC, this);
        } while (!zH);
    }
}

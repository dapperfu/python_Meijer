package sl;

import ij.FulfillmentSlot;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010*\n\u0002\b\u001d\b\u0080\b\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BM\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0096\u0003¢\u0006\u0004\b(\u0010)J\u001e\u0010,\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b3\u00102J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0096\u0001¢\u0006\u0004\b5\u00106J\u001e\u00105\u001a\b\u0012\u0004\u0012\u00020\u0002042\u0006\u0010.\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b5\u00107J&\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b:\u0010;R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b=\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010\u001d¨\u0006Q"}, d2 = {"Lsl/a;", "", "Lij/c;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "fulfillmentMode", "slots", "", "error", "j$/time/Instant", "updatedAt", "expiresAt", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Throwable;Lj$/time/Instant;Lj$/time/Instant;)V", "j$/time/Duration", "duration", "now", "", "t", "(Lj$/time/Duration;Lj$/time/Instant;)Z", "s", "(Lj$/time/Instant;)Z", "f", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Throwable;Lj$/time/Instant;Lj$/time/Instant;)Lsl/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "element", "a", "(Lij/c;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "k", "(I)Lij/c;", "r", "(Lij/c;)I", "v", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "I", "getStoreId", "b", "Ljava/lang/String;", "getFulfillmentMode", "c", "Ljava/util/List;", "p", "()Ljava/util/List;", "d", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "e", "Lj$/time/Instant;", "q", "()Lj$/time/Instant;", "n", "o", "size", "g", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentSlotSet implements List<FulfillmentSlot>, KMappedMarker {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentSlot> slots;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable error;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Instant updatedAt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Instant expiresAt;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lsl/a$a;", "", "<init>", "()V", "j$/time/Instant", "now", "a", "(Lj$/time/Instant;)Lj$/time/Instant;", "", "STALE_DURATION_MINUTES", "J", "EXPIRED_DURATION_MINUTES", "SECONDS_IN_A_MINUTE", "EXPIRED_DURATION_SECONDS", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sl.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Instant a(Instant now) {
            Intrinsics.j(now, "now");
            Instant instantPlusSeconds = now.plusSeconds(1200L);
            Intrinsics.i(instantPlusSeconds, "plusSeconds(...)");
            return instantPlusSeconds;
        }
    }

    public FulfillmentSlotSet(int i10, String str, List<FulfillmentSlot> slots, Throwable th2, Instant updatedAt, Instant expiresAt) {
        Intrinsics.j(slots, "slots");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(expiresAt, "expiresAt");
        this.storeId = i10;
        this.fulfillmentMode = str;
        this.slots = slots;
        this.error = th2;
        this.updatedAt = updatedAt;
        this.expiresAt = expiresAt;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, FulfillmentSlot fulfillmentSlot) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends FulfillmentSlot> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotSet)) {
            return false;
        }
        FulfillmentSlotSet fulfillmentSlotSet = (FulfillmentSlotSet) other;
        return this.storeId == fulfillmentSlotSet.storeId && Intrinsics.e(this.fulfillmentMode, fulfillmentSlotSet.fulfillmentMode) && Intrinsics.e(this.slots, fulfillmentSlotSet.slots) && Intrinsics.e(this.error, fulfillmentSlotSet.error) && Intrinsics.e(this.updatedAt, fulfillmentSlotSet.updatedAt) && Intrinsics.e(this.expiresAt, fulfillmentSlotSet.expiresAt);
    }

    @Override // java.util.List
    public ListIterator<FulfillmentSlot> listIterator() {
        return this.slots.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ FulfillmentSlot remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public static /* synthetic */ FulfillmentSlotSet h(FulfillmentSlotSet fulfillmentSlotSet, int i10, String str, List list, Throwable th2, Instant instant, Instant instant2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fulfillmentSlotSet.storeId;
        }
        if ((i11 & 2) != 0) {
            str = fulfillmentSlotSet.fulfillmentMode;
        }
        if ((i11 & 4) != 0) {
            list = fulfillmentSlotSet.slots;
        }
        if ((i11 & 8) != 0) {
            th2 = fulfillmentSlotSet.error;
        }
        if ((i11 & 16) != 0) {
            instant = fulfillmentSlotSet.updatedAt;
        }
        if ((i11 & 32) != 0) {
            instant2 = fulfillmentSlotSet.expiresAt;
        }
        Instant instant3 = instant;
        Instant instant4 = instant2;
        return fulfillmentSlotSet.f(i10, str, list, th2, instant3, instant4);
    }

    public boolean a(FulfillmentSlot element) {
        Intrinsics.j(element, "element");
        return this.slots.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends FulfillmentSlot> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FulfillmentSlot) {
            return a((FulfillmentSlot) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        return this.slots.containsAll(elements);
    }

    public final FulfillmentSlotSet f(int storeId, String fulfillmentMode, List<FulfillmentSlot> slots, Throwable error, Instant updatedAt, Instant expiresAt) {
        Intrinsics.j(slots, "slots");
        Intrinsics.j(updatedAt, "updatedAt");
        Intrinsics.j(expiresAt, "expiresAt");
        return new FulfillmentSlotSet(storeId, fulfillmentMode, slots, error, updatedAt, expiresAt);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storeId) * 31;
        String str = this.fulfillmentMode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.slots.hashCode()) * 31;
        Throwable th2 = this.error;
        return ((((iHashCode2 + (th2 != null ? th2.hashCode() : 0)) * 31) + this.updatedAt.hashCode()) * 31) + this.expiresAt.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FulfillmentSlot) {
            return r((FulfillmentSlot) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.slots.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<FulfillmentSlot> iterator() {
        return this.slots.iterator();
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public FulfillmentSlot get(int index) {
        return this.slots.get(index);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FulfillmentSlot) {
            return v((FulfillmentSlot) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<FulfillmentSlot> listIterator(int index) {
        return this.slots.listIterator(index);
    }

    /* renamed from: n, reason: from getter */
    public final Instant getExpiresAt() {
        return this.expiresAt;
    }

    public int o() {
        return this.slots.size();
    }

    public final List<FulfillmentSlot> p() {
        return this.slots;
    }

    /* renamed from: q, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public int r(FulfillmentSlot element) {
        Intrinsics.j(element, "element");
        return this.slots.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<FulfillmentSlot> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s(Instant now) {
        Intrinsics.j(now, "now");
        return now.isAfter(this.expiresAt);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ FulfillmentSlot set(int i10, FulfillmentSlot fulfillmentSlot) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super FulfillmentSlot> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<FulfillmentSlot> subList(int fromIndex, int toIndex) {
        return this.slots.subList(fromIndex, toIndex);
    }

    public final boolean t(Duration duration, Instant now) {
        Intrinsics.j(duration, "duration");
        Intrinsics.j(now, "now");
        return !Duration.between(this.updatedAt, now).minus(duration).isNegative();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    public String toString() {
        return "FulfillmentSlotSet(storeId=" + this.storeId + ", fulfillmentMode=" + this.fulfillmentMode + ", slots=" + this.slots + ", error=" + this.error + ", updatedAt=" + this.updatedAt + ", expiresAt=" + this.expiresAt + ')';
    }

    public int v(FulfillmentSlot element) {
        Intrinsics.j(element, "element");
        return this.slots.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return o();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FulfillmentSlotSet(int i10, String str, List list, Throwable th2, Instant instant, Instant instant2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        List listM = (i11 & 4) != 0 ? CollectionsKt.m() : list;
        Throwable th3 = (i11 & 8) != 0 ? null : th2;
        Instant instantNow = (i11 & 16) != 0 ? Instant.now() : instant;
        if ((i11 & 32) != 0) {
            Companion companion = INSTANCE;
            Instant instantNow2 = Instant.now();
            Intrinsics.i(instantNow2, "now(...)");
            instant2 = companion.a(instantNow2);
        }
        this(i10, str, listM, th3, instantNow, instant2);
    }
}

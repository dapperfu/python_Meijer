package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\f\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010!J\u0017\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00028\u0001H\u0002¢\u0006\u0004\b+\u0010!J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0013J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0013J\u001f\u00102\u001a\u00020\u00192\u000e\u00101\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000300H\u0002¢\u0006\u0004\b2\u00103J#\u00106\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0002¢\u0006\u0004\b6\u00107J)\u0010:\u001a\u00020\u00192\u0018\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010408H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0019H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00192\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010FJ%\u0010G\u001a\u00020\u00142\u0014\u00109\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010DJ\u000f\u0010J\u001a\u00020\u0014H\u0016¢\u0006\u0004\bJ\u0010\u0011J\u001a\u0010L\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010KH\u0096\u0002¢\u0006\u0004\bL\u0010AJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0014H\u0000¢\u0006\u0004\bR\u0010\u0011J\u0017\u0010S\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010!J\u0017\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0002\u0010AJ#\u0010T\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\bT\u00107J\u001b\u0010V\u001a\u00020\u00192\n\u0010U\u001a\u0006\u0012\u0002\b\u000308H\u0000¢\u0006\u0004\bV\u0010;J#\u0010W\u001a\u00020\u00192\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000104H\u0000¢\u0006\u0004\bW\u00107J\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010X\u001a\u00028\u0001H\u0000¢\u0006\u0004\bY\u0010AJ\u001b\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010ZH\u0000¢\u0006\u0004\b[\u0010\\J\u001b\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0004\b^\u0010_J\u001b\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`H\u0000¢\u0006\u0004\ba\u0010bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0016\u0010o\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR$\u0010q\u001a\u00020\f2\u0006\u0010*\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010j\u001a\u0004\bp\u0010NR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010wR$\u0010|\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R$\u0010\u007f\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010}\u001a\u0004\b~\u0010?R\u0016\u0010\u0081\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010NR\u001d\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bj\u0010\u0083\u0001R\u001d\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0085\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u0086\u0001R+\u0010\u008a\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0088\u00010\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u0016\u0010\u008c\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010N¨\u0006\u0093\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "Q", "n", "B", "extraCapacity", "", "X", "(I)Z", "minCapacity", "A", "()[Ljava/lang/Object;", "key", "L", "(Ljava/lang/Object;)I", "updateHashArray", "s", "(Z)V", "newHashSize", "R", "i", "P", "D", "value", "E", "index", "T", "removedHash", "U", "", "other", "y", "(Ljava/util/Map;)Z", "", "entry", "O", "(Ljava/util/Map$Entry;)Z", "", "from", "N", "(Ljava/util/Collection;)Z", "q", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "r", "k", "x", "m", "v", "S", "element", "W", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "M", "()Lkotlin/collections/builders/MapBuilder$KeysItr;", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "Y", "()Lkotlin/collections/builders/MapBuilder$ValuesItr;", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "C", "()Lkotlin/collections/builders/MapBuilder$EntriesItr;", "a", "[Ljava/lang/Object;", "b", "c", "[I", "d", "e", "I", "f", "g", "hashShift", "h", "modCount", "J", "size", "Lkotlin/collections/builders/MapBuilderKeys;", "j", "Lkotlin/collections/builders/MapBuilderKeys;", "keysView", "Lkotlin/collections/builders/MapBuilderValues;", "Lkotlin/collections/builders/MapBuilderValues;", "valuesView", "Lkotlin/collections/builders/MapBuilderEntries;", "l", "Lkotlin/collections/builders/MapBuilderEntries;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "H", "hashSize", "", "()Ljava/util/Set;", "keys", "", "()Ljava/util/Collection;", "values", "", "G", "entries", "F", "capacity", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    private static final MapBuilder f142566o;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private K[] keysArray;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V[] valuesArray;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] presenceArray;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] hashArray;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxProbeDistance;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int hashShift;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private MapBuilderKeys<K> keysView;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private MapBuilderValues<V> valuesView;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private MapBuilderEntries<K, V> entriesView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "Lkotlin/collections/builders/MapBuilder;", "", "Empty", "Lkotlin/collections/builders/MapBuilder;", "e", "()Lkotlin/collections/builders/MapBuilder;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int capacity) {
            return Integer.highestOneBit(RangesKt.f(capacity, 1) * 3);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.f142566o;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "k", "()Lkotlin/collections/builders/MapBuilder$EntryRef;", "", "o", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "n", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EntriesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.j(map, "map");
        }

        public final void n(StringBuilder sb2) {
            Intrinsics.j(sb2, "sb");
            if (getIndex() >= ((MapBuilder) f()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            h(index + 1);
            j(index);
            Object obj = ((MapBuilder) f()).keysArray[getLastIndex()];
            if (obj == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((MapBuilder) f()).valuesArray;
            Intrinsics.g(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == f()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            g();
        }

        @Override // java.util.Iterator
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public EntryRef<K, V> next() {
            a();
            if (getIndex() < ((MapBuilder) f()).length) {
                int index = getIndex();
                h(index + 1);
                j(index);
                EntryRef<K, V> entryRef = new EntryRef<>(f(), getLastIndex());
                g();
                return entryRef;
            }
            throw new NoSuchElementException();
        }

        public final int o() {
            int iHashCode;
            if (getIndex() < ((MapBuilder) f()).length) {
                int index = getIndex();
                h(index + 1);
                j(index);
                Object obj = ((MapBuilder) f()).keysArray[getLastIndex()];
                int iHashCode2 = 0;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                Object[] objArr = ((MapBuilder) f()).valuesArray;
                Intrinsics.g(objArr);
                Object obj2 = objArr[getLastIndex()];
                if (obj2 != null) {
                    iHashCode2 = obj2.hashCode();
                }
                int i10 = iHashCode ^ iHashCode2;
                g();
                return i10;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "", "index", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "", "a", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/collections/builders/MapBuilder;", "b", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final MapBuilder<K, V> map;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int expectedModCount;

        public EntryRef(MapBuilder<K, V> map, int i10) {
            Intrinsics.j(map, "map");
            this.map = map;
            this.index = i10;
            this.expectedModCount = ((MapBuilder) map).modCount;
        }

        private final void a() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return Intrinsics.e(entry.getKey(), getKey()) && Intrinsics.e(entry.getValue(), getValue());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((MapBuilder) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            Object[] objArr = ((MapBuilder) this.map).valuesArray;
            Intrinsics.g(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            K key = getKey();
            int iHashCode2 = 0;
            if (key != null) {
                iHashCode = key.hashCode();
            } else {
                iHashCode = 0;
            }
            V value = getValue();
            if (value != null) {
                iHashCode2 = value.hashCode();
            }
            return iHashCode ^ iHashCode2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            a();
            this.map.r();
            Object[] objArrN = this.map.n();
            int i10 = this.index;
            V v10 = (V) objArrN[i10];
            objArrN[i10] = newValue;
            return v10;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "Lkotlin/collections/builders/MapBuilder;", "map", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "g", "()V", "", "hasNext", "()Z", "remove", "a", "Lkotlin/collections/builders/MapBuilder;", "f", "()Lkotlin/collections/builders/MapBuilder;", "", "b", "I", "c", "()I", "h", "(I)V", "index", "d", "j", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static class Itr<K, V> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final MapBuilder<K, V> map;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public Itr(MapBuilder<K, V> map) {
            Intrinsics.j(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((MapBuilder) map).modCount;
            g();
        }

        public final void a() {
            if (((MapBuilder) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: d, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final MapBuilder<K, V> f() {
            return this.map;
        }

        public final void g() {
            while (this.index < ((MapBuilder) this.map).length) {
                int[] iArr = ((MapBuilder) this.map).presenceArray;
                int i10 = this.index;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.index = i10 + 1;
                }
            }
        }

        public final void h(int i10) {
            this.index = i10;
        }

        public final boolean hasNext() {
            return this.index < ((MapBuilder) this.map).length;
        }

        public final void j(int i10) {
            this.lastIndex = i10;
        }

        public final void remove() {
            a();
            if (this.lastIndex != -1) {
                this.map.r();
                this.map.T(this.lastIndex);
                this.lastIndex = -1;
                this.expectedModCount = ((MapBuilder) this.map).modCount;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeysItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.j(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (getIndex() < ((MapBuilder) f()).length) {
                int index = getIndex();
                h(index + 1);
                j(index);
                K k10 = (K) ((MapBuilder) f()).keysArray[getLastIndex()];
                g();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValuesItr(MapBuilder<K, V> map) {
            super(map);
            Intrinsics.j(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (getIndex() < ((MapBuilder) f()).length) {
                int index = getIndex();
                h(index + 1);
                j(index);
                Object[] objArr = ((MapBuilder) f()).valuesArray;
                Intrinsics.g(objArr);
                V v10 = (V) objArr[getLastIndex()];
                g();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    private MapBuilder(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i10;
        this.length = i11;
        this.hashShift = INSTANCE.d(H());
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f142566o = mapBuilder;
    }

    private final void A(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > F()) {
            int iE = AbstractList.INSTANCE.e(F(), minCapacity);
            this.keysArray = (K[]) ListBuilderKt.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) ListBuilderKt.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            Intrinsics.i(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = INSTANCE.c(iE);
            if (iC > H()) {
                R(iC);
            }
        }
    }

    private final int E(V value) {
        int i10 = this.length;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.presenceArray[i10] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.g(vArr);
                if (Intrinsics.e(vArr[i10], value)) {
                    return i10;
                }
            }
        }
    }

    private final int H() {
        return this.hashArray.length;
    }

    private final int L(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean P(int i10) {
        int iL = L(this.keysArray[i10]);
        int i11 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iL] == 0) {
                iArr[iL] = i10 + 1;
                this.presenceArray[i10] = iL;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iL = iL == 0 ? H() - 1 : iL - 1;
        }
    }

    private final void Q() {
        this.modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(int index) {
        ListBuilderKt.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.f(vArr, index);
        }
        U(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        Q();
    }

    private final void U(int removedHash) {
        int iK = RangesKt.k(this.maxProbeDistance * 2, H() / 2);
        int i10 = 0;
        int i11 = removedHash;
        do {
            removedHash = removedHash == 0 ? H() - 1 : removedHash - 1;
            i10++;
            if (i10 > this.maxProbeDistance) {
                this.hashArray[i11] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i12 = iArr[removedHash];
            if (i12 == 0) {
                iArr[i11] = 0;
                return;
            }
            if (i12 < 0) {
                iArr[i11] = -1;
            } else {
                int i13 = i12 - 1;
                if (((L(this.keysArray[i13]) - removedHash) & (H() - 1)) >= i10) {
                    this.hashArray[i11] = i12;
                    this.presenceArray[i13] = i11;
                }
                iK--;
            }
            i11 = removedHash;
            i10 = 0;
            iK--;
        } while (iK >= 0);
        this.hashArray[i11] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.d(F());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void s(boolean updateHashArray) {
        int i10;
        V[] vArr = this.valuesArray;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.length;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                if (updateHashArray) {
                    iArr[i12] = i13;
                    this.hashArray[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        ListBuilderKt.g(this.keysArray, i12, i10);
        if (vArr != null) {
            ListBuilderKt.g(vArr, i12, this.length);
        }
        this.length = i12;
    }

    public final EntriesItr<K, V> C() {
        return new EntriesItr<>(this);
    }

    public final int F() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> G() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.entriesView;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.entriesView = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    public Set<K> I() {
        MapBuilderKeys<K> mapBuilderKeys = this.keysView;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.keysView = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* renamed from: J, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public Collection<V> K() {
        MapBuilderValues<V> mapBuilderValues = this.valuesView;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.valuesView = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public final KeysItr<K, V> M() {
        return new KeysItr<>(this);
    }

    public final boolean S(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.j(entry, "entry");
        r();
        int iD = D(entry.getKey());
        if (iD < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.g(vArr);
        if (!Intrinsics.e(vArr[iD], entry.getValue())) {
            return false;
        }
        T(iD);
        return true;
    }

    public final ValuesItr<K, V> Y() {
        return new ValuesItr<>(this);
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && y((Map) other);
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.j(from, "from");
        r();
        N(from.entrySet());
    }

    public final void r() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        EntriesItr<K, V> entriesItrC = C();
        int i10 = 0;
        while (entriesItrC.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            entriesItrC.n(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final boolean v(Collection<?> m10) {
        Intrinsics.j(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!x((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean x(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.j(entry, "entry");
        int iD = D(entry.getKey());
        if (iD < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.g(vArr);
        return Intrinsics.e(vArr[iD], entry.getValue());
    }

    private final void B(int n10) {
        if (X(n10)) {
            s(true);
        } else {
            A(this.length + n10);
        }
    }

    private final int D(K key) {
        int iL = L(key);
        int i10 = this.maxProbeDistance;
        while (true) {
            int i11 = this.hashArray[iL];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (Intrinsics.e(this.keysArray[i12], key)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = iL - 1;
            if (iL == 0) {
                iL = H() - 1;
            } else {
                iL = i13;
            }
        }
    }

    private final boolean N(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z10 = false;
        if (from.isEmpty()) {
            return false;
        }
        B(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (O(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean O(Map.Entry<? extends K, ? extends V> entry) {
        int iK = k(entry.getKey());
        V[] vArrN = n();
        if (iK >= 0) {
            vArrN[iK] = entry.getValue();
            return true;
        }
        int i10 = (-iK) - 1;
        if (!Intrinsics.e(entry.getValue(), vArrN[i10])) {
            vArrN[i10] = entry.getValue();
            return true;
        }
        return false;
    }

    private final void R(int newHashSize) {
        Q();
        int i10 = 0;
        if (this.length > size()) {
            s(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i10 < this.length) {
            int i11 = i10 + 1;
            if (P(i10)) {
                i10 = i11;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final boolean X(int extraCapacity) {
        int iF = F();
        int i10 = this.length;
        int i11 = iF - i10;
        int size = i10 - size();
        if (i11 < extraCapacity && i11 + size >= extraCapacity && size >= F() / 4) {
            return true;
        }
        return false;
    }

    private final boolean y(Map<?, ?> other) {
        if (size() == other.size() && v(other.entrySet())) {
            return true;
        }
        return false;
    }

    public final boolean V(K key) {
        r();
        int iD = D(key);
        if (iD < 0) {
            return false;
        }
        T(iD);
        return true;
    }

    public final boolean W(V element) {
        r();
        int iE = E(element);
        if (iE < 0) {
            return false;
        }
        T(iE);
        return true;
    }

    @Override // java.util.Map
    public void clear() {
        r();
        int i10 = this.length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.hashArray[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        ListBuilderKt.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            ListBuilderKt.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (D(key) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        if (E(value) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iD = D(key);
        if (iD < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.g(vArr);
        return vArr[iD];
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr<K, V> entriesItrC = C();
        int iO = 0;
        while (entriesItrC.hasNext()) {
            iO += entriesItrC.o();
        }
        return iO;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final int k(K key) {
        r();
        while (true) {
            int iL = L(key);
            int iK = RangesKt.k(this.maxProbeDistance * 2, H() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.hashArray[iL];
                if (i11 <= 0) {
                    if (this.length >= F()) {
                        B(1);
                    } else {
                        int i12 = this.length;
                        int i13 = i12 + 1;
                        this.length = i13;
                        this.keysArray[i12] = key;
                        this.presenceArray[i12] = iL;
                        this.hashArray[iL] = i13;
                        this.size = size() + 1;
                        Q();
                        if (i10 > this.maxProbeDistance) {
                            this.maxProbeDistance = i10;
                        }
                        return i12;
                    }
                } else {
                    if (Intrinsics.e(this.keysArray[i11 - 1], key)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iK) {
                        R(H() * 2);
                        break;
                    }
                    int i14 = iL - 1;
                    if (iL == 0) {
                        iL = H() - 1;
                    } else {
                        iL = i14;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return I();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        r();
        int iK = k(key);
        V[] vArrN = n();
        if (iK < 0) {
            int i10 = (-iK) - 1;
            V v10 = vArrN[i10];
            vArrN[i10] = value;
            return v10;
        }
        vArrN[iK] = value;
        return null;
    }

    public final Map<K, V> q() {
        r();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f142566o;
        Intrinsics.h(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        r();
        int iD = D(key);
        if (iD < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.g(vArr);
        V v10 = vArr[iD];
        T(iD);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return K();
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i10) {
        this(ListBuilderKt.d(i10), null, new int[i10], new int[INSTANCE.c(i10)], 2, 0);
    }
}

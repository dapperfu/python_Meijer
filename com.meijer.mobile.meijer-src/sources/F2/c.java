package F2;

import F2.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\u0014R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006-"}, d2 = {"LF2/c;", "LF2/f;", "", "LF2/f$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "", "e", "()V", "f", "T", "key", "b", "(LF2/f$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "i", "(LF2/f$a;Ljava/lang/Object;)V", "j", "", "LF2/f$b;", "pairs", "g", "([LF2/f$b;)V", "h", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core_release", "LF2/b;", "LF2/b;", "frozen", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<f.a<?>, Object> preferencesMap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b frozen;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "LF2/f$a;", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f8988f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            Intrinsics.j(entry, "entry");
            Object value = entry.getValue();
            return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? ArraysKt.B0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // F2.f
    public Map<f.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry<f.a<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.i(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return F2.a.b(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F2.f
    public <T> T b(f.a<T> key) {
        Intrinsics.j(key, "key");
        T t10 = (T) this.preferencesMap.get(key);
        if (!(t10 instanceof byte[])) {
            return t10;
        }
        byte[] bArr = (byte[]) t10;
        T t11 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.i(t11, "copyOf(this, size)");
        return t11;
    }

    public final void e() {
        if (this.frozen.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof F2.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            F2.c r6 = (F2.c) r6
            java.util.Map<F2.f$a<?>, java.lang.Object> r0 = r6.preferencesMap
            java.util.Map<F2.f$a<?>, java.lang.Object> r2 = r5.preferencesMap
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map<F2.f$a<?>, java.lang.Object> r2 = r5.preferencesMap
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map<F2.f$a<?>, java.lang.Object> r6 = r6.preferencesMap
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<F2.f$a<?>, java.lang.Object> r2 = r5.preferencesMap
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.frozen.b(true);
    }

    public final void g(f.b<?>... pairs) {
        Intrinsics.j(pairs, "pairs");
        e();
        for (f.b<?> bVar : pairs) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(f.a<T> key) {
        Intrinsics.j(key, "key");
        e();
        return (T) this.preferencesMap.remove(key);
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final <T> void i(f.a<T> key, T value) {
        Intrinsics.j(key, "key");
        j(key, value);
    }

    public final void j(f.a<?> key, Object value) {
        Intrinsics.j(key, "key");
        e();
        if (value == null) {
            h(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, F2.a.a((Set) value));
            return;
        }
        if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<f.a<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) value;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.i(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return CollectionsKt.B0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f8988f, 24, null);
    }

    public c(Map<f.a<?>, Object> preferencesMap, boolean z10) {
        Intrinsics.j(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new b(z10);
    }
}

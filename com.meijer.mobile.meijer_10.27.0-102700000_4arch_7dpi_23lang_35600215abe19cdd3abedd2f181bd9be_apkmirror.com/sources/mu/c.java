package mu;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "", "name", "", "list", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "K", "V", "", "map", "b", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "value", "c", "(Ljava/lang/String;)Ljava/lang/String;", "values", "d", "(Ljava/util/List;)Ljava/lang/String;", "wire-runtime"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/squareup/wire/internal/Internal")
@SourceDebugExtension
/* loaded from: classes11.dex */
final /* synthetic */ class c {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f150747b = new a();

        a() {
            super(1, c.class, "sanitize", "sanitize(Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            Intrinsics.j(p02, "p0");
            return C15710b.c(p02);
        }
    }

    public static final <T> List<T> a(String name, List<? extends T> list) {
        Intrinsics.j(name, "name");
        Intrinsics.j(list, "list");
        if (list instanceof d) {
            list = (List<T>) ((d) list).h();
        }
        if (list == CollectionsKt.m() || (list instanceof C15709a)) {
            return (List<T>) list;
        }
        C15709a c15709a = new C15709a(list);
        if (!c15709a.contains(null)) {
            return c15709a;
        }
        throw new IllegalArgumentException((name + ".contains(null)").toString());
    }

    public static final <K, V> Map<K, V> b(String name, Map<K, ? extends V> map) {
        Intrinsics.j(name, "name");
        Intrinsics.j(map, "map");
        if (map.isEmpty()) {
            return MapsKt.k();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        Intrinsics.h(setKeySet, "null cannot be cast to non-null type kotlin.collections.Collection<K of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (setKeySet.contains(null)) {
            throw new IllegalArgumentException((name + ".containsKey(null)").toString());
        }
        Collection<V> collectionValues = linkedHashMap.values();
        Intrinsics.h(collectionValues, "null cannot be cast to non-null type kotlin.collections.Collection<V of com.squareup.wire.internal.Internal__InternalKt.immutableCopyOf?>");
        if (!collectionValues.contains(null)) {
            Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            Intrinsics.i(mapUnmodifiableMap, "unmodifiableMap(...)");
            return mapUnmodifiableMap;
        }
        throw new IllegalArgumentException((name + ".containsValue(null)").toString());
    }

    public static final String c(String value) {
        Intrinsics.j(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i10 = 0; i10 < value.length(); i10++) {
            char cCharAt = value.charAt(i10);
            if (StringsKt.b0(",[]{}\\", cCharAt, false, 2, null)) {
                sb2.append('\\');
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public static final String d(List<String> values) {
        Intrinsics.j(values, "values");
        return CollectionsKt.B0(values, null, "[", "]", 0, null, a.f150747b, 25, null);
    }
}

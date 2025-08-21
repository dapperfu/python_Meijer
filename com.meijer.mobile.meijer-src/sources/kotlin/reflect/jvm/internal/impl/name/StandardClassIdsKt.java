package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class StandardClassIdsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId k(String str) {
        FqName fqNameB = StandardClassIds.f146663a.b();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameB, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId l(String str) {
        FqName fqNameF = StandardClassIds.f146663a.f();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameF, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId m(String str) {
        FqName fqNameC = StandardClassIds.f146663a.c();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameC, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId n(String str) {
        FqName fqNameD = StandardClassIds.f146663a.d();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameD, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId o(String str) {
        FqName fqNameE = StandardClassIds.f146663a.e();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameE, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId q(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.f146663a;
        FqName fqNameF = standardClassIds.a().f();
        Name nameO = Name.o(name.l() + standardClassIds.a().h().l());
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameF, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId r(String str) {
        FqName fqNameG = StandardClassIds.f146663a.g();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameG, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId s(String str) {
        FqName fqNameH = StandardClassIds.f146663a.h();
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameH, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId t(ClassId classId) {
        FqName fqNameF = StandardClassIds.f146663a.f();
        Name nameO = Name.o('U' + classId.h().l());
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqNameF, nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> p(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = TuplesKt.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }
}

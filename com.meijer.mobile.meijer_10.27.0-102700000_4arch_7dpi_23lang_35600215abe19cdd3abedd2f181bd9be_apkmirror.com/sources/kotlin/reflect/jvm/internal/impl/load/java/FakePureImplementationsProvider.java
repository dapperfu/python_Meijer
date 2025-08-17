package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FakePureImplementationsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final FakePureImplementationsProvider f144171a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f144172b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<FqName, FqName> f144173c;

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        f144171a = fakePureImplementationsProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f144172b = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.f145756a;
        fakePureImplementationsProvider.c(standardClassIds.l(), fakePureImplementationsProvider.a("java.util.ArrayList", "java.util.LinkedList"));
        fakePureImplementationsProvider.c(standardClassIds.n(), fakePureImplementationsProvider.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        fakePureImplementationsProvider.c(standardClassIds.m(), fakePureImplementationsProvider.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.f145674d;
        fakePureImplementationsProvider.c(companion.c(new FqName("java.util.function.Function")), fakePureImplementationsProvider.a("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.c(companion.c(new FqName("java.util.function.BiFunction")), fakePureImplementationsProvider.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(TuplesKt.a(((ClassId) entry.getKey()).a(), ((ClassId) entry.getValue()).a()));
        }
        f144173c = MapsKt.y(arrayList);
    }

    private final List<ClassId> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.f145674d.c(new FqName(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(ClassId classId, List<ClassId> list) {
        Map<ClassId, ClassId> map = f144172b;
        for (Object obj : list) {
            map.put(obj, classId);
        }
    }

    public final FqName b(FqName classFqName) {
        Intrinsics.j(classFqName, "classFqName");
        return f144173c.get(classFqName);
    }

    private FakePureImplementationsProvider() {
    }
}

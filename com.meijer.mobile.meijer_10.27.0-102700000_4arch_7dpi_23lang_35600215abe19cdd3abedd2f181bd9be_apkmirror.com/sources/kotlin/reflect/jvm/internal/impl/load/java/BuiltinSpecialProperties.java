package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BuiltinSpecialProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final BuiltinSpecialProperties f144163a = new BuiltinSpecialProperties();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<FqName, Name> f144164b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Name, List<Name>> f144165c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<FqName> f144166d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<FqName> f144167e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<Name> f144168f;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.f143404s;
        Pair pairA = TuplesKt.a(BuiltinSpecialPropertiesKt.d(fqNameUnsafe, "name"), StandardNames.f143306m);
        Pair pairA2 = TuplesKt.a(BuiltinSpecialPropertiesKt.d(fqNameUnsafe, "ordinal"), Name.o("ordinal"));
        Pair pairA3 = TuplesKt.a(BuiltinSpecialPropertiesKt.c(StandardNames.FqNames.f143365X, "size"), Name.o("size"));
        FqName fqName = StandardNames.FqNames.f143371b0;
        Map<FqName, Name> mapO = MapsKt.o(pairA, pairA2, pairA3, TuplesKt.a(BuiltinSpecialPropertiesKt.c(fqName, "size"), Name.o("size")), TuplesKt.a(BuiltinSpecialPropertiesKt.d(StandardNames.FqNames.f143380g, "length"), Name.o("length")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(fqName, "keys"), Name.o("keySet")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(fqName, "values"), Name.o("values")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(fqName, "entries"), Name.o("entrySet")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(StandardNames.FqNames.f143351P0, "size"), Name.o("length")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(StandardNames.FqNames.f143353Q0, "size"), Name.o("length")), TuplesKt.a(BuiltinSpecialPropertiesKt.c(StandardNames.FqNames.f143355R0, "size"), Name.o("length")));
        f144164b = mapO;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapO.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.d();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.f(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt.i0((Iterable) entry2.getValue()));
        }
        f144165c = linkedHashMap2;
        Map<FqName, Name> map = f144164b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            ClassId classIdN = JavaToKotlinClassMap.f143492a.n(entry3.getKey().d().i());
            Intrinsics.g(classIdN);
            linkedHashSet.add(classIdN.a().b(entry3.getValue()));
        }
        f144166d = linkedHashSet;
        Set<FqName> setKeySet = f144164b.keySet();
        f144167e = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).f());
        }
        f144168f = CollectionsKt.o1(arrayList3);
    }

    public final Map<FqName, Name> a() {
        return f144164b;
    }

    public final List<Name> b(Name name1) {
        Intrinsics.j(name1, "name1");
        List<Name> list = f144165c.get(name1);
        return list == null ? CollectionsKt.m() : list;
    }

    public final Set<FqName> c() {
        return f144167e;
    }

    public final Set<Name> d() {
        return f144168f;
    }

    private BuiltinSpecialProperties() {
    }
}

package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.HashSet;
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
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes13.dex */
public class SpecialGenericSignatures {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f144282a = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final List<Companion.NameAndSignature> f144283b;

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f144284c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<String> f144285d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> f144286e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, TypeSafeBarrierDescription> f144287f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<Name> f144288g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f144289h;

    /* renamed from: i, reason: collision with root package name */
    private static final Companion.NameAndSignature f144290i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Companion.NameAndSignature, Name> f144291j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<String, Name> f144292k;

    /* renamed from: l, reason: collision with root package name */
    private static final Set<String> f144293l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set<Name> f144294m;

    /* renamed from: n, reason: collision with root package name */
    private static final Map<Name, Name> f144295n;

    public static final class Companion {

        public static final class NameAndSignature {

            /* renamed from: a, reason: collision with root package name */
            private final String f144296a;

            /* renamed from: b, reason: collision with root package name */
            private final Name f144297b;

            /* renamed from: c, reason: collision with root package name */
            private final String f144298c;

            /* renamed from: d, reason: collision with root package name */
            private final String f144299d;

            /* renamed from: e, reason: collision with root package name */
            private final String f144300e;

            public static /* synthetic */ NameAndSignature b(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = nameAndSignature.f144296a;
                }
                if ((i10 & 2) != 0) {
                    name = nameAndSignature.f144297b;
                }
                if ((i10 & 4) != 0) {
                    str2 = nameAndSignature.f144298c;
                }
                if ((i10 & 8) != 0) {
                    str3 = nameAndSignature.f144299d;
                }
                return nameAndSignature.a(str, name, str2, str3);
            }

            public final NameAndSignature a(String classInternalName, Name name, String parameters, String returnType) {
                Intrinsics.j(classInternalName, "classInternalName");
                Intrinsics.j(name, "name");
                Intrinsics.j(parameters, "parameters");
                Intrinsics.j(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.e(this.f144296a, nameAndSignature.f144296a) && Intrinsics.e(this.f144297b, nameAndSignature.f144297b) && Intrinsics.e(this.f144298c, nameAndSignature.f144298c) && Intrinsics.e(this.f144299d, nameAndSignature.f144299d);
            }

            public int hashCode() {
                return (((((this.f144296a.hashCode() * 31) + this.f144297b.hashCode()) * 31) + this.f144298c.hashCode()) * 31) + this.f144299d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f144296a + ", name=" + this.f144297b + ", parameters=" + this.f144298c + ", returnType=" + this.f144299d + ')';
            }

            public NameAndSignature(String classInternalName, Name name, String parameters, String returnType) {
                Intrinsics.j(classInternalName, "classInternalName");
                Intrinsics.j(name, "name");
                Intrinsics.j(parameters, "parameters");
                Intrinsics.j(returnType, "returnType");
                this.f144296a = classInternalName;
                this.f144297b = name;
                this.f144298c = parameters;
                this.f144299d = returnType;
                this.f144300e = SignatureBuildingComponents.f144829a.m(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public final Name c() {
                return this.f144297b;
            }

            public final String d() {
                return this.f144300e;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NameAndSignature m(String str, String str2, String str3, String str4) {
            Name nameO = Name.o(str2);
            Intrinsics.i(nameO, "identifier(...)");
            return new NameAndSignature(str, nameO, str3, str4);
        }

        public final Name b(Name name) {
            Intrinsics.j(name, "name");
            return f().get(name);
        }

        public final boolean k(Name name) {
            Intrinsics.j(name, "<this>");
            return g().contains(name);
        }

        public final SpecialSignatureInfo l(String builtinSignature) {
            Intrinsics.j(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? SpecialSignatureInfo.f144301c : ((TypeSafeBarrierDescription) MapsKt.l(i(), builtinSignature)) == TypeSafeBarrierDescription.f144308b ? SpecialSignatureInfo.f144303e : SpecialSignatureInfo.f144302d;
        }

        public final List<String> c() {
            return SpecialGenericSignatures.f144284c;
        }

        public final Set<Name> d() {
            return SpecialGenericSignatures.f144288g;
        }

        public final Set<String> e() {
            return SpecialGenericSignatures.f144289h;
        }

        public final Map<Name, Name> f() {
            return SpecialGenericSignatures.f144295n;
        }

        public final Set<Name> g() {
            return SpecialGenericSignatures.f144294m;
        }

        public final NameAndSignature h() {
            return SpecialGenericSignatures.f144290i;
        }

        public final Map<String, TypeSafeBarrierDescription> i() {
            return SpecialGenericSignatures.f144287f;
        }

        public final Map<String, Name> j() {
            return SpecialGenericSignatures.f144292k;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {

        /* renamed from: c, reason: collision with root package name */
        public static final SpecialSignatureInfo f144301c = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0, "Ljava/util/Collection<+Ljava/lang/Object;>;", false);

        /* renamed from: d, reason: collision with root package name */
        public static final SpecialSignatureInfo f144302d = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1, null, true);

        /* renamed from: e, reason: collision with root package name */
        public static final SpecialSignatureInfo f144303e = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2, "Ljava/lang/Object;", true);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ SpecialSignatureInfo[] f144304f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144305g;

        /* renamed from: a, reason: collision with root package name */
        private final String f144306a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f144307b;

        private static final /* synthetic */ SpecialSignatureInfo[] a() {
            return new SpecialSignatureInfo[]{f144301c, f144302d, f144303e};
        }

        static {
            SpecialSignatureInfo[] specialSignatureInfoArrA = a();
            f144304f = specialSignatureInfoArrA;
            f144305g = EnumEntriesKt.a(specialSignatureInfoArrA);
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) f144304f.clone();
        }

        private SpecialSignatureInfo(String str, int i10, String str2, boolean z10) {
            this.f144306a = str2;
            this.f144307b = z10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f144308b = new TypeSafeBarrierDescription("NULL", 0, null);

        /* renamed from: c, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f144309c = new TypeSafeBarrierDescription("INDEX", 1, -1);

        /* renamed from: d, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f144310d = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);

        /* renamed from: e, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f144311e = new a("MAP_GET_OR_DEFAULT", 3);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ TypeSafeBarrierDescription[] f144312f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144313g;

        /* renamed from: a, reason: collision with root package name */
        private final Object f144314a;

        static final class a extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i10) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i10, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] a() {
            return new TypeSafeBarrierDescription[]{f144308b, f144309c, f144310d, f144311e};
        }

        static {
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArrA = a();
            f144312f = typeSafeBarrierDescriptionArrA;
            f144313g = EnumEntriesKt.a(typeSafeBarrierDescriptionArrA);
        }

        private TypeSafeBarrierDescription(String str, int i10, Object obj) {
            this.f144314a = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f144312f.clone();
        }
    }

    static {
        Set<String> setI = SetsKt.i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(setI, 10));
        for (String str : setI) {
            Companion companion = f144282a;
            String strL = JvmPrimitiveType.BOOLEAN.l();
            Intrinsics.i(strL, "getDesc(...)");
            arrayList.add(companion.m("java/util/Collection", str, "Ljava/util/Collection;", strL));
        }
        f144283b = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it.next()).d());
        }
        f144284c = arrayList3;
        List<Companion.NameAndSignature> list = f144283b;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).c().b());
        }
        f144285d = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f144829a;
        Companion companion2 = f144282a;
        String strI = signatureBuildingComponents.i("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String strL2 = jvmPrimitiveType.l();
        Intrinsics.i(strL2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureM = companion2.m(strI, "contains", "Ljava/lang/Object;", strL2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.f144310d;
        Pair pairA = TuplesKt.a(nameAndSignatureM, typeSafeBarrierDescription);
        String strI2 = signatureBuildingComponents.i("Collection");
        String strL3 = jvmPrimitiveType.l();
        Intrinsics.i(strL3, "getDesc(...)");
        Pair pairA2 = TuplesKt.a(companion2.m(strI2, "remove", "Ljava/lang/Object;", strL3), typeSafeBarrierDescription);
        String strI3 = signatureBuildingComponents.i("Map");
        String strL4 = jvmPrimitiveType.l();
        Intrinsics.i(strL4, "getDesc(...)");
        Pair pairA3 = TuplesKt.a(companion2.m(strI3, "containsKey", "Ljava/lang/Object;", strL4), typeSafeBarrierDescription);
        String strI4 = signatureBuildingComponents.i("Map");
        String strL5 = jvmPrimitiveType.l();
        Intrinsics.i(strL5, "getDesc(...)");
        Pair pairA4 = TuplesKt.a(companion2.m(strI4, "containsValue", "Ljava/lang/Object;", strL5), typeSafeBarrierDescription);
        String strI5 = signatureBuildingComponents.i("Map");
        String strL6 = jvmPrimitiveType.l();
        Intrinsics.i(strL6, "getDesc(...)");
        Pair pairA5 = TuplesKt.a(companion2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strL6), typeSafeBarrierDescription);
        Pair pairA6 = TuplesKt.a(companion2.m(signatureBuildingComponents.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f144311e);
        Companion.NameAndSignature nameAndSignatureM2 = companion2.m(signatureBuildingComponents.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f144308b;
        Pair pairA7 = TuplesKt.a(nameAndSignatureM2, typeSafeBarrierDescription2);
        Pair pairA8 = TuplesKt.a(companion2.m(signatureBuildingComponents.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strI6 = signatureBuildingComponents.i("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String strL7 = jvmPrimitiveType2.l();
        Intrinsics.i(strL7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureM3 = companion2.m(strI6, "indexOf", "Ljava/lang/Object;", strL7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.f144309c;
        Pair pairA9 = TuplesKt.a(nameAndSignatureM3, typeSafeBarrierDescription3);
        String strI7 = signatureBuildingComponents.i("List");
        String strL8 = jvmPrimitiveType2.l();
        Intrinsics.i(strL8, "getDesc(...)");
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapO = MapsKt.o(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, TuplesKt.a(companion2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strL8), typeSafeBarrierDescription3));
        f144286e = mapO;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(mapO.size()));
        Iterator<T> it3 = mapO.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).d(), entry.getValue());
        }
        f144287f = linkedHashMap;
        Set setL = SetsKt.l(f144286e.keySet(), f144283b);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(setL, 10));
        Iterator it4 = setL.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it4.next()).c());
        }
        f144288g = CollectionsKt.o1(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.x(setL, 10));
        Iterator it5 = setL.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it5.next()).d());
        }
        f144289h = CollectionsKt.o1(arrayList6);
        Companion companion3 = f144282a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String strL9 = jvmPrimitiveType3.l();
        Intrinsics.i(strL9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureM4 = companion3.m("java/util/List", "removeAt", strL9, "Ljava/lang/Object;");
        f144290i = nameAndSignatureM4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.f144829a;
        String strH = signatureBuildingComponents2.h("Number");
        String strL10 = JvmPrimitiveType.BYTE.l();
        Intrinsics.i(strL10, "getDesc(...)");
        Pair pairA10 = TuplesKt.a(companion3.m(strH, "toByte", "", strL10), Name.o("byteValue"));
        String strH2 = signatureBuildingComponents2.h("Number");
        String strL11 = JvmPrimitiveType.SHORT.l();
        Intrinsics.i(strL11, "getDesc(...)");
        Pair pairA11 = TuplesKt.a(companion3.m(strH2, "toShort", "", strL11), Name.o("shortValue"));
        String strH3 = signatureBuildingComponents2.h("Number");
        String strL12 = jvmPrimitiveType3.l();
        Intrinsics.i(strL12, "getDesc(...)");
        Pair pairA12 = TuplesKt.a(companion3.m(strH3, "toInt", "", strL12), Name.o("intValue"));
        String strH4 = signatureBuildingComponents2.h("Number");
        String strL13 = JvmPrimitiveType.LONG.l();
        Intrinsics.i(strL13, "getDesc(...)");
        Pair pairA13 = TuplesKt.a(companion3.m(strH4, "toLong", "", strL13), Name.o("longValue"));
        String strH5 = signatureBuildingComponents2.h("Number");
        String strL14 = JvmPrimitiveType.FLOAT.l();
        Intrinsics.i(strL14, "getDesc(...)");
        Pair pairA14 = TuplesKt.a(companion3.m(strH5, "toFloat", "", strL14), Name.o("floatValue"));
        String strH6 = signatureBuildingComponents2.h("Number");
        String strL15 = JvmPrimitiveType.DOUBLE.l();
        Intrinsics.i(strL15, "getDesc(...)");
        Pair pairA15 = TuplesKt.a(companion3.m(strH6, "toDouble", "", strL15), Name.o("doubleValue"));
        Pair pairA16 = TuplesKt.a(nameAndSignatureM4, Name.o("remove"));
        String strH7 = signatureBuildingComponents2.h("CharSequence");
        String strL16 = jvmPrimitiveType3.l();
        Intrinsics.i(strL16, "getDesc(...)");
        String strL17 = JvmPrimitiveType.CHAR.l();
        Intrinsics.i(strL17, "getDesc(...)");
        Map<Companion.NameAndSignature, Name> mapO2 = MapsKt.o(pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, TuplesKt.a(companion3.m(strH7, "get", strL16, strL17), Name.o("charAt")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicInteger"), "load", "", "I"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicInteger"), PlaceTypes.STORE, "I", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicInteger"), "exchange", "I", "I"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.o("getAndAdd")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicInteger"), "addAndFetch", "I", "I"), Name.o("addAndGet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLong"), "load", "", "J"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLong"), PlaceTypes.STORE, "J", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLong"), "exchange", "J", "J"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLong"), "fetchAndAdd", "J", "J"), Name.o("getAndAdd")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLong"), "addAndFetch", "J", "J"), Name.o("addAndGet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicBoolean"), "load", "", "Z"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicBoolean"), PlaceTypes.STORE, "Z", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicBoolean"), "exchange", "Z", "Z"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReference"), "load", "", "Ljava/lang/Object;"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReference"), PlaceTypes.STORE, "Ljava/lang/Object;", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "loadAt", "I", "I"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "storeAt", "II", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.o("compareAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.o("getAndAdd")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.o("addAndGet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "loadAt", "I", "J"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "storeAt", "IJ", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.o("compareAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.o("getAndAdd")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.o("addAndGet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.o("get")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), Name.o("set")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.o("getAndSet")), TuplesKt.a(companion3.m(signatureBuildingComponents2.j("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.o("compareAndSet")));
        f144291j = mapO2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.f(mapO2.size()));
        Iterator<T> it6 = mapO2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).d(), entry2.getValue());
        }
        f144292k = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = f144291j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.b(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).d());
        }
        f144293l = linkedHashSet;
        Set<Companion.NameAndSignature> setKeySet = f144291j.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it7.next()).c());
        }
        f144294m = hashSet;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = f144291j.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).c(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((Name) pair.d(), (Name) pair.c());
        }
        f144295n = linkedHashMap3;
    }
}

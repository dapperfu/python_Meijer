package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectClassUtilKt {

    /* renamed from: a, reason: collision with root package name */
    private static final List<KClass<? extends Object>> f144975a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f144976b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f144977c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Class<? extends Function<?>>, Integer> f144978d;

    static {
        int i10 = 0;
        List<KClass<? extends Object>> listP = CollectionsKt.p(Reflection.b(Boolean.TYPE), Reflection.b(Byte.TYPE), Reflection.b(Character.TYPE), Reflection.b(Double.TYPE), Reflection.b(Float.TYPE), Reflection.b(Integer.TYPE), Reflection.b(Long.TYPE), Reflection.b(Short.TYPE));
        f144975a = listP;
        List<KClass<? extends Object>> list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(TuplesKt.a(JvmClassMappingKt.c(kClass), JvmClassMappingKt.d(kClass)));
        }
        f144976b = MapsKt.y(arrayList);
        List<KClass<? extends Object>> list2 = f144975a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(TuplesKt.a(JvmClassMappingKt.d(kClass2), JvmClassMappingKt.c(kClass2)));
        }
        f144977c = MapsKt.y(arrayList2);
        List listP2 = CollectionsKt.p(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listP2, 10));
        for (Object obj : listP2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            arrayList3.add(TuplesKt.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f144978d = MapsKt.y(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        Intrinsics.j(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence b(ParameterizedType it) {
        Intrinsics.j(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.i(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.T(actualTypeArguments);
    }

    public static final ClassId e(Class<?> cls) {
        ClassId classIdE;
        Intrinsics.j(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.i(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (classIdE = e(declaringClass)) != null) {
                    Name nameO = Name.o(cls.getSimpleName());
                    Intrinsics.i(nameO, "identifier(...)");
                    ClassId classIdD = classIdE.d(nameO);
                    if (classIdD != null) {
                        return classIdD;
                    }
                }
                ClassId.Companion companion = ClassId.f146581d;
                String name = cls.getName();
                Intrinsics.i(name, "getName(...)");
                return companion.c(new FqName(name));
            }
        }
        String name2 = cls.getName();
        Intrinsics.i(name2, "getName(...)");
        FqName fqName = new FqName(name2);
        return new ClassId(fqName.d(), FqName.f146585c.a(fqName.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String f(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.i(name, "getName(...)");
                return StringsKt.P(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            Intrinsics.i(name2, "getName(...)");
            sb2.append(StringsKt.P(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        return f144978d.get(cls);
    }

    public static final List<Type> h(Type type) {
        Intrinsics.j(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.m();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt.X(SequencesKt.G(SequencesKt.q(type, a.f145016a), b.f145017a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.i(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.h1(actualTypeArguments);
    }

    public static final Class<?> i(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        return f144976b.get(cls);
    }

    public static final ClassLoader j(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.i(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> k(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        return f144977c.get(cls);
    }

    public static final boolean l(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}

package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
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
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010#\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "m", "()Ljava/lang/Void;", "value", "", "s", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "h", "()Ljava/lang/Class;", "u", "simpleName", "t", "qualifiedName", "r", "()Z", "isValue$annotations", "()V", "isValue", "b", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends Function<?>>, Integer> f143720c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f143721d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f143722e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f143723f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f143724g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "b", "(Ljava/lang/Class;)Ljava/lang/String;", "a", "value", "", "c", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/Function;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "primitiveFqNames", "Ljava/util/HashMap;", "primitiveWrapperFqNames", "classFqNames", "kotlin.jvm.PlatformType", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(Class<?> jClass) {
            String str;
            Intrinsics.j(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) ClassReference.f143723f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) ClassReference.f143723f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class<?> jClass) {
            String str;
            Intrinsics.j(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) ClassReference.f143724g.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) ClassReference.f143724g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.g(simpleName);
                String strO1 = StringsKt.o1(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strO1 != null) {
                    return strO1;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.g(simpleName);
                return StringsKt.n1(simpleName, '$', null, 2, null);
            }
            Intrinsics.g(simpleName);
            return StringsKt.o1(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object value, Class<?> jClass) {
            Intrinsics.j(jClass, "jClass");
            Map map = ClassReference.f143720c;
            Intrinsics.h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return TypeIntrinsics.m(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = JvmClassMappingKt.c(JvmClassMappingKt.e(jClass));
            }
            return jClass.isInstance(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listP = CollectionsKt.p(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            arrayList.add(TuplesKt.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f143720c = MapsKt.y(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f143721d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f143722e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            Intrinsics.g(str);
            sb2.append(StringsKt.r1(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            Pair pairA = TuplesKt.a(sb2.toString(), str + ".Companion");
            map3.put(pairA.c(), pairA.d());
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : f143720c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f143723f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.g(str2);
            linkedHashMap.put(key, StringsKt.r1(str2, '.', null, 2, null));
        }
        f143724g = linkedHashMap;
    }

    public ClassReference(Class<?> jClass) {
        Intrinsics.j(jClass, "jClass");
        this.jClass = jClass;
    }

    private final Void m() {
        throw new KotlinReflectionNotSupportedError();
    }

    public boolean equals(Object other) {
        return (other instanceof ClassReference) && Intrinsics.e(JvmClassMappingKt.c(this), JvmClassMappingKt.c((KClass) other));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> h() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass
    @SinceKotlin
    public boolean s(Object value) {
        return INSTANCE.c(value, h());
    }

    @Override // kotlin.reflect.KClass
    public String t() {
        return INSTANCE.a(h());
    }

    public String toString() {
        return h() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.KClass
    public String u() {
        return INSTANCE.b(h());
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean r() {
        m();
        throw new KotlinNothingValueException();
    }
}

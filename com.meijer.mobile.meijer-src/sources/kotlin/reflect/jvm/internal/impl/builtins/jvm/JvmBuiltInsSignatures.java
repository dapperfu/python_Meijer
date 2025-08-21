package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JvmBuiltInsSignatures {

    /* renamed from: a, reason: collision with root package name */
    public static final JvmBuiltInsSignatures f144460a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f144461b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f144462c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f144463d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f144464e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<String> f144465f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f144466g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f144467h;

    static {
        JvmBuiltInsSignatures jvmBuiltInsSignatures = new JvmBuiltInsSignatures();
        f144460a = jvmBuiltInsSignatures;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f145736a;
        f144461b = SetsKt.m(signatureBuildingComponents.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f144462c = SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(jvmBuiltInsSignatures.b(), signatureBuildingComponents.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), signatureBuildingComponents.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.e("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.e("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), signatureBuildingComponents.e("CharSequence", "isEmpty()Z"));
        f144463d = signatureBuildingComponents.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f144464e = SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(SetsKt.l(signatureBuildingComponents.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), signatureBuildingComponents.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f144465f = SetsKt.l(SetsKt.l(signatureBuildingComponents.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), signatureBuildingComponents.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setA = jvmBuiltInsSignatures.a();
        String[] strArrB = signatureBuildingComponents.b("D");
        Set setL = SetsKt.l(setA, signatureBuildingComponents.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = signatureBuildingComponents.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f144466g = SetsKt.l(setL, signatureBuildingComponents.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = signatureBuildingComponents.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f144467h = signatureBuildingComponents.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private final Set<String> a() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f145736a;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List listP = CollectionsKt.p(jvmPrimitiveType, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            String strB = ((JvmPrimitiveType) it.next()).p().f().b();
            Intrinsics.i(strB, "asString(...)");
            String[] strArrB = signatureBuildingComponents.b("Ljava/lang/String;");
            CollectionsKt.C(linkedHashSet, signatureBuildingComponents.e(strB, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f145736a;
        List<JvmPrimitiveType> listP = CollectionsKt.p(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listP) {
            String strB = jvmPrimitiveType.p().f().b();
            Intrinsics.i(strB, "asString(...)");
            CollectionsKt.C(linkedHashSet, signatureBuildingComponents.e(strB, jvmPrimitiveType.m() + "Value()" + jvmPrimitiveType.l()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f144463d;
    }

    public final Set<String> d() {
        return f144461b;
    }

    public final Set<String> e() {
        return f144466g;
    }

    public final Set<String> f() {
        return f144462c;
    }

    public final Set<String> g() {
        return f144465f;
    }

    public final Set<String> h() {
        return f144467h;
    }

    public final Set<String> i() {
        return f144464e;
    }

    public final boolean j(FqNameUnsafe fqName) {
        Intrinsics.j(fqName, "fqName");
        return Intrinsics.e(fqName, StandardNames.FqNames.f144291i) || StandardNames.e(fqName);
    }

    public final boolean k(FqNameUnsafe fqName) {
        Intrinsics.j(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        ClassId classIdN = JavaToKotlinClassMap.f144399a.n(fqName);
        if (classIdN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(classIdN.a().a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private JvmBuiltInsSignatures() {
    }
}

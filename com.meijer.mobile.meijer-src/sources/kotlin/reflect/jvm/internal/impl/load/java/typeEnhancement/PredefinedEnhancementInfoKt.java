package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PredefinedEnhancementInfoKt {

    /* renamed from: a, reason: collision with root package name */
    private static final JavaTypeQualifiers f145567a = new JavaTypeQualifiers(NullabilityQualifier.f145559b, null, false, false, 8, null);

    /* renamed from: b, reason: collision with root package name */
    private static final JavaTypeQualifiers f145568b;

    /* renamed from: c, reason: collision with root package name */
    private static final JavaTypeQualifiers f145569c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, PredefinedFunctionEnhancementInfo> f145570d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.f145560c;
        f145568b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f145569c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f145736a;
        String strH = signatureBuildingComponents.h("Object");
        String strG = signatureBuildingComponents.g("Predicate");
        String strG2 = signatureBuildingComponents.g("Function");
        String strG3 = signatureBuildingComponents.g("Consumer");
        String strG4 = signatureBuildingComponents.g("BiFunction");
        String strG5 = signatureBuildingComponents.g("BiConsumer");
        String strG6 = signatureBuildingComponents.g("UnaryOperator");
        String strI = signatureBuildingComponents.i("stream/Stream");
        String strI2 = signatureBuildingComponents.i("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("Iterator")), "forEachRemaining", null, new C15359f(strG3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.h("Iterable")), "spliterator", null, new C15370q(signatureBuildingComponents), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("Collection"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder, "removeIf", null, new B(strG), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder, "stream", null, new M(strI), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder, "parallelStream", null, new S(strI), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("List"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder2, "replaceAll", null, new T(strG6), 2, null);
        classEnhancementBuilder2.a("addFirst", "2.1", new U(strH));
        classEnhancementBuilder2.a("addLast", "2.1", new V(strH));
        classEnhancementBuilder2.a("removeFirst", "2.1", new W(strH));
        classEnhancementBuilder2.a("removeLast", "2.1", new X(strH));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("LinkedList"));
        classEnhancementBuilder3.a("addFirst", "2.1", new C15360g(strH));
        classEnhancementBuilder3.a("addLast", "2.1", new C15361h(strH));
        classEnhancementBuilder3.a("removeFirst", "2.1", new C15362i(strH));
        classEnhancementBuilder3.a("removeLast", "2.1", new C15363j(strH));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder4 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("LinkedHashSet"));
        classEnhancementBuilder4.a("addFirst", "2.2", new C15364k(strH));
        classEnhancementBuilder4.a("addLast", "2.2", new C15365l(strH));
        classEnhancementBuilder4.a("removeFirst", "2.2", new C15366m(strH));
        classEnhancementBuilder4.a("removeLast", "2.2", new C15367n(strH));
        classEnhancementBuilder4.a("getFirst", "2.2", new C15368o(strH));
        classEnhancementBuilder4.a("getLast", "2.2", new C15369p(strH));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder5 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("Map"));
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "forEach", null, new r(strG5), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "putIfAbsent", null, new C15371s(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "replace", null, new C15372t(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "replace", null, new C15373u(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "replaceAll", null, new C15374v(strG4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "compute", null, new C15375w(strH, strG4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "computeIfAbsent", null, new C15376x(strH, strG2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "computeIfPresent", null, new C15377y(strH, strG4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder5, "merge", null, new C15378z(strH, strG4), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder6 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.i("LinkedHashMap"));
        classEnhancementBuilder6.a("putFirst", "2.2", new A(strH));
        classEnhancementBuilder6.a("putLast", "2.2", new C(strH));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder7 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strI2);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder7, "empty", null, new D(strI2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder7, "of", null, new E(strH, strI2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder7, "ofNullable", null, new F(strH, strI2), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder7, "get", null, new G(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(classEnhancementBuilder7, "ifPresent", null, new H(strG3), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.h("ref/Reference")), "get", null, new I(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strG), "test", null, new J(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.g("BiPredicate")), "test", null, new K(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strG3), "accept", null, new L(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strG5), "accept", null, new N(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strG2), "apply", null, new O(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strG4), "apply", null, new P(strH), 2, null);
        SignatureEnhancementBuilder.ClassEnhancementBuilder.b(new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.g("Supplier")), "get", null, new Q(strH), 2, null);
        f145570d = signatureEnhancementBuilder.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.c(str, f145567a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.c(str, f145567a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b, f145569c);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145569c;
        function.b(str, javaTypeQualifiers);
        function.c(str2, f145568b, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145567a);
        function.c(str2, f145568b, f145569c);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145569c);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b, f145569c);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145567a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        function.d(JvmPrimitiveType.BOOLEAN);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.d(JvmPrimitiveType.BOOLEAN);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    public static final Map<String, PredefinedFunctionEnhancementInfo> K0() {
        return f145570d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.c(str, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.c(str, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers, javaTypeQualifiers);
        function.d(JvmPrimitiveType.BOOLEAN);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.c(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.b(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        function.c(str, f145568b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(SignatureBuildingComponents signatureBuildingComponents, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        String strI = signatureBuildingComponents.i("Spliterator");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.c(strI, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.c(str, f145567a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.c(str, f145567a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.b(str, javaTypeQualifiers);
        function.d(JvmPrimitiveType.BOOLEAN);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(String str, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f145567a;
        function.b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2);
        function.c(str, javaTypeQualifiers2);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        function.b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers);
        function.c(str, javaTypeQualifiers);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f145569c;
        JavaTypeQualifiers javaTypeQualifiers3 = f145567a;
        function.b(str2, javaTypeQualifiers, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers3);
        function.c(str, javaTypeQualifiers3);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String str, String str2, SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
        Intrinsics.j(function, "$this$function");
        JavaTypeQualifiers javaTypeQualifiers = f145568b;
        function.b(str, javaTypeQualifiers);
        JavaTypeQualifiers javaTypeQualifiers2 = f145569c;
        function.b(str, javaTypeQualifiers2);
        JavaTypeQualifiers javaTypeQualifiers3 = f145567a;
        function.b(str2, javaTypeQualifiers, javaTypeQualifiers2, javaTypeQualifiers2, javaTypeQualifiers3);
        function.c(str, javaTypeQualifiers3);
        return Unit.f143329a;
    }
}

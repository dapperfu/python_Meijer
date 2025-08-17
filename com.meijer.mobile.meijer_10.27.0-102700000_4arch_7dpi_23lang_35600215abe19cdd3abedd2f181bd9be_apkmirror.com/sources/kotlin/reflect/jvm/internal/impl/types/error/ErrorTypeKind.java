package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ErrorTypeKind {

    /* renamed from: D0, reason: collision with root package name */
    public static final ErrorTypeKind f146910D0;

    /* renamed from: F, reason: collision with root package name */
    public static final ErrorTypeKind f146913F;

    /* renamed from: H0, reason: collision with root package name */
    private static final /* synthetic */ ErrorTypeKind[] f146918H0;

    /* renamed from: I0, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146920I0;

    /* renamed from: N, reason: collision with root package name */
    public static final ErrorTypeKind f146925N;

    /* renamed from: V, reason: collision with root package name */
    public static final ErrorTypeKind f146933V;

    /* renamed from: f0, reason: collision with root package name */
    public static final ErrorTypeKind f146947f0;

    /* renamed from: n0, reason: collision with root package name */
    public static final ErrorTypeKind f146963n0;

    /* renamed from: p, reason: collision with root package name */
    public static final ErrorTypeKind f146966p;

    /* renamed from: v0, reason: collision with root package name */
    public static final ErrorTypeKind f146979v0;

    /* renamed from: x, reason: collision with root package name */
    public static final ErrorTypeKind f146982x;

    /* renamed from: a, reason: collision with root package name */
    private final String f146988a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146989b;

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorTypeKind f146940c = new ErrorTypeKind("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorTypeKind f146942d = new ErrorTypeKind("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorTypeKind f146944e = new ErrorTypeKind("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorTypeKind f146946f = new ErrorTypeKind("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorTypeKind f146948g = new ErrorTypeKind("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorTypeKind f146950h = new ErrorTypeKind("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);

    /* renamed from: i, reason: collision with root package name */
    public static final ErrorTypeKind f146952i = new ErrorTypeKind("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public static final ErrorTypeKind f146954j = new ErrorTypeKind("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);

    /* renamed from: k, reason: collision with root package name */
    public static final ErrorTypeKind f146956k = new ErrorTypeKind("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);

    /* renamed from: l, reason: collision with root package name */
    public static final ErrorTypeKind f146958l = new ErrorTypeKind("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);

    /* renamed from: m, reason: collision with root package name */
    public static final ErrorTypeKind f146960m = new ErrorTypeKind("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);

    /* renamed from: n, reason: collision with root package name */
    public static final ErrorTypeKind f146962n = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);

    /* renamed from: o, reason: collision with root package name */
    public static final ErrorTypeKind f146964o = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);

    /* renamed from: q, reason: collision with root package name */
    public static final ErrorTypeKind f146968q = new ErrorTypeKind("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);

    /* renamed from: r, reason: collision with root package name */
    public static final ErrorTypeKind f146970r = new ErrorTypeKind("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);

    /* renamed from: s, reason: collision with root package name */
    public static final ErrorTypeKind f146972s = new ErrorTypeKind("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);

    /* renamed from: t, reason: collision with root package name */
    public static final ErrorTypeKind f146974t = new ErrorTypeKind("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);

    /* renamed from: u, reason: collision with root package name */
    public static final ErrorTypeKind f146976u = new ErrorTypeKind("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);

    /* renamed from: v, reason: collision with root package name */
    public static final ErrorTypeKind f146978v = new ErrorTypeKind("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);

    /* renamed from: w, reason: collision with root package name */
    public static final ErrorTypeKind f146980w = new ErrorTypeKind("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);

    /* renamed from: y, reason: collision with root package name */
    public static final ErrorTypeKind f146984y = new ErrorTypeKind("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);

    /* renamed from: z, reason: collision with root package name */
    public static final ErrorTypeKind f146986z = new ErrorTypeKind("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);

    /* renamed from: A, reason: collision with root package name */
    public static final ErrorTypeKind f146903A = new ErrorTypeKind("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);

    /* renamed from: B, reason: collision with root package name */
    public static final ErrorTypeKind f146905B = new ErrorTypeKind("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);

    /* renamed from: C, reason: collision with root package name */
    public static final ErrorTypeKind f146907C = new ErrorTypeKind("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);

    /* renamed from: D, reason: collision with root package name */
    public static final ErrorTypeKind f146909D = new ErrorTypeKind("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);

    /* renamed from: E, reason: collision with root package name */
    public static final ErrorTypeKind f146911E = new ErrorTypeKind("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);

    /* renamed from: G, reason: collision with root package name */
    public static final ErrorTypeKind f146915G = new ErrorTypeKind("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);

    /* renamed from: H, reason: collision with root package name */
    public static final ErrorTypeKind f146917H = new ErrorTypeKind("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false, 2, null);

    /* renamed from: I, reason: collision with root package name */
    public static final ErrorTypeKind f146919I = new ErrorTypeKind("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false, 2, null);

    /* renamed from: J, reason: collision with root package name */
    public static final ErrorTypeKind f146921J = new ErrorTypeKind("ERROR_RAW_TYPE", 33, "Error raw type %s", false, 2, null);

    /* renamed from: K, reason: collision with root package name */
    public static final ErrorTypeKind f146922K = new ErrorTypeKind("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);

    /* renamed from: L, reason: collision with root package name */
    public static final ErrorTypeKind f146923L = new ErrorTypeKind("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false, 2, null);

    /* renamed from: M, reason: collision with root package name */
    public static final ErrorTypeKind f146924M = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null);

    /* renamed from: O, reason: collision with root package name */
    public static final ErrorTypeKind f146926O = new ErrorTypeKind("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);

    /* renamed from: P, reason: collision with root package name */
    public static final ErrorTypeKind f146927P = new ErrorTypeKind("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);

    /* renamed from: Q, reason: collision with root package name */
    public static final ErrorTypeKind f146928Q = new ErrorTypeKind("UNKNOWN_TYPE", 40, "Unknown type", false, 2, null);

    /* renamed from: R, reason: collision with root package name */
    public static final ErrorTypeKind f146929R = new ErrorTypeKind("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false, 2, null);

    /* renamed from: S, reason: collision with root package name */
    public static final ErrorTypeKind f146930S = new ErrorTypeKind("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false, 2, null);

    /* renamed from: T, reason: collision with root package name */
    public static final ErrorTypeKind f146931T = new ErrorTypeKind("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false, 2, null);

    /* renamed from: U, reason: collision with root package name */
    public static final ErrorTypeKind f146932U = new ErrorTypeKind("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false, 2, null);

    /* renamed from: W, reason: collision with root package name */
    public static final ErrorTypeKind f146934W = new ErrorTypeKind("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false, 2, null);

    /* renamed from: X, reason: collision with root package name */
    public static final ErrorTypeKind f146935X = new ErrorTypeKind("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false, 2, null);

    /* renamed from: Y, reason: collision with root package name */
    public static final ErrorTypeKind f146936Y = new ErrorTypeKind("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false, 2, null);

    /* renamed from: Z, reason: collision with root package name */
    public static final ErrorTypeKind f146937Z = new ErrorTypeKind("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false, 2, null);

    /* renamed from: a0, reason: collision with root package name */
    public static final ErrorTypeKind f146938a0 = new ErrorTypeKind("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false, 2, null);

    /* renamed from: b0, reason: collision with root package name */
    public static final ErrorTypeKind f146939b0 = new ErrorTypeKind("RETURN_NOT_ALLOWED", 51, "Return not allowed", false, 2, null);

    /* renamed from: c0, reason: collision with root package name */
    public static final ErrorTypeKind f146941c0 = new ErrorTypeKind("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);

    /* renamed from: d0, reason: collision with root package name */
    public static final ErrorTypeKind f146943d0 = new ErrorTypeKind("KAPT_ERROR_TYPE", 53, "Kapt error type", false, 2, null);

    /* renamed from: e0, reason: collision with root package name */
    public static final ErrorTypeKind f146945e0 = new ErrorTypeKind("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false, 2, null);

    /* renamed from: g0, reason: collision with root package name */
    public static final ErrorTypeKind f146949g0 = new ErrorTypeKind("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false, 2, null);

    /* renamed from: h0, reason: collision with root package name */
    public static final ErrorTypeKind f146951h0 = new ErrorTypeKind("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false, 2, null);

    /* renamed from: i0, reason: collision with root package name */
    public static final ErrorTypeKind f146953i0 = new ErrorTypeKind("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false, 2, null);

    /* renamed from: j0, reason: collision with root package name */
    public static final ErrorTypeKind f146955j0 = new ErrorTypeKind("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false, 2, null);

    /* renamed from: k0, reason: collision with root package name */
    public static final ErrorTypeKind f146957k0 = new ErrorTypeKind("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false, 2, null);

    /* renamed from: l0, reason: collision with root package name */
    public static final ErrorTypeKind f146959l0 = new ErrorTypeKind("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false, 2, null);

    /* renamed from: m0, reason: collision with root package name */
    public static final ErrorTypeKind f146961m0 = new ErrorTypeKind("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false, 2, null);

    /* renamed from: o0, reason: collision with root package name */
    public static final ErrorTypeKind f146965o0 = new ErrorTypeKind("ERROR_TYPE_PROJECTION", 64, "Error type projection", false, 2, null);

    /* renamed from: p0, reason: collision with root package name */
    public static final ErrorTypeKind f146967p0 = new ErrorTypeKind("ERROR_SUPER_TYPE", 65, "Error super type", false, 2, null);

    /* renamed from: q0, reason: collision with root package name */
    public static final ErrorTypeKind f146969q0 = new ErrorTypeKind("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false, 2, null);

    /* renamed from: r0, reason: collision with root package name */
    public static final ErrorTypeKind f146971r0 = new ErrorTypeKind("ERROR_PROPERTY_TYPE", 67, "Error property type", false, 2, null);

    /* renamed from: s0, reason: collision with root package name */
    public static final ErrorTypeKind f146973s0 = new ErrorTypeKind("ERROR_CLASS", 68, "Error class", false, 2, null);

    /* renamed from: t0, reason: collision with root package name */
    public static final ErrorTypeKind f146975t0 = new ErrorTypeKind("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false, 2, null);

    /* renamed from: u0, reason: collision with root package name */
    public static final ErrorTypeKind f146977u0 = new ErrorTypeKind("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false, 2, null);

    /* renamed from: w0, reason: collision with root package name */
    public static final ErrorTypeKind f146981w0 = new ErrorTypeKind("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false, 2, null);

    /* renamed from: x0, reason: collision with root package name */
    public static final ErrorTypeKind f146983x0 = new ErrorTypeKind("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);

    /* renamed from: y0, reason: collision with root package name */
    public static final ErrorTypeKind f146985y0 = new ErrorTypeKind("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false, 2, null);

    /* renamed from: z0, reason: collision with root package name */
    public static final ErrorTypeKind f146987z0 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false, 2, null);

    /* renamed from: A0, reason: collision with root package name */
    public static final ErrorTypeKind f146904A0 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false, 2, null);

    /* renamed from: B0, reason: collision with root package name */
    public static final ErrorTypeKind f146906B0 = new ErrorTypeKind("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);

    /* renamed from: C0, reason: collision with root package name */
    public static final ErrorTypeKind f146908C0 = new ErrorTypeKind("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);

    /* renamed from: E0, reason: collision with root package name */
    public static final ErrorTypeKind f146912E0 = new ErrorTypeKind("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false, 2, null);

    /* renamed from: F0, reason: collision with root package name */
    public static final ErrorTypeKind f146914F0 = new ErrorTypeKind("NOT_FOUND_FQNAME", 81, "No fqName for %s", false, 2, null);

    /* renamed from: G0, reason: collision with root package name */
    public static final ErrorTypeKind f146916G0 = new ErrorTypeKind("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false, 2, null);

    private ErrorTypeKind(String str, int i10, String str2, boolean z10) {
        this.f146988a = str2;
        this.f146989b = z10;
    }

    private static final /* synthetic */ ErrorTypeKind[] a() {
        return new ErrorTypeKind[]{f146940c, f146942d, f146944e, f146946f, f146948g, f146950h, f146952i, f146954j, f146956k, f146958l, f146960m, f146962n, f146964o, f146966p, f146968q, f146970r, f146972s, f146974t, f146976u, f146978v, f146980w, f146982x, f146984y, f146986z, f146903A, f146905B, f146907C, f146909D, f146911E, f146913F, f146915G, f146917H, f146919I, f146921J, f146922K, f146923L, f146924M, f146925N, f146926O, f146927P, f146928Q, f146929R, f146930S, f146931T, f146932U, f146933V, f146934W, f146935X, f146936Y, f146937Z, f146938a0, f146939b0, f146941c0, f146943d0, f146945e0, f146947f0, f146949g0, f146951h0, f146953i0, f146955j0, f146957k0, f146959l0, f146961m0, f146963n0, f146965o0, f146967p0, f146969q0, f146971r0, f146973s0, f146975t0, f146977u0, f146979v0, f146981w0, f146983x0, f146985y0, f146987z0, f146904A0, f146906B0, f146908C0, f146910D0, f146912E0, f146914F0, f146916G0};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f146966p = new ErrorTypeKind("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, defaultConstructorMarker);
        f146982x = new ErrorTypeKind("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, defaultConstructorMarker);
        f146913F = new ErrorTypeKind("STUB_TYPE", 29, "Stub type %s", false, 2, defaultConstructorMarker);
        f146925N = new ErrorTypeKind("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false, 2, defaultConstructorMarker);
        f146933V = new ErrorTypeKind("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false, 2, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        f146947f0 = new ErrorTypeKind("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false, 2, defaultConstructorMarker2);
        f146963n0 = new ErrorTypeKind("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false, 2, defaultConstructorMarker2);
        f146979v0 = new ErrorTypeKind("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false, 2, defaultConstructorMarker2);
        f146910D0 = new ErrorTypeKind("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false, 2, defaultConstructorMarker2);
        ErrorTypeKind[] errorTypeKindArrA = a();
        f146918H0 = errorTypeKindArrA;
        f146920I0 = EnumEntriesKt.a(errorTypeKindArrA);
    }

    /* synthetic */ ErrorTypeKind(String str, int i10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }

    public static ErrorTypeKind valueOf(String str) {
        return (ErrorTypeKind) Enum.valueOf(ErrorTypeKind.class, str);
    }

    public static ErrorTypeKind[] values() {
        return (ErrorTypeKind[]) f146918H0.clone();
    }

    public final String b() {
        return this.f146988a;
    }

    public final boolean e() {
        return this.f146989b;
    }
}

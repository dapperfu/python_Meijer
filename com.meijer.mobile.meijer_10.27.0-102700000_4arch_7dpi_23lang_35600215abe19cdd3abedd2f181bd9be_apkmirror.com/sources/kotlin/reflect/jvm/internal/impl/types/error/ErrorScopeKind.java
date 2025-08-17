package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ErrorScopeKind {

    /* renamed from: b, reason: collision with root package name */
    public static final ErrorScopeKind f146880b = new ErrorScopeKind("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorScopeKind f146881c = new ErrorScopeKind("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorScopeKind f146882d = new ErrorScopeKind("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorScopeKind f146883e = new ErrorScopeKind("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorScopeKind f146884f = new ErrorScopeKind("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorScopeKind f146885g = new ErrorScopeKind("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorScopeKind f146886h = new ErrorScopeKind("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* renamed from: i, reason: collision with root package name */
    public static final ErrorScopeKind f146887i = new ErrorScopeKind("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* renamed from: j, reason: collision with root package name */
    public static final ErrorScopeKind f146888j = new ErrorScopeKind("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* renamed from: k, reason: collision with root package name */
    public static final ErrorScopeKind f146889k = new ErrorScopeKind("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ ErrorScopeKind[] f146890l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146891m;

    /* renamed from: a, reason: collision with root package name */
    private final String f146892a;

    private static final /* synthetic */ ErrorScopeKind[] a() {
        return new ErrorScopeKind[]{f146880b, f146881c, f146882d, f146883e, f146884f, f146885g, f146886h, f146887i, f146888j, f146889k};
    }

    static {
        ErrorScopeKind[] errorScopeKindArrA = a();
        f146890l = errorScopeKindArrA;
        f146891m = EnumEntriesKt.a(errorScopeKindArrA);
    }

    public static ErrorScopeKind valueOf(String str) {
        return (ErrorScopeKind) Enum.valueOf(ErrorScopeKind.class, str);
    }

    public static ErrorScopeKind[] values() {
        return (ErrorScopeKind[]) f146890l.clone();
    }

    public final String b() {
        return this.f146892a;
    }

    private ErrorScopeKind(String str, int i10, String str2) {
        this.f146892a = str2;
    }
}

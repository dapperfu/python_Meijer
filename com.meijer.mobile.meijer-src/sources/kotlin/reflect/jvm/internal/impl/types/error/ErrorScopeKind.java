package kotlin.reflect.jvm.internal.impl.types.error;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class ErrorScopeKind {

    /* renamed from: b, reason: collision with root package name */
    public static final ErrorScopeKind f147787b = new ErrorScopeKind("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorScopeKind f147788c = new ErrorScopeKind("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorScopeKind f147789d = new ErrorScopeKind("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorScopeKind f147790e = new ErrorScopeKind("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorScopeKind f147791f = new ErrorScopeKind("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");

    /* renamed from: g, reason: collision with root package name */
    public static final ErrorScopeKind f147792g = new ErrorScopeKind("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");

    /* renamed from: h, reason: collision with root package name */
    public static final ErrorScopeKind f147793h = new ErrorScopeKind("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");

    /* renamed from: i, reason: collision with root package name */
    public static final ErrorScopeKind f147794i = new ErrorScopeKind("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");

    /* renamed from: j, reason: collision with root package name */
    public static final ErrorScopeKind f147795j = new ErrorScopeKind("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");

    /* renamed from: k, reason: collision with root package name */
    public static final ErrorScopeKind f147796k = new ErrorScopeKind("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ ErrorScopeKind[] f147797l;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147798m;

    /* renamed from: a, reason: collision with root package name */
    private final String f147799a;

    private static final /* synthetic */ ErrorScopeKind[] a() {
        return new ErrorScopeKind[]{f147787b, f147788c, f147789d, f147790e, f147791f, f147792g, f147793h, f147794i, f147795j, f147796k};
    }

    static {
        ErrorScopeKind[] errorScopeKindArrA = a();
        f147797l = errorScopeKindArrA;
        f147798m = EnumEntriesKt.a(errorScopeKindArrA);
    }

    public static ErrorScopeKind valueOf(String str) {
        return (ErrorScopeKind) Enum.valueOf(ErrorScopeKind.class, str);
    }

    public static ErrorScopeKind[] values() {
        return (ErrorScopeKind[]) f147797l.clone();
    }

    public final String b() {
        return this.f147799a;
    }

    private ErrorScopeKind(String str, int i10, String str2) {
        this.f147799a = str2;
    }
}

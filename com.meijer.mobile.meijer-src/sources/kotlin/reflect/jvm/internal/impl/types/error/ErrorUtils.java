package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public final class ErrorUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorUtils f147897a = new ErrorUtils();

    /* renamed from: b, reason: collision with root package name */
    private static final ModuleDescriptor f147898b = ErrorModuleDescriptor.f147778a;

    /* renamed from: c, reason: collision with root package name */
    private static final ErrorClassDescriptor f147899c;

    /* renamed from: d, reason: collision with root package name */
    private static final KotlinType f147900d;

    /* renamed from: e, reason: collision with root package name */
    private static final KotlinType f147901e;

    /* renamed from: f, reason: collision with root package name */
    private static final PropertyDescriptor f147902f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<PropertyDescriptor> f147903g;

    @JvmStatic
    public static final boolean o(KotlinType kotlinType) {
        if (kotlinType == null) {
            return false;
        }
        TypeConstructor typeConstructorK0 = kotlinType.K0();
        return (typeConstructorK0 instanceof ErrorTypeConstructor) && ((ErrorTypeConstructor) typeConstructorK0).f() == ErrorTypeKind.f147891y;
    }

    static {
        String str = String.format(ErrorEntity.f147767b.b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.i(str, "format(...)");
        Name nameU = Name.u(str);
        Intrinsics.i(nameU, "special(...)");
        f147899c = new ErrorClassDescriptor(nameU);
        f147900d = d(ErrorTypeKind.f147885v, new String[0]);
        f147901e = d(ErrorTypeKind.f147878r0, new String[0]);
        ErrorPropertyDescriptor errorPropertyDescriptor = new ErrorPropertyDescriptor();
        f147902f = errorPropertyDescriptor;
        f147903g = SetsKt.d(errorPropertyDescriptor);
    }

    @JvmStatic
    public static final ErrorScope a(ErrorScopeKind kind, boolean z10, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        return z10 ? new ThrowingScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new ErrorScope(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @JvmStatic
    public static final ErrorScope b(ErrorScopeKind kind, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @JvmStatic
    public static final ErrorType d(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        return f147897a.g(kind, CollectionsKt.m(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @JvmStatic
    public static final boolean m(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        ErrorUtils errorUtils = f147897a;
        return errorUtils.n(declarationDescriptor) || errorUtils.n(declarationDescriptor.b()) || declarationDescriptor == f147898b;
    }

    private final boolean n(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof ErrorClassDescriptor;
    }

    public final ErrorType c(ErrorTypeKind kind, TypeConstructor typeConstructor, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(typeConstructor, "typeConstructor");
        Intrinsics.j(formatParams, "formatParams");
        return f(kind, CollectionsKt.m(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorTypeConstructor e(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        return new ErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType f(ErrorTypeKind kind, List<? extends TypeProjection> arguments, TypeConstructor typeConstructor, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(typeConstructor, "typeConstructor");
        Intrinsics.j(formatParams, "formatParams");
        return new ErrorType(typeConstructor, b(ErrorScopeKind.f147793h, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorType g(ErrorTypeKind kind, List<? extends TypeProjection> arguments, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final ErrorClassDescriptor h() {
        return f147899c;
    }

    public final ModuleDescriptor i() {
        return f147898b;
    }

    public final Set<PropertyDescriptor> j() {
        return f147903g;
    }

    public final KotlinType k() {
        return f147901e;
    }

    public final KotlinType l() {
        return f147900d;
    }

    public final String p(KotlinType type) {
        Intrinsics.j(type, "type");
        TypeUtilsKt.z(type);
        TypeConstructor typeConstructorK0 = type.K0();
        Intrinsics.h(typeConstructorK0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((ErrorTypeConstructor) typeConstructorK0).g(0);
    }

    private ErrorUtils() {
    }
}

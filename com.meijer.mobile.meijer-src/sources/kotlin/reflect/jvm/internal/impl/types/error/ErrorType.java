package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class ErrorType extends SimpleType {

    /* renamed from: b, reason: collision with root package name */
    private final TypeConstructor f147800b;

    /* renamed from: c, reason: collision with root package name */
    private final MemberScope f147801c;

    /* renamed from: d, reason: collision with root package name */
    private final ErrorTypeKind f147802d;

    /* renamed from: e, reason: collision with root package name */
    private final List<TypeProjection> f147803e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f147804f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f147805g;

    /* renamed from: h, reason: collision with root package name */
    private final String f147806h;

    public /* synthetic */ ErrorType(TypeConstructor typeConstructor, MemberScope memberScope, ErrorTypeKind errorTypeKind, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeConstructor, memberScope, errorTypeKind, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public ErrorType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return this.f147803e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return TypeAttributes.f147647b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return this.f147800b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f147804f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        TypeConstructor typeConstructorK0 = K0();
        MemberScope memberScopeN = n();
        ErrorTypeKind errorTypeKind = this.f147802d;
        List<TypeProjection> listI0 = I0();
        String[] strArr = this.f147805g;
        return new ErrorType(typeConstructorK0, memberScopeN, errorTypeKind, listI0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String T0() {
        return this.f147806h;
    }

    public final ErrorTypeKind U0() {
        return this.f147802d;
    }

    public final ErrorType W0(List<? extends TypeProjection> newArguments) {
        Intrinsics.j(newArguments, "newArguments");
        TypeConstructor typeConstructorK0 = K0();
        MemberScope memberScopeN = n();
        ErrorTypeKind errorTypeKind = this.f147802d;
        boolean zL0 = L0();
        String[] strArr = this.f147805g;
        return new ErrorType(typeConstructorK0, memberScopeN, errorTypeKind, newArguments, zL0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f147801c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(TypeConstructor constructor, MemberScope memberScope, ErrorTypeKind kind, List<? extends TypeProjection> arguments, boolean z10, String... formatParams) {
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(memberScope, "memberScope");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(formatParams, "formatParams");
        this.f147800b = constructor;
        this.f147801c = memberScope;
        this.f147802d = kind;
        this.f147803e = arguments;
        this.f147804f = z10;
        this.f147805g = formatParams;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.i(str, "format(...)");
        this.f147806h = str;
    }
}

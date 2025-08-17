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

/* loaded from: classes13.dex */
public final class ErrorType extends SimpleType {

    /* renamed from: b, reason: collision with root package name */
    private final TypeConstructor f146893b;

    /* renamed from: c, reason: collision with root package name */
    private final MemberScope f146894c;

    /* renamed from: d, reason: collision with root package name */
    private final ErrorTypeKind f146895d;

    /* renamed from: e, reason: collision with root package name */
    private final List<TypeProjection> f146896e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f146897f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f146898g;

    /* renamed from: h, reason: collision with root package name */
    private final String f146899h;

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
        return this.f146896e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return TypeAttributes.f146740b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return this.f146893b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f146897f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        TypeConstructor typeConstructorK0 = K0();
        MemberScope memberScopeN = n();
        ErrorTypeKind errorTypeKind = this.f146895d;
        List<TypeProjection> listI0 = I0();
        String[] strArr = this.f146898g;
        return new ErrorType(typeConstructorK0, memberScopeN, errorTypeKind, listI0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String T0() {
        return this.f146899h;
    }

    public final ErrorTypeKind U0() {
        return this.f146895d;
    }

    public final ErrorType W0(List<? extends TypeProjection> newArguments) {
        Intrinsics.j(newArguments, "newArguments");
        TypeConstructor typeConstructorK0 = K0();
        MemberScope memberScopeN = n();
        ErrorTypeKind errorTypeKind = this.f146895d;
        boolean zL0 = L0();
        String[] strArr = this.f146898g;
        return new ErrorType(typeConstructorK0, memberScopeN, errorTypeKind, newArguments, zL0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f146894c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ErrorType(TypeConstructor constructor, MemberScope memberScope, ErrorTypeKind kind, List<? extends TypeProjection> arguments, boolean z10, String... formatParams) {
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(memberScope, "memberScope");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(formatParams, "formatParams");
        this.f146893b = constructor;
        this.f146894c = memberScope;
        this.f146895d = kind;
        this.f146896e = arguments;
        this.f146897f = z10;
        this.f146898g = formatParams;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String strB = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.i(str, "format(...)");
        this.f146899h = str;
    }
}

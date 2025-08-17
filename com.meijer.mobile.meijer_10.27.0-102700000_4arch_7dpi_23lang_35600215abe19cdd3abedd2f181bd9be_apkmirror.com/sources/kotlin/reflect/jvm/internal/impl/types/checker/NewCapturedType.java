package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* renamed from: b, reason: collision with root package name */
    private final CaptureStatus f146820b;

    /* renamed from: c, reason: collision with root package name */
    private final NewCapturedTypeConstructor f146821c;

    /* renamed from: d, reason: collision with root package name */
    private final UnwrappedType f146822d;

    /* renamed from: e, reason: collision with root package name */
    private final TypeAttributes f146823e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f146824f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f146825g;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i10 & 8) != 0 ? TypeAttributes.f146740b.k() : typeAttributes, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return this.f146823e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f146824f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new NewCapturedType(this.f146820b, K0(), this.f146822d, newAttributes, L0(), this.f146825g);
    }

    public final CaptureStatus T0() {
        return this.f146820b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor K0() {
        return this.f146821c;
    }

    public final UnwrappedType V0() {
        return this.f146822d;
    }

    public final boolean W0() {
        return this.f146825g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType R0(boolean z10) {
        return new NewCapturedType(this.f146820b, K0(), this.f146822d, J0(), z10, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public NewCapturedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f146820b;
        NewCapturedTypeConstructor newCapturedTypeConstructorB = K0().b(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f146822d;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorB, unwrappedType != null ? kotlinTypeRefiner.a(unwrappedType).N0() : null, J0(), L0(), false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return ErrorUtils.a(ErrorScopeKind.f146880b, true, new String[0]);
    }

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z10, boolean z11) {
        Intrinsics.j(captureStatus, "captureStatus");
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(attributes, "attributes");
        this.f146820b = captureStatus;
        this.f146821c = constructor;
        this.f146822d = unwrappedType;
        this.f146823e = attributes;
        this.f146824f = z10;
        this.f146825g = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return CollectionsKt.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(CaptureStatus captureStatus, UnwrappedType unwrappedType, TypeProjection projection, TypeParameterDescriptor typeParameter) {
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), unwrappedType, null, false, false, 56, null);
        Intrinsics.j(captureStatus, "captureStatus");
        Intrinsics.j(projection, "projection");
        Intrinsics.j(typeParameter, "typeParameter");
    }
}

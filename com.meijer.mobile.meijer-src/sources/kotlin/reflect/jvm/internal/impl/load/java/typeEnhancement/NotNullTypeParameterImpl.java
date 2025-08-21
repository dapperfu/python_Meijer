package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public final class NotNullTypeParameterImpl extends DelegatingSimpleType implements NotNullTypeParameter {

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f145557b;

    private final SimpleType W0(SimpleType simpleType) {
        SimpleType simpleTypeR0 = simpleType.R0(false);
        return !TypeUtilsKt.y(simpleType) ? simpleTypeR0 : new NotNullTypeParameterImpl(simpleTypeR0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public boolean B0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return false;
    }

    public NotNullTypeParameterImpl(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f145557b = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        return z10 ? T0().R0(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType T0() {
        return this.f145557b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new NotNullTypeParameterImpl(T0().Q0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public NotNullTypeParameterImpl V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new NotNullTypeParameterImpl(delegate);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public KotlinType g0(KotlinType replacement) {
        Intrinsics.j(replacement, "replacement");
        UnwrappedType unwrappedTypeN0 = replacement.N0();
        if (!TypeUtilsKt.y(unwrappedTypeN0) && !TypeUtils.l(unwrappedTypeN0)) {
            return unwrappedTypeN0;
        }
        if (unwrappedTypeN0 instanceof SimpleType) {
            return W0((SimpleType) unwrappedTypeN0);
        }
        if (!(unwrappedTypeN0 instanceof FlexibleType)) {
            throw new NoWhenBranchMatchedException();
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeN0;
        return TypeWithEnhancementKt.d(KotlinTypeFactory.e(W0(flexibleType.S0()), W0(flexibleType.T0())), TypeWithEnhancementKt.a(unwrappedTypeN0));
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class SimpleTypeWithEnhancement extends DelegatingSimpleType implements TypeWithEnhancement {

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f147629b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinType f147630c;

    public SimpleTypeWithEnhancement(SimpleType delegate, KotlinType enhancement) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(enhancement, "enhancement");
        this.f147629b = delegate;
        this.f147630c = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        UnwrappedType unwrappedTypeD = TypeWithEnhancementKt.d(D0().Q0(newAttributes), e0());
        Intrinsics.h(unwrappedTypeD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType T0() {
        return this.f147629b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(T0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new SimpleTypeWithEnhancement((SimpleType) kotlinTypeA, kotlinTypeRefiner.a(e0()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public SimpleTypeWithEnhancement V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new SimpleTypeWithEnhancement(delegate, e0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public KotlinType e0() {
        return this.f147630c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        return "[@EnhancedForWarnings(" + e0() + ")] " + D0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        UnwrappedType unwrappedTypeD = TypeWithEnhancementKt.d(D0().R0(z10), e0().N0().R0(z10));
        Intrinsics.h(unwrappedTypeD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (SimpleType) unwrappedTypeD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public SimpleType D0() {
        return T0();
    }
}

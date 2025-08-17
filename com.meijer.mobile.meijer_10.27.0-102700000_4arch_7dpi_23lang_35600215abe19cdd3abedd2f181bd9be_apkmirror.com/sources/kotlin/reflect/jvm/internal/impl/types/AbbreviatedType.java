package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f146662b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f146663c;

    public AbbreviatedType(SimpleType delegate, SimpleType abbreviation) {
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(abbreviation, "abbreviation");
        this.f146662b = delegate;
        this.f146663c = abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new AbbreviatedType(T0().Q0(newAttributes), this.f146663c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType T0() {
        return this.f146662b;
    }

    public final SimpleType W0() {
        return this.f146663c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType R0(boolean z10) {
        return new AbbreviatedType(T0().R0(z10), this.f146663c.R0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbbreviatedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(T0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeA2 = kotlinTypeRefiner.a(this.f146663c);
        Intrinsics.h(kotlinTypeA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new AbbreviatedType((SimpleType) kotlinTypeA, (SimpleType) kotlinTypeA2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public AbbreviatedType V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new AbbreviatedType(delegate, this.f146663c);
    }

    public final SimpleType F() {
        return T0();
    }
}

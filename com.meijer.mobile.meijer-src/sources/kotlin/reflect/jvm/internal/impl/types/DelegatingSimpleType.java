package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    protected abstract SimpleType T0();

    public abstract DelegatingSimpleType V0(SimpleType simpleType);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(T0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return V0((SimpleType) kotlinTypeA);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return T0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return T0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return T0().K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return T0().L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return T0().n();
    }
}

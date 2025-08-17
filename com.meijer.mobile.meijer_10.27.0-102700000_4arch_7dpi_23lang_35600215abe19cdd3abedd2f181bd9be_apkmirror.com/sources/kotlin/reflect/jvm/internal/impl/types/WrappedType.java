package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes13.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    protected abstract KotlinType O0();

    public boolean P0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return O0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return O0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return O0().K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return O0().L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType N0() {
        KotlinType kotlinTypeO0 = O0();
        while (kotlinTypeO0 instanceof WrappedType) {
            kotlinTypeO0 = ((WrappedType) kotlinTypeO0).O0();
        }
        Intrinsics.h(kotlinTypeO0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeO0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return O0().n();
    }

    public String toString() {
        if (P0()) {
            return O0().toString();
        }
        return "<Not computed yet>";
    }
}

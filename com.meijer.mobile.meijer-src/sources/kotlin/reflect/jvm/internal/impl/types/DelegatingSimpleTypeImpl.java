package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f147598b;

    public DelegatingSimpleTypeImpl(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f147598b = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return newAttributes != J0() ? new t(this, newAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType T0() {
        return this.f147598b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        if (z10 == L0()) {
            return this;
        }
        return T0().R0(z10).Q0(J0());
    }
}

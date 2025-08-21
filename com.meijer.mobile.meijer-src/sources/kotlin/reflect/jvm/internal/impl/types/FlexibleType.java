package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* loaded from: classes14.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* renamed from: b, reason: collision with root package name */
    private final SimpleType f147606b;

    /* renamed from: c, reason: collision with root package name */
    private final SimpleType f147607c;

    public abstract SimpleType R0();

    public abstract String U0(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(SimpleType lowerBound, SimpleType upperBound) {
        super(null);
        Intrinsics.j(lowerBound, "lowerBound");
        Intrinsics.j(upperBound, "upperBound");
        this.f147606b = lowerBound;
        this.f147607c = upperBound;
    }

    public final SimpleType S0() {
        return this.f147606b;
    }

    public final SimpleType T0() {
        return this.f147607c;
    }

    public String toString() {
        return DescriptorRenderer.f146902k.T(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return R0().I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return R0().J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return R0().K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return R0().L0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return R0().n();
    }
}

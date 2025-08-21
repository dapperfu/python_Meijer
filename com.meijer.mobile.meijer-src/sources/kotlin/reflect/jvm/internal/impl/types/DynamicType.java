package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes14.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {

    /* renamed from: d, reason: collision with root package name */
    private final TypeAttributes f147602d;

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public DynamicType R0(boolean z10) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public DynamicType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(KotlinBuiltIns builtIns, TypeAttributes attributes) {
        Intrinsics.j(builtIns, "builtIns");
        Intrinsics.j(attributes, "attributes");
        SimpleType simpleTypeI = builtIns.I();
        Intrinsics.i(simpleTypeI, "getNothingType(...)");
        SimpleType simpleTypeJ = builtIns.J();
        Intrinsics.i(simpleTypeJ, "getNullableAnyType(...)");
        super(simpleTypeI, simpleTypeJ);
        this.f147602d = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return this.f147602d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String U0(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        Intrinsics.j(renderer, "renderer");
        Intrinsics.j(options, "options");
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public DynamicType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new DynamicType(TypeUtilsKt.n(R0()), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType R0() {
        return T0();
    }
}

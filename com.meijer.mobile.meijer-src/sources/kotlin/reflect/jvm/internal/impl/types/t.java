package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
final class t extends DelegatingSimpleTypeImpl {

    /* renamed from: c, reason: collision with root package name */
    private final TypeAttributes f147942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SimpleType delegate, TypeAttributes attributes) {
        super(delegate);
        Intrinsics.j(delegate, "delegate");
        Intrinsics.j(attributes, "attributes");
        this.f147942c = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return this.f147942c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public t V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new t(delegate, J0());
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
final class q extends DelegatingSimpleTypeImpl {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(SimpleType delegate) {
        super(delegate);
        Intrinsics.j(delegate, "delegate");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public q V0(SimpleType delegate) {
        Intrinsics.j(delegate, "delegate");
        return new q(delegate);
    }
}

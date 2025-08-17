package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* loaded from: classes13.dex */
class d implements KotlinTypeChecker.TypeConstructorEquality {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f146201a;

    /* renamed from: b, reason: collision with root package name */
    private final CallableDescriptor f146202b;

    /* renamed from: c, reason: collision with root package name */
    private final CallableDescriptor f146203c;

    public d(boolean z10, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f146201a = z10;
        this.f146202b = callableDescriptor;
        this.f146203c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return DescriptorEquivalenceForOverrides.h(this.f146201a, this.f146202b, this.f146203c, typeConstructor, typeConstructor2);
    }
}

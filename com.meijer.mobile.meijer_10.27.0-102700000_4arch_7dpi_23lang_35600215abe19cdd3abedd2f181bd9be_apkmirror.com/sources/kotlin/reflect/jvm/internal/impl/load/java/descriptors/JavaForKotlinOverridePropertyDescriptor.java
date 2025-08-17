package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes13.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    /* renamed from: F, reason: collision with root package name */
    private final SimpleFunctionDescriptor f144360F;

    /* renamed from: G, reason: collision with root package name */
    private final SimpleFunctionDescriptor f144361G;

    /* renamed from: H, reason: collision with root package name */
    private final PropertyDescriptor f144362H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor ownerDescriptor, SimpleFunctionDescriptor getterMethod, SimpleFunctionDescriptor simpleFunctionDescriptor, PropertyDescriptor overriddenProperty) {
        super(ownerDescriptor, Annotations.f143689s3.b(), getterMethod.q(), getterMethod.getVisibility(), simpleFunctionDescriptor != null, overriddenProperty.getName(), getterMethod.g(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        Intrinsics.j(ownerDescriptor, "ownerDescriptor");
        Intrinsics.j(getterMethod, "getterMethod");
        Intrinsics.j(overriddenProperty, "overriddenProperty");
        this.f144360F = getterMethod;
        this.f144361G = simpleFunctionDescriptor;
        this.f144362H = overriddenProperty;
    }
}

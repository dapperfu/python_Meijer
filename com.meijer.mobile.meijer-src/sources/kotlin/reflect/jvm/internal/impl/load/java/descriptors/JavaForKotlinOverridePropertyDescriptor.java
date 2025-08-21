package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes14.dex */
public final class JavaForKotlinOverridePropertyDescriptor extends JavaPropertyDescriptor {

    /* renamed from: F, reason: collision with root package name */
    private final SimpleFunctionDescriptor f145267F;

    /* renamed from: G, reason: collision with root package name */
    private final SimpleFunctionDescriptor f145268G;

    /* renamed from: H, reason: collision with root package name */
    private final PropertyDescriptor f145269H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaForKotlinOverridePropertyDescriptor(ClassDescriptor ownerDescriptor, SimpleFunctionDescriptor getterMethod, SimpleFunctionDescriptor simpleFunctionDescriptor, PropertyDescriptor overriddenProperty) {
        super(ownerDescriptor, Annotations.f144596s3.b(), getterMethod.q(), getterMethod.getVisibility(), simpleFunctionDescriptor != null, overriddenProperty.getName(), getterMethod.g(), null, CallableMemberDescriptor.Kind.DECLARATION, false, null);
        Intrinsics.j(ownerDescriptor, "ownerDescriptor");
        Intrinsics.j(getterMethod, "getterMethod");
        Intrinsics.j(overriddenProperty, "overriddenProperty");
        this.f145267F = getterMethod;
        this.f145268G = simpleFunctionDescriptor;
        this.f145269H = overriddenProperty;
    }
}

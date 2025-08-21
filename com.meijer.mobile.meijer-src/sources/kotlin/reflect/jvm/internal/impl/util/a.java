package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes14.dex */
final class a implements Check {

    /* renamed from: a, reason: collision with root package name */
    public static final a f148057a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f148058b = "second parameter must be of type KProperty<*> or its supertype";

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean b(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.h().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.f144178k;
        Intrinsics.g(valueParameterDescriptor);
        KotlinType kotlinTypeA = companion.a(DescriptorUtilsKt.s(valueParameterDescriptor));
        if (kotlinTypeA == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.i(type, "getType(...)");
        return TypeUtilsKt.w(kotlinTypeA, TypeUtilsKt.A(type));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return f148058b;
    }

    private a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}

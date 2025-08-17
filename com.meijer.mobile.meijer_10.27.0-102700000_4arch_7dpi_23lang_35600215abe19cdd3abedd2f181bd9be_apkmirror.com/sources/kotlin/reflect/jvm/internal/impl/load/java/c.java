package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes13.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f144317a = new c();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.m((CallableMemberDescriptor) obj));
    }
}

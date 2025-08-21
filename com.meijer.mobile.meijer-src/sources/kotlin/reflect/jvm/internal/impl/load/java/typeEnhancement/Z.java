package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes14.dex */
class Z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ValueParameterDescriptor f145600a;

    public Z(ValueParameterDescriptor valueParameterDescriptor) {
        this.f145600a = valueParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.o(this.f145600a, (CallableMemberDescriptor) obj);
    }
}

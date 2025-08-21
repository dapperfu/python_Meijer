package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15389o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f148110a;

    public C15389o(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f148110a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.q(this.f148110a);
    }
}

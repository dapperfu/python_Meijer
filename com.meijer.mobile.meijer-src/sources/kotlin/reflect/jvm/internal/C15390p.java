package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15390p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f148112a;

    public C15390p(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f148112a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.v(this.f148112a);
    }
}

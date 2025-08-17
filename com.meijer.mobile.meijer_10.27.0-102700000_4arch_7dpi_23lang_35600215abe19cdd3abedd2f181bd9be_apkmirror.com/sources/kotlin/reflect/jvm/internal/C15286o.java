package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15286o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f147203a;

    public C15286o(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f147203a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.q(this.f147203a);
    }
}

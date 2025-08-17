package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15287p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final ReceiverParameterDescriptor f147205a;

    public C15287p(ReceiverParameterDescriptor receiverParameterDescriptor) {
        this.f147205a = receiverParameterDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.v(this.f147205a);
    }
}

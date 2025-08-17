package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15288q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final CallableMemberDescriptor f147207a;

    /* renamed from: b, reason: collision with root package name */
    private final int f147208b;

    public C15288q(CallableMemberDescriptor callableMemberDescriptor, int i10) {
        this.f147207a = callableMemberDescriptor;
        this.f147208b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.w(this.f147207a, this.f147208b);
    }
}

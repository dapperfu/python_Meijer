package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15391q implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final CallableMemberDescriptor f148114a;

    /* renamed from: b, reason: collision with root package name */
    private final int f148115b;

    public C15391q(CallableMemberDescriptor callableMemberDescriptor, int i10) {
        this.f148114a = callableMemberDescriptor;
        this.f148115b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KCallableImpl.w(this.f148114a, this.f148115b);
    }
}

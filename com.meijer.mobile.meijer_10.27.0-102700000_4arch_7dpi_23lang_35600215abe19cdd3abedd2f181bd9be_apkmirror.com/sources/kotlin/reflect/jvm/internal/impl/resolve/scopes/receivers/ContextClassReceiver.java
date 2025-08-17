package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f146319c;

    /* renamed from: d, reason: collision with root package name */
    private final Name f146320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.j(classDescriptor, "classDescriptor");
        Intrinsics.j(receiverType, "receiverType");
        this.f146319c = classDescriptor;
        this.f146320d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name a() {
        return this.f146320d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f146319c + " }";
    }
}

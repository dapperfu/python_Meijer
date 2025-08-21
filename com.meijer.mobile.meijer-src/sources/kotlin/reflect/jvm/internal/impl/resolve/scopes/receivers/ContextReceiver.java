package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* renamed from: c, reason: collision with root package name */
    private final CallableDescriptor f147228c;

    /* renamed from: d, reason: collision with root package name */
    private final Name f147229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(CallableDescriptor declarationDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.j(declarationDescriptor, "declarationDescriptor");
        Intrinsics.j(receiverType, "receiverType");
        this.f147228c = declarationDescriptor;
        this.f147229d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name a() {
        return this.f147229d;
    }

    public CallableDescriptor d() {
        return this.f147228c;
    }

    public String toString() {
        return "Cxt { " + d() + " }";
    }
}

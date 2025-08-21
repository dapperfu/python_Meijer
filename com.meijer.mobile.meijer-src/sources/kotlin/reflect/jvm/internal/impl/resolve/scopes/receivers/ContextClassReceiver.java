package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public final class ContextClassReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f147226c;

    /* renamed from: d, reason: collision with root package name */
    private final Name f147227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextClassReceiver(ClassDescriptor classDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.j(classDescriptor, "classDescriptor");
        Intrinsics.j(receiverType, "receiverType");
        this.f147226c = classDescriptor;
        this.f147227d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public Name a() {
        return this.f147227d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f147226c + " }";
    }
}

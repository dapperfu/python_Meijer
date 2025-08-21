package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f147231a;

    /* renamed from: b, reason: collision with root package name */
    private final ImplicitClassReceiver f147232b;

    /* renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f147233c;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.j(classDescriptor, "classDescriptor");
        this.f147231a = classDescriptor;
        this.f147232b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f147233c = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        SimpleType simpleTypeO = this.f147231a.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    public boolean equals(Object obj) {
        ClassDescriptor classDescriptor = this.f147231a;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.e(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f147231a : null);
    }

    public int hashCode() {
        return this.f147231a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor s() {
        return this.f147231a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* loaded from: classes13.dex */
public abstract class DescriptorVisibility {
    public abstract Visibility b();

    public abstract String c();

    public abstract boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10);

    public abstract DescriptorVisibility f();

    public final Integer a(DescriptorVisibility visibility) {
        Intrinsics.j(visibility, "visibility");
        return b().a(visibility.b());
    }

    protected DescriptorVisibility() {
    }

    public final boolean d() {
        return b().c();
    }

    public final String toString() {
        return b().toString();
    }
}

package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes13.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f146324a;

    /* renamed from: b, reason: collision with root package name */
    private final ImplicitClassReceiver f146325b;

    /* renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f146326c;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        Intrinsics.j(classDescriptor, "classDescriptor");
        this.f146324a = classDescriptor;
        this.f146325b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f146326c = classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SimpleType getType() {
        SimpleType simpleTypeO = this.f146324a.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    public boolean equals(Object obj) {
        ClassDescriptor classDescriptor = this.f146324a;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return Intrinsics.e(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f146324a : null);
    }

    public int hashCode() {
        return this.f146324a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor s() {
        return this.f146324a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}

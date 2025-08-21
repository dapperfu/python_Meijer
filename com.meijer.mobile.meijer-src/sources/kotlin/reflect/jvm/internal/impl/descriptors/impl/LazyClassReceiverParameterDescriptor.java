package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* loaded from: classes14.dex */
public class LazyClassReceiverParameterDescriptor extends AbstractReceiverParameterDescriptor {

    /* renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f144809c;

    /* renamed from: d, reason: collision with root package name */
    private final ImplicitClassReceiver f144810d;

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyClassReceiverParameterDescriptor(ClassDescriptor classDescriptor) {
        super(Annotations.f144596s3.b());
        if (classDescriptor == null) {
            e0(0);
        }
        this.f144809c = classDescriptor;
        this.f144810d = new ImplicitClassReceiver(classDescriptor, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        ClassDescriptor classDescriptor = this.f144809c;
        if (classDescriptor == null) {
            e0(2);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor
    public ReceiverValue getValue() {
        ImplicitClassReceiver implicitClassReceiver = this.f144810d;
        if (implicitClassReceiver == null) {
            e0(1);
        }
        return implicitClassReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "class " + this.f144809c.getName() + "::this";
    }
}

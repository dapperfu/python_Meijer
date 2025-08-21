package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* loaded from: classes14.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    /* renamed from: b, reason: collision with root package name */
    public static final RuntimeErrorReporter f144953b = new RuntimeErrorReporter();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void a(CallableMemberDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void b(ClassDescriptor descriptor, List<String> unresolvedSuperClasses) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }

    private RuntimeErrorReporter() {
    }
}

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* loaded from: classes13.dex */
public interface JavaClassesTracker {
    void a(JavaClassDescriptor javaClassDescriptor);

    public static final class Default implements JavaClassesTracker {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f144177a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void a(JavaClassDescriptor classDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
        }

        private Default() {
        }
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* loaded from: classes13.dex */
public interface JavaPropertyInitializerEvaluator {
    ConstantValue<?> a(JavaField javaField, PropertyDescriptor propertyDescriptor);

    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public static final DoNothing f144338a = new DoNothing();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        public ConstantValue<?> a(JavaField field, PropertyDescriptor descriptor) {
            Intrinsics.j(field, "field");
            Intrinsics.j(descriptor, "descriptor");
            return null;
        }

        private DoNothing() {
        }
    }
}

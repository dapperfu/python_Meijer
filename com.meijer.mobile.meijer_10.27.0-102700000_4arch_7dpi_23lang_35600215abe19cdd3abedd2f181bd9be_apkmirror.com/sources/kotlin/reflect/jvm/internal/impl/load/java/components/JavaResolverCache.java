package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public interface JavaResolverCache {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaResolverCache f144339a = new a();

    void a(JavaElement javaElement, ConstructorDescriptor constructorDescriptor);

    void b(JavaField javaField, PropertyDescriptor propertyDescriptor);

    void c(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor);

    ClassDescriptor d(FqName fqName);

    void e(JavaClass javaClass, ClassDescriptor classDescriptor);

    static class a implements JavaResolverCache {
        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void a(JavaElement javaElement, ConstructorDescriptor constructorDescriptor) {
            if (javaElement == null) {
                f(3);
            }
            if (constructorDescriptor == null) {
                f(4);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void b(JavaField javaField, PropertyDescriptor propertyDescriptor) {
            if (javaField == null) {
                f(5);
            }
            if (propertyDescriptor == null) {
                f(6);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void c(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor) {
            if (javaMember == null) {
                f(1);
            }
            if (simpleFunctionDescriptor == null) {
                f(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public ClassDescriptor d(FqName fqName) {
            if (fqName != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
        public void e(JavaClass javaClass, ClassDescriptor classDescriptor) {
            if (javaClass == null) {
                f(7);
            }
            if (classDescriptor == null) {
                f(8);
            }
        }

        a() {
        }
    }
}

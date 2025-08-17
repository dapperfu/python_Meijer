package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* loaded from: classes13.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final RuntimeSourceElementFactory f144050a = new RuntimeSourceElementFactory();

    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* renamed from: b, reason: collision with root package name */
        private final ReflectJavaElement f144051b;

        public RuntimeSourceElement(ReflectJavaElement javaElement) {
            Intrinsics.j(javaElement, "javaElement");
            this.f144051b = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        public SourceFile b() {
            SourceFile NO_SOURCE_FILE = SourceFile.f143648a;
            Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ReflectJavaElement c() {
            return this.f144051b;
        }

        public String toString() {
            return RuntimeSourceElement.class.getName() + ": " + c();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    public JavaSourceElement a(JavaElement javaElement) {
        Intrinsics.j(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }

    private RuntimeSourceElementFactory() {
    }
}

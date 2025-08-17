package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectJavaAnnotation extends ReflectJavaElement implements JavaAnnotation {

    /* renamed from: a, reason: collision with root package name */
    private final Annotation f144072a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean H() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean k() {
        return false;
    }

    public ReflectJavaAnnotation(Annotation annotation) {
        Intrinsics.j(annotation, "annotation");
        this.f144072a = annotation;
    }

    public final Annotation Q() {
        return this.f144072a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass u() {
        return new ReflectJavaClass(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f144072a)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public Collection<JavaAnnotationArgument> d() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Method[] declaredMethods = JvmClassMappingKt.b(JvmClassMappingKt.a(this.f144072a)).getDeclaredMethods();
        Intrinsics.i(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            ReflectJavaAnnotationArgument.Factory factory = ReflectJavaAnnotationArgument.f144073b;
            Object objInvoke = method.invoke(this.f144072a, null);
            Intrinsics.i(objInvoke, "invoke(...)");
            arrayList.add(factory.a(objInvoke, Name.o(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaAnnotation) && this.f144072a == ((ReflectJavaAnnotation) obj).f144072a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public ClassId f() {
        return ReflectClassUtilKt.e(JvmClassMappingKt.b(JvmClassMappingKt.a(this.f144072a)));
    }

    public int hashCode() {
        return System.identityHashCode(this.f144072a);
    }

    public String toString() {
        return ReflectJavaAnnotation.class.getName() + ": " + this.f144072a;
    }
}

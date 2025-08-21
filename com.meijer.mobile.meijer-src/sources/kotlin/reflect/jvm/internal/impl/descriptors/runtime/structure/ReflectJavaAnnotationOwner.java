package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public interface ReflectJavaAnnotationOwner extends JavaAnnotationOwner {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    List<ReflectJavaAnnotation> getAnnotations();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    ReflectJavaAnnotation i(FqName fqName);

    AnnotatedElement s();
}

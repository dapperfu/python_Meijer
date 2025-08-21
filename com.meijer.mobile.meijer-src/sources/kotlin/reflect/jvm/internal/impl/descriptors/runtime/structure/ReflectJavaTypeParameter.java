package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements ReflectJavaAnnotationOwner, JavaTypeParameter {

    /* renamed from: a, reason: collision with root package name */
    private final TypeVariable<?> f145008a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation i(FqName fqName) {
        return i(fqName);
    }

    public ReflectJavaTypeParameter(TypeVariable<?> typeVariable) {
        Intrinsics.j(typeVariable, "typeVariable");
        this.f145008a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaClassifierType> getUpperBounds() {
        Type[] bounds = this.f145008a.getBounds();
        Intrinsics.i(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new ReflectJavaClassifierType(type));
        }
        ReflectJavaClassifierType reflectJavaClassifierType = (ReflectJavaClassifierType) CollectionsKt.W0(arrayList);
        return Intrinsics.e(reflectJavaClassifierType != null ? reflectJavaClassifierType.Q() : null, Object.class) ? CollectionsKt.m() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaTypeParameter) && Intrinsics.e(this.f145008a, ((ReflectJavaTypeParameter) obj).f145008a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = ReflectJavaAnnotationOwnerKt.b(declaredAnnotations)) == null) ? CollectionsKt.m() : listB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Name nameO = Name.o(this.f145008a.getName());
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    public int hashCode() {
        return this.f145008a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation i(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.j(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.a(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement s() {
        TypeVariable<?> typeVariable = this.f145008a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public String toString() {
        return ReflectJavaTypeParameter.class.getName() + ": " + this.f145008a;
    }
}

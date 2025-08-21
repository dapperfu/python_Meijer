package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    public abstract Member R();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation i(FqName fqName) {
        return i(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass P() {
        Class<?> declaringClass = R().getDeclaringClass();
        Intrinsics.i(declaringClass, "getDeclaringClass(...)");
        return new ReflectJavaClass(declaringClass);
    }

    protected final List<JavaValueParameter> S(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Intrinsics.j(parameterTypes, "parameterTypes");
        Intrinsics.j(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> listB = Java8ParameterNamesLoader.f144971a.b(R());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            ReflectJavaType reflectJavaTypeA = ReflectJavaType.f145007a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) CollectionsKt.v0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new ReflectJavaValueParameter(reflectJavaTypeA, parameterAnnotations[i10], str, z10 && i10 == ArraysKt.m0(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.e(R(), ((ReflectJavaMember) obj).R());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = ReflectJavaAnnotationOwnerKt.b(declaredAnnotations)) == null) ? CollectionsKt.m() : listB;
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

    public String toString() {
        return getClass().getName() + ": " + R();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return R().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        Name nameO;
        String name = R().getName();
        if (name != null && (nameO = Name.o(name)) != null) {
            return nameO;
        }
        return SpecialNames.f146602b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.f144567c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.f144564c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return JavaVisibilities.ProtectedStaticVisibility.f144940c;
            }
            return JavaVisibilities.ProtectedAndPackage.f144939c;
        }
        return JavaVisibilities.PackageVisibility.f144938c;
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public AnnotatedElement s() {
        Member memberR = R();
        Intrinsics.h(memberR, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberR;
    }
}

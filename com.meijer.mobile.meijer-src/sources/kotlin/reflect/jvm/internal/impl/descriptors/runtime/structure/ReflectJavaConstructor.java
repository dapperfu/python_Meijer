package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final Constructor<?> f144997a;

    public ReflectJavaConstructor(Constructor<?> member) {
        Intrinsics.j(member, "member");
        this.f144997a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Constructor<?> R() {
        return this.f144997a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = R().getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public List<JavaValueParameter> h() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        Intrinsics.g(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return CollectionsKt.m();
        }
        Class<?> declaringClass = R().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt.w(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                Intrinsics.g(parameterAnnotations);
                parameterAnnotations = (Annotation[][]) ArraysKt.w(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            Intrinsics.g(genericParameterTypes);
            Intrinsics.g(parameterAnnotations);
            return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + R());
    }
}

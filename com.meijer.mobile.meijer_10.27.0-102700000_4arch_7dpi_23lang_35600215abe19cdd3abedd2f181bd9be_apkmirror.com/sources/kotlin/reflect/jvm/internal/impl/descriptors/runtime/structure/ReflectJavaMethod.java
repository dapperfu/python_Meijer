package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ReflectJavaMethod extends ReflectJavaMember implements JavaMethod {

    /* renamed from: a, reason: collision with root package name */
    private final Method f144094a;

    public ReflectJavaMethod(Method member) {
        Intrinsics.j(member, "member");
        this.f144094a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Method R() {
        return this.f144094a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType getReturnType() {
        ReflectJavaType.Factory factory = ReflectJavaType.f144100a;
        Type genericReturnType = R().getGenericReturnType();
        Intrinsics.i(genericReturnType, "getGenericReturnType(...)");
        return factory.a(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public boolean N() {
        if (p() != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = R().getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public List<JavaValueParameter> h() {
        Type[] genericParameterTypes = R().getGenericParameterTypes();
        Intrinsics.i(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = R().getParameterAnnotations();
        Intrinsics.i(parameterAnnotations, "getParameterAnnotations(...)");
        return S(genericParameterTypes, parameterAnnotations, R().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public JavaAnnotationArgument p() {
        Object defaultValue = R().getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        return ReflectJavaAnnotationArgument.f144073b.a(defaultValue, null);
    }
}

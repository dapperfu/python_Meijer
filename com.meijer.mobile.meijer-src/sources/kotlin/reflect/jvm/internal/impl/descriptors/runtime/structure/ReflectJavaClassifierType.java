package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaClassifierType extends ReflectJavaType implements JavaClassifierType {

    /* renamed from: b, reason: collision with root package name */
    private final Type f144995b;

    /* renamed from: c, reason: collision with root package name */
    private final JavaClassifier f144996c;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation i(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return null;
    }

    public ReflectJavaClassifierType(Type reflectType) {
        JavaClassifier reflectJavaClass;
        Intrinsics.j(reflectType, "reflectType");
        this.f144995b = reflectType;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            reflectJavaClass = new ReflectJavaClass((Class) typeQ);
        } else if (typeQ instanceof TypeVariable) {
            reflectJavaClass = new ReflectJavaTypeParameter((TypeVariable) typeQ);
        } else {
            if (!(typeQ instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeQ.getClass() + "): " + typeQ);
            }
            Type rawType = ((ParameterizedType) typeQ).getRawType();
            Intrinsics.h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            reflectJavaClass = new ReflectJavaClass((Class) rawType);
        }
        this.f144996c = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String I() {
        throw new UnsupportedOperationException("Type not found: " + Q());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type Q() {
        return this.f144995b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public JavaClassifier c() {
        return this.f144996c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public List<JavaType> A() {
        List<Type> listH = ReflectClassUtilKt.h(Q());
        ReflectJavaType.Factory factory = ReflectJavaType.f145007a;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public String F() {
        return Q().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean t() {
        boolean z10;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeQ).getTypeParameters();
            Intrinsics.i(typeParameters, "getTypeParameters(...)");
            if (typeParameters.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* loaded from: classes13.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    /* renamed from: b, reason: collision with root package name */
    private final Type f144077b;

    /* renamed from: c, reason: collision with root package name */
    private final ReflectJavaType f144078c;

    /* renamed from: d, reason: collision with root package name */
    private final Collection<JavaAnnotation> f144079d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f144080e;

    public ReflectJavaArrayType(Type reflectType) {
        ReflectJavaType reflectJavaTypeA;
        Intrinsics.j(reflectType, "reflectType");
        this.f144077b = reflectType;
        Type typeQ = Q();
        if (!(typeQ instanceof GenericArrayType)) {
            if (typeQ instanceof Class) {
                Class cls = (Class) typeQ;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.f144100a;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.i(componentType, "getComponentType(...)");
                    reflectJavaTypeA = factory.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + Q().getClass() + "): " + Q());
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.f144100a;
        Type genericComponentType = ((GenericArrayType) typeQ).getGenericComponentType();
        Intrinsics.i(genericComponentType, "getGenericComponentType(...)");
        reflectJavaTypeA = factory2.a(genericComponentType);
        this.f144078c = reflectJavaTypeA;
        this.f144079d = CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean E() {
        return this.f144080e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    protected Type Q() {
        return this.f144077b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ReflectJavaType n() {
        return this.f144078c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.f144079d;
    }
}

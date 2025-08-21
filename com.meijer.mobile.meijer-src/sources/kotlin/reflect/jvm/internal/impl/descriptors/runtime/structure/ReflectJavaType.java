package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public abstract class ReflectJavaType implements JavaType {

    /* renamed from: a, reason: collision with root package name */
    public static final Factory f145007a = new Factory(null);

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final ReflectJavaType a(Type type) {
            Intrinsics.j(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new ReflectJavaArrayType(type) : type instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type) : new ReflectJavaClassifierType(type);
        }
    }

    protected abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.e(Q(), ((ReflectJavaType) obj).Q());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation i(FqName fqName) {
        Object obj;
        Intrinsics.j(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassId classIdF = ((JavaAnnotation) next).f();
            if (Intrinsics.e(classIdF != null ? classIdF.a() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (JavaAnnotation) obj;
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }

    public int hashCode() {
        return Q().hashCode();
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes13.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f144052a = new a();

    private final ClassLiteralValue a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            Intrinsics.i(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.e(cls, Void.TYPE)) {
                return new ClassLiteralValue(ClassId.f145674d.c(StandardNames.FqNames.f143378f.m()), i10);
            }
            PrimitiveType primitiveTypeO = JvmPrimitiveType.b(cls.getName()).o();
            Intrinsics.i(primitiveTypeO, "getPrimitiveType(...)");
            return i10 > 0 ? new ClassLiteralValue(ClassId.f145674d.c(primitiveTypeO.m()), i10 - 1) : new ClassLiteralValue(ClassId.f145674d.c(primitiveTypeO.p()), i10);
        }
        ClassId classIdE = ReflectClassUtilKt.e(cls);
        ClassId classIdM = JavaToKotlinClassMap.f143492a.m(classIdE.a());
        if (classIdM != null) {
            classIdE = classIdM;
        }
        return new ClassLiteralValue(classIdE, i10);
    }

    public final void b(Class<?> klass, KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        Intrinsics.j(klass, "klass");
        Intrinsics.j(visitor, "visitor");
        Iterator itA = ArrayIteratorKt.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            Intrinsics.g(annotation);
            f(visitor, annotation);
        }
        visitor.a();
    }

    public final void i(Class<?> klass, KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        Intrinsics.j(klass, "klass");
        Intrinsics.j(memberVisitor, "memberVisitor");
        e(klass, memberVisitor);
        c(klass, memberVisitor);
        d(klass, memberVisitor);
    }

    private a() {
    }

    private final void c(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor<?> constructor = (Constructor) itA.next();
            Name name = SpecialNames.f145703j;
            b bVar = b.f144053a;
            Intrinsics.g(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorB = memberVisitor.b(name, bVar.a(constructor));
            if (methodAnnotationVisitorB != null) {
                Iterator itA2 = ArrayIteratorKt.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.g(annotation);
                    f(methodAnnotationVisitorB, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.g(parameterAnnotations);
                if (parameterAnnotations.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = ArrayIteratorKt.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class<?> clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation2));
                            ClassId classIdE = ReflectClassUtilKt.e(clsB);
                            Intrinsics.g(annotation2);
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = methodAnnotationVisitorB.b(i10 + length, classIdE, new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorB != null) {
                                f144052a.h(annotationArgumentVisitorB, annotation2, clsB);
                            }
                        }
                    }
                }
                methodAnnotationVisitorB.a();
            }
        }
    }

    private final void d(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            Name nameO = Name.o(field.getName());
            Intrinsics.i(nameO, "identifier(...)");
            b bVar = b.f144053a;
            Intrinsics.g(field);
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorA = memberVisitor.a(nameO, bVar.b(field), null);
            if (annotationVisitorA != null) {
                Iterator itA2 = ArrayIteratorKt.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.g(annotation);
                    f(annotationVisitorA, annotation);
                }
                annotationVisitorA.a();
            }
        }
    }

    private final void e(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            Name nameO = Name.o(method.getName());
            Intrinsics.i(nameO, "identifier(...)");
            b bVar = b.f144053a;
            Intrinsics.g(method);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorB = memberVisitor.b(nameO, bVar.c(method));
            if (methodAnnotationVisitorB != null) {
                Iterator itA2 = ArrayIteratorKt.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.g(annotation);
                    f(methodAnnotationVisitorB, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.i(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = ArrayIteratorKt.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class<?> clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation2));
                        ClassId classIdE = ReflectClassUtilKt.e(clsB);
                        Intrinsics.g(annotation2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = methodAnnotationVisitorB.b(i10, classIdE, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorB != null) {
                            f144052a.h(annotationArgumentVisitorB, annotation2, clsB);
                        }
                    }
                }
                methodAnnotationVisitorB.a();
            }
        }
    }

    private final void f(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsB = JvmClassMappingKt.b(JvmClassMappingKt.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationVisitor.c(ReflectClassUtilKt.e(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorC != null) {
            f144052a.h(annotationArgumentVisitorC, annotation, clsB);
        }
    }

    private final void g(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.e(enclosingClass, Class.class)) {
            Intrinsics.h(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            annotationArgumentVisitor.d(name, a((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.f144045a.contains(enclosingClass)) {
            annotationArgumentVisitor.e(name, obj);
            return;
        }
        if (ReflectClassUtilKt.l(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            Intrinsics.g(enclosingClass);
            ClassId classIdE = ReflectClassUtilKt.e(enclosingClass);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Name nameO = Name.o(((Enum) obj).name());
            Intrinsics.i(nameO, "identifier(...)");
            annotationArgumentVisitor.b(name, classIdE, nameO);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            Intrinsics.i(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) ArraysKt.R0(interfaces);
            Intrinsics.g(cls);
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorC = annotationArgumentVisitor.c(name, ReflectClassUtilKt.e(cls));
            if (annotationArgumentVisitorC != null) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Annotation");
                h(annotationArgumentVisitorC, (Annotation) obj, cls);
                return;
            }
            return;
        }
        if (enclosingClass.isArray()) {
            KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorF = annotationArgumentVisitor.f(name);
            if (annotationArrayArgumentVisitorF == null) {
                return;
            }
            Class<?> componentType = enclosingClass.getComponentType();
            int i10 = 0;
            if (componentType.isEnum()) {
                Intrinsics.g(componentType);
                ClassId classIdE2 = ReflectClassUtilKt.e(componentType);
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i10 < length) {
                    Object obj2 = objArr[i10];
                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    Name nameO2 = Name.o(((Enum) obj2).name());
                    Intrinsics.i(nameO2, "identifier(...)");
                    annotationArrayArgumentVisitorF.d(classIdE2, nameO2);
                    i10++;
                }
            } else if (Intrinsics.e(componentType, Class.class)) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i10 < length2) {
                    Object obj3 = objArr2[i10];
                    Intrinsics.h(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                    annotationArrayArgumentVisitorF.e(a((Class) obj3));
                    i10++;
                }
            } else if (Annotation.class.isAssignableFrom(componentType)) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr3 = (Object[]) obj;
                int length3 = objArr3.length;
                while (i10 < length3) {
                    Object obj4 = objArr3[i10];
                    Intrinsics.g(componentType);
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorB = annotationArrayArgumentVisitorF.b(ReflectClassUtilKt.e(componentType));
                    if (annotationArgumentVisitorB != null) {
                        Intrinsics.h(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                        h(annotationArgumentVisitorB, (Annotation) obj4, componentType);
                    }
                    i10++;
                }
            } else {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr4 = (Object[]) obj;
                int length4 = objArr4.length;
                while (i10 < length4) {
                    annotationArrayArgumentVisitorF.c(objArr4[i10]);
                    i10++;
                }
            }
            annotationArrayArgumentVisitorF.a();
            return;
        }
        throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
    }

    private final void h(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator itA = ArrayIteratorKt.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.g(objInvoke);
                Name nameO = Name.o(method.getName());
                Intrinsics.i(nameO, "identifier(...)");
                g(annotationArgumentVisitor, nameO, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.a();
    }
}

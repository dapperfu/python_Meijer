package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class JavaAnnotationMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaAnnotationMapper f145235a = new JavaAnnotationMapper();

    /* renamed from: b, reason: collision with root package name */
    private static final Name f145236b;

    /* renamed from: c, reason: collision with root package name */
    private static final Name f145237c;

    /* renamed from: d, reason: collision with root package name */
    private static final Name f145238d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<FqName, FqName> f145239e;

    static {
        Name nameO = Name.o("message");
        Intrinsics.i(nameO, "identifier(...)");
        f145236b = nameO;
        Name nameO2 = Name.o("allowedTargets");
        Intrinsics.i(nameO2, "identifier(...)");
        f145237c = nameO2;
        Name nameO3 = Name.o("value");
        Intrinsics.i(nameO3, "identifier(...)");
        f145238d = nameO3;
        f145239e = MapsKt.o(TuplesKt.a(StandardNames.FqNames.f144241H, JvmAnnotationNames.f145131d), TuplesKt.a(StandardNames.FqNames.f144249L, JvmAnnotationNames.f145133f), TuplesKt.a(StandardNames.FqNames.f144257P, JvmAnnotationNames.f145136i));
    }

    public static /* synthetic */ AnnotationDescriptor f(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return javaAnnotationMapper.e(javaAnnotation, lazyJavaResolverContext, z10);
    }

    public final AnnotationDescriptor a(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c10) {
        JavaAnnotation javaAnnotationI;
        Intrinsics.j(kotlinName, "kotlinName");
        Intrinsics.j(annotationOwner, "annotationOwner");
        Intrinsics.j(c10, "c");
        if (Intrinsics.e(kotlinName, StandardNames.FqNames.f144323y)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.f145135h;
            Intrinsics.i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationI2 = annotationOwner.i(DEPRECATED_ANNOTATION);
            if (javaAnnotationI2 != null || annotationOwner.E()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationI2, c10);
            }
        }
        FqName fqName = f145239e.get(kotlinName);
        if (fqName == null || (javaAnnotationI = annotationOwner.i(fqName)) == null) {
            return null;
        }
        return f(f145235a, javaAnnotationI, c10, false, 4, null);
    }

    public final Name b() {
        return f145236b;
    }

    public final Name c() {
        return f145238d;
    }

    public final Name d() {
        return f145237c;
    }

    public final AnnotationDescriptor e(JavaAnnotation annotation, LazyJavaResolverContext c10, boolean z10) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(c10, "c");
        ClassId classIdF = annotation.f();
        ClassId.Companion companion = ClassId.f146581d;
        FqName TARGET_ANNOTATION = JvmAnnotationNames.f145131d;
        Intrinsics.i(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c10);
        }
        FqName RETENTION_ANNOTATION = JvmAnnotationNames.f145133f;
        Intrinsics.i(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c10);
        }
        FqName DOCUMENTED_ANNOTATION = JvmAnnotationNames.f145136i;
        Intrinsics.i(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c10, annotation, StandardNames.FqNames.f144257P);
        }
        FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.f145135h;
        Intrinsics.i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c10, annotation, z10);
    }

    private JavaAnnotationMapper() {
    }
}

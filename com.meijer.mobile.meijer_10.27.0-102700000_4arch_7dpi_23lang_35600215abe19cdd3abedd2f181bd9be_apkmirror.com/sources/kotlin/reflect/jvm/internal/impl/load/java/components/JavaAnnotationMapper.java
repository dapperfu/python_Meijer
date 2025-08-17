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

/* loaded from: classes13.dex */
public final class JavaAnnotationMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaAnnotationMapper f144328a = new JavaAnnotationMapper();

    /* renamed from: b, reason: collision with root package name */
    private static final Name f144329b;

    /* renamed from: c, reason: collision with root package name */
    private static final Name f144330c;

    /* renamed from: d, reason: collision with root package name */
    private static final Name f144331d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<FqName, FqName> f144332e;

    static {
        Name nameO = Name.o("message");
        Intrinsics.i(nameO, "identifier(...)");
        f144329b = nameO;
        Name nameO2 = Name.o("allowedTargets");
        Intrinsics.i(nameO2, "identifier(...)");
        f144330c = nameO2;
        Name nameO3 = Name.o("value");
        Intrinsics.i(nameO3, "identifier(...)");
        f144331d = nameO3;
        f144332e = MapsKt.o(TuplesKt.a(StandardNames.FqNames.f143334H, JvmAnnotationNames.f144224d), TuplesKt.a(StandardNames.FqNames.f143342L, JvmAnnotationNames.f144226f), TuplesKt.a(StandardNames.FqNames.f143350P, JvmAnnotationNames.f144229i));
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
        if (Intrinsics.e(kotlinName, StandardNames.FqNames.f143416y)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.f144228h;
            Intrinsics.i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationI2 = annotationOwner.i(DEPRECATED_ANNOTATION);
            if (javaAnnotationI2 != null || annotationOwner.E()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationI2, c10);
            }
        }
        FqName fqName = f144332e.get(kotlinName);
        if (fqName == null || (javaAnnotationI = annotationOwner.i(fqName)) == null) {
            return null;
        }
        return f(f144328a, javaAnnotationI, c10, false, 4, null);
    }

    public final Name b() {
        return f144329b;
    }

    public final Name c() {
        return f144331d;
    }

    public final Name d() {
        return f144330c;
    }

    public final AnnotationDescriptor e(JavaAnnotation annotation, LazyJavaResolverContext c10, boolean z10) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(c10, "c");
        ClassId classIdF = annotation.f();
        ClassId.Companion companion = ClassId.f145674d;
        FqName TARGET_ANNOTATION = JvmAnnotationNames.f144224d;
        Intrinsics.i(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c10);
        }
        FqName RETENTION_ANNOTATION = JvmAnnotationNames.f144226f;
        Intrinsics.i(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c10);
        }
        FqName DOCUMENTED_ANNOTATION = JvmAnnotationNames.f144229i;
        Intrinsics.i(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c10, annotation, StandardNames.FqNames.f143350P);
        }
        FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.f144228h;
        Intrinsics.i(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (Intrinsics.e(classIdF, companion.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c10, annotation, z10);
    }

    private JavaAnnotationMapper() {
    }
}

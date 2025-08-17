package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SpecialJvmAnnotations {

    /* renamed from: a, reason: collision with root package name */
    public static final SpecialJvmAnnotations f143229a = new SpecialJvmAnnotations();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<ClassId> f143230b;

    /* renamed from: c, reason: collision with root package name */
    private static final ClassId f143231c;

    static {
        List listP = CollectionsKt.p(JvmAnnotationNames.f144221a, JvmAnnotationNames.f144232l, JvmAnnotationNames.f144233m, JvmAnnotationNames.f144224d, JvmAnnotationNames.f144226f, JvmAnnotationNames.f144229i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.f145674d;
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.c((FqName) it.next()));
        }
        f143230b = linkedHashSet;
        ClassId.Companion companion2 = ClassId.f145674d;
        FqName REPEATABLE_ANNOTATION = JvmAnnotationNames.f144230j;
        Intrinsics.i(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f143231c = companion2.c(REPEATABLE_ANNOTATION);
    }

    public final ClassId a() {
        return f143231c;
    }

    public final Set<ClassId> b() {
        return f143230b;
    }

    public final boolean c(KotlinJvmBinaryClass klass) {
        Intrinsics.j(klass, "klass");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        klass.c(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId, SourceElement source) {
                Intrinsics.j(classId, "classId");
                Intrinsics.j(source, "source");
                if (!Intrinsics.e(classId, JvmAbi.f144216a.a())) {
                    return null;
                }
                booleanRef.f142828a = true;
                return null;
            }
        }, null);
        return booleanRef.f142828a;
    }

    private SpecialJvmAnnotations() {
    }
}

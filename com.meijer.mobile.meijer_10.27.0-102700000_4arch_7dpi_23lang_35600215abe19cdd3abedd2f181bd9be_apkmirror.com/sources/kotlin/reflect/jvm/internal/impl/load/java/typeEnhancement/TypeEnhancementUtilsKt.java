package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeEnhancementUtilsKt {
    public static final JavaTypeQualifiers a(JavaTypeQualifiers javaTypeQualifiers, Collection<JavaTypeQualifiers> superQualifiers, boolean z10, boolean z11, boolean z12) {
        NullabilityQualifier nullabilityQualifierF;
        Intrinsics.j(javaTypeQualifiers, "<this>");
        Intrinsics.j(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierB = b((JavaTypeQualifiers) it.next());
            if (nullabilityQualifierB != null) {
                arrayList.add(nullabilityQualifierB);
            }
        }
        NullabilityQualifier nullabilityQualifierF2 = f(CollectionsKt.o1(arrayList), b(javaTypeQualifiers), z10);
        if (nullabilityQualifierF2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierF3 = ((JavaTypeQualifiers) it2.next()).f();
                if (nullabilityQualifierF3 != null) {
                    arrayList2.add(nullabilityQualifierF3);
                }
            }
            nullabilityQualifierF = f(CollectionsKt.o1(arrayList2), javaTypeQualifiers.f(), z10);
        } else {
            nullabilityQualifierF = nullabilityQualifierF2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierE = ((JavaTypeQualifiers) it3.next()).e();
            if (mutabilityQualifierE != null) {
                arrayList3.add(mutabilityQualifierE);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) e(CollectionsKt.o1(arrayList3), MutabilityQualifier.f144646b, MutabilityQualifier.f144645a, javaTypeQualifiers.e(), z10);
        if (nullabilityQualifierF == null || z12 || (z11 && nullabilityQualifierF == NullabilityQualifier.f144652b)) {
            nullabilityQualifierF = null;
        }
        boolean z13 = false;
        boolean z14 = nullabilityQualifierF != null && nullabilityQualifierF2 == null;
        if (nullabilityQualifierF == NullabilityQualifier.f144653c) {
            if (d(javaTypeQualifiers, z14)) {
                z13 = true;
                break;
            }
            if (!collection.isEmpty()) {
                Iterator<T> it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (d((JavaTypeQualifiers) it4.next(), z14)) {
                        z13 = true;
                        break;
                    }
                }
            }
        }
        return new JavaTypeQualifiers(nullabilityQualifierF, mutabilityQualifier, z13, z14);
    }

    public static final boolean c(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type) {
        Intrinsics.j(typeSystemCommonBackendContext, "<this>");
        Intrinsics.j(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f144242v;
        Intrinsics.i(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.C0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final <T> T e(Set<? extends T> set, T t10, T t11, T t12, boolean z10) {
        Set<? extends T> setO1;
        if (!z10) {
            if (t12 != null && (setO1 = CollectionsKt.o1(SetsKt.m(set, t12))) != null) {
                set = setO1;
            }
            return (T) CollectionsKt.V0(set);
        }
        T t13 = set.contains(t10) ? t10 : set.contains(t11) ? t11 : null;
        if (Intrinsics.e(t13, t10) && Intrinsics.e(t12, t11)) {
            return null;
        }
        return t12 == null ? t13 : t12;
    }

    private static final NullabilityQualifier f(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z10) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.f144651a;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) e(set, NullabilityQualifier.f144653c, NullabilityQualifier.f144652b, nullabilityQualifier, z10);
    }

    private static final NullabilityQualifier b(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.g()) {
            return null;
        }
        return javaTypeQualifiers.f();
    }

    private static final boolean d(JavaTypeQualifiers javaTypeQualifiers, boolean z10) {
        if (javaTypeQualifiers.g() == z10 && javaTypeQualifiers.d()) {
            return true;
        }
        return false;
    }
}

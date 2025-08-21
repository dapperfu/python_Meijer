package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaAnnotationOwnerKt {
    public static final ReflectJavaAnnotation a(Annotation[] annotationArr, FqName fqName) {
        Annotation annotation;
        Intrinsics.j(annotationArr, "<this>");
        Intrinsics.j(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (Intrinsics.e(ReflectClassUtilKt.e(JvmClassMappingKt.b(JvmClassMappingKt.a(annotation))).a(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new ReflectJavaAnnotation(annotation);
        }
        return null;
    }

    public static final List<ReflectJavaAnnotation> b(Annotation[] annotationArr) {
        Intrinsics.j(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }
}

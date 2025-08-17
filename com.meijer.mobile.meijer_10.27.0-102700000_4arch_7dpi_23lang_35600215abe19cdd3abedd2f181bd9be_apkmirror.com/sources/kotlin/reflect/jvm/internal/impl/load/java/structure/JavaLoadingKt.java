package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public final class JavaLoadingKt {
    public static final boolean c(JavaMember javaMember) {
        Intrinsics.j(javaMember, "<this>");
        return javaMember.P().K() && (javaMember instanceof JavaMethod) && b((JavaMethod) javaMember);
    }

    private static final boolean a(JavaMethod javaMethod) {
        JavaType type;
        FqName fqNameE;
        JavaValueParameter javaValueParameter = (JavaValueParameter) CollectionsKt.W0(javaMethod.h());
        JavaClassifierType javaClassifierType = null;
        if (javaValueParameter != null) {
            type = javaValueParameter.getType();
        } else {
            type = null;
        }
        if (type instanceof JavaClassifierType) {
            javaClassifierType = (JavaClassifierType) type;
        }
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier javaClassifierC = javaClassifierType.c();
        if (!(javaClassifierC instanceof JavaClass) || (fqNameE = ((JavaClass) javaClassifierC).e()) == null || !Intrinsics.e(fqNameE.a(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    private static final boolean b(JavaMethod javaMethod) {
        String strB = javaMethod.getName().b();
        int iHashCode = strB.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode != -1295482945) {
                if (iHashCode != 147696667 || !strB.equals("hashCode")) {
                    return false;
                }
            } else {
                if (strB.equals("equals")) {
                    return a(javaMethod);
                }
                return false;
            }
        } else if (!strB.equals("toString")) {
            return false;
        }
        return javaMethod.h().isEmpty();
    }
}

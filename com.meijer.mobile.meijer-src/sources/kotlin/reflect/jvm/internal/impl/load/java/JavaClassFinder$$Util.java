package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public /* synthetic */ class JavaClassFinder$$Util {
    public static /* synthetic */ JavaPackage a(JavaClassFinder javaClassFinder, FqName fqName, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return javaClassFinder.b(fqName, z10);
    }
}

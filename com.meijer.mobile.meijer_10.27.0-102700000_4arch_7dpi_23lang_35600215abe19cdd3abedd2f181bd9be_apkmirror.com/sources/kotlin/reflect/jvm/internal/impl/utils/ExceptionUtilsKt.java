package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ExceptionUtilsKt {
    public static final boolean a(Throwable th2) {
        Intrinsics.j(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!Intrinsics.e(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException b(Throwable e10) throws Throwable {
        Intrinsics.j(e10, "e");
        throw e10;
    }
}

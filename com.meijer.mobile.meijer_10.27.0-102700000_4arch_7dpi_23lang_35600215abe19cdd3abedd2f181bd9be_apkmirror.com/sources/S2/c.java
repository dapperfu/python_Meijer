package S2;

import androidx.compose.runtime.F0;
import androidx.compose.runtime.r;
import androidx.view.InterfaceC6030s;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/F0;", "Landroidx/lifecycle/s;", "a", "Landroidx/compose/runtime/F0;", "c", "()Landroidx/compose/runtime/F0;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<InterfaceC6030s> f33151a;

    static {
        Object objB;
        F0 f02;
        try {
            Result.Companion companion = Result.INSTANCE;
            ClassLoader classLoader = InterfaceC6030s.class.getClassLoader();
            Intrinsics.g(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof F0) {
                        f02 = (F0) objInvoke;
                    }
                } else if (annotations[i10] instanceof Deprecated) {
                    break;
                } else {
                    i10++;
                }
            }
            f02 = null;
            objB = Result.b(f02);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        F0<InterfaceC6030s> f0F = (F0) (Result.g(objB) ? null : objB);
        if (f0F == null) {
            f0F = r.f(new Function0() { // from class: S2.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.b();
                }
            });
        }
        f33151a = f0F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6030s b() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static final F0<InterfaceC6030s> c() {
        return f33151a;
    }
}

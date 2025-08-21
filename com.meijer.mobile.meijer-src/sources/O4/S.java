package O4;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LO4/S;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/c;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class S {
    public abstract androidx.work.c a(Context appContext, String workerClassName, WorkerParameters workerParameters);

    public final androidx.work.c b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(workerClassName, "workerClassName");
        Intrinsics.j(workerParameters, "workerParameters");
        androidx.work.c cVarA = a(appContext, workerClassName, workerParameters);
        if (cVarA == null) {
            cVarA = c(appContext, workerClassName, workerParameters);
        }
        if (!cVarA.isUsed()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    private static final androidx.work.c c(Context context, String str, WorkerParameters workerParameters) {
        try {
            androidx.work.c cVarNewInstance = d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.i(cVarNewInstance, "{\n                val co…Parameters)\n            }");
            return cVarNewInstance;
        } catch (Throwable th2) {
            AbstractC4373v.e().d(T.f23141a, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    private static final Class<? extends androidx.work.c> d(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(androidx.work.c.class);
            Intrinsics.i(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            return clsAsSubclass;
        } catch (Throwable th2) {
            AbstractC4373v.e().d(T.f23141a, "Invalid class: " + str, th2);
            throw th2;
        }
    }
}

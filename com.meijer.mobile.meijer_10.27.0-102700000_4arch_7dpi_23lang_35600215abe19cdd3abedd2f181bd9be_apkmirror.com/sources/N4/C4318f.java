package N4;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LN4/f;", "LN4/S;", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "e", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ljava/lang/Void;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4318f extends S {

    /* renamed from: a, reason: collision with root package name */
    public static final C4318f f21403a = new C4318f();

    public Void e(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(workerClassName, "workerClassName");
        Intrinsics.j(workerParameters, "workerParameters");
        return null;
    }

    private C4318f() {
    }

    @Override // N4.S
    public /* bridge */ /* synthetic */ androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        return (androidx.work.c) e(context, str, workerParameters);
    }
}

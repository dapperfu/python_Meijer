package R6;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LR6/b;", "LR6/c;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "ctx", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context ctx;

    /* renamed from: d, reason: from getter */
    public final Context getCtx() {
        return this.ctx;
    }

    public b(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
            Intrinsics.f(context, "appContext.applicationContext");
        }
        this.ctx = context;
    }
}

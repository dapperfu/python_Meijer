package S6;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LS6/c;", "LS6/a;", "Landroid/content/Context;", "appContext", "LR6/b;", "bgTaskService", "<init>", "(Landroid/content/Context;LR6/b;)V", "c", "Landroid/content/Context;", "a", "()Landroid/content/Context;", "ctx", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context ctx;

    public c(Context context, R6.b bVar) {
        super(bVar, null, 2, null);
        this.ctx = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    /* renamed from: a, reason: from getter */
    public final Context getCtx() {
        return this.ctx;
    }
}

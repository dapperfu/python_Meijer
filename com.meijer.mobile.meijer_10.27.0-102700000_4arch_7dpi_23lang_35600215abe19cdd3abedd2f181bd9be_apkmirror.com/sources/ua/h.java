package ua;

import G9.o;
import I9.e;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lua/h;", "Ljava/lang/Runnable;", "Landroid/content/Intent;", "intent", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Intent;Landroid/content/Context;)V", "", "run", "()V", "a", "Landroid/content/Intent;", "b", "()Landroid/content/Intent;", "Landroid/content/Context;", "()Landroid/content/Context;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class h implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Intent intent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public h(Intent intent, Context context) {
        Intrinsics.j(intent, "intent");
        Intrinsics.j(context, "context");
        this.intent = intent;
        this.context = context;
    }

    /* renamed from: a, reason: from getter */
    public Context getContext() {
        return this.context;
    }

    /* renamed from: b, reason: from getter */
    public Intent getIntent() {
        return this.intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            getContext().startActivity(getIntent());
        } catch (Exception e10) {
            e.Companion companion = I9.e.INSTANCE;
            String strA = o.a();
            Intrinsics.i(strA, "getCallerMethodName(...)");
            e.Companion.b(companion, new J9.k(h.class, strA, MapsKt.o(TuplesKt.a("intent", getIntent()), TuplesKt.a("exception", e10)), null, 8, null), false, 2, null);
        }
    }
}

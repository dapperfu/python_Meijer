package ua;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import za.C18409e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lua/f;", "Ljava/lang/Runnable;", "Landroid/content/Intent;", "intent", "Landroid/content/Context;", "context", "Lta/c;", "launchActivityCommandLifecycleCallbacksFactory", "<init>", "(Landroid/content/Intent;Landroid/content/Context;Lta/c;)V", "", "run", "()V", "a", "Landroid/content/Intent;", "b", "Landroid/content/Context;", "c", "Lta/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Intent intent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ta.c launchActivityCommandLifecycleCallbacksFactory;

    public f(Intent intent, Context context, ta.c launchActivityCommandLifecycleCallbacksFactory) {
        Intrinsics.j(intent, "intent");
        Intrinsics.j(context, "context");
        Intrinsics.j(launchActivityCommandLifecycleCallbacksFactory, "launchActivityCommandLifecycleCallbacksFactory");
        this.intent = intent;
        this.context = context;
        this.launchActivityCommandLifecycleCallbacksFactory = launchActivityCommandLifecycleCallbacksFactory;
    }

    @Override // java.lang.Runnable
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksA = this.launchActivityCommandLifecycleCallbacksFactory.a(countDownLatch);
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(activityLifecycleCallbacksA);
        PendingIntent pendingIntentA = C18409e.a(this.intent, this.context);
        if (pendingIntentA != null) {
            try {
                pendingIntentA.send();
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (PendingIntent.CanceledException e10) {
                I9.e.INSTANCE.c(new J9.b(e10, null));
                Unit unit = Unit.f142422a;
            } catch (InterruptedException e11) {
                I9.e.INSTANCE.c(new J9.b(e11, null));
                Unit unit2 = Unit.f142422a;
            } catch (Throwable th2) {
                I9.e.INSTANCE.c(new J9.b(th2, null));
                Unit unit3 = Unit.f142422a;
            }
        }
        Context applicationContext2 = this.context.getApplicationContext();
        Intrinsics.h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacksA);
    }
}

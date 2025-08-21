package Gh;

import Kk.AppVersion;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yo.C18335a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, d2 = {"LGh/b;", "", "Lyo/a;", "appPrefManager", "LKk/a;", "appVersion", "<init>", "(Lyo/a;LKk/a;)V", "", "g", "()Z", "", "a", "()V", "enabled", "authenticated", "d", "(ZZ)V", "", "nowTimeMillis", "e", "(J)Z", "timeInMillis", "b", "(J)V", "Lyo/a;", "J", "minTimeToPromptNotificationRationale", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long minTimeToPromptNotificationRationale;

    public b(C18335a appPrefManager, AppVersion appVersion) {
        TimeUnit timeUnit;
        long j10;
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(appVersion, "appVersion");
        this.appPrefManager = appPrefManager;
        if (appVersion.getIsDevMode()) {
            timeUnit = TimeUnit.MINUTES;
            j10 = 2;
        } else {
            timeUnit = TimeUnit.DAYS;
            j10 = 7;
        }
        this.minTimeToPromptNotificationRationale = timeUnit.toMillis(j10);
    }

    public static /* synthetic */ void c(b bVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        bVar.b(j10);
    }

    public static /* synthetic */ boolean f(b bVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return bVar.e(j10);
    }

    public final void a() {
        this.appPrefManager.t();
    }

    public final void b(long timeInMillis) {
        this.appPrefManager.x(timeInMillis);
    }

    public final void d(boolean enabled, boolean authenticated) {
        qw.a.INSTANCE.a("updating state of push notifications: enabled=%s", Boolean.valueOf(enabled));
        this.appPrefManager.I(enabled);
        if (authenticated) {
            return;
        }
        this.appPrefManager.v(enabled);
    }

    public final boolean e(long nowTimeMillis) {
        return this.appPrefManager.f() + this.minTimeToPromptNotificationRationale < nowTimeMillis;
    }

    public final boolean g() {
        return !this.appPrefManager.Q();
    }
}

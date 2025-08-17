package yl;

import Jk.AppVersion;
import android.os.Build;
import com.meijer.mobile.core.GetMMAConfigResponse;
import com.meijer.mobile.core.MMAConfigVersionInfo;
import com.squareup.moshi.t;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tk.c;
import vj.C17589b;
import yl.AbstractC18227f;
import yo.C18264a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J>\u0010-\u001a\u00020\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0'2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0)¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0014\u00106\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00105R\u0014\u00107\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R8\u0010>\u001a&\u0012\f\u0012\n <*\u0004\u0018\u00010\u00120\u0012 <*\u0012\u0012\f\u0012\n <*\u0004\u0018\u00010\u00120\u0012\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010=¨\u0006?"}, d2 = {"Lyl/b;", "", "Lyl/k;", "featureManager", "Lyo/a;", "appPrefManager", "Lyo/k;", "userManager", "LJk/a;", "appVersion", "<init>", "(Lyl/k;Lyo/a;Lyo/k;LJk/a;)V", "Lvj/b;", "config", "", "k", "(Lvj/b;)V", "Ltk/c;", "Lcom/meijer/mobile/core/GetMMAConfigResponse;", "b", "()Ltk/c;", "j$/time/Instant", "d", "()Lj$/time/Instant;", "", "g", "()Z", "lastCheckDate", "f", "(Lj$/time/Instant;)Z", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "versionToCheck", "e", "(Lcom/meijer/mobile/core/MMAConfigVersionInfo;)Z", "", "lastShownTime", "now", "i", "(JLj$/time/Instant;)Z", "Lkotlin/Function0;", "showSimpleOkAlert", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "sendUpdateNotification", "h", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "a", "Lyl/k;", "Lyo/a;", "c", "Lyo/k;", "LJk/a;", "J", "lastCheckMinuteThreshold", "minTimeForAppVersionCheck", "", "Ljava/lang/String;", "fetchErrorLogMessage", "Lcom/squareup/moshi/h;", "kotlin.jvm.PlatformType", "Lcom/squareup/moshi/h;", "moshiBuilder", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yl.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18223b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18264a appPrefManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long lastCheckMinuteThreshold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long minTimeForAppVersionCheck;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String fetchErrorLogMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.moshi.h<GetMMAConfigResponse> moshiBuilder;

    private final boolean e(MMAConfigVersionInfo versionToCheck) {
        if (versionToCheck == null) {
            return false;
        }
        int versionCode = (this.appVersion.getVersionCode() / 1000) * 1000;
        int i10 = Build.VERSION.SDK_INT;
        int iE = versionToCheck.e();
        uw.a.INSTANCE.k("Local Version Code = " + versionCode + " \nConfig Version Code = " + iE, new Object[0]);
        return versionCode < iE && versionToCheck.getMinSdk() <= i10;
    }

    public C18223b(k featureManager, C18264a appPrefManager, yo.k userManager, AppVersion appVersion) {
        TimeUnit timeUnit;
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(appVersion, "appVersion");
        this.featureManager = featureManager;
        this.appPrefManager = appPrefManager;
        this.userManager = userManager;
        this.appVersion = appVersion;
        long j10 = 1;
        this.lastCheckMinuteThreshold = appVersion.getIsDevMode() ? 1L : 30L;
        if (appVersion.getIsDevMode()) {
            timeUnit = TimeUnit.MINUTES;
            j10 = 2;
        } else {
            timeUnit = TimeUnit.DAYS;
        }
        this.minTimeForAppVersionCheck = timeUnit.toMillis(j10);
        this.fetchErrorLogMessage = "Unable to fetch app update config with key " + AbstractC18227f.v0.f170609h.getRemoteId() + " from launch darkly";
        this.moshiBuilder = new t.a().d().c(GetMMAConfigResponse.class);
    }

    private final tk.c<GetMMAConfigResponse> b() {
        return c.Companion.c(tk.c.INSTANCE, null, null, new Function0() { // from class: yl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C18223b.c(this.f170522a);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetMMAConfigResponse c(C18223b c18223b) throws Exception {
        GetMMAConfigResponse getMMAConfigResponseFromJson = c18223b.moshiBuilder.fromJson(c18223b.featureManager.b(AbstractC18227f.v0.f170609h).y());
        if (getMMAConfigResponseFromJson != null) {
            return getMMAConfigResponseFromJson;
        }
        throw new Exception(c18223b.fetchErrorLogMessage);
    }

    private final Instant d() {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.appPrefManager.e());
        Intrinsics.i(instantOfEpochMilli, "ofEpochMilli(...)");
        return instantOfEpochMilli;
    }

    private final boolean g() {
        return this.appPrefManager.s() || f(d());
    }

    private final boolean i(long lastShownTime, Instant now) {
        return lastShownTime + this.minTimeForAppVersionCheck < now.toEpochMilli();
    }

    static /* synthetic */ boolean j(C18223b c18223b, long j10, Instant instant, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            instant = Instant.now();
        }
        return c18223b.i(j10, instant);
    }

    private final void k(C17589b config) {
        this.appPrefManager.O(config.getEnableRatingsPrompt(), config.getPercentChanceOfLoggingRatingsPromptEvent(), config.getRatingsPromptClippedCouponsCount());
        this.appPrefManager.P(e(config.getCurrentAppVersion()), Instant.now().toEpochMilli());
    }

    public final void h(Function0<Unit> showSimpleOkAlert, Function1<? super C17589b, Unit> sendUpdateNotification) {
        Intrinsics.j(showSimpleOkAlert, "showSimpleOkAlert");
        Intrinsics.j(sendUpdateNotification, "sendUpdateNotification");
        if (g()) {
            tk.c<GetMMAConfigResponse> cVarB = b();
            if (!(cVarB instanceof c.Success)) {
                if (cVarB instanceof c.Failure) {
                    uw.a.INSTANCE.f(((c.Failure) cVarB).getError(), "Unable to get MMA config info for version checking purposes", new Object[0]);
                    return;
                } else {
                    if (!(cVarB instanceof c.Loading)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            GetMMAConfigResponse getMMAConfigResponse = (GetMMAConfigResponse) ((c.Success) cVarB).a();
            C17589b c17589bK = getMMAConfigResponse != null ? getMMAConfigResponse.k() : null;
            if (c17589bK == null) {
                uw.a.INSTANCE.f(new IllegalStateException(this.fetchErrorLogMessage), "Unable to get MMA config info for version checking purposes", new Object[0]);
                return;
            }
            k(c17589bK);
            if (e(c17589bK.getCurrentAppVersion())) {
                if (e(c17589bK.getForceAppUpdateVersion())) {
                    showSimpleOkAlert.invoke();
                } else if (j(this, this.userManager.C(), null, 2, null)) {
                    sendUpdateNotification.invoke(c17589bK);
                }
            }
        }
    }

    private final boolean f(Instant lastCheckDate) {
        if (Duration.between(Instant.ofEpochMilli(lastCheckDate.toEpochMilli()), Instant.now()).toMinutes() > this.lastCheckMinuteThreshold) {
            return true;
        }
        return false;
    }
}

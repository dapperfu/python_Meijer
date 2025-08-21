package zl;

import Kk.AppVersion;
import com.launchdarkly.sdk.android.c0;
import com.meijer.mobile.featureflag.env.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzl/l;", "", "<init>", "()V", "LKk/a;", "appVersion", "Lcom/launchdarkly/sdk/android/c0;", "a", "(LKk/a;)Lcom/launchdarkly/sdk/android/c0;", "featureflag-env_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f172925a = new l();

    public final c0 a(AppVersion appVersion) {
        Intrinsics.j(appVersion, "appVersion");
        c0 c0VarA = new c0.a(c0.a.EnumC1311a.Enabled).e(BuildConfig.LAUNCH_DARKLY_API_KEY).c(appVersion.getIsDevMode()).d(true).a();
        Intrinsics.i(c0VarA, "build(...)");
        return c0VarA;
    }

    private l() {
    }
}

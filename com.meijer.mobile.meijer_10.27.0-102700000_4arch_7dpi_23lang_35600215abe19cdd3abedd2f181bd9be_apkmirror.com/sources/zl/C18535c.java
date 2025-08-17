package zl;

import Jk.AppVersion;
import Tq.j;
import android.app.Application;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.a0;
import com.launchdarkly.sdk.android.b0;
import com.launchdarkly.sdk.android.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yo.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzl/c;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/launchdarkly/sdk/android/c0;", "configuration", "Lcom/launchdarkly/sdk/LDContext;", "ldContext", "Lcom/launchdarkly/sdk/android/b0;", "a", "(Landroid/app/Application;Lcom/launchdarkly/sdk/android/c0;Lcom/launchdarkly/sdk/LDContext;)Lcom/launchdarkly/sdk/android/b0;", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "LJk/a;", "appVersion", "b", "(Lyo/k;LTq/j;LJk/a;)Lcom/launchdarkly/sdk/LDContext;", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zl.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18535c {

    /* renamed from: a, reason: collision with root package name */
    public static final C18535c f172835a = new C18535c();

    public final b0 a(Application application, c0 configuration, LDContext ldContext) {
        Intrinsics.j(application, "application");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(ldContext, "ldContext");
        a0 a0VarM = a0.m(application, configuration, ldContext, 0);
        Intrinsics.i(a0VarM, "init(...)");
        return a0VarM;
    }

    public final LDContext b(k userManager, j storeProvider, AppVersion appVersion) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(appVersion, "appVersion");
        return C18534b.b(userManager.D(), "Android", appVersion.getVersionName(), String.valueOf(appVersion.getVersionCode()), Integer.valueOf(storeProvider.g()));
    }

    private C18535c() {
    }
}

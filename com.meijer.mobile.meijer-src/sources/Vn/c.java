package Vn;

import Kk.AppVersion;
import Q8.EmarsysConfig;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LVn/c;", "", "<init>", "()V", "LQ8/h;", "emarsysConfig", "LN8/d;", "a", "(LQ8/h;)LN8/d;", "Landroid/app/Application;", "application", "", "applicationCode", "LKk/a;", "appVersion", "b", "(Landroid/app/Application;Ljava/lang/String;LKk/a;)LQ8/h;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f40101a = new c();

    public final N8.d a(EmarsysConfig emarsysConfig) throws IllegalArgumentException {
        Intrinsics.j(emarsysConfig, "emarsysConfig");
        N8.d dVar = N8.d.f20726a;
        N8.d.p(emarsysConfig);
        return dVar;
    }

    public final EmarsysConfig b(Application application, String applicationCode, AppVersion appVersion) {
        Intrinsics.j(application, "application");
        Intrinsics.j(applicationCode, "applicationCode");
        Intrinsics.j(appVersion, "appVersion");
        return new EmarsysConfig(application, applicationCode, null, null, false, null, null, appVersion.getIsDevMode() || appVersion.getIsDebug(), 108, null);
    }

    private c() {
    }
}

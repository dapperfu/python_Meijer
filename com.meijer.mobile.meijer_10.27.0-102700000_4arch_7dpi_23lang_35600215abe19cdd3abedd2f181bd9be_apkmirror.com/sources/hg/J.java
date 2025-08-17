package hg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.sessions.BuildConfig;
import ig.InterfaceC14721c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lhg/J;", "", "<init>", "()V", "Lig/c;", "subscriber", "Lhg/d;", "d", "(Lig/c;)Lhg/d;", "Lcom/google/firebase/f;", "firebaseApp", "Lhg/H;", "sessionDetails", "Lkg/j;", "sessionsSettings", "", "Lig/c$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Lhg/I;", "a", "(Lcom/google/firebase/f;Lhg/H;Lkg/j;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lhg/I;", "Lhg/b;", "b", "(Lcom/google/firebase/f;)Lhg/b;", "LBf/a;", "LBf/a;", "c", "()LBf/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f134751a = new J();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bf.a SESSION_EVENT_ENCODER;

    static {
        Bf.a aVarI = new Df.d().j(C14431c.f134857a).k(true).i();
        Intrinsics.i(aVarI, "build(...)");
        SESSION_EVENT_ENCODER = aVarI;
    }

    private final EnumC14432d d(InterfaceC14721c subscriber) {
        return subscriber == null ? EnumC14432d.f134894c : subscriber.b() ? EnumC14432d.f134895d : EnumC14432d.f134896e;
    }

    public final SessionEvent a(com.google.firebase.f firebaseApp, SessionDetails sessionDetails, kg.j sessionsSettings, Map<InterfaceC14721c.a, ? extends InterfaceC14721c> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.j(firebaseApp, "firebaseApp");
        Intrinsics.j(sessionDetails, "sessionDetails");
        Intrinsics.j(sessionsSettings, "sessionsSettings");
        Intrinsics.j(subscribers, "subscribers");
        Intrinsics.j(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.j(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EnumC14438j.f134910c, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(d(subscribers.get(InterfaceC14721c.a.f137752b)), d(subscribers.get(InterfaceC14721c.a.f137751a)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final ApplicationInfo b(com.google.firebase.f firebaseApp) throws PackageManager.NameNotFoundException {
        Intrinsics.j(firebaseApp, "firebaseApp");
        Context contextK = firebaseApp.k();
        Intrinsics.i(contextK, "getApplicationContext(...)");
        String packageName = contextK.getPackageName();
        PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.n().c();
        Intrinsics.i(strC, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        Intrinsics.i(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.i(RELEASE, "RELEASE");
        EnumC14448u enumC14448u = EnumC14448u.f134938e;
        Intrinsics.g(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.i(MANUFACTURER, "MANUFACTURER");
        D d10 = D.f134735a;
        Context contextK2 = firebaseApp.k();
        Intrinsics.i(contextK2, "getApplicationContext(...)");
        ProcessDetails processDetailsB = d10.b(contextK2);
        Context contextK3 = firebaseApp.k();
        Intrinsics.i(contextK3, "getApplicationContext(...)");
        return new ApplicationInfo(strC, MODEL, BuildConfig.VERSION_NAME, RELEASE, enumC14448u, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, processDetailsB, d10.a(contextK3)));
    }

    public final Bf.a c() {
        return SESSION_EVENT_ENCODER;
    }

    private J() {
    }
}

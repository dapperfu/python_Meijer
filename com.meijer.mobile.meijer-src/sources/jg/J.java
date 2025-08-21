package jg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.sessions.BuildConfig;
import java.util.Map;
import kg.InterfaceC15125c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ljg/J;", "", "<init>", "()V", "Lkg/c;", "subscriber", "Ljg/d;", "d", "(Lkg/c;)Ljg/d;", "Lcom/google/firebase/f;", "firebaseApp", "Ljg/H;", "sessionDetails", "Lmg/j;", "sessionsSettings", "", "Lkg/c$a;", "subscribers", "", "firebaseInstallationId", "firebaseAuthenticationToken", "Ljg/I;", "a", "(Lcom/google/firebase/f;Ljg/H;Lmg/j;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljg/I;", "Ljg/b;", "b", "(Lcom/google/firebase/f;)Ljg/b;", "LDf/a;", "LDf/a;", "c", "()LDf/a;", "SESSION_EVENT_ENCODER", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f140446a = new J();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Df.a SESSION_EVENT_ENCODER;

    static {
        Df.a aVarI = new Ff.d().j(C15009c.f140552a).k(true).i();
        Intrinsics.i(aVarI, "build(...)");
        SESSION_EVENT_ENCODER = aVarI;
    }

    private final EnumC15010d d(InterfaceC15125c subscriber) {
        return subscriber == null ? EnumC15010d.f140589c : subscriber.b() ? EnumC15010d.f140590d : EnumC15010d.f140591e;
    }

    public final SessionEvent a(com.google.firebase.f firebaseApp, SessionDetails sessionDetails, mg.j sessionsSettings, Map<InterfaceC15125c.a, ? extends InterfaceC15125c> subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.j(firebaseApp, "firebaseApp");
        Intrinsics.j(sessionDetails, "sessionDetails");
        Intrinsics.j(sessionsSettings, "sessionsSettings");
        Intrinsics.j(subscribers, "subscribers");
        Intrinsics.j(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.j(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionEvent(EnumC15016j.f140605c, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(d(subscribers.get(InterfaceC15125c.a.f141841b)), d(subscribers.get(InterfaceC15125c.a.f141840a)), sessionsSettings.a()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
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
        EnumC15026u enumC15026u = EnumC15026u.f140633e;
        Intrinsics.g(packageName);
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.i(MANUFACTURER, "MANUFACTURER");
        D d10 = D.f140430a;
        Context contextK2 = firebaseApp.k();
        Intrinsics.i(contextK2, "getApplicationContext(...)");
        ProcessDetails processDetailsB = d10.b(contextK2);
        Context contextK3 = firebaseApp.k();
        Intrinsics.i(contextK3, "getApplicationContext(...)");
        return new ApplicationInfo(strC, MODEL, BuildConfig.VERSION_NAME, RELEASE, enumC15026u, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, processDetailsB, d10.a(contextK3)));
    }

    public final Df.a c() {
        return SESSION_EVENT_ENCODER;
    }

    private J() {
    }
}

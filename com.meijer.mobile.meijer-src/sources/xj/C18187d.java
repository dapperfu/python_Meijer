package xj;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import j2.C14923c;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \f2\u00020\u0001:\u0002\u001b\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lxj/d;", "", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "", "versionName", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;)V", "Lxj/d$b;", "eventType", "errorDescription", "", "c", "(Lxj/d$b;Ljava/lang/String;)V", "eventName", "Landroid/os/Bundle;", "bundle", "a", "(Ljava/lang/String;Landroid/os/Bundle;)V", "propertyName", "value", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "userId", "e", "(Ljava/lang/String;)V", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "b", "Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xj.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18187d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FirebaseAnalytics firebaseAnalytics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String versionName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lxj/d$b;", "", "", "eventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xj.d$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f170823b = new b("USER_TOKEN_REFRESH_ERROR", 0, "UserTokenRefreshError");

        /* renamed from: c, reason: collision with root package name */
        public static final b f170824c = new b("NAV_HELPER_NULL_ERROR", 1, "NavigationHelperNull");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f170825d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f170826e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        static {
            b[] bVarArrA = a();
            f170825d = bVarArrA;
            f170826e = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f170823b, f170824c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f170825d.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        private b(String str, int i10, String str2) {
            this.eventName = str2;
        }
    }

    public C18187d(FirebaseAnalytics firebaseAnalytics, String versionName) {
        Intrinsics.j(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.j(versionName, "versionName");
        this.firebaseAnalytics = firebaseAnalytics;
        this.versionName = versionName;
    }

    public static /* synthetic */ void b(C18187d c18187d, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        c18187d.a(str, bundle);
    }

    public static /* synthetic */ void d(C18187d c18187d, b bVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b.f170823b;
        }
        if ((i10 & 2) != 0) {
            str = "Valid authentication token not available. Force-logout event triggered.";
        }
        c18187d.c(bVar, str);
    }

    @JvmOverloads
    public final void a(String eventName, Bundle bundle) {
        Intrinsics.j(eventName, "eventName");
        try {
            this.firebaseAnalytics.a(eventName, bundle);
        } catch (IllegalStateException e10) {
            qw.a.INSTANCE.f(e10, "Logging util is not setup", new Object[0]);
        }
    }

    public final void c(b eventType, String errorDescription) {
        Intrinsics.j(eventType, "eventType");
        Intrinsics.j(errorDescription, "errorDescription");
        a(eventType.getEventName(), C14923c.b(TuplesKt.a("ErrorDescription", errorDescription), TuplesKt.a("VersionName", this.versionName), TuplesKt.a("AppResult", "Logout")));
    }

    public final void e(String userId) {
        try {
            this.firebaseAnalytics.b(userId);
        } catch (IllegalStateException e10) {
            qw.a.INSTANCE.f(e10, "Logging util is not setup", new Object[0]);
        }
    }

    public final void f(String propertyName, String value) {
        Intrinsics.j(propertyName, "propertyName");
        try {
            this.firebaseAnalytics.c(propertyName, value);
        } catch (IllegalStateException e10) {
            qw.a.INSTANCE.f(e10, "Logging util is not setup", new Object[0]);
        }
    }
}

package ga;

import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m9.C15696a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lga/a;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "applicationCode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "c", "d", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14342a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14342a f134119a = new C14342a();

    public final String a(String applicationCode) {
        Intrinsics.j(applicationCode, "applicationCode");
        return "/v3/apps/" + applicationCode + "/client";
    }

    public final String b() {
        return "/api/clicks";
    }

    public final String c(String applicationCode) {
        Intrinsics.j(applicationCode, "applicationCode");
        return q2.f93563c + (C15696a.c(P8.a.f25708d) ? "v4" : "v3") + "/apps/" + applicationCode + "/client/events";
    }

    public final String d(String applicationCode) {
        Intrinsics.j(applicationCode, "applicationCode");
        return "/v3/apps/" + applicationCode + "/geo-fences";
    }

    private C14342a() {
    }
}

package I5;

import R5.K;
import R5.t;
import R5.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\u0003J\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\u0006J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u0006R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"LI5/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "appId", "", "e", "(Ljava/lang/String;)V", "d", "c", "b", "LR5/v;", "LR5/v;", "configStateStoreCollection", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v configStateStoreCollection = K.f().d().a("AdobeMobile_ConfigState");

    public final void d() {
        t.e("Configuration", "AppIdManager", "Attempting to set empty App Id into persistence.", new Object[0]);
        v vVar = this.configStateStoreCollection;
        if (vVar != null) {
            vVar.remove("config.appID");
        }
    }

    public final String b() {
        v vVar = this.configStateStoreCollection;
        if (vVar != null) {
            return vVar.getString("config.appID", null);
        }
        return null;
    }

    public final void e(String appId) {
        Intrinsics.j(appId, "appId");
        if (StringsKt.s0(appId)) {
            t.e("Configuration", "AppIdManager", "Attempting to set empty App Id into persistence.", new Object[0]);
            return;
        }
        v vVar = this.configStateStoreCollection;
        if (vVar != null) {
            vVar.d("config.appID", appId);
        }
    }

    private final String a() {
        return K.f().e().t("ADBMobileAppID");
    }

    public final String c() {
        String strB = b();
        if (strB != null) {
            t.e("Configuration", "AppIdManager", "Retrieved AppId from persistence.", new Object[0]);
        }
        if (strB == null && (strB = a()) != null) {
            t.e("Configuration", "AppIdManager", "Retrieved AppId from manifest.", new Object[0]);
            e(strB);
        }
        return strB;
    }
}

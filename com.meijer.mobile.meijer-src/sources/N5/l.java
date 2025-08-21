package N5;

import Q5.x;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.medallia.digital.mobilesdk.q2;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LN5/l;", "LQ5/x;", "Lcom/adobe/marketing/mobile/h;", "event", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/m;)V", "", "key", "", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "b", "a", "Lcom/adobe/marketing/mobile/h;", "getEvent", "()Lcom/adobe/marketing/mobile/h;", "Lcom/adobe/marketing/mobile/m;", "getExtensionApi", "()Lcom/adobe/marketing/mobile/m;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6574h event;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6579m extensionApi;

    private final Object c(String key) {
        Map<String, Object> mapB;
        String strSubstring = key.substring(7);
        Intrinsics.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (StringsKt.s0(strSubstring) || !StringsKt.d0(strSubstring, q2.f93563c, false, 2, null)) {
            return null;
        }
        List listB1 = StringsKt.b1(strSubstring, new String[]{q2.f93563c}, false, 0, 6, null);
        String str = (String) listB1.get(0);
        String str2 = (String) listB1.get(1);
        H hE = this.extensionApi.e(str, this.event, false, F.ANY);
        Map mapB2 = (hE == null || (mapB = hE.b()) == null) ? null : M5.j.b(mapB, null, false, 3, null);
        if (mapB2 == null || mapB2.isEmpty() || StringsKt.s0(str2) || !mapB2.containsKey(str2)) {
            return null;
        }
        return mapB2.get(str2);
    }

    public l(C6574h event, AbstractC6579m extensionApi) {
        Intrinsics.j(event, "event");
        Intrinsics.j(extensionApi, "extensionApi");
        this.event = event;
        this.extensionApi = extensionApi;
    }

    private final Object b(String key) {
        if (this.event.o() == null) {
            return "";
        }
        Map<String, Object> mapO = this.event.o();
        Intrinsics.i(mapO, "event.eventData");
        return M5.j.b(mapO, null, false, 3, null).get(key);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Q5.x
    public Object a(String key) {
        Intrinsics.j(key, "key");
        String string = StringsKt.C1(key).toString();
        switch (string.hashCode()) {
            case -1368656616:
                if (string.equals("~timestampp")) {
                    return g6.j.f(null, 1, null);
                }
                break;
            case -1368656611:
                if (string.equals("~timestampu")) {
                    return String.valueOf(g6.j.h());
                }
                break;
            case -1368656606:
                if (string.equals("~timestampz")) {
                    return g6.j.d(null, 1, null);
                }
                break;
            case -750644441:
                if (string.equals("~sdkver")) {
                    return B.g();
                }
                break;
            case -740191719:
                if (string.equals("~source")) {
                    return this.event.t();
                }
                break;
            case -361051245:
                if (string.equals("~all_url")) {
                    if (this.event.o() != null) {
                        Map<String, Object> mapO = this.event.o();
                        Intrinsics.i(mapO, "event.eventData");
                        return M5.j.i(M5.j.b(mapO, null, false, 1, null));
                    }
                    t.a("LaunchRulesEngine", "LaunchTokenFinder", "Triggering event " + this.event.x() + " - Event data is null, can not use it to generate an url query string", new Object[0]);
                    return "";
                }
                break;
            case 0:
                if (string.equals("")) {
                    return null;
                }
                break;
            case 119939256:
                if (string.equals("~type")) {
                    return this.event.w();
                }
                break;
            case 455941560:
                if (string.equals("~cachebust")) {
                    return String.valueOf(new SecureRandom().nextInt(100000000));
                }
                break;
            case 1691986756:
                if (string.equals("~all_json")) {
                    if (this.event.o() == null) {
                        t.a("LaunchRulesEngine", "LaunchTokenFinder", "Triggering event " + this.event.x() + " - Event data is null, can not use it to generate a json string", new Object[0]);
                        return "";
                    }
                    try {
                        return new JSONObject(this.event.o()).toString();
                    } catch (Exception e10) {
                        t.a("LaunchRulesEngine", "LaunchTokenFinder", "Triggering event " + this.event.x() + " - Failed to generate a json string " + e10.getMessage(), new Object[0]);
                        return "";
                    }
                }
                break;
        }
        return StringsKt.W(key, "~state.", false, 2, null) ? c(key) : b(key);
    }
}

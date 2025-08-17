package wa;

import U9.MobileEngageRequestContext;
import e9.d;
import ea.C13638a;
import j9.C14877b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import na.ButtonClicked;
import y9.EnumC18191b;
import y9.c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011H\u0016¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010\u0006\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010\u0007\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b%\u0010)R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010*¨\u0006+"}, d2 = {"Lwa/c;", "", "LU9/k;", "requestContext", "Lj9/b;", "clientServiceProvider", "eventServiceProvider", "messageInboxServiceProvider", "Le9/c;", "Lna/a;", "Le9/d;", "buttonClickedRepository", "<init>", "(LU9/k;Lj9/b;Lj9/b;Lj9/b;Le9/c;)V", "", "j", "()Ljava/lang/String;", "", "payload", "Ly9/c;", "b", "(Ljava/util/Map;LU9/k;)Ly9/c;", "pushToken", "h", "(Ljava/lang/String;)Ly9/c;", "f", "()Ly9/c;", "i", "", "contactFieldId", "contactFieldValue", "g", "(Ljava/lang/Integer;Ljava/lang/String;)Ly9/c;", "eventName", "eventAttributes", "a", "(Ljava/lang/String;Ljava/util/Map;)Ly9/c;", "d", "e", "c", "LU9/k;", "Lj9/b;", "Le9/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14877b clientServiceProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14877b eventServiceProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14877b messageInboxServiceProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e9.c<ButtonClicked, d> buttonClickedRepository;

    public c(MobileEngageRequestContext requestContext, C14877b clientServiceProvider, C14877b eventServiceProvider, C14877b messageInboxServiceProvider, e9.c<ButtonClicked, d> buttonClickedRepository) {
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(clientServiceProvider, "clientServiceProvider");
        Intrinsics.j(eventServiceProvider, "eventServiceProvider");
        Intrinsics.j(messageInboxServiceProvider, "messageInboxServiceProvider");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        this.requestContext = requestContext;
        this.clientServiceProvider = clientServiceProvider;
        this.eventServiceProvider = eventServiceProvider;
        this.messageInboxServiceProvider = messageInboxServiceProvider;
        this.buttonClickedRepository = buttonClickedRepository;
    }

    private String j() {
        String applicationCode = this.requestContext.getApplicationCode();
        if (applicationCode == null || StringsKt.r0(applicationCode)) {
            throw new IllegalArgumentException("Application Code must not be null!");
        }
        String applicationCode2 = this.requestContext.getApplicationCode();
        Intrinsics.g(applicationCode2);
        return applicationCode2;
    }

    public y9.c a(String eventName, Map<String, String> eventAttributes) {
        Intrinsics.j(eventName, "eventName");
        return b(Da.c.b(eventName, eventAttributes, this.requestContext), this.requestContext);
    }

    public y9.c d(String eventName, Map<String, String> eventAttributes) {
        Intrinsics.j(eventName, "eventName");
        return b(Da.c.e(eventName, eventAttributes, this.requestContext), this.requestContext);
    }

    public y9.c h(String pushToken) {
        Intrinsics.j(pushToken, "pushToken");
        String strJ = j();
        return new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.clientServiceProvider.a() + C13638a.f128651a.a(strJ) + "/push-token").k(EnumC18191b.PUT).l(Da.c.g(pushToken)).a();
    }

    private y9.c b(Map<String, ? extends Object> payload, MobileEngageRequestContext requestContext) {
        String strJ = j();
        return new c.a(requestContext.getTimestampProvider(), requestContext.getUuidProvider()).p(this.eventServiceProvider.a() + C13638a.f128651a.c(strJ)).k(EnumC18191b.POST).l(payload).a();
    }

    public y9.c c() {
        String strJ = j();
        return new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).k(EnumC18191b.GET).p(this.clientServiceProvider.a() + C13638a.f128651a.d(strJ)).a();
    }

    public y9.c e() {
        String strJ = j();
        return new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.clientServiceProvider.a() + C13638a.f128651a.a(strJ) + "/contact-token").k(EnumC18191b.POST).l(Da.c.f(this.requestContext)).a();
    }

    public y9.c f() {
        String strJ = j();
        return new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.clientServiceProvider.a() + C13638a.f128651a.a(strJ) + "/push-token").k(EnumC18191b.DELETE).a();
    }

    public y9.c g(Integer contactFieldId, String contactFieldValue) {
        String strJ = j();
        c.a aVarK = new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.clientServiceProvider.a() + C13638a.f128651a.a(strJ) + "/contact").k(EnumC18191b.POST);
        if (!this.requestContext.n()) {
            HashMap map = new HashMap();
            map.put("anonymous", "true");
            aVarK.l(MapsKt.k());
            aVarK.m(map);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (contactFieldId != null) {
                linkedHashMap.put("contactFieldId", contactFieldId);
            }
            if (contactFieldValue != null) {
                linkedHashMap.put("contactFieldValue", contactFieldValue);
            }
            aVarK.l(linkedHashMap);
        }
        return aVarK.a();
    }

    public y9.c i() {
        String strJ = j();
        return new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.clientServiceProvider.a() + C13638a.f128651a.a(strJ)).k(EnumC18191b.POST).l(Da.c.h(this.requestContext)).a();
    }
}

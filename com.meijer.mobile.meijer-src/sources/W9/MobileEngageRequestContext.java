package W9;

import Da.SessionIdHolder;
import j9.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0097\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001b\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b%\u0010:R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\b5\u0010:R\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010:R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b;\u0010:R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b1\u0010:R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b=\u0010?R(\u0010B\u001a\u0004\u0018\u00010\u00022\b\u0010@\u001a\u0004\u0018\u00010\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010\u001b\"\u0004\bA\u0010$¨\u0006C"}, d2 = {"LW9/k;", "", "", "applicationCode", "", "contactFieldId", "openIdToken", "Lj9/c;", "deviceInfo", "Lu9/a;", "timestampProvider", "Lv9/a;", "uuidProvider", "LH9/l;", "clientStateStorage", "contactTokenStorage", "refreshTokenStorage", "pushTokenStorage", "contactFieldValueStorage", "LDa/b;", "sessionIdHolder", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lj9/c;Lu9/a;Lv9/a;LH9/l;LH9/l;LH9/l;LH9/l;LH9/l;LDa/b;)V", "", "n", "()Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setApplicationCode", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "o", "(Ljava/lang/Integer;)V", "h", "q", "d", "Lj9/c;", "g", "()Lj9/c;", "e", "Lu9/a;", "l", "()Lu9/a;", "f", "Lv9/a;", "m", "()Lv9/a;", "LH9/l;", "()LH9/l;", "i", "j", "k", "LDa/b;", "()LDa/b;", "value", "p", "contactFieldValue", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: W9.k, reason: from toString */
/* loaded from: classes4.dex */
public /* data */ class MobileEngageRequestContext {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String applicationCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer contactFieldId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String openIdToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> clientStateStorage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> contactTokenStorage;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> refreshTokenStorage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> pushTokenStorage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final H9.l<String> contactFieldValueStorage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final SessionIdHolder sessionIdHolder;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileEngageRequestContext)) {
            return false;
        }
        MobileEngageRequestContext mobileEngageRequestContext = (MobileEngageRequestContext) other;
        return Intrinsics.e(getApplicationCode(), mobileEngageRequestContext.getApplicationCode()) && Intrinsics.e(getContactFieldId(), mobileEngageRequestContext.getContactFieldId()) && Intrinsics.e(getOpenIdToken(), mobileEngageRequestContext.getOpenIdToken()) && Intrinsics.e(getDeviceInfo(), mobileEngageRequestContext.getDeviceInfo()) && Intrinsics.e(getTimestampProvider(), mobileEngageRequestContext.getTimestampProvider()) && Intrinsics.e(getUuidProvider(), mobileEngageRequestContext.getUuidProvider()) && Intrinsics.e(b(), mobileEngageRequestContext.b()) && Intrinsics.e(f(), mobileEngageRequestContext.f()) && Intrinsics.e(j(), mobileEngageRequestContext.j()) && Intrinsics.e(i(), mobileEngageRequestContext.i()) && Intrinsics.e(e(), mobileEngageRequestContext.e()) && Intrinsics.e(getSessionIdHolder(), mobileEngageRequestContext.getSessionIdHolder());
    }

    public MobileEngageRequestContext(String str, Integer num, String str2, DeviceInfo deviceInfo, C17361a timestampProvider, C17649a uuidProvider, H9.l<String> clientStateStorage, H9.l<String> contactTokenStorage, H9.l<String> refreshTokenStorage, H9.l<String> pushTokenStorage, H9.l<String> contactFieldValueStorage, SessionIdHolder sessionIdHolder) {
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(clientStateStorage, "clientStateStorage");
        Intrinsics.j(contactTokenStorage, "contactTokenStorage");
        Intrinsics.j(refreshTokenStorage, "refreshTokenStorage");
        Intrinsics.j(pushTokenStorage, "pushTokenStorage");
        Intrinsics.j(contactFieldValueStorage, "contactFieldValueStorage");
        Intrinsics.j(sessionIdHolder, "sessionIdHolder");
        this.applicationCode = str;
        this.contactFieldId = num;
        this.openIdToken = str2;
        this.deviceInfo = deviceInfo;
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.clientStateStorage = clientStateStorage;
        this.contactTokenStorage = contactTokenStorage;
        this.refreshTokenStorage = refreshTokenStorage;
        this.pushTokenStorage = pushTokenStorage;
        this.contactFieldValueStorage = contactFieldValueStorage;
        this.sessionIdHolder = sessionIdHolder;
    }

    /* renamed from: a, reason: from getter */
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public H9.l<String> b() {
        return this.clientStateStorage;
    }

    /* renamed from: c, reason: from getter */
    public Integer getContactFieldId() {
        return this.contactFieldId;
    }

    public H9.l<String> e() {
        return this.contactFieldValueStorage;
    }

    public H9.l<String> f() {
        return this.contactTokenStorage;
    }

    /* renamed from: g, reason: from getter */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: h, reason: from getter */
    public String getOpenIdToken() {
        return this.openIdToken;
    }

    public H9.l<String> i() {
        return this.pushTokenStorage;
    }

    public H9.l<String> j() {
        return this.refreshTokenStorage;
    }

    /* renamed from: k, reason: from getter */
    public SessionIdHolder getSessionIdHolder() {
        return this.sessionIdHolder;
    }

    /* renamed from: l, reason: from getter */
    public C17361a getTimestampProvider() {
        return this.timestampProvider;
    }

    /* renamed from: m, reason: from getter */
    public C17649a getUuidProvider() {
        return this.uuidProvider;
    }

    public void o(Integer num) {
        this.contactFieldId = num;
    }

    public void q(String str) {
        this.openIdToken = str;
    }

    public String d() {
        return e().get();
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = 0;
        if (getApplicationCode() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getApplicationCode().hashCode();
        }
        int i10 = iHashCode * 31;
        if (getContactFieldId() == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = getContactFieldId().hashCode();
        }
        int i11 = (i10 + iHashCode2) * 31;
        if (getOpenIdToken() != null) {
            iHashCode3 = getOpenIdToken().hashCode();
        }
        return ((((((((((((((((((i11 + iHashCode3) * 31) + getDeviceInfo().hashCode()) * 31) + getTimestampProvider().hashCode()) * 31) + getUuidProvider().hashCode()) * 31) + b().hashCode()) * 31) + f().hashCode()) * 31) + j().hashCode()) * 31) + i().hashCode()) * 31) + e().hashCode()) * 31) + getSessionIdHolder().hashCode();
    }

    public boolean n() {
        if (getOpenIdToken() == null && d() == null) {
            return false;
        }
        return true;
    }

    public void p(String str) {
        e().set(str);
    }

    public String toString() {
        return "MobileEngageRequestContext(applicationCode=" + getApplicationCode() + ", contactFieldId=" + getContactFieldId() + ", openIdToken=" + getOpenIdToken() + ", deviceInfo=" + getDeviceInfo() + ", timestampProvider=" + getTimestampProvider() + ", uuidProvider=" + getUuidProvider() + ", clientStateStorage=" + b() + ", contactTokenStorage=" + f() + ", refreshTokenStorage=" + j() + ", pushTokenStorage=" + i() + ", contactFieldValueStorage=" + e() + ", sessionIdHolder=" + getSessionIdHolder() + ")";
    }
}

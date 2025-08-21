package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.InterfaceC6543a;
import com.adobe.marketing.mobile.assurance.internal.W;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0016B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R&\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/P;", "Ljava/lang/Runnable;", "", "orgId", "clientId", "deviceName", "Lcom/adobe/marketing/mobile/a;", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "LR5/o;", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/a;)V", "LR5/x;", "b", "()LR5/x;", "networkRequest", "", "c", "(LR5/x;)V", "run", "()V", "a", "Ljava/lang/String;", "d", "Lcom/adobe/marketing/mobile/a;", "e", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class P implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String orgId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String deviceName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6543a<W<R5.o, EnumC6550g>> callback;

    public P(String orgId, String clientId, String deviceName, InterfaceC6543a<W<R5.o, EnumC6550g>> callback) {
        Intrinsics.j(orgId, "orgId");
        Intrinsics.j(clientId, "clientId");
        Intrinsics.j(deviceName, "deviceName");
        Intrinsics.j(callback, "callback");
        this.orgId = orgId;
        this.clientId = clientId;
        this.deviceName = deviceName;
        this.callback = callback;
    }

    private final R5.x b() {
        Map mapO = MapsKt.o(TuplesKt.a("Accept", "application/json"), TuplesKt.a("Content-Type", "application/json"));
        String string = new JSONObject(MapsKt.o(TuplesKt.a("orgId", this.orgId), TuplesKt.a("deviceName", this.deviceName), TuplesKt.a("clientId", this.clientId))).toString();
        Intrinsics.i(string, "jsonBody.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        R5.r rVar = R5.r.POST;
        C6552i c6552i = C6552i.f63102a;
        return new R5.x("https://device.griffon.adobe.com/device/create", rVar, bytes, mapO, c6552i.a(), c6552i.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P this$0, R5.o oVar) {
        Intrinsics.j(this$0, "this$0");
        if (oVar == null) {
            this$0.callback.a(new W.a(EnumC6550g.UNEXPECTED_ERROR));
            return;
        }
        int iD = oVar.d();
        if (iD == 201 || 200 == iD) {
            R5.t.a("Assurance", "Assurance", "Registration request succeeded: %s", Integer.valueOf(iD));
            this$0.callback.a(new W.b(oVar));
        } else {
            R5.t.e("Assurance", "QuickConnectDeviceCreator", "Device registration failed with code : " + iD + " and message: " + oVar.e() + '.', new Object[0]);
            this$0.callback.a(new W.a(EnumC6550g.CREATE_DEVICE_REQUEST_FAILED));
        }
        oVar.close();
    }

    private final void c(R5.x networkRequest) {
        R5.K.f().h().a(networkRequest, new R5.w() { // from class: com.adobe.marketing.mobile.assurance.internal.O
            @Override // R5.w
            public final void a(R5.o oVar) {
                P.d(this.f63020a, oVar);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        R5.x xVarB;
        try {
            xVarB = b();
        } catch (Exception e10) {
            R5.t.e("Assurance", "QuickConnectDeviceCreator", "Exception attempting to build request. " + e10.getMessage(), new Object[0]);
            xVarB = null;
        }
        if (xVarB == null) {
            this.callback.a(new W.a(EnumC6550g.CREATE_DEVICE_REQUEST_MALFORMED));
        } else {
            c(xVarB);
        }
    }
}

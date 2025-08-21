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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/S;", "Ljava/lang/Runnable;", "", "orgId", "clientId", "Lcom/adobe/marketing/mobile/a;", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "LR5/o;", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/a;)V", "LR5/x;", "b", "()LR5/x;", "networkRequest", "", "c", "(LR5/x;)V", "run", "()V", "a", "Ljava/lang/String;", "Lcom/adobe/marketing/mobile/a;", "d", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String orgId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6543a<W<R5.o, EnumC6550g>> callback;

    public S(String orgId, String clientId, InterfaceC6543a<W<R5.o, EnumC6550g>> callback) {
        Intrinsics.j(orgId, "orgId");
        Intrinsics.j(clientId, "clientId");
        Intrinsics.j(callback, "callback");
        this.orgId = orgId;
        this.clientId = clientId;
        this.callback = callback;
    }

    private final R5.x b() {
        Map mapO = MapsKt.o(TuplesKt.a("orgId", this.orgId), TuplesKt.a("clientId", this.clientId));
        Map mapO2 = MapsKt.o(TuplesKt.a("Accept", "application/json"), TuplesKt.a("Content-Type", "application/json"));
        String string = new JSONObject(mapO).toString();
        Intrinsics.i(string, "jsonBody.toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
        R5.r rVar = R5.r.POST;
        C6552i c6552i = C6552i.f63102a;
        return new R5.x("https://device.griffon.adobe.com/device/status", rVar, bytes, mapO2, c6552i.a(), c6552i.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(S this$0, R5.o oVar) {
        Intrinsics.j(this$0, "this$0");
        if (oVar == null) {
            this$0.callback.a(new W.a(EnumC6550g.UNEXPECTED_ERROR));
            return;
        }
        int iD = oVar.d();
        if (iD == 201 || iD == 200) {
            this$0.callback.a(new W.b(oVar));
        } else {
            R5.t.e("Assurance", "QuickConnectDeviceStatusChecker", "Device status check failed with code : " + iD + " and message: " + oVar.e() + '.', new Object[0]);
            this$0.callback.a(new W.a(EnumC6550g.DEVICE_STATUS_REQUEST_FAILED));
        }
        oVar.close();
    }

    private final void c(R5.x networkRequest) {
        R5.K.f().h().a(networkRequest, new R5.w() { // from class: com.adobe.marketing.mobile.assurance.internal.Q
            @Override // R5.w
            public final void a(R5.o oVar) {
                S.d(this.f63026a, oVar);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        R5.x xVarB;
        try {
            xVarB = b();
        } catch (Exception e10) {
            R5.t.e("Assurance", "QuickConnectDeviceStatusChecker", "Exception attempting to build request. " + e10.getMessage(), new Object[0]);
            xVarB = null;
        }
        if (xVarB == null) {
            this.callback.a(new W.a(EnumC6550g.STATUS_CHECK_REQUEST_MALFORMED));
        } else {
            c(xVarB);
        }
    }
}

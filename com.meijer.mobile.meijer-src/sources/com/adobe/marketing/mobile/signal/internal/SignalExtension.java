package com.adobe.marketing.mobile.signal.internal;

import R5.F;
import R5.K;
import R5.n;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.J;
import com.adobe.marketing.mobile.signal.internal.SignalExtension;
import f6.C13955a;
import f6.C13959e;
import f6.C13961g;
import g6.C14328a;
import g6.C14332e;
import g6.l;
import io.constructor.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001c\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006 "}, d2 = {"Lcom/adobe/marketing/mobile/signal/internal/SignalExtension;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "LR5/n;", "hitQueue", "(Lcom/adobe/marketing/mobile/m;LR5/n;)V", "", "l", "()V", "Lcom/adobe/marketing/mobile/h;", "event", "", "s", "(Lcom/adobe/marketing/mobile/h;)Z", "g", "", "e", "()Ljava/lang/String;", "b", "f", "m", "(Lcom/adobe/marketing/mobile/h;)V", "p", "i", "n", "o", "LR5/n;", "c", "a", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class SignalExtension extends AbstractC6578l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n hitQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalExtension(AbstractC6579m extensionApi) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        this.hitQueue = new F(K.f().c().a("com.adobe.module.signal"), new C13961g());
    }

    private final void l() {
        C14332e.a("ADBMobileSignalDataCache.sqlite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SignalExtension this$0, C6574h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.p(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SignalExtension this$0, C6574h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.m(it);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "Signal";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.module.signal";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    public boolean i(C6574h event) {
        Intrinsics.j(event, "event");
        H hE = a().e("com.adobe.module.configuration", event, false, com.adobe.marketing.mobile.F.LAST_SET);
        return (hE != null ? hE.a() : null) == I.SET;
    }

    public final void m(C6574h event) {
        D dB;
        Intrinsics.j(event, "event");
        try {
            dB = D.b(C14328a.e(event.o(), "global.privacy"));
        } catch (Exception unused) {
            dB = D.UNKNOWN;
        }
        this.hitQueue.d(dB);
        if (dB == D.OPT_OUT) {
            t.a("Signal", "SignalExtension", "Device has opted-out of tracking. Clearing the Signal queue.", new Object[0]);
        }
    }

    public final void n(C6574h event) {
        Intrinsics.j(event, "event");
        String strK = C13955a.k(event);
        if (strK == null) {
            t.f("Signal", "SignalExtension", "Unable to process OpenURL consequence - no URL was found in EventData.", new Object[0]);
            return;
        }
        t.a("Signal", "SignalExtension", "Opening URL " + strK + '.', new Object[0]);
        K.f().j().a(strK);
    }

    public final void o(C6574h event) {
        Intrinsics.j(event, "event");
        String strI = C13955a.i(event);
        if (strI == null) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal doesn't contain url.", new Object[0]);
            return;
        }
        if (!l.a(strI)) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal will not be processed, url (" + strI + ") is malformed.", new Object[0]);
            return;
        }
        if (C13955a.e(event) && !StringsKt.W(strI, BuildConfig.SERVICE_SCHEME, false, 2, null)) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal will not be processed, url must be https.", new Object[0]);
            return;
        }
        String strH = C13955a.h(event);
        if (strH == null) {
            strH = "";
        }
        this.hitQueue.e(new C13959e(strI, strH, C13955a.c(event), C13955a.j(event)).e());
    }

    public final void p(C6574h event) {
        Intrinsics.j(event, "event");
        if (s(event)) {
            return;
        }
        if (C13955a.e(event) || C13955a.g(event)) {
            o(event);
        } else if (C13955a.f(event)) {
            n(event);
        }
    }

    private final boolean s(C6574h event) {
        Map<String, Object> mapB;
        Comparable comparableE;
        H hE = a().e("com.adobe.module.configuration", event, false, com.adobe.marketing.mobile.F.ANY);
        if (hE == null || (mapB = hE.b()) == null) {
            return true;
        }
        try {
            comparableE = C14328a.e(mapB, "global.privacy");
        } catch (Exception unused) {
            comparableE = D.UNKNOWN;
        }
        if (D.OPT_OUT != comparableE) {
            return false;
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        String strA = J.a();
        Intrinsics.i(strA, "extensionVersion()");
        return strA;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: f6.c
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                SignalExtension.q(this.f131601a, c6574h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6581o() { // from class: f6.d
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                SignalExtension.r(this.f131602a, c6574h);
            }
        });
        l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalExtension(AbstractC6579m extensionApi, n hitQueue) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        Intrinsics.j(hitQueue, "hitQueue");
        this.hitQueue = hitQueue;
    }
}

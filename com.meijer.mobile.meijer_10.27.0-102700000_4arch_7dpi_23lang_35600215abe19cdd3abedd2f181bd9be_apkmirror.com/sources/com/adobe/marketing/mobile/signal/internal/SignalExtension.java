package com.adobe.marketing.mobile.signal.internal;

import Q5.F;
import Q5.K;
import Q5.n;
import Q5.t;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.J;
import com.adobe.marketing.mobile.signal.internal.SignalExtension;
import e6.C13625a;
import e6.C13629e;
import e6.C13631g;
import f6.C13845a;
import f6.C13849e;
import f6.l;
import io.constructor.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001c\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006 "}, d2 = {"Lcom/adobe/marketing/mobile/signal/internal/SignalExtension;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "LQ5/n;", "hitQueue", "(Lcom/adobe/marketing/mobile/m;LQ5/n;)V", "", "l", "()V", "Lcom/adobe/marketing/mobile/h;", "event", "", "s", "(Lcom/adobe/marketing/mobile/h;)Z", "g", "", "e", "()Ljava/lang/String;", "b", "f", "m", "(Lcom/adobe/marketing/mobile/h;)V", "p", "i", "n", "o", "LQ5/n;", "c", "a", "signal_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class SignalExtension extends AbstractC6453l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n hitQueue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalExtension(AbstractC6454m extensionApi) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        this.hitQueue = new F(K.f().c().a("com.adobe.module.signal"), new C13631g());
    }

    private final void l() {
        C13849e.a("ADBMobileSignalDataCache.sqlite");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SignalExtension this$0, C6449h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.p(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SignalExtension this$0, C6449h it) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        this$0.m(it);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Signal";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.module.signal";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h event) {
        Intrinsics.j(event, "event");
        H hE = a().e("com.adobe.module.configuration", event, false, com.adobe.marketing.mobile.F.LAST_SET);
        return (hE != null ? hE.a() : null) == I.SET;
    }

    public final void m(C6449h event) {
        D dB;
        Intrinsics.j(event, "event");
        try {
            dB = D.b(C13845a.e(event.o(), "global.privacy"));
        } catch (Exception unused) {
            dB = D.UNKNOWN;
        }
        this.hitQueue.d(dB);
        if (dB == D.OPT_OUT) {
            t.a("Signal", "SignalExtension", "Device has opted-out of tracking. Clearing the Signal queue.", new Object[0]);
        }
    }

    public final void n(C6449h event) {
        Intrinsics.j(event, "event");
        String strK = C13625a.k(event);
        if (strK == null) {
            t.f("Signal", "SignalExtension", "Unable to process OpenURL consequence - no URL was found in EventData.", new Object[0]);
            return;
        }
        t.a("Signal", "SignalExtension", "Opening URL " + strK + '.', new Object[0]);
        K.f().j().a(strK);
    }

    public final void o(C6449h event) {
        Intrinsics.j(event, "event");
        String strI = C13625a.i(event);
        if (strI == null) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal doesn't contain url.", new Object[0]);
            return;
        }
        if (!l.a(strI)) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal will not be processed, url (" + strI + ") is malformed.", new Object[0]);
            return;
        }
        if (C13625a.e(event) && !StringsKt.W(strI, BuildConfig.SERVICE_SCHEME, false, 2, null)) {
            t.f("Signal", "SignalExtension", "Rule consequence Event for Signal will not be processed, url must be https.", new Object[0]);
            return;
        }
        String strH = C13625a.h(event);
        if (strH == null) {
            strH = "";
        }
        this.hitQueue.e(new C13629e(strI, strH, C13625a.c(event), C13625a.j(event)).e());
    }

    public final void p(C6449h event) {
        Intrinsics.j(event, "event");
        if (s(event)) {
            return;
        }
        if (C13625a.e(event) || C13625a.g(event)) {
            o(event);
        } else if (C13625a.f(event)) {
            n(event);
        }
    }

    private final boolean s(C6449h event) {
        Map<String, Object> mapB;
        Comparable comparableE;
        H hE = a().e("com.adobe.module.configuration", event, false, com.adobe.marketing.mobile.F.ANY);
        if (hE == null || (mapB = hE.b()) == null) {
            return true;
        }
        try {
            comparableE = C13845a.e(mapB, "global.privacy");
        } catch (Exception unused) {
            comparableE = D.UNKNOWN;
        }
        if (D.OPT_OUT != comparableE) {
            return false;
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        String strA = J.a();
        Intrinsics.i(strA, "extensionVersion()");
        return strA;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        a().h("com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: e6.c
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                SignalExtension.q(this.f128622a, c6449h);
            }
        });
        a().h("com.adobe.eventType.configuration", "com.adobe.eventSource.responseContent", new InterfaceC6456o() { // from class: e6.d
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                SignalExtension.r(this.f128623a, c6449h);
            }
        });
        l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalExtension(AbstractC6454m extensionApi, n hitQueue) {
        super(extensionApi);
        Intrinsics.j(extensionApi, "extensionApi");
        Intrinsics.j(hitQueue, "hitQueue");
        this.hitQueue = hitQueue;
    }
}

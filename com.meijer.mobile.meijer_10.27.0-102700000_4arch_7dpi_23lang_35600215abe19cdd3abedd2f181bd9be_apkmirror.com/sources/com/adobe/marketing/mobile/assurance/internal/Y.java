package com.adobe.marketing.mobile.assurance.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/Y;", "", "Lcom/adobe/marketing/mobile/assurance/internal/z;", "orchestrator", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/z;)V", "", "sessionId", "token", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "Lcom/adobe/marketing/mobile/assurance/internal/B;", "listener", "Lcom/adobe/marketing/mobile/assurance/internal/X;", "authorizingPresentationType", "", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/assurance/internal/h;Lcom/adobe/marketing/mobile/assurance/internal/B;Lcom/adobe/marketing/mobile/assurance/internal/X;)V", "c", "()V", "a", "Lcom/adobe/marketing/mobile/assurance/internal/z;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z orchestrator;

    public final void a() {
        Q5.t.a("Assurance", "SessionUIOperationHandler", "On Cancel Clicked. Disconnecting session.", new Object[0]);
        this.orchestrator.g(true);
    }

    public final void c() {
        Q5.t.a("Assurance", "SessionUIOperationHandler", "On Disconnect clicked. Disconnecting session.", new Object[0]);
        this.orchestrator.g(true);
    }

    public Y(z orchestrator) {
        Intrinsics.j(orchestrator, "orchestrator");
        this.orchestrator = orchestrator;
    }

    public final void b(String sessionId, String token, EnumC6426h environment, B listener, X authorizingPresentationType) {
        Intrinsics.j(sessionId, "sessionId");
        Intrinsics.j(token, "token");
        Intrinsics.j(environment, "environment");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(authorizingPresentationType, "authorizingPresentationType");
        C6442y c6442yD = this.orchestrator.d();
        if (c6442yD != null) {
            if (c6442yD.m() != authorizingPresentationType) {
                Q5.t.f("Assurance", "SessionUIOperationHandler", "Cannot start " + authorizingPresentationType + " session. A " + c6442yD.m() + " session exists.", new Object[0]);
                listener.b(EnumC6425g.UNEXPECTED_ERROR);
            } else {
                Q5.t.a("Assurance", "SessionUIOperationHandler", "Disconnecting active session of and recreating.", new Object[0]);
                this.orchestrator.g(false);
            }
        }
        this.orchestrator.c(sessionId, environment, token, listener, authorizingPresentationType);
    }
}

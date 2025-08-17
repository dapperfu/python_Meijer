package com.adobe.marketing.mobile.assurance.internal;

import Q5.InterfaceC5076h;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/D;", "", "LQ5/h;", "dataStoreService", "<init>", "(LQ5/h;)V", "Lcom/adobe/marketing/mobile/assurance/internal/C;", "c", "()Lcom/adobe/marketing/mobile/assurance/internal/C;", "persistedState", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/C;)Lcom/adobe/marketing/mobile/assurance/internal/C;", "stateToPersist", "", "d", "(Lcom/adobe/marketing/mobile/assurance/internal/C;)V", "", "sessionId", "e", "(Ljava/lang/String;)V", "LQ5/v;", "LQ5/v;", "assuranceDataStore", "b", "Lcom/adobe/marketing/mobile/assurance/internal/C;", "setAssuranceSharedState", "assuranceSharedState", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q5.v assuranceDataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AssuranceSharedState assuranceSharedState;

    public D(InterfaceC5076h dataStoreService) {
        Intrinsics.j(dataStoreService, "dataStoreService");
        this.assuranceDataStore = dataStoreService.a("com.adobe.assurance.preferences");
        this.assuranceSharedState = a(c());
    }

    private final AssuranceSharedState c() {
        Q5.v vVar = this.assuranceDataStore;
        if (vVar == null) {
            return new AssuranceSharedState("", "");
        }
        String persistedClientId = vVar.getString("clientid", "");
        String persistedSessionId = this.assuranceDataStore.getString("sessionid", "");
        Q5.t.a("Assurance", "AssuranceSharedStateManager", "Assurance state loaded, sessionID : " + persistedSessionId + " and clientId " + persistedClientId + " from persistence.", new Object[0]);
        Intrinsics.i(persistedClientId, "persistedClientId");
        Intrinsics.i(persistedSessionId, "persistedSessionId");
        return new AssuranceSharedState(persistedClientId, persistedSessionId);
    }

    private final void d(AssuranceSharedState stateToPersist) {
        if (this.assuranceDataStore == null) {
            Q5.t.f("Assurance", "AssuranceSharedStateManager", "Assurance datastore is null, unable to persist assurance state.", new Object[0]);
            return;
        }
        if (StringsKt.r0(stateToPersist.getClientId())) {
            this.assuranceDataStore.remove("clientid");
        } else {
            this.assuranceDataStore.d("clientid", stateToPersist.getClientId());
        }
        if (StringsKt.r0(stateToPersist.getSessionId())) {
            this.assuranceDataStore.remove("sessionid");
        } else {
            this.assuranceDataStore.d("sessionid", stateToPersist.getSessionId());
        }
    }

    /* renamed from: b, reason: from getter */
    public final AssuranceSharedState getAssuranceSharedState() {
        return this.assuranceSharedState;
    }

    @JvmName
    public final void e(String sessionId) {
        AssuranceSharedState assuranceSharedState = this.assuranceSharedState;
        if (sessionId == null) {
            sessionId = "";
        }
        AssuranceSharedState assuranceSharedStateC = AssuranceSharedState.c(assuranceSharedState, null, sessionId, 1, null);
        this.assuranceSharedState = assuranceSharedStateC;
        d(assuranceSharedStateC);
    }

    private final AssuranceSharedState a(AssuranceSharedState persistedState) {
        if (persistedState.getClientId().length() == 0) {
            Q5.t.f("Assurance", "AssuranceSharedStateManager", "Assurance clientId persisted is empty, generating a new one.", new Object[0]);
            String string = UUID.randomUUID().toString();
            Intrinsics.i(string, "randomUUID().toString()");
            persistedState = new AssuranceSharedState(string, persistedState.getSessionId());
        }
        d(persistedState);
        return persistedState;
    }
}

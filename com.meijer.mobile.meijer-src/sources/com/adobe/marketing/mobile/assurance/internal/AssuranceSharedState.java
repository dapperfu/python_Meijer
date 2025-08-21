package com.adobe.marketing.mobile.assurance.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/C;", "", "", "clientId", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "a", "()Ljava/util/Map;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/adobe/marketing/mobile/assurance/internal/C;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "f", "e", "integrationId", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.C, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AssuranceSharedState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    public static /* synthetic */ AssuranceSharedState c(AssuranceSharedState assuranceSharedState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assuranceSharedState.clientId;
        }
        if ((i10 & 2) != 0) {
            str2 = assuranceSharedState.sessionId;
        }
        return assuranceSharedState.b(str, str2);
    }

    public final AssuranceSharedState b(String clientId, String sessionId) {
        Intrinsics.j(clientId, "clientId");
        Intrinsics.j(sessionId, "sessionId");
        return new AssuranceSharedState(clientId, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssuranceSharedState)) {
            return false;
        }
        AssuranceSharedState assuranceSharedState = (AssuranceSharedState) other;
        return Intrinsics.e(this.clientId, assuranceSharedState.clientId) && Intrinsics.e(this.sessionId, assuranceSharedState.sessionId);
    }

    public int hashCode() {
        return (this.clientId.hashCode() * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "AssuranceSharedState(clientId=" + this.clientId + ", sessionId=" + this.sessionId + ')';
    }

    public AssuranceSharedState(String clientId, String sessionId) {
        Intrinsics.j(clientId, "clientId");
        Intrinsics.j(sessionId, "sessionId");
        this.clientId = clientId;
        this.sessionId = sessionId;
    }

    private final String e() {
        if (StringsKt.s0(this.clientId) || StringsKt.s0(this.sessionId)) {
            return "";
        }
        return this.sessionId + '|' + this.clientId;
    }

    public final Map<String, Object> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!StringsKt.s0(this.clientId)) {
            linkedHashMap.put("clientid", this.clientId);
        }
        if (!StringsKt.s0(this.sessionId)) {
            linkedHashMap.put("sessionid", this.sessionId);
        }
        if (!StringsKt.s0(e())) {
            linkedHashMap.put("integrationid", e());
        }
        return linkedHashMap;
    }

    /* renamed from: d, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: f, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }
}

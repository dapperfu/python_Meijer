package com.adobe.marketing.mobile.analytics.internal;

import Q5.C5072d;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/c;", "", "", "payload", "", "timestampSec", "eventIdentifier", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "LQ5/d;", "d", "()LQ5/d;", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "c", "()J", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String payload;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timestampSec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String eventIdentifier;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/c$a;", "", "<init>", "()V", "LQ5/d;", "dataEntity", "Lcom/adobe/marketing/mobile/analytics/internal/c;", "a", "(LQ5/d;)Lcom/adobe/marketing/mobile/analytics/internal/c;", "", "EMPTY_JSON", "Ljava/lang/String;", "EVENT_IDENTIFIER", "PAYLOAD", "TIMESTAMP", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.analytics.internal.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a(C5072d dataEntity) {
            JSONObject jSONObject;
            Intrinsics.j(dataEntity, "dataEntity");
            String strA = dataEntity.a();
            if (strA == null) {
                strA = "";
            }
            try {
                jSONObject = new JSONObject(strA);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("payload");
            Intrinsics.i(strOptString, "jsonObject.optString(PAYLOAD)");
            long jOptLong = jSONObject.optLong("timestamp");
            String strOptString2 = jSONObject.optString("eventIdentifier");
            Intrinsics.i(strOptString2, "jsonObject.optString(EVENT_IDENTIFIER)");
            return new c(strOptString, jOptLong, strOptString2);
        }
    }

    public c(String payload, long j10, String eventIdentifier) {
        Intrinsics.j(payload, "payload");
        Intrinsics.j(eventIdentifier, "eventIdentifier");
        this.payload = payload;
        this.timestampSec = j10;
        this.eventIdentifier = eventIdentifier;
    }

    /* renamed from: a, reason: from getter */
    public final String getEventIdentifier() {
        return this.eventIdentifier;
    }

    /* renamed from: b, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    /* renamed from: c, reason: from getter */
    public final long getTimestampSec() {
        return this.timestampSec;
    }

    public final C5072d d() {
        String string;
        try {
            string = new JSONObject(MapsKt.o(TuplesKt.a("payload", this.payload), TuplesKt.a("timestamp", Long.valueOf(this.timestampSec)), TuplesKt.a("eventIdentifier", this.eventIdentifier))).toString();
        } catch (Exception unused) {
            string = "";
        }
        Intrinsics.i(string, "try {\n            JSONOb…     EMPTY_JSON\n        }");
        return new C5072d(string);
    }
}

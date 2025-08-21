package com.adobe.marketing.mobile.analytics.internal;

import R5.v;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8@@AX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f8@@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R$\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t8@@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006 "}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/e;", "", "LR5/v;", "dataStore", "<init>", "(LR5/v;)V", "", "e", "()V", "", "timestampInSeconds", "g", "(J)V", "a", "LR5/v;", "", "aidValue", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "aid", "vidValue", "c", "d", "h", "vid", "<set-?>", "J", "()J", "mostRecentHitTimeStampInSeconds", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final String f62920f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v dataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String aid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String vid;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long mostRecentHitTimeStampInSeconds;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adobe/marketing/mobile/analytics/internal/e$a;", "", "<init>", "()V", "", "CHARSET", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.analytics.internal.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return e.f62920f;
        }
    }

    static {
        String strName = StandardCharsets.UTF_8.name();
        Intrinsics.i(strName, "UTF_8.name()");
        f62920f = strName;
    }

    public e(v dataStore) {
        Intrinsics.j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    public final String b() {
        return this.dataStore.getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null);
    }

    public final long c() {
        return this.dataStore.getLong("mostRecentHitTimestampSeconds", 0L);
    }

    public final String d() {
        return this.dataStore.getString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", null);
    }

    public final void e() {
        this.mostRecentHitTimeStampInSeconds = 0L;
        h(null);
        f(null);
        this.dataStore.remove("mostRecentHitTimestampSeconds");
    }

    public final void f(String str) {
        if (str == null || str.length() == 0) {
            this.dataStore.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
        } else {
            this.dataStore.d("ADOBEMOBILE_STOREDDEFAULTS_AID", str);
        }
        this.aid = str;
    }

    public final void h(String str) {
        if (str == null || str.length() == 0) {
            this.dataStore.remove("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER");
        } else {
            this.dataStore.d("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", str);
        }
        this.vid = str;
    }

    public final void g(long timestampInSeconds) {
        if (c() < timestampInSeconds) {
            this.dataStore.b("mostRecentHitTimestampSeconds", timestampInSeconds);
            this.mostRecentHitTimeStampInSeconds = timestampInSeconds;
        }
    }
}

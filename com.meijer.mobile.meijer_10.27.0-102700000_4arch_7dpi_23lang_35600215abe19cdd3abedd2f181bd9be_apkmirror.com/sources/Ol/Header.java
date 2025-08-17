package Ol;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001\u001cBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b$\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b)\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b*\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u0017¨\u0006-"}, d2 = {"LOl/c;", "", "", "storeId", "", "transactionDateTime", "transactionDateTimeUTC", "eventTimeStamp", "eventTimeStampUTC", "deviceId", "deviceOS", "deviceAppVersion", "deviceOSVersion", "transactionStatus", "transactionId", "trackingId", "transactionNumber", "terminal", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/lang/String;", "j", "c", "k", "d", "e", "f", "h", "i", "n", "l", "m", "o", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ol.c, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class Header {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTimeUTC;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventTimeStamp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventTimeStampUTC;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceOS;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceAppVersion;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceOSVersion;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatus;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String trackingId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int transactionNumber;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int terminal;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOl/c$a;", "", "<init>", "()V", "LOl/c;", "a", "()LOl/c;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ol.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Header a() {
            return new Header(0, "", "", "", "", "", "", "", "", "", "", "", 0, 0);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return this.storeId == header.storeId && Intrinsics.e(this.transactionDateTime, header.transactionDateTime) && Intrinsics.e(this.transactionDateTimeUTC, header.transactionDateTimeUTC) && Intrinsics.e(this.eventTimeStamp, header.eventTimeStamp) && Intrinsics.e(this.eventTimeStampUTC, header.eventTimeStampUTC) && Intrinsics.e(this.deviceId, header.deviceId) && Intrinsics.e(this.deviceOS, header.deviceOS) && Intrinsics.e(this.deviceAppVersion, header.deviceAppVersion) && Intrinsics.e(this.deviceOSVersion, header.deviceOSVersion) && Intrinsics.e(this.transactionStatus, header.transactionStatus) && Intrinsics.e(this.transactionId, header.transactionId) && Intrinsics.e(this.trackingId, header.trackingId) && this.transactionNumber == header.transactionNumber && this.terminal == header.terminal;
    }

    public Header(int i10, String transactionDateTime, String transactionDateTimeUTC, String eventTimeStamp, String eventTimeStampUTC, String deviceId, String deviceOS, String deviceAppVersion, String deviceOSVersion, String transactionStatus, String transactionId, String trackingId, int i11, int i12) {
        Intrinsics.j(transactionDateTime, "transactionDateTime");
        Intrinsics.j(transactionDateTimeUTC, "transactionDateTimeUTC");
        Intrinsics.j(eventTimeStamp, "eventTimeStamp");
        Intrinsics.j(eventTimeStampUTC, "eventTimeStampUTC");
        Intrinsics.j(deviceId, "deviceId");
        Intrinsics.j(deviceOS, "deviceOS");
        Intrinsics.j(deviceAppVersion, "deviceAppVersion");
        Intrinsics.j(deviceOSVersion, "deviceOSVersion");
        Intrinsics.j(transactionStatus, "transactionStatus");
        Intrinsics.j(transactionId, "transactionId");
        Intrinsics.j(trackingId, "trackingId");
        this.storeId = i10;
        this.transactionDateTime = transactionDateTime;
        this.transactionDateTimeUTC = transactionDateTimeUTC;
        this.eventTimeStamp = eventTimeStamp;
        this.eventTimeStampUTC = eventTimeStampUTC;
        this.deviceId = deviceId;
        this.deviceOS = deviceOS;
        this.deviceAppVersion = deviceAppVersion;
        this.deviceOSVersion = deviceOSVersion;
        this.transactionStatus = transactionStatus;
        this.transactionId = transactionId;
        this.trackingId = trackingId;
        this.transactionNumber = i11;
        this.terminal = i12;
    }

    /* renamed from: a, reason: from getter */
    public final String getDeviceAppVersion() {
        return this.deviceAppVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceOS() {
        return this.deviceOS;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeviceOSVersion() {
        return this.deviceOSVersion;
    }

    /* renamed from: e, reason: from getter */
    public final String getEventTimeStamp() {
        return this.eventTimeStamp;
    }

    /* renamed from: f, reason: from getter */
    public final String getEventTimeStampUTC() {
        return this.eventTimeStampUTC;
    }

    /* renamed from: g, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: h, reason: from getter */
    public final int getTerminal() {
        return this.terminal;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.storeId) * 31) + this.transactionDateTime.hashCode()) * 31) + this.transactionDateTimeUTC.hashCode()) * 31) + this.eventTimeStamp.hashCode()) * 31) + this.eventTimeStampUTC.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceOS.hashCode()) * 31) + this.deviceAppVersion.hashCode()) * 31) + this.deviceOSVersion.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + Integer.hashCode(this.transactionNumber)) * 31) + Integer.hashCode(this.terminal);
    }

    /* renamed from: i, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    /* renamed from: j, reason: from getter */
    public final String getTransactionDateTime() {
        return this.transactionDateTime;
    }

    /* renamed from: k, reason: from getter */
    public final String getTransactionDateTimeUTC() {
        return this.transactionDateTimeUTC;
    }

    /* renamed from: l, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: m, reason: from getter */
    public final int getTransactionNumber() {
        return this.transactionNumber;
    }

    /* renamed from: n, reason: from getter */
    public final String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String toString() {
        return "Header(storeId=" + this.storeId + ", transactionDateTime=" + this.transactionDateTime + ", transactionDateTimeUTC=" + this.transactionDateTimeUTC + ", eventTimeStamp=" + this.eventTimeStamp + ", eventTimeStampUTC=" + this.eventTimeStampUTC + ", deviceId=" + this.deviceId + ", deviceOS=" + this.deviceOS + ", deviceAppVersion=" + this.deviceAppVersion + ", deviceOSVersion=" + this.deviceOSVersion + ", transactionStatus=" + this.transactionStatus + ", transactionId=" + this.transactionId + ", trackingId=" + this.trackingId + ", transactionNumber=" + this.transactionNumber + ", terminal=" + this.terminal + ')';
    }
}

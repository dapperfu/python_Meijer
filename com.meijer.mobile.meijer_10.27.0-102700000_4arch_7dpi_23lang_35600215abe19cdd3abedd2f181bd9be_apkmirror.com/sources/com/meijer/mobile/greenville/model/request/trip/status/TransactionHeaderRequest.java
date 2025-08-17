package com.meijer.mobile.greenville.model.request.trip.status;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u009c\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b(\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b)\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b#\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "", "", "transactionDateTime", "transactionDateTimeUTC", "", "storeId", "terminal", "eventTimeStamp", "eventTimeStampUTC", "deviceId", "deviceOS", "deviceAppVersion", "deviceOSVersion", "transactionStatus", "transactionId", "trackingId", "transactionNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/meijer/mobile/greenville/model/request/trip/status/TransactionHeaderRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "k", "c", "I", "g", "d", "h", "e", "f", "i", "n", "l", "m", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransactionHeaderRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionDateTimeUTC;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int terminal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventTimeStamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventTimeStampUTC;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceOS;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceAppVersion;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceOSVersion;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionStatus;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String trackingId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int transactionNumber;

    public final TransactionHeaderRequest copy(@g(name = "transactionDateTime") String transactionDateTime, @g(name = "transactionDateTimeUTC") String transactionDateTimeUTC, @g(name = "storeId") int storeId, @g(name = "terminal") int terminal, @g(name = "eventTimeStamp") String eventTimeStamp, @g(name = "eventTimeStampUTC") String eventTimeStampUTC, @g(name = "deviceId") String deviceId, @g(name = "deviceOS") String deviceOS, @g(name = "deviceAppVersion") String deviceAppVersion, @g(name = "deviceOSVersion") String deviceOSVersion, @g(name = "transactionStatus") String transactionStatus, @g(name = "transactionId") String transactionId, @g(name = "trackingId") String trackingId, @g(name = "transactionNumber") int transactionNumber) {
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
        return new TransactionHeaderRequest(transactionDateTime, transactionDateTimeUTC, storeId, terminal, eventTimeStamp, eventTimeStampUTC, deviceId, deviceOS, deviceAppVersion, deviceOSVersion, transactionStatus, transactionId, trackingId, transactionNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionHeaderRequest)) {
            return false;
        }
        TransactionHeaderRequest transactionHeaderRequest = (TransactionHeaderRequest) other;
        return Intrinsics.e(this.transactionDateTime, transactionHeaderRequest.transactionDateTime) && Intrinsics.e(this.transactionDateTimeUTC, transactionHeaderRequest.transactionDateTimeUTC) && this.storeId == transactionHeaderRequest.storeId && this.terminal == transactionHeaderRequest.terminal && Intrinsics.e(this.eventTimeStamp, transactionHeaderRequest.eventTimeStamp) && Intrinsics.e(this.eventTimeStampUTC, transactionHeaderRequest.eventTimeStampUTC) && Intrinsics.e(this.deviceId, transactionHeaderRequest.deviceId) && Intrinsics.e(this.deviceOS, transactionHeaderRequest.deviceOS) && Intrinsics.e(this.deviceAppVersion, transactionHeaderRequest.deviceAppVersion) && Intrinsics.e(this.deviceOSVersion, transactionHeaderRequest.deviceOSVersion) && Intrinsics.e(this.transactionStatus, transactionHeaderRequest.transactionStatus) && Intrinsics.e(this.transactionId, transactionHeaderRequest.transactionId) && Intrinsics.e(this.trackingId, transactionHeaderRequest.trackingId) && this.transactionNumber == transactionHeaderRequest.transactionNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.transactionDateTime.hashCode() * 31) + this.transactionDateTimeUTC.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31) + Integer.hashCode(this.terminal)) * 31) + this.eventTimeStamp.hashCode()) * 31) + this.eventTimeStampUTC.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceOS.hashCode()) * 31) + this.deviceAppVersion.hashCode()) * 31) + this.deviceOSVersion.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + Integer.hashCode(this.transactionNumber);
    }

    public String toString() {
        return "TransactionHeaderRequest(transactionDateTime=" + this.transactionDateTime + ", transactionDateTimeUTC=" + this.transactionDateTimeUTC + ", storeId=" + this.storeId + ", terminal=" + this.terminal + ", eventTimeStamp=" + this.eventTimeStamp + ", eventTimeStampUTC=" + this.eventTimeStampUTC + ", deviceId=" + this.deviceId + ", deviceOS=" + this.deviceOS + ", deviceAppVersion=" + this.deviceAppVersion + ", deviceOSVersion=" + this.deviceOSVersion + ", transactionStatus=" + this.transactionStatus + ", transactionId=" + this.transactionId + ", trackingId=" + this.trackingId + ", transactionNumber=" + this.transactionNumber + ')';
    }

    public TransactionHeaderRequest(@g(name = "transactionDateTime") String transactionDateTime, @g(name = "transactionDateTimeUTC") String transactionDateTimeUTC, @g(name = "storeId") int i10, @g(name = "terminal") int i11, @g(name = "eventTimeStamp") String eventTimeStamp, @g(name = "eventTimeStampUTC") String eventTimeStampUTC, @g(name = "deviceId") String deviceId, @g(name = "deviceOS") String deviceOS, @g(name = "deviceAppVersion") String deviceAppVersion, @g(name = "deviceOSVersion") String deviceOSVersion, @g(name = "transactionStatus") String transactionStatus, @g(name = "transactionId") String transactionId, @g(name = "trackingId") String trackingId, @g(name = "transactionNumber") int i12) {
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
        this.transactionDateTime = transactionDateTime;
        this.transactionDateTimeUTC = transactionDateTimeUTC;
        this.storeId = i10;
        this.terminal = i11;
        this.eventTimeStamp = eventTimeStamp;
        this.eventTimeStampUTC = eventTimeStampUTC;
        this.deviceId = deviceId;
        this.deviceOS = deviceOS;
        this.deviceAppVersion = deviceAppVersion;
        this.deviceOSVersion = deviceOSVersion;
        this.transactionStatus = transactionStatus;
        this.transactionId = transactionId;
        this.trackingId = trackingId;
        this.transactionNumber = i12;
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
}

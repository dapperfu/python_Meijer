package com.meijer.mobile.greenville.model.request.item.update;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u009c\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u00042\b\b\u0003\u0010\u000e\u001a\u00020\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u00042\b\b\u0003\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010\u0017R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010\u0019¨\u0006<"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequestHeader;", "", "", "storeId", "", "transactionDateTime", "transactionDateTimeUTC", "eventTimeStamp", "eventTimeStampUTC", "deviceId", "deviceOS", "deviceAppVersion", "deviceOSVersion", "transactionStatus", "transactionId", "trackingId", "transactionNumber", "terminal", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequestHeader;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStoreId", "b", "Ljava/lang/String;", "getTransactionDateTime", "c", "getTransactionDateTimeUTC", "d", "getEventTimeStamp", "e", "getEventTimeStampUTC", "f", "getDeviceId", "g", "getDeviceOS", "h", "getDeviceAppVersion", "i", "getDeviceOSVersion", "j", "getTransactionStatus", "k", "getTransactionId", "l", "getTrackingId", "m", "getTransactionNumber", "n", "getTerminal", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UpdateItemRequestHeader {

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

    public final UpdateItemRequestHeader copy(@g(name = "storeId") int storeId, @g(name = "transactionDateTime") String transactionDateTime, @g(name = "transactionDateTimeUTC") String transactionDateTimeUTC, @g(name = "eventTimeStamp") String eventTimeStamp, @g(name = "eventTimeStampUTC") String eventTimeStampUTC, @g(name = "deviceId") String deviceId, @g(name = "deviceOS") String deviceOS, @g(name = "deviceAppVersion") String deviceAppVersion, @g(name = "deviceOSVersion") String deviceOSVersion, @g(name = "transactionStatus") String transactionStatus, @g(name = "transactionId") String transactionId, @g(name = "trackingId") String trackingId, @g(name = "transactionNumber") int transactionNumber, @g(name = "terminal") int terminal) {
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
        return new UpdateItemRequestHeader(storeId, transactionDateTime, transactionDateTimeUTC, eventTimeStamp, eventTimeStampUTC, deviceId, deviceOS, deviceAppVersion, deviceOSVersion, transactionStatus, transactionId, trackingId, transactionNumber, terminal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateItemRequestHeader)) {
            return false;
        }
        UpdateItemRequestHeader updateItemRequestHeader = (UpdateItemRequestHeader) other;
        return this.storeId == updateItemRequestHeader.storeId && Intrinsics.e(this.transactionDateTime, updateItemRequestHeader.transactionDateTime) && Intrinsics.e(this.transactionDateTimeUTC, updateItemRequestHeader.transactionDateTimeUTC) && Intrinsics.e(this.eventTimeStamp, updateItemRequestHeader.eventTimeStamp) && Intrinsics.e(this.eventTimeStampUTC, updateItemRequestHeader.eventTimeStampUTC) && Intrinsics.e(this.deviceId, updateItemRequestHeader.deviceId) && Intrinsics.e(this.deviceOS, updateItemRequestHeader.deviceOS) && Intrinsics.e(this.deviceAppVersion, updateItemRequestHeader.deviceAppVersion) && Intrinsics.e(this.deviceOSVersion, updateItemRequestHeader.deviceOSVersion) && Intrinsics.e(this.transactionStatus, updateItemRequestHeader.transactionStatus) && Intrinsics.e(this.transactionId, updateItemRequestHeader.transactionId) && Intrinsics.e(this.trackingId, updateItemRequestHeader.trackingId) && this.transactionNumber == updateItemRequestHeader.transactionNumber && this.terminal == updateItemRequestHeader.terminal;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.storeId) * 31) + this.transactionDateTime.hashCode()) * 31) + this.transactionDateTimeUTC.hashCode()) * 31) + this.eventTimeStamp.hashCode()) * 31) + this.eventTimeStampUTC.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceOS.hashCode()) * 31) + this.deviceAppVersion.hashCode()) * 31) + this.deviceOSVersion.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.trackingId.hashCode()) * 31) + Integer.hashCode(this.transactionNumber)) * 31) + Integer.hashCode(this.terminal);
    }

    public String toString() {
        return "UpdateItemRequestHeader(storeId=" + this.storeId + ", transactionDateTime=" + this.transactionDateTime + ", transactionDateTimeUTC=" + this.transactionDateTimeUTC + ", eventTimeStamp=" + this.eventTimeStamp + ", eventTimeStampUTC=" + this.eventTimeStampUTC + ", deviceId=" + this.deviceId + ", deviceOS=" + this.deviceOS + ", deviceAppVersion=" + this.deviceAppVersion + ", deviceOSVersion=" + this.deviceOSVersion + ", transactionStatus=" + this.transactionStatus + ", transactionId=" + this.transactionId + ", trackingId=" + this.trackingId + ", transactionNumber=" + this.transactionNumber + ", terminal=" + this.terminal + ')';
    }

    public UpdateItemRequestHeader(@g(name = "storeId") int i10, @g(name = "transactionDateTime") String transactionDateTime, @g(name = "transactionDateTimeUTC") String transactionDateTimeUTC, @g(name = "eventTimeStamp") String eventTimeStamp, @g(name = "eventTimeStampUTC") String eventTimeStampUTC, @g(name = "deviceId") String deviceId, @g(name = "deviceOS") String deviceOS, @g(name = "deviceAppVersion") String deviceAppVersion, @g(name = "deviceOSVersion") String deviceOSVersion, @g(name = "transactionStatus") String transactionStatus, @g(name = "transactionId") String transactionId, @g(name = "trackingId") String trackingId, @g(name = "transactionNumber") int i11, @g(name = "terminal") int i12) {
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
}

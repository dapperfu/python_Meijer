package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0016B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\u0010¨\u0006("}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceRequest;", "", "", "accountId", "", "deviceType", "", "channelId", "", "isDeviceNotificationEnabled", "updatedBy", "<init>", "(JILjava/lang/String;ZLjava/lang/String;)V", "copy", "(JILjava/lang/String;ZLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "setAccountId", "(J)V", "b", "I", "c", "Ljava/lang/String;", "setChannelId", "(Ljava/lang/String;)V", "d", "Z", "e", "()Z", "setDeviceNotificationEnabled", "(Z)V", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RegisterNotificationDeviceRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deviceType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String channelId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isDeviceNotificationEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    public RegisterNotificationDeviceRequest(@g(name = "accountId") long j10, @g(name = "deviceType") int i10, @g(name = "channelId") String str, @g(name = "isDeviceNotificationEnabled") boolean z10, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(updatedBy, "updatedBy");
        this.accountId = j10;
        this.deviceType = i10;
        this.channelId = str;
        this.isDeviceNotificationEnabled = z10;
        this.updatedBy = updatedBy;
    }

    public final RegisterNotificationDeviceRequest copy(@g(name = "accountId") long accountId, @g(name = "deviceType") int deviceType, @g(name = "channelId") String channelId, @g(name = "isDeviceNotificationEnabled") boolean isDeviceNotificationEnabled, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(updatedBy, "updatedBy");
        return new RegisterNotificationDeviceRequest(accountId, deviceType, channelId, isDeviceNotificationEnabled, updatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterNotificationDeviceRequest)) {
            return false;
        }
        RegisterNotificationDeviceRequest registerNotificationDeviceRequest = (RegisterNotificationDeviceRequest) other;
        return this.accountId == registerNotificationDeviceRequest.accountId && this.deviceType == registerNotificationDeviceRequest.deviceType && Intrinsics.e(this.channelId, registerNotificationDeviceRequest.channelId) && this.isDeviceNotificationEnabled == registerNotificationDeviceRequest.isDeviceNotificationEnabled && Intrinsics.e(this.updatedBy, registerNotificationDeviceRequest.updatedBy);
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.accountId) * 31) + Integer.hashCode(this.deviceType)) * 31;
        String str = this.channelId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isDeviceNotificationEnabled)) * 31) + this.updatedBy.hashCode();
    }

    public String toString() {
        return "RegisterNotificationDeviceRequest(accountId=" + this.accountId + ", deviceType=" + this.deviceType + ", channelId=" + this.channelId + ", isDeviceNotificationEnabled=" + this.isDeviceNotificationEnabled + ", updatedBy=" + this.updatedBy + ')';
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: c, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: d, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDeviceNotificationEnabled() {
        return this.isDeviceNotificationEnabled;
    }

    public /* synthetic */ RegisterNotificationDeviceRequest(long j10, int i10, String str, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, str, z10, (i11 & 16) != 0 ? "DIGITALMMA" : str2);
    }
}

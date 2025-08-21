package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;", "", "", PreferencesHelper.PREF_ID, "accountId", "", "success", "<init>", "(JJZ)V", "copy", "(JJZ)Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "setId", "(J)V", "setAccountId", "c", "Z", "()Z", "setSuccess", "(Z)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RegisterNotificationDeviceResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean success;

    public RegisterNotificationDeviceResponseJson() {
        this(0L, 0L, false, 7, null);
    }

    public final RegisterNotificationDeviceResponseJson copy(@g(name = PreferencesHelper.PREF_ID) long id2, @g(name = "accountId") long accountId, @g(name = "success") boolean success) {
        return new RegisterNotificationDeviceResponseJson(id2, accountId, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterNotificationDeviceResponseJson)) {
            return false;
        }
        RegisterNotificationDeviceResponseJson registerNotificationDeviceResponseJson = (RegisterNotificationDeviceResponseJson) other;
        return this.id == registerNotificationDeviceResponseJson.id && this.accountId == registerNotificationDeviceResponseJson.accountId && this.success == registerNotificationDeviceResponseJson.success;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + Long.hashCode(this.accountId)) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "RegisterNotificationDeviceResponseJson(id=" + this.id + ", accountId=" + this.accountId + ", success=" + this.success + ')';
    }

    public RegisterNotificationDeviceResponseJson(@g(name = PreferencesHelper.PREF_ID) long j10, @g(name = "accountId") long j11, @g(name = "success") boolean z10) {
        this.id = j10;
        this.accountId = j11;
        this.success = z10;
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public /* synthetic */ RegisterNotificationDeviceResponseJson(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? false : z10);
    }
}

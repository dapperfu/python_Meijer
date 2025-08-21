package Ma;

import H9.h;
import j9.DeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;
import v9.C17649a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0097\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"LMa/b;", "", "", "merchantId", "Lj9/c;", "deviceInfo", "Lu9/a;", "timestampProvider", "Lv9/a;", "uuidProvider", "LH9/h;", "keyValueStore", "<init>", "(Ljava/lang/String;Lj9/c;Lu9/a;Lv9/a;LH9/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "setMerchantId", "(Ljava/lang/String;)V", "b", "Lj9/c;", "()Lj9/c;", "Lu9/a;", "d", "()Lu9/a;", "Lv9/a;", "e", "()Lv9/a;", "LH9/h;", "()LH9/h;", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ma.b, reason: from toString */
/* loaded from: classes4.dex */
public /* data */ class PredictRequestContext {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String merchantId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h keyValueStore;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictRequestContext)) {
            return false;
        }
        PredictRequestContext predictRequestContext = (PredictRequestContext) other;
        return Intrinsics.e(getMerchantId(), predictRequestContext.getMerchantId()) && Intrinsics.e(getDeviceInfo(), predictRequestContext.getDeviceInfo()) && Intrinsics.e(getTimestampProvider(), predictRequestContext.getTimestampProvider()) && Intrinsics.e(getUuidProvider(), predictRequestContext.getUuidProvider()) && Intrinsics.e(getKeyValueStore(), predictRequestContext.getKeyValueStore());
    }

    public PredictRequestContext(String str, DeviceInfo deviceInfo, C17361a timestampProvider, C17649a uuidProvider, h keyValueStore) {
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(keyValueStore, "keyValueStore");
        this.merchantId = str;
        this.deviceInfo = deviceInfo;
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.keyValueStore = keyValueStore;
    }

    /* renamed from: a, reason: from getter */
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    /* renamed from: b, reason: from getter */
    public h getKeyValueStore() {
        return this.keyValueStore;
    }

    /* renamed from: c, reason: from getter */
    public String getMerchantId() {
        return this.merchantId;
    }

    /* renamed from: d, reason: from getter */
    public C17361a getTimestampProvider() {
        return this.timestampProvider;
    }

    /* renamed from: e, reason: from getter */
    public C17649a getUuidProvider() {
        return this.uuidProvider;
    }

    public int hashCode() {
        int iHashCode;
        if (getMerchantId() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getMerchantId().hashCode();
        }
        return (((((((iHashCode * 31) + getDeviceInfo().hashCode()) * 31) + getTimestampProvider().hashCode()) * 31) + getUuidProvider().hashCode()) * 31) + getKeyValueStore().hashCode();
    }

    public String toString() {
        return "PredictRequestContext(merchantId=" + getMerchantId() + ", deviceInfo=" + getDeviceInfo() + ", timestampProvider=" + getTimestampProvider() + ", uuidProvider=" + getUuidProvider() + ", keyValueStore=" + getKeyValueStore() + ")";
    }
}

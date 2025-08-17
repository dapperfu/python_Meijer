package U8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b\n\u0010\u0012¨\u0006#"}, d2 = {"LU8/a;", "", "", "channelId", "", "importance", "", "isCanBypassDnd", "isCanShowBadge", "isShouldVibrate", "isShouldShowLights", "<init>", "(Ljava/lang/String;IZZZZ)V", "a", "()Ljava/lang/String;", "b", "()I", "c", "()Z", "d", "e", "f", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "I", "h", "Z", "i", "j", "k", "core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: U8.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ChannelSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String channelId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int importance;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCanBypassDnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCanShowBadge;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShouldVibrate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShouldShowLights;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelSettings)) {
            return false;
        }
        ChannelSettings channelSettings = (ChannelSettings) other;
        return Intrinsics.e(this.channelId, channelSettings.channelId) && this.importance == channelSettings.importance && this.isCanBypassDnd == channelSettings.isCanBypassDnd && this.isCanShowBadge == channelSettings.isCanShowBadge && this.isShouldVibrate == channelSettings.isShouldVibrate && this.isShouldShowLights == channelSettings.isShouldShowLights;
    }

    public ChannelSettings(String channelId, int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.j(channelId, "channelId");
        this.channelId = channelId;
        this.importance = i10;
        this.isCanBypassDnd = z10;
        this.isCanShowBadge = z11;
        this.isShouldVibrate = z12;
        this.isShouldShowLights = z13;
    }

    /* renamed from: a, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: b, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsCanBypassDnd() {
        return this.isCanBypassDnd;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsCanShowBadge() {
        return this.isCanShowBadge;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsShouldVibrate() {
        return this.isShouldVibrate;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsShouldShowLights() {
        return this.isShouldShowLights;
    }

    public final String g() {
        return this.channelId;
    }

    public final int h() {
        return this.importance;
    }

    public int hashCode() {
        return (((((((((this.channelId.hashCode() * 31) + Integer.hashCode(this.importance)) * 31) + Boolean.hashCode(this.isCanBypassDnd)) * 31) + Boolean.hashCode(this.isCanShowBadge)) * 31) + Boolean.hashCode(this.isShouldVibrate)) * 31) + Boolean.hashCode(this.isShouldShowLights);
    }

    public final boolean i() {
        return this.isCanBypassDnd;
    }

    public final boolean j() {
        return this.isCanShowBadge;
    }

    public final boolean k() {
        return this.isShouldVibrate;
    }

    public String toString() {
        return "ChannelSettings(channelId=" + this.channelId + ", importance=" + this.importance + ", isCanBypassDnd=" + this.isCanBypassDnd + ", isCanShowBadge=" + this.isCanShowBadge + ", isShouldVibrate=" + this.isShouldVibrate + ", isShouldShowLights=" + this.isShouldShowLights + ")";
    }
}

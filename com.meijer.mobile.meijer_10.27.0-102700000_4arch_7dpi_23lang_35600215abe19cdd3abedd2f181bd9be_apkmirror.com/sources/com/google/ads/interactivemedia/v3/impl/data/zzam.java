package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
final class zzam extends zzcc {
    private final boolean attached;
    private final zzbb bounds;
    private final String detailedReason;
    private final boolean hidden;
    private final FriendlyObstructionPurpose purpose;
    private final String type;

    private zzam(boolean z10, zzbb zzbbVar, String str, boolean z11, FriendlyObstructionPurpose friendlyObstructionPurpose, String str2) {
        this.attached = z10;
        this.bounds = zzbbVar;
        this.detailedReason = str;
        this.hidden = z11;
        this.purpose = friendlyObstructionPurpose;
        this.type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    zzbb bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj;
            if (this.attached == zzccVar.attached() && this.bounds.equals(zzccVar.bounds()) && ((str = this.detailedReason) != null ? str.equals(zzccVar.detailedReason()) : zzccVar.detailedReason() == null) && this.hidden == zzccVar.hidden() && this.purpose.equals(zzccVar.purpose()) && this.type.equals(zzccVar.type())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcc
    String type() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode();
        String str = this.detailedReason;
        return (((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003) ^ this.type.hashCode();
    }

    public String toString() {
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.purpose;
        return "ObstructionData{attached=" + this.attached + ", bounds=" + String.valueOf(this.bounds) + ", detailedReason=" + this.detailedReason + ", hidden=" + this.hidden + ", purpose=" + String.valueOf(friendlyObstructionPurpose) + ", type=" + this.type + "}";
    }
}

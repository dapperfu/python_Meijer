package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
final class zzv extends zzbh {
    private final String detailedReason;
    private final FriendlyObstructionPurpose purpose;
    private final View view;

    private zzv(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.detailedReason = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbh
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbh) {
            zzbh zzbhVar = (zzbh) obj;
            if (this.view.equals(zzbhVar.view()) && this.purpose.equals(zzbhVar.purpose()) && ((str = this.detailedReason) != null ? str.equals(zzbhVar.detailedReason()) : zzbhVar.detailedReason() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbh
    public FriendlyObstructionPurpose purpose() {
        return this.purpose;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbh
    public View view() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = ((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode();
        String str = this.detailedReason;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.purpose;
        return "FriendlyObstructionImpl{view=" + String.valueOf(this.view) + ", purpose=" + String.valueOf(friendlyObstructionPurpose) + ", detailedReason=" + this.detailedReason + "}";
    }
}

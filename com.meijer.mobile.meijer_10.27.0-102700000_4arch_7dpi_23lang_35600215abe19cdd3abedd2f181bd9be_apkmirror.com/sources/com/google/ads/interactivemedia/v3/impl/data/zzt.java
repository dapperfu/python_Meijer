package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
final class zzt implements zzbg {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    zzt() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbg detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbh build() {
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        View view = this.view;
        if (view != null && (friendlyObstructionPurpose = this.purpose) != null) {
            return new zzv(view, friendlyObstructionPurpose, this.detailedReason);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.view == null) {
            sb2.append(" view");
        }
        if (this.purpose == null) {
            sb2.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbg purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbg view(View view) {
        if (view == null) {
            throw new NullPointerException("Null view");
        }
        this.view = view;
        return this;
    }
}

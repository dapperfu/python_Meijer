package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public abstract class zzbh implements FriendlyObstruction {
    public static zzbg builder() {
        return new zzt();
    }

    public abstract String detailedReason();

    public abstract FriendlyObstructionPurpose purpose();

    public abstract View view();

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public String getDetailedReason() {
        return detailedReason();
    }

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public FriendlyObstructionPurpose getPurpose() {
        return purpose();
    }

    @Override // com.google.ads.interactivemedia.v3.api.FriendlyObstruction
    public View getView() {
        return view();
    }
}

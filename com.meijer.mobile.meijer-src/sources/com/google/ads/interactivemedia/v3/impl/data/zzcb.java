package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
public abstract class zzcb {
    public abstract zzcb attached(boolean z10);

    public abstract zzcb bounds(zzbb zzbbVar);

    public abstract zzcc build();

    public abstract zzcb detailedReason(String str);

    public abstract zzcb hidden(boolean z10);

    public abstract zzcb purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract zzcb type(String str);

    zzcb view(View view) {
        return attached(view.isAttachedToWindow()).bounds(zzbb.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}

package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class zzca {
    public abstract zzcd build();

    public abstract zzca obstructions(List<zzcc> list);

    public zzca friendlyObstructions(Collection<FriendlyObstruction> collection) {
        ArrayList arrayList = new ArrayList();
        for (FriendlyObstruction friendlyObstruction : collection) {
            arrayList.add(zzcc.builder().view(friendlyObstruction.getView()).purpose(friendlyObstruction.getPurpose()).detailedReason(friendlyObstruction.getDetailedReason()).build());
        }
        return obstructions(arrayList);
    }
}

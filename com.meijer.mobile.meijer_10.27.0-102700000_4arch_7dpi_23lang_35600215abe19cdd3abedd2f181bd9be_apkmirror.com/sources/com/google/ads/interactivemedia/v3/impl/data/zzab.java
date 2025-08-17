package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;

/* loaded from: classes4.dex */
final class zzab extends zzbm {
    private final List<zzbl> icons;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbm
    public List<zzbl> icons() {
        return this.icons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbm) {
            return this.icons.equals(((zzbm) obj).icons());
        }
        return false;
    }

    public int hashCode() {
        return this.icons.hashCode() ^ 1000003;
    }

    public String toString() {
        return "IconsViewData{icons=" + String.valueOf(this.icons) + "}";
    }

    zzab(List<zzbl> list) {
        if (list != null) {
            this.icons = list;
            return;
        }
        throw new NullPointerException("Null icons");
    }
}

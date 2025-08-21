package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzps(zza = zzaa.class)
/* loaded from: classes4.dex */
public abstract class zzbl implements com.google.ads.interactivemedia.v3.api.zzb {
    public abstract String alternateText();

    public abstract int duration();

    public abstract List<zzbk> fallbackImages();

    public abstract int height();

    public abstract int id();

    public abstract String imageUrl();

    public abstract int offset();

    public abstract double pixelRatio();

    public abstract int width();

    public abstract String xPosition();

    public abstract String yPosition();

    public List getIconClickFallbackImages() {
        ArrayList arrayList = new ArrayList();
        Iterator<zzbk> it = fallbackImages().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public int getDuration() {
        return duration();
    }

    public int getHeight() {
        return height();
    }

    @Override // com.google.ads.interactivemedia.v3.api.zzb
    public int getId() {
        return id();
    }

    public int getOffset() {
        return offset();
    }

    public double getPixelRatio() {
        return pixelRatio();
    }

    public String getResourceUri() {
        return imageUrl();
    }

    public int getWidth() {
        return width();
    }

    public String getXPosition() {
        return xPosition();
    }

    public String getYPosition() {
        return yPosition();
    }
}

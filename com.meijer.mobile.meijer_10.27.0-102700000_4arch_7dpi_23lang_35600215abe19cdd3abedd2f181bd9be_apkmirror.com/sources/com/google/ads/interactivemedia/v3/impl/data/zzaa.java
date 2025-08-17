package com.google.ads.interactivemedia.v3.impl.data;

import java.util.List;

/* loaded from: classes4.dex */
final class zzaa extends zzbl {
    private final String alternateText;
    private final int duration;
    private final List<zzbk> fallbackImages;
    private final int height;

    /* renamed from: id, reason: collision with root package name */
    private final int f64396id;
    private final String imageUrl;
    private final int offset;
    private final double pixelRatio;
    private final int width;
    private final String xPosition;
    private final String yPosition;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public String alternateText() {
        return this.alternateText;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public int duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbl) {
            zzbl zzblVar = (zzbl) obj;
            if (this.f64396id == zzblVar.id() && this.width == zzblVar.width() && this.height == zzblVar.height() && Double.doubleToLongBits(this.pixelRatio) == Double.doubleToLongBits(zzblVar.pixelRatio()) && this.xPosition.equals(zzblVar.xPosition()) && this.yPosition.equals(zzblVar.yPosition()) && this.offset == zzblVar.offset() && this.duration == zzblVar.duration() && this.imageUrl.equals(zzblVar.imageUrl()) && this.alternateText.equals(zzblVar.alternateText()) && this.fallbackImages.equals(zzblVar.fallbackImages())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public List<zzbk> fallbackImages() {
        return this.fallbackImages;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public int id() {
        return this.f64396id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public String imageUrl() {
        return this.imageUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public int offset() {
        return this.offset;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public double pixelRatio() {
        return this.pixelRatio;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public int width() {
        return this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public String xPosition() {
        return this.xPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbl
    public String yPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(this.pixelRatio) >>> 32) ^ Double.doubleToLongBits(this.pixelRatio);
        int i10 = (int) jDoubleToLongBits;
        return ((((((((((((((i10 ^ ((((((this.f64396id ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003)) * 1000003) ^ this.xPosition.hashCode()) * 1000003) ^ this.yPosition.hashCode()) * 1000003) ^ this.offset) * 1000003) ^ this.duration) * 1000003) ^ this.imageUrl.hashCode()) * 1000003) ^ this.alternateText.hashCode()) * 1000003) ^ this.fallbackImages.hashCode();
    }

    public String toString() {
        return "IconData{id=" + this.f64396id + ", width=" + this.width + ", height=" + this.height + ", pixelRatio=" + this.pixelRatio + ", xPosition=" + this.xPosition + ", yPosition=" + this.yPosition + ", offset=" + this.offset + ", duration=" + this.duration + ", imageUrl=" + this.imageUrl + ", alternateText=" + this.alternateText + ", fallbackImages=" + String.valueOf(this.fallbackImages) + "}";
    }

    zzaa(int i10, int i11, int i12, double d10, String str, String str2, int i13, int i14, String str3, String str4, List<zzbk> list) {
        this.f64396id = i10;
        this.width = i11;
        this.height = i12;
        this.pixelRatio = d10;
        if (str != null) {
            this.xPosition = str;
            if (str2 != null) {
                this.yPosition = str2;
                this.offset = i13;
                this.duration = i14;
                if (str3 != null) {
                    this.imageUrl = str3;
                    if (str4 != null) {
                        this.alternateText = str4;
                        if (list != null) {
                            this.fallbackImages = list;
                            return;
                        }
                        throw new NullPointerException("Null fallbackImages");
                    }
                    throw new NullPointerException("Null alternateText");
                }
                throw new NullPointerException("Null imageUrl");
            }
            throw new NullPointerException("Null yPosition");
        }
        throw new NullPointerException("Null xPosition");
    }
}

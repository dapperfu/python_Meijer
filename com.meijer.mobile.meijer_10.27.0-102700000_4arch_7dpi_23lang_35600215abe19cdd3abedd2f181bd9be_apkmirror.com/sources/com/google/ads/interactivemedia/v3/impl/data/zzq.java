package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzq extends zzbb {
    private final int height;
    private final int left;
    private final int top;
    private final int width;

    private zzq(int i10, int i11, int i12, int i13) {
        this.left = i10;
        this.top = i11;
        this.height = i12;
        this.width = i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.left == zzbbVar.left() && this.top == zzbbVar.top() && this.height == zzbbVar.height() && this.width == zzbbVar.width()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.left ^ 1000003) * 1000003) ^ this.top) * 1000003) ^ this.height) * 1000003) ^ this.width;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int height() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int left() {
        return this.left;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int top() {
        return this.top;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbb
    public int width() {
        return this.width;
    }

    public String toString() {
        return "BoundingRectData{left=" + this.left + ", top=" + this.top + ", height=" + this.height + ", width=" + this.width + "}";
    }
}

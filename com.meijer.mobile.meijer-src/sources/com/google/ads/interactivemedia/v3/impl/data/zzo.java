package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzo extends zzba {
    private int height;
    private int left;
    private byte set$0;
    private int top;
    private int width;

    zzo() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzba height(int i10) {
        this.height = i10;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzba left(int i10) {
        this.left = i10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzba top(int i10) {
        this.top = i10;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzba width(int i10) {
        this.width = i10;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzbb build() {
        if (this.set$0 == 15) {
            return new zzq(this.left, this.top, this.height, this.width);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" left");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" top");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" height");
        }
        if ((this.set$0 & 8) == 0) {
            sb2.append(" width");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

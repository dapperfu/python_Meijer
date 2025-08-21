package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;

/* loaded from: classes4.dex */
final class zzak extends zzcb {
    private boolean attached;
    private zzbb bounds;
    private String detailedReason;
    private boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private byte set$0;
    private String type;

    zzak() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb attached(boolean z10) {
        this.attached = z10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb hidden(boolean z10) {
        this.hidden = z10;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb bounds(zzbb zzbbVar) {
        if (zzbbVar == null) {
            throw new NullPointerException("Null bounds");
        }
        this.bounds = zzbbVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcc build() {
        zzbb zzbbVar;
        FriendlyObstructionPurpose friendlyObstructionPurpose;
        String str;
        if (this.set$0 == 3 && (zzbbVar = this.bounds) != null && (friendlyObstructionPurpose = this.purpose) != null && (str = this.type) != null) {
            return new zzam(this.attached, zzbbVar, this.detailedReason, this.hidden, friendlyObstructionPurpose, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" attached");
        }
        if (this.bounds == null) {
            sb2.append(" bounds");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" hidden");
        }
        if (this.purpose == null) {
            sb2.append(" purpose");
        }
        if (this.type == null) {
            sb2.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose == null) {
            throw new NullPointerException("Null purpose");
        }
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcb
    public zzcb type(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        return this;
    }
}

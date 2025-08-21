package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzi implements zza {
    private String appState;
    private String eventId;
    private long nativeTime;
    private zzbb nativeViewBounds;
    private boolean nativeViewHidden;
    private zzbb nativeViewVisibleBounds;
    private double nativeVolume;
    private String queryId;
    private byte set$0;

    zzi() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeTime(long j10) {
        this.nativeTime = j10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewHidden(boolean z10) {
        this.nativeViewHidden = z10;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeVolume(double d10) {
        this.nativeVolume = d10;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza appState(String str) {
        if (str == null) {
            throw new NullPointerException("Null appState");
        }
        this.appState = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zzb build() {
        String str;
        String str2;
        String str3;
        zzbb zzbbVar;
        zzbb zzbbVar2;
        if (this.set$0 == 7 && (str = this.queryId) != null && (str2 = this.eventId) != null && (str3 = this.appState) != null && (zzbbVar = this.nativeViewBounds) != null && (zzbbVar2 = this.nativeViewVisibleBounds) != null) {
            return new zzk(str, str2, str3, this.nativeTime, this.nativeVolume, this.nativeViewHidden, zzbbVar, zzbbVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.queryId == null) {
            sb2.append(" queryId");
        }
        if (this.eventId == null) {
            sb2.append(" eventId");
        }
        if (this.appState == null) {
            sb2.append(" appState");
        }
        if ((this.set$0 & 1) == 0) {
            sb2.append(" nativeTime");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" nativeVolume");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            sb2.append(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            sb2.append(" nativeViewVisibleBounds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza eventId(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventId");
        }
        this.eventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewBounds(zzbb zzbbVar) {
        if (zzbbVar == null) {
            throw new NullPointerException("Null nativeViewBounds");
        }
        this.nativeViewBounds = zzbbVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza nativeViewVisibleBounds(zzbb zzbbVar) {
        if (zzbbVar == null) {
            throw new NullPointerException("Null nativeViewVisibleBounds");
        }
        this.nativeViewVisibleBounds = zzbbVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zza
    public zza queryId(String str) {
        if (str == null) {
            throw new NullPointerException("Null queryId");
        }
        this.queryId = str;
        return this;
    }
}

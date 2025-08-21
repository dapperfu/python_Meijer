package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.NonceRequest;
import java.util.Set;

/* loaded from: classes4.dex */
final class zzl extends NonceRequest.Builder {
    private Boolean zza;
    private Boolean zzb;
    private Integer zzc;
    private Integer zzd;
    private Integer zze;
    private Boolean zzf;
    private Boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private PlatformSignalCollector zzo;
    private Set zzp;
    private String zzq;

    zzl() {
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder continuousPlayback(Boolean bool) {
        this.zza = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder nonceLengthLimit(Integer num) {
        this.zzc = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder platformSignalCollector(PlatformSignalCollector platformSignalCollector) {
        this.zzo = platformSignalCollector;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder videoPlayerHeight(Integer num) {
        this.zzd = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder videoPlayerWidth(Integer num) {
        this.zze = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder willAdAutoPlay(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder willAdPlayMuted(Boolean bool) {
        this.zzf = bool;
        return this;
    }

    /* synthetic */ zzl(NonceRequest nonceRequest, zzk zzkVar) {
        this.zza = nonceRequest.zzb();
        this.zzb = nonceRequest.zzc();
        this.zzc = nonceRequest.zzf();
        this.zzd = nonceRequest.zzg();
        this.zze = nonceRequest.zzh();
        this.zzf = nonceRequest.zze();
        this.zzg = nonceRequest.zzd();
        this.zzh = nonceRequest.zzi();
        this.zzi = nonceRequest.zzj();
        this.zzj = nonceRequest.zzk();
        this.zzk = nonceRequest.zzl();
        this.zzl = nonceRequest.zzm();
        this.zzm = nonceRequest.zzn();
        this.zzn = nonceRequest.zzo();
        this.zzo = nonceRequest.zza();
        this.zzp = nonceRequest.zzq();
        this.zzq = nonceRequest.zzp();
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest build() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Set set;
        String str8;
        Boolean bool = this.zzb;
        if (bool != null && (str = this.zzh) != null && (str2 = this.zzi) != null && (str3 = this.zzj) != null && (str4 = this.zzk) != null && (str5 = this.zzl) != null && (str6 = this.zzm) != null && (str7 = this.zzn) != null && (set = this.zzp) != null && (str8 = this.zzq) != null) {
            return new zzn(this.zza, bool, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, str, str2, str3, str4, str5, str6, str7, this.zzo, set, str8, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zzb == null) {
            sb2.append(" iconsSupported");
        }
        if (this.zzh == null) {
            sb2.append(" descriptionURL");
        }
        if (this.zzi == null) {
            sb2.append(" omidPartnerName");
        }
        if (this.zzj == null) {
            sb2.append(" omidPartnerVersion");
        }
        if (this.zzk == null) {
            sb2.append(" omidVersion");
        }
        if (this.zzl == null) {
            sb2.append(" playerType");
        }
        if (this.zzm == null) {
            sb2.append(" playerVersion");
        }
        if (this.zzn == null) {
            sb2.append(" ppid");
        }
        if (this.zzp == null) {
            sb2.append(" supportedApiFrameworks");
        }
        if (this.zzq == null) {
            sb2.append(" sessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder descriptionURL(String str) {
        if (str == null) {
            throw new NullPointerException("Null descriptionURL");
        }
        this.zzh = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder iconsSupported(Boolean bool) {
        if (bool == null) {
            throw new NullPointerException("Null iconsSupported");
        }
        this.zzb = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder omidPartnerName(String str) {
        if (str == null) {
            throw new NullPointerException("Null omidPartnerName");
        }
        this.zzi = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder omidPartnerVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null omidPartnerVersion");
        }
        this.zzj = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder omidVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null omidVersion");
        }
        this.zzk = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder playerType(String str) {
        if (str == null) {
            throw new NullPointerException("Null playerType");
        }
        this.zzl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder playerVersion(String str) {
        if (str == null) {
            throw new NullPointerException("Null playerVersion");
        }
        this.zzm = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder ppid(String str) {
        if (str == null) {
            throw new NullPointerException("Null ppid");
        }
        this.zzn = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder sessionId(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.zzq = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest.Builder
    public final NonceRequest.Builder supportedApiFrameworks(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null supportedApiFrameworks");
        }
        this.zzp = set;
        return this;
    }
}

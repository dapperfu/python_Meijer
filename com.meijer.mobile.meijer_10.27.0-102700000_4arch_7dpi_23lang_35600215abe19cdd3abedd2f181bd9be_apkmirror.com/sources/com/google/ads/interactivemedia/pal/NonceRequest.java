package com.google.ads.interactivemedia.pal;

import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class NonceRequest {

    public static abstract class Builder {
        public abstract NonceRequest build();

        public abstract Builder continuousPlayback(Boolean bool);

        public abstract Builder descriptionURL(String str);

        public abstract Builder iconsSupported(Boolean bool);

        public abstract Builder nonceLengthLimit(Integer num);

        public abstract Builder omidPartnerName(String str);

        public abstract Builder omidPartnerVersion(String str);

        public abstract Builder omidVersion(String str);

        public abstract Builder platformSignalCollector(PlatformSignalCollector platformSignalCollector);

        public abstract Builder playerType(String str);

        public abstract Builder playerVersion(String str);

        public abstract Builder ppid(String str);

        public abstract Builder sessionId(String str);

        public abstract Builder supportedApiFrameworks(Set<Integer> set);

        public abstract Builder videoPlayerHeight(Integer num);

        public abstract Builder videoPlayerWidth(Integer num);

        public abstract Builder willAdAutoPlay(Boolean bool);

        public abstract Builder willAdPlayMuted(Boolean bool);
    }

    public abstract Builder toBuilder();

    public abstract PlatformSignalCollector zza();

    public abstract Boolean zzb();

    public abstract Boolean zzc();

    public abstract Boolean zzd();

    public abstract Boolean zze();

    public abstract Integer zzf();

    public abstract Integer zzg();

    public abstract Integer zzh();

    public abstract String zzi();

    public abstract String zzj();

    public abstract String zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract String zzn();

    public abstract String zzo();

    public abstract String zzp();

    public abstract Set zzq();

    public static Builder builder() {
        zzl zzlVar = new zzl();
        zzlVar.willAdPlayMuted(null);
        zzlVar.willAdAutoPlay(null);
        zzlVar.continuousPlayback(null);
        zzlVar.iconsSupported(Boolean.FALSE);
        zzlVar.nonceLengthLimit(null);
        zzlVar.videoPlayerHeight(null);
        zzlVar.videoPlayerWidth(null);
        zzlVar.platformSignalCollector(null);
        zzlVar.descriptionURL("");
        zzlVar.omidPartnerName("");
        zzlVar.omidPartnerVersion("");
        zzlVar.omidVersion("");
        zzlVar.playerType("");
        zzlVar.playerVersion("");
        zzlVar.ppid("");
        zzlVar.supportedApiFrameworks(new TreeSet());
        zzlVar.sessionId(UUID.randomUUID().toString());
        return zzlVar;
    }
}

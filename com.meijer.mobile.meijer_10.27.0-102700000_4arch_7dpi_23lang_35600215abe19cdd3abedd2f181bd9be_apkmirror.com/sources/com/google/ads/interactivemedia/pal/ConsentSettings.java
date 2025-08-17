package com.google.ads.interactivemedia.pal;

/* loaded from: classes4.dex */
public abstract class ConsentSettings {

    public static abstract class Builder {
        public abstract Builder allowStorage(Boolean bool);

        public abstract ConsentSettings build();

        public abstract Builder directedForChildOrUnknownAge(Boolean bool);

        public abstract Builder enableCookiesFor3pServerSideAdInsertion(Boolean bool);
    }

    public abstract Builder toBuilder();

    abstract Boolean zza();

    abstract Boolean zzb();

    abstract Boolean zzc();

    public static Builder builder() {
        zzb zzbVar = new zzb();
        zzbVar.enableCookiesFor3pServerSideAdInsertion(null);
        Boolean bool = Boolean.FALSE;
        zzbVar.allowStorage(bool);
        zzbVar.directedForChildOrUnknownAge(bool);
        return zzbVar;
    }
}

package com.google.ads.interactivemedia.v3.api;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl;
import com.google.ads.interactivemedia.v3.impl.ImaSdkSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.data.zzbg;
import com.google.ads.interactivemedia.v3.impl.data.zzbh;
import com.google.ads.interactivemedia.v3.impl.data.zzh;
import com.google.ads.interactivemedia.v3.impl.zzac;
import com.google.ads.interactivemedia.v3.impl.zzal;
import com.google.ads.interactivemedia.v3.impl.zzbx;
import com.google.ads.interactivemedia.v3.impl.zzbz;
import com.google.ads.interactivemedia.v3.impl.zzc;
import com.google.ads.interactivemedia.v3.impl.zzy;
import com.google.ads.interactivemedia.v3.internal.zzahg;
import com.google.ads.interactivemedia.v3.internal.zzahh;
import com.google.ads.interactivemedia.v3.internal.zzahj;
import com.google.ads.interactivemedia.v3.internal.zzfe;
import com.google.ads.interactivemedia.v3.internal.zzff;
import com.google.ads.interactivemedia.v3.internal.zzfj;
import com.google.ads.interactivemedia.v3.internal.zzgh;
import com.google.ads.interactivemedia.v3.internal.zzvf;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class ImaSdkFactory {
    private static ImaSdkFactory zza;
    private static final zzff zzb = new zzff();
    private int zzc = 0;
    private ExecutorService zzd;

    private ImaSdkFactory() {
    }

    private AdsLoader createAdsLoader(Context context, Uri uri, BaseDisplayContainer baseDisplayContainer, ImaSdkSettings imaSdkSettings) {
        return zzb(context, uri == null ? zzgh.zza(imaSdkSettings, context.getPackageName()) : zzgh.zzb(uri, imaSdkSettings, context.getPackageName()), imaSdkSettings, baseDisplayContainer, zza());
    }

    public static ImaSdkFactory getInstance() {
        if (zza == null) {
            zza = new ImaSdkFactory();
        }
        return zza;
    }

    @Deprecated
    public AdDisplayContainer createAdDisplayContainer() {
        return new zzc(null, null);
    }

    public AdsRenderingSettings createAdsRenderingSettings() {
        return new zzh();
    }

    @Deprecated
    public AdDisplayContainer createAudioAdDisplayContainer(Context context) {
        context.getClass();
        return new zzac(context, null);
    }

    public ImaSdkSettings createImaSdkSettings() {
        return new ImaSdkSettingsImpl();
    }

    @Deprecated
    public StreamDisplayContainer createStreamDisplayContainer() {
        return new zzbx(null, null);
    }

    public StreamRequest createVideoStitcherVodStreamRequest(String str, String str2, String str3, String str4, String str5) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzk(str);
        zzbzVar.zzn(str2);
        zzbzVar.zzm(str3);
        zzbzVar.zzl(str4);
        zzbzVar.zzp(str5);
        return zzbzVar;
    }

    public void initialize(Context context, ImaSdkSettings imaSdkSettings) {
        zzb.zzb(context, zzgh.zza(imaSdkSettings, context.getPackageName()), imaSdkSettings.getTestingConfig(), zza());
    }

    public static AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        viewGroup.getClass();
        videoAdPlayer.getClass();
        return new zzc(viewGroup, videoAdPlayer);
    }

    public static StreamDisplayContainer createStreamDisplayContainer(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        viewGroup.getClass();
        videoStreamPlayer.getClass();
        return new zzbx(viewGroup, videoStreamPlayer);
    }

    public AdsRequest createAdsRequest() {
        return new AdsRequestImpl();
    }

    public CompanionAdSlot createCompanionAdSlot() {
        return new zzal();
    }

    public StreamRequest createLiveStreamRequest(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzf(str);
        zzbzVar.zze(str2);
        return zzbzVar;
    }

    public StreamRequest createPodStreamRequest(String str, String str2, String str3) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzk(str);
        zzbzVar.zzi(str2);
        zzbzVar.zze(str3);
        return zzbzVar;
    }

    public StreamRequest createPodVodStreamRequest(String str) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzk(str);
        return zzbzVar;
    }

    public StreamRequest createVideoStitcherLiveStreamRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzk(str);
        zzbzVar.zzi(str2);
        zzbzVar.zzj(str3);
        zzbzVar.zzn(str4);
        zzbzVar.zzm(str5);
        zzbzVar.zzl(str6);
        return zzbzVar;
    }

    public StreamRequest createVodStreamRequest(String str, String str2, String str3) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzg(str);
        zzbzVar.zzo(str2);
        zzbzVar.zze(str3);
        return zzbzVar;
    }

    public final ExecutorService zza() {
        if (this.zzd == null) {
            zzvf zzvfVar = new zzvf();
            zzvfVar.zza("imasdk-%d");
            this.zzd = Executors.newCachedThreadPool(zzvfVar.zzb());
        }
        return this.zzd;
    }

    public static AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
        context.getClass();
        videoAdPlayer.getClass();
        return new zzac(context, videoAdPlayer);
    }

    private final AdsLoader zzb(Context context, Uri uri, ImaSdkSettings imaSdkSettings, BaseDisplayContainer baseDisplayContainer, ExecutorService executorService) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfe zzfeVarZza = zzb.zza(context, uri, imaSdkSettings.getTestingConfig(), executorService);
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzfj zzfjVar = new zzfj(i10);
        zzfjVar.zzf(zzfeVarZza.zze());
        zzy zzyVarZzc = zzy.zzc(zzfeVarZza.zzb(), context, imaSdkSettings, baseDisplayContainer, zzfjVar, zzfeVarZza.zzf(), zzfeVarZza.zzd());
        zzahj zzahjVarZzb = zzfjVar.zzb();
        zzahg zzahgVarZzc = zzahh.zzc();
        zzahgVarZzc.zzb(jCurrentTimeMillis);
        zzahgVarZzc.zza(System.currentTimeMillis());
        zzahjVarZzb.zzb(zzahgVarZzc);
        return zzyVarZzc;
    }

    public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        zzbg zzbgVarBuilder = zzbh.builder();
        zzbgVarBuilder.view(view);
        zzbgVarBuilder.purpose(friendlyObstructionPurpose);
        zzbgVarBuilder.detailedReason(str);
        return zzbgVarBuilder.build();
    }

    private void initialize(Context context, ImaSdkSettings imaSdkSettings, Uri uri) {
        zzb.zzb(context, zzgh.zzb(uri, imaSdkSettings, context.getPackageName()), imaSdkSettings.getTestingConfig(), zza());
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        return zzb(context, zzgh.zza(imaSdkSettings, context.getPackageName()), imaSdkSettings, adDisplayContainer, zza());
    }

    public StreamRequest createVideoStitcherVodStreamRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        zzbz zzbzVar = new zzbz();
        zzbzVar.zzh(str);
        zzbzVar.zzk(str2);
        zzbzVar.zzn(str3);
        zzbzVar.zzm(str4);
        zzbzVar.zzl(str5);
        zzbzVar.zzd(str6);
        return zzbzVar;
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer) {
        return zzb(context, zzgh.zza(imaSdkSettings, context.getPackageName()), imaSdkSettings, streamDisplayContainer, zza());
    }
}

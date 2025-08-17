package com.google.ads.interactivemedia.pal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5228f;
import android.content.Context;
import bd.C6224c;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.pal.AbstractC10870r6;
import com.google.android.gms.internal.pal.AbstractC10994z2;
import com.google.android.gms.internal.pal.C10658e2;
import com.google.android.gms.internal.pal.C10791m6;
import com.google.android.gms.internal.pal.C10839p6;
import com.google.android.gms.internal.pal.C10978y2;
import com.google.android.gms.internal.pal.E2;
import com.google.android.gms.internal.pal.G2;
import com.google.android.gms.internal.pal.I6;
import com.google.android.gms.internal.pal.InterfaceC10641d2;
import com.google.android.gms.internal.pal.InterfaceC10823o6;
import com.google.android.gms.internal.pal.J6;
import com.google.android.gms.internal.pal.K2;
import com.google.android.gms.internal.pal.S6;
import com.medallia.digital.mobilesdk.q2;
import com.scandit.datacapture.core.source.CameraSettings;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class NonceLoader {
    public static final /* synthetic */ int zza = 0;
    private static final Random zzb = new Random();
    private final Context zzc;
    private final InterfaceC10641d2 zzd;
    private final InterfaceC10641d2 zze;
    private final AbstractC5232j zzf;
    private final C10978y2 zzg;
    private final K2 zzh;
    private final K2 zzi;
    private final K2 zzj;
    private final G2 zzk;
    private final zzx zzl;
    private final long zzm;
    private long zzn;
    private final String zzo;

    private static String zzf() {
        return Integer.toString(zzb.nextInt(a.e.API_PRIORITY_OTHER));
    }

    private static String zzg(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            FS.log_e("NonceGenerator", "Failed to encode the input string.");
            return "";
        }
    }

    public AbstractC5232j<NonceManager> loadNonceManager(final NonceRequest nonceRequest) {
        String str;
        if (nonceRequest == null) {
            this.zzl.zza(103);
            return C5235m.e(NonceLoaderException.zzb(103));
        }
        final String strZzf = zzf();
        final I6 i62 = new I6();
        if (nonceRequest.zzi().length() <= 500) {
            i62.a(zzak.DESCRIPTION_URL.zza(), zzg(nonceRequest.zzi()));
        }
        if (nonceRequest.zzo().length() <= 200) {
            i62.a(zzak.PPID.zza(), zzg(nonceRequest.zzo()));
        }
        if (nonceRequest.zzl().length() > 0 && nonceRequest.zzl().length() <= 200) {
            i62.a(zzak.OMID_VERSION.zza(), zzg(nonceRequest.zzl()));
        }
        if (nonceRequest.zzm().length() <= 200) {
            i62.a(zzak.PLAYER_TYPE.zza(), zzg(nonceRequest.zzm()));
        }
        if (nonceRequest.zzn().length() <= 200) {
            i62.a(zzak.PLAYER_VERSION.zza(), zzg(nonceRequest.zzn()));
        }
        if (nonceRequest.zzj().length() == 0 || nonceRequest.zzj().length() > 200 || nonceRequest.zzk().length() == 0 || nonceRequest.zzk().length() > 200) {
            str = "";
        } else {
            str = nonceRequest.zzj() + q2.f92724c + nonceRequest.zzk();
        }
        i62.a(zzak.OMID_PARTNER.zza(), zzg(str));
        TreeSet treeSet = new TreeSet(nonceRequest.zzq());
        if (!str.isEmpty()) {
            treeSet.add(7);
        }
        String strZza = zzak.API_FRAMEWORKS.zza();
        Iterator it = treeSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            C10839p6.b(sb2, it, ",");
            i62.a(strZza, sb2.toString());
            Integer numZzg = nonceRequest.zzg();
            if (numZzg != null) {
                String strZza2 = zzak.PLAYER_HEIGHT.zza();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(numZzg);
                i62.a(strZza2, sb3.toString());
            }
            Integer numZzh = nonceRequest.zzh();
            if (numZzh != null) {
                String strZza3 = zzak.PLAYER_WIDTH.zza();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(numZzh);
                i62.a(strZza3, sb4.toString());
            }
            if (numZzg != null && numZzh != null) {
                i62.a(zzak.ORIENTATION.zza(), numZzg.intValue() <= numZzh.intValue() ? "l" : "p");
            }
            Boolean boolZzd = nonceRequest.zzd();
            if (boolZzd != null) {
                i62.a(zzak.PLAY_ACTIVATION.zza(), true != boolZzd.booleanValue() ? "click" : CameraSettings.FOCUS_STRATEGY_AUTO);
            }
            i62.a(zzak.WTA_SUPPORTED.zza(), true != nonceRequest.zzc().booleanValue() ? "0" : "1");
            Boolean boolZze = nonceRequest.zze();
            if (boolZze != null) {
                i62.a(zzak.PLAY_MUTED.zza(), true == boolZze.booleanValue() ? "1" : "0");
            }
            Boolean boolZzb = nonceRequest.zzb();
            if (boolZzb != null) {
                i62.a(zzak.CONTINUOUS_PLAYBACK.zza(), true == boolZzb.booleanValue() ? "2" : "1");
            }
            i62.a(zzak.SESSION_ID.zza(), nonceRequest.zzp());
            final I6 i63 = new I6();
            i63.a(zzak.PAL_VERSION.zza(), zzat.zza);
            i63.a(zzak.SDK_VERSION.zza(), zzh(this.zzc));
            i63.a(zzak.APP_NAME.zza(), this.zzc.getApplicationContext().getPackageName());
            i63.a(zzak.PAGE_CORRELATOR.zza(), this.zzo);
            i63.a(zzak.AD_SPAM_CAPABILITIES.zza(), "3");
            i63.a(zzak.SPAM_CORRELATOR.zza(), strZzf);
            final AbstractC5232j abstractC5232jB = this.zzi.b();
            final AbstractC5232j abstractC5232jB2 = this.zzj.b();
            final AbstractC5232j abstractC5232jB3 = this.zzg.b();
            final AbstractC5232j abstractC5232jB4 = this.zzh.b();
            final AbstractC5232j<TContinuationResult> abstractC5232jI = C5235m.k(abstractC5232jB, abstractC5232jB2, abstractC5232jB3, abstractC5232jB4).i(new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzae
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return NonceLoader.zzb(i63, abstractC5232jB, abstractC5232jB2, abstractC5232jB3, abstractC5232jB4, abstractC5232j);
                }
            });
            PlatformSignalCollector platformSignalCollectorZza = nonceRequest.zza();
            final AbstractC5232j<Map<String, String>> abstractC5232jF = platformSignalCollectorZza == null ? C5235m.f(J6.c()) : platformSignalCollectorZza.collectSignals(this.zzc, Executors.newSingleThreadExecutor());
            final AbstractC5232j abstractC5232jB5 = this.zzk.b();
            final long jA = i.d().a();
            return C5235m.k(abstractC5232jI, abstractC5232jB5, abstractC5232jF).j(Executors.newSingleThreadExecutor(), new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzz
                @Override // Td.InterfaceC5225c
                public final Object then(AbstractC5232j abstractC5232j) {
                    return this.zza.zza(i62, abstractC5232jI, abstractC5232jF, abstractC5232jB5, nonceRequest, strZzf, jA, abstractC5232j);
                }
            }).e(new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.pal.zzaa
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    this.zza.zzc(exc);
                }
            });
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public void release() {
        this.zzg.e();
        this.zzh.e();
        this.zzi.e();
        this.zzj.e();
        this.zzk.e();
    }

    final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof NonceLoaderException) {
            this.zzl.zza(((NonceLoaderException) exc).zza());
        } else {
            this.zzl.zza(100);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NonceLoader(final android.content.Context r13, com.google.ads.interactivemedia.pal.ConsentSettings r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.pal.NonceLoader.<init>(android.content.Context, com.google.ads.interactivemedia.pal.ConsentSettings):void");
    }

    static /* synthetic */ Map zzb(I6 i62, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, AbstractC5232j abstractC5232j3, AbstractC5232j abstractC5232j4, AbstractC5232j abstractC5232j5) throws Exception {
        J6 j6C;
        i62.b((Map) zze(abstractC5232j).a(new InterfaceC10823o6() { // from class: com.google.ads.interactivemedia.pal.zzaf
            @Override // com.google.android.gms.internal.pal.InterfaceC10823o6
            public final Object zza(Object obj) {
                AbstractC10994z2 abstractC10994z2 = (AbstractC10994z2) obj;
                int i10 = NonceLoader.zza;
                return J6.g(zzak.ADVERTISING_ID.zza(), abstractC10994z2.a(), zzak.ID_TYPE.zza(), abstractC10994z2.b(), zzak.LIMIT_AD_TRACKING.zza(), true != abstractC10994z2.c() ? "0" : "1");
            }
        }).c(J6.c()));
        AbstractC10870r6 abstractC10870r6Zze = zze(abstractC5232j);
        AbstractC10870r6 abstractC10870r6Zze2 = zze(abstractC5232j2);
        if (((Boolean) abstractC10870r6Zze.a(new InterfaceC10823o6() { // from class: com.google.ads.interactivemedia.pal.zzab
            @Override // com.google.android.gms.internal.pal.InterfaceC10823o6
            public final Object zza(Object obj) {
                AbstractC10994z2 abstractC10994z2 = (AbstractC10994z2) obj;
                int i10 = NonceLoader.zza;
                boolean z10 = false;
                if (!abstractC10994z2.c() && !C10791m6.a(abstractC10994z2.a(), "00000000-0000-0000-0000-000000000000")) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }).c(Boolean.FALSE)).booleanValue()) {
            j6C = J6.c();
        } else {
            j6C = (J6) abstractC10870r6Zze2.a(new InterfaceC10823o6() { // from class: com.google.ads.interactivemedia.pal.zzac
                @Override // com.google.android.gms.internal.pal.InterfaceC10823o6
                public final Object zza(Object obj) {
                    C6224c c6224c = (C6224c) obj;
                    int i10 = NonceLoader.zza;
                    return J6.f(zzak.PER_VENDOR_ID.zza(), c6224c.a(), zzak.PER_VENDOR_ID_SCOPE.zza(), String.valueOf(c6224c.b()));
                }
            }).c(J6.c());
        }
        i62.b(j6C);
        i62.b((Map) zze(abstractC5232j3).a(new InterfaceC10823o6() { // from class: com.google.ads.interactivemedia.pal.zzag
            @Override // com.google.android.gms.internal.pal.InterfaceC10823o6
            public final Object zza(Object obj) {
                int i10 = NonceLoader.zza;
                return J6.d(zzak.MOBILE_SPAM.zza(), (String) obj);
            }
        }).c(J6.c()));
        i62.b((Map) zze(abstractC5232j4).a(new InterfaceC10823o6() { // from class: com.google.ads.interactivemedia.pal.zzah
            @Override // com.google.android.gms.internal.pal.InterfaceC10823o6
            public final Object zza(Object obj) {
                int i10 = NonceLoader.zza;
                return J6.d(zzak.ADS_IDENTITY_TOKEN.zza(), (String) obj);
            }
        }).c(J6.c()));
        return i62.c();
    }

    private static AbstractC10870r6 zze(AbstractC5232j abstractC5232j) {
        if (!abstractC5232j.r()) {
            return AbstractC10870r6.e();
        }
        return (AbstractC10870r6) abstractC5232j.n();
    }

    private static String zzh(Context context) {
        return "h.3.2.2/n.android.3.2.2/".concat(String.valueOf(context.getApplicationContext().getPackageName()));
    }

    final /* synthetic */ NonceManager zza(I6 i62, AbstractC5232j abstractC5232j, AbstractC5232j abstractC5232j2, AbstractC5232j abstractC5232j3, NonceRequest nonceRequest, String str, long j10, AbstractC5232j abstractC5232j4) throws Exception {
        i62.b((Map) abstractC5232j.n());
        if (abstractC5232j2.r()) {
            i62.b((Map) abstractC5232j2.n());
        }
        E2 e22 = (E2) ((AbstractC10870r6) abstractC5232j3.n()).b();
        J6 j6C = i62.c();
        StringBuilder sb2 = new StringBuilder();
        S6 s6K = j6C.entrySet().k();
        while (s6K.hasNext()) {
            Map.Entry entry = (Map.Entry) s6K.next();
            if (entry.getValue() != null && ((String) entry.getValue()).length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append((String) entry.getValue());
            }
        }
        String strZza = e22.zza(sb2.toString());
        Integer numZzf = nonceRequest.zzf();
        if (numZzf != null && strZza.length() > numZzf.intValue()) {
            FS.log_e("NonceGenerator", "Nonce length limit crossed.");
            throw NonceLoaderException.zzb(104);
        }
        String strZzh = zzh(this.zzc);
        String str2 = this.zzo;
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(strZzh);
        zzeVar.zza(str2);
        zzax zzaxVar = new zzax(new zzs(zzeVar.zzd()), str);
        int length = strZza.length();
        zzh zzhVar = new zzh();
        C10658e2 c10658e2 = C10658e2.f83097b;
        zzhVar.zzc(c10658e2);
        zzhVar.zzd(C10658e2.a(j10 - this.zzm));
        zzhVar.zzb(C10658e2.a(i.d().a() - this.zzm));
        zzhVar.zzf(c10658e2);
        zzhVar.zze(C10658e2.a(this.zzn - this.zzm));
        zzhVar.zza(length);
        this.zzl.zzb(zzhVar.zzg());
        return new NonceManager(this.zzc, zzaj.zza(), Executors.newSingleThreadExecutor(), this.zzf, zzaxVar, strZza);
    }

    final /* synthetic */ void zzd(AbstractC5232j abstractC5232j) {
        this.zzn = i.d().a();
    }
}

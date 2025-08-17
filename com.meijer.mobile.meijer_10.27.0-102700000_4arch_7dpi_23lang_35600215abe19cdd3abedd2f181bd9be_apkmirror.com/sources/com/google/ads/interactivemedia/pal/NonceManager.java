package com.google.ads.interactivemedia.pal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.gms.internal.pal.C10658e2;
import com.google.android.gms.internal.pal.R4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class NonceManager {
    static final C10658e2 zza = C10658e2.e(3);
    static final C10658e2 zzb = C10658e2.e(5);
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final ExecutorService zze;
    private final AbstractC5232j zzf;
    private final zzax zzg;
    private final zzav zzh;
    private final String zzi;
    private boolean zzj = false;
    private String zzk;

    public String getNonce() {
        return this.zzi;
    }

    @Deprecated
    public void sendAdImpression() {
    }

    static /* bridge */ /* synthetic */ Activity zza(NonceManager nonceManager) {
        Context context = nonceManager.zzd;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public void sendAdClick() {
        C5235m.l(this.zzf.j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzan
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return this.zza.zzc(abstractC5232j);
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzao
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws Exception {
                this.zza.zzd(abstractC5232j);
                return null;
            }
        });
    }

    public void sendAdTouch(final MotionEvent motionEvent) {
        C5235m.l(this.zzf.j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzal
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws RemoteException {
                MotionEvent motionEvent2 = motionEvent;
                int i10 = NonceManager.zzc;
                ((R4) abstractC5232j.n()).d(motionEvent2);
                return null;
            }
        }), zza.zzd(), TimeUnit.MILLISECONDS).j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzam
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws Exception {
                this.zza.zze(abstractC5232j);
                return null;
            }
        });
    }

    public void sendPlaybackEnd() {
        this.zzh.zzd();
        if (this.zzj) {
            this.zzj = false;
            this.zzg.zza(8, this.zzk);
        }
    }

    public void sendPlaybackStart() {
        if (this.zzj) {
            return;
        }
        this.zzj = true;
        AbstractC5232j abstractC5232jL = C5235m.l(this.zzf.j(this.zze, new zzas(this)), zza.zzd(), TimeUnit.MILLISECONDS);
        abstractC5232jL.j(this.zze, new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzap
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws Exception {
                this.zza.zzf(abstractC5232j);
                return null;
            }
        });
        abstractC5232jL.i(new InterfaceC5225c() { // from class: com.google.ads.interactivemedia.pal.zzaq
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws Exception {
                this.zza.zzg(abstractC5232j);
                return null;
            }
        });
    }

    final /* synthetic */ Void zze(AbstractC5232j abstractC5232j) throws Exception {
        this.zzg.zza(5, null);
        return null;
    }

    final /* synthetic */ Void zzg(AbstractC5232j abstractC5232j) throws Exception {
        if (!this.zzj) {
            return null;
        }
        this.zzh.zzc(new zzar(this));
        return null;
    }

    NonceManager(Context context, Handler handler, ExecutorService executorService, AbstractC5232j abstractC5232j, zzax zzaxVar, String str) {
        this.zzd = context;
        this.zze = executorService;
        this.zzf = abstractC5232j;
        this.zzg = zzaxVar;
        this.zzh = new zzav(handler, zzb);
        this.zzi = str;
    }

    final /* synthetic */ String zzc(AbstractC5232j abstractC5232j) throws Exception {
        return ((R4) abstractC5232j.n()).a(this.zzd, "");
    }

    final /* synthetic */ Void zzd(AbstractC5232j abstractC5232j) throws Exception {
        String str;
        if (abstractC5232j.r()) {
            str = (String) abstractC5232j.n();
        } else {
            str = null;
        }
        this.zzg.zza(4, str);
        return null;
    }

    final /* synthetic */ Void zzf(AbstractC5232j abstractC5232j) throws Exception {
        String str;
        if (abstractC5232j.r()) {
            str = (String) abstractC5232j.n();
        } else {
            str = null;
        }
        this.zzk = str;
        this.zzg.zza(6, str);
        return null;
    }
}

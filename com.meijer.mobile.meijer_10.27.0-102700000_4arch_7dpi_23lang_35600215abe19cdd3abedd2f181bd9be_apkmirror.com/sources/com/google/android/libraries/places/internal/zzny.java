package com.google.android.libraries.places.internal;

import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import androidx.view.c0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzny extends c0 {
    private final zznn zza;
    private final zzoa zzb;
    private final zzoz zzc;
    private Runnable zze;
    private final Handler zzd = new Handler(Looper.getMainLooper());
    private final C5988D zzf = new C5988D();

    public final AbstractC5985A zza() {
        return this.zzf;
    }

    private final void zzp(zzni zzniVar) {
        C5988D c5988d = this.zzf;
        if (zzniVar.equals(c5988d.e())) {
            return;
        }
        c5988d.o(zzniVar);
    }

    private static Status zzq(Exception exc) {
        return exc instanceof ApiException ? ((ApiException) exc).a() : new Status(13, exc.getMessage());
    }

    @Override // androidx.view.c0
    protected final void onCleared() {
        try {
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            zzoa zzoaVar = this.zzb;
            zzoaVar.zzu();
            this.zzc.zza(zzoaVar);
        } catch (Error | RuntimeException e10) {
            zzmr.zzb(e10);
            throw e10;
        }
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            this.zzf.o(zzni.zzh());
        }
    }

    public final void zzc(final String str, final int i10) {
        this.zzb.zzA(str);
        Runnable runnable = this.zze;
        if (runnable != null) {
            this.zzd.removeCallbacks(runnable);
        }
        if (str.isEmpty()) {
            this.zza.zzc();
            zzp(zzni.zzi());
        } else {
            Runnable runnable2 = new Runnable() { // from class: com.google.android.libraries.places.internal.zznw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, i10);
                }
            };
            this.zze = runnable2;
            this.zzd.postDelayed(runnable2, 100L);
            zzp(zzni.zzj());
        }
    }

    public final void zzd(final AutocompletePrediction autocompletePrediction, int i10) {
        zzoa zzoaVar = this.zzb;
        zzoaVar.zzs(i10);
        zznn zznnVar = this.zza;
        if (zznnVar.zzf() == zzmo.PLACES_UI_KIT) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            Place placeBuild = builder.build();
            zzoaVar.zzy();
            zzp(zzni.zzo(placeBuild));
            return;
        }
        if (zznnVar.zzf() == zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) {
            zzoaVar.zzy();
            zzp(zzni.zzp(autocompletePrediction, zzoaVar.zze()));
        } else {
            AbstractC5232j abstractC5232jZzb = zznnVar.zzb(autocompletePrediction);
            if (!abstractC5232jZzb.q()) {
                zzp(zzni.zzj());
            }
            abstractC5232jZzb.c(new InterfaceC5227e() { // from class: com.google.android.libraries.places.internal.zznv
                @Override // Td.InterfaceC5227e
                public final /* synthetic */ void onComplete(AbstractC5232j abstractC5232j) {
                    this.zza.zzo(autocompletePrediction, abstractC5232j);
                }
            });
        }
    }

    public final void zze() {
        this.zzb.zzC();
    }

    public final void zzf() {
        this.zzb.zzB();
        zzc("", 0);
    }

    public final void zzg(String str, int i10) {
        this.zza.zzc();
        zzc(str, i10);
        zzp(zzni.zzk());
    }

    public final void zzh() {
        this.zzb.zzD();
    }

    public final void zzi() {
        this.zzb.zzE();
    }

    public final void zzj() {
        this.zzb.zzt();
        zzp(zzni.zzr());
    }

    public final void zzk() {
        this.zza.zzd();
    }

    public final void zzl() {
        this.zza.zze();
    }

    final /* synthetic */ void zzm(final String str, int i10) {
        this.zza.zza(str, i10).c(new InterfaceC5227e() { // from class: com.google.android.libraries.places.internal.zznu
            @Override // Td.InterfaceC5227e
            public final /* synthetic */ void onComplete(AbstractC5232j abstractC5232j) {
                this.zza.zzn(str, abstractC5232j);
            }
        });
    }

    /* synthetic */ zzny(zznn zznnVar, zzoa zzoaVar, zzoz zzozVar, byte[] bArr) {
        this.zza = zznnVar;
        this.zzb = zzoaVar;
        this.zzc = zzozVar;
    }

    private static boolean zzr(Status status) {
        if (!status.W0() && status.c0() != 9012 && status.c0() != 9011) {
            return false;
        }
        return true;
    }

    final /* synthetic */ void zzn(String str, AbstractC5232j abstractC5232j) {
        if (abstractC5232j.p()) {
            return;
        }
        Exception excM = abstractC5232j.m();
        if (excM == null) {
            this.zzb.zzv();
            List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) abstractC5232j.n()).getAutocompletePredictions();
            if (autocompletePredictions.isEmpty()) {
                zzp(zzni.zzm(str));
                return;
            } else {
                zzp(zzni.zzl(autocompletePredictions));
                return;
            }
        }
        String message = excM.getMessage();
        if (message != null && message.contains("Too many concurrent requests")) {
            this.zzb.zzx();
            return;
        }
        this.zzb.zzw();
        Status statusZzq = zzq(excM);
        if (zzr(statusZzq)) {
            zzp(zzni.zzs(statusZzq));
        } else {
            zzp(zzni.zzn(str, statusZzq));
        }
    }

    final /* synthetic */ void zzo(AutocompletePrediction autocompletePrediction, AbstractC5232j abstractC5232j) {
        if (abstractC5232j.p()) {
            return;
        }
        Exception excM = abstractC5232j.m();
        if (excM == null) {
            this.zzb.zzy();
            zzp(zzni.zzo(((FetchPlaceResponse) abstractC5232j.n()).getPlace()));
            return;
        }
        this.zzb.zzz();
        Status statusZzq = zzq(excM);
        if (zzr(statusZzq)) {
            zzp(zzni.zzs(statusZzq));
        } else {
            zzp(zzni.zzq(autocompletePrediction, statusZzq));
        }
    }
}

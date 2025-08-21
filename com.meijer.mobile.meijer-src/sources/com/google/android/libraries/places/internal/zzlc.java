package com.google.android.libraries.places.internal;

import Ee.L;
import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class zzlc implements zzfm {
    private final zzmx zza;
    private final zzfr zzb;
    private final zzfx zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzkh zzf;
    private final zzkp zzg;
    private final zzmf zzh;

    zzlc(zzmf zzmfVar, zzmx zzmxVar, zzfr zzfrVar, zzfx zzfxVar, zzme zzmeVar, zzdy zzdyVar, zzkd zzkdVar, zzkh zzkhVar, zzkl zzklVar, zzkp zzkpVar) {
        this.zzh = zzmfVar;
        this.zza = zzmxVar;
        this.zzb = zzfrVar;
        this.zzc = zzfxVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzf = zzkhVar;
        this.zzg = zzkpVar;
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zze(long j10, zzmo zzmoVar, AbstractC5516j abstractC5516j) {
        this.zzd.zzl(abstractC5516j, j10, this.zze.zzb(), 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        return (FindAutocompletePredictionsResponse) abstractC5516j.n();
    }

    final /* synthetic */ FetchPhotoResponse zzf(long j10, zzmo zzmoVar, AbstractC5516j abstractC5516j) {
        this.zzd.zzd(abstractC5516j, j10, this.zze.zzb(), zzmoVar);
        return (FetchPhotoResponse) abstractC5516j.n();
    }

    final /* synthetic */ FetchPlaceResponse zzg(long j10, zzmo zzmoVar, AbstractC5516j abstractC5516j) {
        this.zzd.zzn(abstractC5516j, j10, this.zze.zzb(), 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        return (FetchPlaceResponse) abstractC5516j.n();
    }

    final /* synthetic */ FindCurrentPlaceResponse zzh(long j10, zzmo zzmoVar, AbstractC5516j abstractC5516j) {
        this.zzd.zzb(abstractC5516j, j10, this.zze.zzb(), zzmoVar);
        return (FindCurrentPlaceResponse) abstractC5516j.n();
    }

    static final /* synthetic */ FetchPlaceResponse zzi(AbstractC5516j abstractC5516j) throws ApiException {
        L lT;
        zzkg zzkgVar = (zzkg) abstractC5516j.n();
        int iZza = zzlj.zza(zzkgVar.status);
        if (!PlacesStatusCodes.isError(iZza)) {
            zzli zzliVar = zzkgVar.result;
            String[] strArr = zzkgVar.htmlAttributions;
            if (strArr != null) {
                lT = L.t(strArr);
            } else {
                lT = null;
            }
            return FetchPlaceResponse.newInstance(zzlf.zzg(zzliVar, lT));
        }
        throw new ApiException(new Status(iZza, zzlj.zzb(zzkgVar.status, zzkgVar.errorMessage)));
    }

    static final /* synthetic */ FindCurrentPlaceResponse zzj(AbstractC5516j abstractC5516j) throws ApiException {
        L lT;
        zzko zzkoVar = (zzko) abstractC5516j.n();
        int iZza = zzlj.zza(zzkoVar.status);
        if (!PlacesStatusCodes.isError(iZza)) {
            ArrayList arrayList = new ArrayList();
            zzlh[] zzlhVarArr = zzkoVar.predictions;
            if (zzlhVarArr != null) {
                for (zzlh zzlhVar : zzlhVarArr) {
                    if (zzlhVar.zzb() != null) {
                        Double dZza = zzlhVar.zza();
                        if (dZza != null) {
                            zzli zzliVarZzb = zzlhVar.zzb();
                            String[] strArr = zzkoVar.htmlAttributions;
                            if (strArr != null) {
                                lT = L.t(strArr);
                            } else {
                                lT = null;
                            }
                            arrayList.add(PlaceLikelihood.newInstance(zzlf.zzg(zzliVarZzb, lT), dZza.doubleValue()));
                        } else {
                            throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                        }
                    } else {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                    }
                }
            }
            return FindCurrentPlaceResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(iZza, zzlj.zzb(zzkoVar.status, zzkoVar.errorMessage)));
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final AbstractC5516j zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final zzmo zzmoVar) {
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query != null && !TextUtils.isEmpty(query.trim())) {
            zzmf zzmfVar = this.zzh;
            zzkj zzkjVar = new zzkj(findAutocompletePredictionsRequest, zzmfVar.zzg(), zzmfVar.zzf(), this.zza);
            zzdy zzdyVar = this.zze;
            zzfr zzfrVar = this.zzb;
            final long jZzb = zzdyVar.zzb();
            return zzfrVar.zza(zzkjVar, zzkk.class).i(new InterfaceC5509c(this) { // from class: com.google.android.libraries.places.internal.zzlb
                @Override // Vd.InterfaceC5509c
                public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                    return zzkl.zza((zzkk) abstractC5516j.n());
                }
            }).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzku
                @Override // Vd.InterfaceC5509c
                public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                    return this.zza.zze(jZzb, zzmoVar, abstractC5516j);
                }
            });
        }
        return C5519m.f(FindAutocompletePredictionsResponse.newInstance(L.x()));
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final AbstractC5516j zzb(FetchPhotoRequest fetchPhotoRequest, final zzmo zzmoVar) {
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", maxWidth))));
        }
        if (maxHeight != null && maxHeight.intValue() <= 0) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", maxHeight))));
        }
        zzmf zzmfVar = this.zzh;
        zzka zzkaVar = new zzka(fetchPhotoRequest, zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfx zzfxVar = this.zzc;
        final long jZzb = zzdyVar.zzb();
        return zzfxVar.zzb(zzkaVar, new zzkb()).i(new InterfaceC5509c(this) { // from class: com.google.android.libraries.places.internal.zzkv
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return FetchPhotoResponse.newInstance(((zzkc) abstractC5516j.n()).zza);
            }
        }).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzkw
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return this.zza.zzf(jZzb, zzmoVar, abstractC5516j);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final AbstractC5516j zzc(FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) {
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        zzmf zzmfVar = this.zzh;
        zzkf zzkfVar = new zzkf(fetchPlaceRequest, zzmfVar.zzg(), zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfr zzfrVar = this.zzb;
        final long jZzb = zzdyVar.zzb();
        return zzfrVar.zza(zzkfVar, zzkg.class).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzkx
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return zzlc.zzi(abstractC5516j);
            }
        }).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzky
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return this.zza.zzg(jZzb, zzmoVar, abstractC5516j);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final AbstractC5516j zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, L l10, final zzmo zzmoVar) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return C5519m.e(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        zzmf zzmfVar = this.zzh;
        zzkn zzknVar = new zzkn(findCurrentPlaceRequest, location, l10, zzmfVar.zzg(), zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfr zzfrVar = this.zzb;
        final long jZzb = zzdyVar.zzb();
        return zzfrVar.zza(zzknVar, zzko.class).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzkz
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return zzlc.zzj(abstractC5516j);
            }
        }).i(new InterfaceC5509c() { // from class: com.google.android.libraries.places.internal.zzla
            @Override // Vd.InterfaceC5509c
            public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
                return this.zza.zzh(jZzb, zzmoVar, abstractC5516j);
            }
        });
    }
}

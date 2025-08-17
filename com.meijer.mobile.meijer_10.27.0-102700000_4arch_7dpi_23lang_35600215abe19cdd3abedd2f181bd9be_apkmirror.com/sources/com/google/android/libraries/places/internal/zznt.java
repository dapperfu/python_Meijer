package com.google.android.libraries.places.internal;

import Be.p;
import Ce.L;
import Td.AbstractC5232j;
import Td.C5224b;
import Td.C5235m;
import Td.InterfaceC5225c;
import android.text.TextUtils;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;

/* loaded from: classes6.dex */
public final class zznt implements zznn {
    public static final /* synthetic */ int zza = 0;
    private static final L zzb = L.z(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzc;
    private final zzng zzd;
    private final AutocompleteSessionToken zze;
    private final zzmo zzf;
    private zznq zzg;
    private zznr zzh;

    public zznt(PlacesClient placesClient, zzng zzngVar, AutocompleteSessionToken autocompleteSessionToken, zzmo zzmoVar) {
        this.zzc = placesClient;
        this.zzd = zzngVar;
        this.zze = autocompleteSessionToken;
        this.zzf = zzmoVar;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final zzmo zzf() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final AbstractC5232j zzb(AutocompletePrediction autocompletePrediction) {
        L l10 = zzb;
        zzng zzngVar = this.zzd;
        if (l10.containsAll(zzngVar.zzc())) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setTypes(autocompletePrediction.getPlaceTypes().isEmpty() ? null : autocompletePrediction.getPlaceTypes());
            return C5235m.f(FetchPlaceResponse.newInstance(builder.build()));
        }
        zznr zznrVar = this.zzh;
        if (zznrVar != null) {
            if (zznrVar.zzb().equals(autocompletePrediction.getPlaceId())) {
                return (AbstractC5232j) p.q(zznrVar.zzc());
            }
            zznrVar.zza().a();
        }
        final zznm zznmVar = new zznm(new C5224b(), autocompletePrediction.getPlaceId());
        this.zzh = zznmVar;
        PlacesClient placesClient = this.zzc;
        FetchPlaceRequest.Builder builder2 = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), zzngVar.zzc());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zznmVar.zza().b());
        AbstractC5232j abstractC5232jK = placesClient.zzd(builder2.build(), zzmo.AUTOCOMPLETE_WIDGET).k(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zzno
            @Override // Td.InterfaceC5225c
            public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                int i10 = zznt.zza;
                return zznmVar.zza().b().a() ? C5235m.d() : abstractC5232j;
            }
        });
        zznmVar.zzd(abstractC5232jK);
        return abstractC5232jK;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zzc() {
        zznq zznqVar = this.zzg;
        if (zznqVar != null) {
            zznqVar.zza().a();
        }
        zznr zznrVar = this.zzh;
        if (zznrVar != null) {
            zznrVar.zza().a();
        }
        this.zzg = null;
        this.zzh = null;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zzd() {
        this.zzc.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zze() {
        this.zzc.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final AbstractC5232j zza(String str, int i10) {
        p.d(!TextUtils.isEmpty(str));
        zznq zznqVar = this.zzg;
        if (zznqVar != null) {
            if (zznqVar.zzb().equals(str)) {
                return (AbstractC5232j) p.q(zznqVar.zzc());
            }
            zznqVar.zza().a();
        }
        final zznl zznlVar = new zznl(new C5224b(), str);
        this.zzg = zznlVar;
        PlacesClient placesClient = this.zzc;
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        zzng zzngVar = this.zzd;
        builder.setLocationBias(zzngVar.zzh());
        builder.setLocationRestriction(zzngVar.zzi());
        builder.setCountries(zzngVar.zzj());
        builder.setRegionCode(zzngVar.zzo());
        builder.setInputOffset(Integer.valueOf(i10));
        builder.setTypeFilter(zzngVar.zzk());
        builder.setTypesFilter(zzngVar.zzl());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zznlVar.zza().b());
        builder.setOrigin(zzngVar.zze());
        builder.setPureServiceAreaBusinessesIncluded(zzngVar.zzq());
        AbstractC5232j abstractC5232jK = placesClient.zza(builder.build(), this.zzf).k(new InterfaceC5225c() { // from class: com.google.android.libraries.places.internal.zznp
            @Override // Td.InterfaceC5225c
            public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
                int i11 = zznt.zza;
                return zznlVar.zza().b().a() ? C5235m.d() : abstractC5232j;
            }
        });
        zznlVar.zzd(abstractC5232jK);
        return abstractC5232jK;
    }
}

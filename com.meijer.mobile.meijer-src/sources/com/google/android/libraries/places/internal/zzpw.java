package com.google.android.libraries.places.internal;

import Vd.AbstractC5516j;
import Vd.InterfaceC5512f;
import Vd.InterfaceC5513g;
import android.app.Application;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import androidx.view.C6153b;
import androidx.view.d0;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.C15809k;
import mv.C15819p;

/* loaded from: classes6.dex */
public final class zzpw extends C6153b {
    public static final /* synthetic */ int zza = 0;
    private final C6130D zzb;
    private final AbstractC6127A zzc;
    private final C6130D zzd;
    private final AbstractC6127A zze;
    private final C6130D zzf;
    private final AbstractC6127A zzg;
    private PlacesClient zzh;
    private zzoy zzi;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzo(List list, Continuation continuation) {
        PhotoMetadata photoMetadata = list != null ? (PhotoMetadata) CollectionsKt.u0(list) : null;
        if (photoMetadata == null) {
            FS.log_i("PlaceSearchViewModel", "No photo metadatas, falling back to placeholder image.");
            return com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza;
        }
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestNewInstance = FetchResolvedPhotoUriRequest.newInstance(photoMetadata);
        FS.log_i("PlaceSearchViewModel", "Resolving photo URI.");
        PlacesClient placesClientZzd = zzd();
        AbstractC5516j abstractC5516jZzc = placesClientZzd != null ? placesClientZzd.zzc(fetchResolvedPhotoUriRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5516jZzc != null) {
            final zzpt zzptVar = new zzpt(c15819p);
            abstractC5516jZzc.g(new InterfaceC5513g(zzptVar) { // from class: com.google.android.libraries.places.internal.zzpv
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.j(zzptVar, "function");
                    this.zza = zzptVar;
                }

                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (abstractC5516jZzc != null) {
            abstractC5516jZzc.e(new zzpu(c15819p));
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    public final AbstractC6127A zza() {
        return this.zzc;
    }

    public final AbstractC6127A zzb() {
        return this.zze;
    }

    public final AbstractC6127A zzc() {
        return this.zzg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpw(Application app) {
        super(app);
        Intrinsics.j(app, "app");
        C6130D c6130d = new C6130D();
        this.zzb = c6130d;
        this.zzc = c6130d;
        C6130D c6130d2 = new C6130D();
        this.zzd = c6130d2;
        this.zze = c6130d2;
        C6130D c6130d3 = new C6130D();
        this.zzf = c6130d3;
        this.zzg = c6130d3;
    }

    static /* synthetic */ Unit zzk(zzpw zzpwVar, SearchByTextResponse searchByTextResponse) {
        zzpwVar.zzb.m(searchByTextResponse.getPlaces());
        List<Place> places = searchByTextResponse.getPlaces();
        Intrinsics.i(places, "getPlaces(...)");
        zzpwVar.zzh(places);
        return Unit.f143329a;
    }

    static /* synthetic */ void zzl(zzpw zzpwVar, Exception e10) {
        Intrinsics.j(e10, "e");
        zzpwVar.zzd.m(e10);
    }

    static /* synthetic */ Unit zzm(zzpw zzpwVar, SearchNearbyResponse searchNearbyResponse) {
        zzpwVar.zzb.m(searchNearbyResponse.getPlaces());
        List<Place> places = searchNearbyResponse.getPlaces();
        Intrinsics.i(places, "getPlaces(...)");
        zzpwVar.zzh(places);
        return Unit.f143329a;
    }

    static /* synthetic */ void zzn(zzpw zzpwVar, Exception e10) {
        Intrinsics.j(e10, "e");
        zzpwVar.zzd.m(e10);
    }

    @Override // androidx.view.c0
    protected final void onCleared() {
        System.out.println("onCleared");
        super.onCleared();
        PlacesClient placesClientZzd = zzd();
        if (placesClientZzd != null) {
            placesClientZzd.zzk();
        }
    }

    public final PlacesClient zzd() {
        if (this.zzh == null) {
            zzoy zzoyVarZze = zze();
            this.zzh = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        }
        return this.zzh;
    }

    public final zzoy zze() {
        if (this.zzi == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(getApplication().getApplicationContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzi = zzoxVarZza.zza();
        }
        return this.zzi;
    }

    public final void zzf(SearchByTextRequest searchByTextRequest, List placeFields) {
        Intrinsics.j(searchByTextRequest, "searchByTextRequest");
        Intrinsics.j(placeFields, "placeFields");
        SearchByTextRequest.Builder builderZza = searchByTextRequest.zza();
        Intrinsics.i(builderZza, "toBuilder(...)");
        builderZza.setPlaceFields(placeFields);
        builderZza.setRoutingSummariesIncluded(false);
        PlacesClient placesClientZzd = zzd();
        AbstractC5516j abstractC5516jZzi = placesClientZzd != null ? placesClientZzd.zzi(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (abstractC5516jZzi != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpq
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzk(this.zza, (SearchByTextResponse) obj);
                }
            };
            abstractC5516jZzi.g(new InterfaceC5513g() { // from class: com.google.android.libraries.places.internal.zzpl
                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5516jZzi != null) {
            abstractC5516jZzi.e(new InterfaceC5512f() { // from class: com.google.android.libraries.places.internal.zzpm
                @Override // Vd.InterfaceC5512f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzpw.zzl(this.zza, exc);
                }
            });
        }
    }

    public final void zzg(SearchNearbyRequest searchNearbyRequest, List placeFields) {
        Intrinsics.j(searchNearbyRequest, "searchNearbyRequest");
        Intrinsics.j(placeFields, "placeFields");
        SearchNearbyRequest.Builder builderZza = searchNearbyRequest.zza();
        Intrinsics.i(builderZza, "toBuilder(...)");
        builderZza.setPlaceFields(placeFields);
        builderZza.setRoutingSummariesIncluded(false);
        PlacesClient placesClientZzd = zzd();
        AbstractC5516j abstractC5516jZzj = placesClientZzd != null ? placesClientZzd.zzj(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (abstractC5516jZzj != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpn
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzm(this.zza, (SearchNearbyResponse) obj);
                }
            };
            abstractC5516jZzj.g(new InterfaceC5513g() { // from class: com.google.android.libraries.places.internal.zzpo
                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5516jZzj != null) {
            abstractC5516jZzj.e(new InterfaceC5512f() { // from class: com.google.android.libraries.places.internal.zzpp
                @Override // Vd.InterfaceC5512f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzpw.zzn(this.zza, exc);
                }
            });
        }
    }

    public final void zzh(List places) {
        Intrinsics.j(places, "places");
        C15809k.d(d0.a(this), null, null, new zzps(places, this, null), 3, null);
    }
}

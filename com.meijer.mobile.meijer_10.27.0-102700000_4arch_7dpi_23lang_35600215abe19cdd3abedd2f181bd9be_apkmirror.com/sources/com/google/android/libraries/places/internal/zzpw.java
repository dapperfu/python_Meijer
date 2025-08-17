package com.google.android.libraries.places.internal;

import Td.AbstractC5232j;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.app.Application;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import androidx.view.C6011b;
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
import qv.C16648k;
import qv.C16658p;

/* loaded from: classes6.dex */
public final class zzpw extends C6011b {
    public static final /* synthetic */ int zza = 0;
    private final C5988D zzb;
    private final AbstractC5985A zzc;
    private final C5988D zzd;
    private final AbstractC5985A zze;
    private final C5988D zzf;
    private final AbstractC5985A zzg;
    private PlacesClient zzh;
    private zzoy zzi;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzo(List list, Continuation continuation) {
        PhotoMetadata photoMetadata = list != null ? (PhotoMetadata) CollectionsKt.u0(list) : null;
        if (photoMetadata == null) {
            FS.log_i("PlaceSearchViewModel", "No photo metadatas, falling back to placeholder image.");
            return com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza;
        }
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestNewInstance = FetchResolvedPhotoUriRequest.newInstance(photoMetadata);
        FS.log_i("PlaceSearchViewModel", "Resolving photo URI.");
        PlacesClient placesClientZzd = zzd();
        AbstractC5232j abstractC5232jZzc = placesClientZzd != null ? placesClientZzd.zzc(fetchResolvedPhotoUriRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5232jZzc != null) {
            final zzpt zzptVar = new zzpt(c16658p);
            abstractC5232jZzc.g(new InterfaceC5229g(zzptVar) { // from class: com.google.android.libraries.places.internal.zzpv
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.j(zzptVar, "function");
                    this.zza = zzptVar;
                }

                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (abstractC5232jZzc != null) {
            abstractC5232jZzc.e(new zzpu(c16658p));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    public final AbstractC5985A zza() {
        return this.zzc;
    }

    public final AbstractC5985A zzb() {
        return this.zze;
    }

    public final AbstractC5985A zzc() {
        return this.zzg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpw(Application app) {
        super(app);
        Intrinsics.j(app, "app");
        C5988D c5988d = new C5988D();
        this.zzb = c5988d;
        this.zzc = c5988d;
        C5988D c5988d2 = new C5988D();
        this.zzd = c5988d2;
        this.zze = c5988d2;
        C5988D c5988d3 = new C5988D();
        this.zzf = c5988d3;
        this.zzg = c5988d3;
    }

    static /* synthetic */ Unit zzk(zzpw zzpwVar, SearchByTextResponse searchByTextResponse) {
        zzpwVar.zzb.m(searchByTextResponse.getPlaces());
        List<Place> places = searchByTextResponse.getPlaces();
        Intrinsics.i(places, "getPlaces(...)");
        zzpwVar.zzh(places);
        return Unit.f142422a;
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
        return Unit.f142422a;
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
        AbstractC5232j abstractC5232jZzi = placesClientZzd != null ? placesClientZzd.zzi(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (abstractC5232jZzi != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpq
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzk(this.zza, (SearchByTextResponse) obj);
                }
            };
            abstractC5232jZzi.g(new InterfaceC5229g() { // from class: com.google.android.libraries.places.internal.zzpl
                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5232jZzi != null) {
            abstractC5232jZzi.e(new InterfaceC5228f() { // from class: com.google.android.libraries.places.internal.zzpm
                @Override // Td.InterfaceC5228f
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
        AbstractC5232j abstractC5232jZzj = placesClientZzd != null ? placesClientZzd.zzj(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (abstractC5232jZzj != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpn
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzm(this.zza, (SearchNearbyResponse) obj);
                }
            };
            abstractC5232jZzj.g(new InterfaceC5229g() { // from class: com.google.android.libraries.places.internal.zzpo
                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5232jZzj != null) {
            abstractC5232jZzj.e(new InterfaceC5228f() { // from class: com.google.android.libraries.places.internal.zzpp
                @Override // Td.InterfaceC5228f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzpw.zzn(this.zza, exc);
                }
            });
        }
    }

    public final void zzh(List places) {
        Intrinsics.j(places, "places");
        C16648k.d(d0.a(this), null, null, new zzps(places, this, null), 3, null);
    }
}

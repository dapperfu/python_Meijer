package com.google.android.libraries.places.widget.internal.placedetails;

import Vd.AbstractC5516j;
import Vd.InterfaceC5512f;
import Vd.InterfaceC5513g;
import android.app.Application;
import android.net.Uri;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import androidx.view.C6153b;
import androidx.view.d0;
import com.fullstory.FS;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.AuthorAttributions;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzoz;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.C15809k;
import mv.C15819p;

/* loaded from: classes6.dex */
public final class zzbi extends C6153b {
    public static final /* synthetic */ int zza = 0;
    private final C6130D zzb;
    private final AbstractC6127A zzc;
    private final C6130D zzd;
    private final AbstractC6127A zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;
    private final C6130D zzi;
    private final C6130D zzj;
    private zzoy zzk;
    private PlacesClient zzl;

    public final AbstractC6127A zza() {
        return this.zzc;
    }

    public final AbstractC6127A zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzh;
    }

    public final C6130D zzd() {
        return this.zzj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(Application app) {
        super(app);
        Intrinsics.j(app, "app");
        C6130D c6130d = new C6130D();
        this.zzb = c6130d;
        this.zzc = c6130d;
        C6130D c6130d2 = new C6130D();
        this.zzd = c6130d2;
        this.zze = c6130d2;
        List listS = CollectionsKt.s(new C6130D(), new C6130D(), new C6130D());
        this.zzf = listS;
        this.zzg = new ArrayList();
        this.zzh = listS;
        C6130D c6130d3 = new C6130D();
        this.zzi = c6130d3;
        this.zzj = c6130d3;
    }

    static /* synthetic */ Unit zzl(zzbi zzbiVar, zzbc zzbcVar, FetchPlaceResponse fetchPlaceResponse) {
        List list;
        C6130D c6130d = zzbiVar.zzb;
        Place place = fetchPlaceResponse.getPlace();
        c6130d.m(place);
        if (zzbcVar.zza()) {
            List<PhotoMetadata> photoMetadatas = place.getPhotoMetadatas();
            int i10 = 0;
            if (photoMetadatas == null) {
                FS.log_i("PlaceDetailsViewModel", "No photo metadatas, falling back to placeholder image.");
                List list2 = zzbiVar.zzf;
                ((C6130D) list2.get(0)).m(zzbo.zza);
                C6130D c6130d2 = (C6130D) list2.get(1);
                zzbn zzbnVar = zzbn.zza;
                c6130d2.m(zzbnVar);
                ((C6130D) list2.get(2)).m(zzbnVar);
            } else if (photoMetadatas.isEmpty()) {
                ((C6130D) zzbiVar.zzf.get(0)).m(zzbo.zza);
            } else {
                while (true) {
                    list = zzbiVar.zzf;
                    if (list.size() >= photoMetadatas.size()) {
                        break;
                    }
                    list.add(new C6130D());
                }
                List list3 = zzbiVar.zzg;
                int size = photoMetadatas.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(new C6130D());
                }
                list3.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (PhotoMetadata photoMetadata : photoMetadatas) {
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzc(), (C6130D) list.get(i10)));
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzd(), (C6130D) list3.get(i10)));
                    i10++;
                }
                for (int size2 = photoMetadatas.size(); size2 < 3; size2++) {
                    ((C6130D) list.get(size2)).m(zzbn.zza);
                }
                C15809k.d(d0.a(zzbiVar), null, null, new zzbe(arrayList2, zzbiVar, null), 3, null);
            }
        }
        return Unit.f143329a;
    }

    static /* synthetic */ void zzm(zzbi zzbiVar, String str, Exception e10) {
        Intrinsics.j(e10, "e");
        zzbiVar.zzd.m(e10);
        FS.log_w("PlaceDetailsViewModel", "Failed to load details for ".concat(String.valueOf(str)));
    }

    static /* synthetic */ void zzn(zzbi zzbiVar, LatLng latLng, Exception e10) {
        Intrinsics.j(e10, "e");
        zzbiVar.zzd.m(e10);
        new StringBuilder(String.valueOf(latLng).length() + 27);
        Objects.toString(latLng);
        FS.log_w("PlaceDetailsViewModel", "Failed to load details for ".concat(String.valueOf(latLng)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzo(PhotoMetadata photoMetadata, int i10, Continuation continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
        builder.setMaxWidth(Boxing.d(i10));
        builder.setMaxHeight(Boxing.d(i10));
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestBuild = builder.build();
        FS.log_i("PlaceDetailsViewModel", "Resolving photo URI.");
        PlacesClient placesClient = this.zzl;
        AbstractC5516j abstractC5516jZzc = placesClient != null ? placesClient.zzc(fetchResolvedPhotoUriRequestBuild, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5516jZzc != null) {
            final zzbf zzbfVar = new zzbf(c15819p);
            abstractC5516jZzc.g(new InterfaceC5513g(zzbfVar) { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbh
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.j(zzbfVar, "function");
                    this.zza = zzbfVar;
                }

                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (abstractC5516jZzc != null) {
            abstractC5516jZzc.e(new zzbg(c15819p));
        }
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    public final zzoy zze() {
        if (this.zzk == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(getApplication().getApplicationContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzk = zzoxVarZza.zza();
        }
        return this.zzk;
    }

    public final void zzf(final String placeId, final zzbc configuration) {
        Intrinsics.j(placeId, "placeId");
        Intrinsics.j(configuration, "configuration");
        for (int i10 = 0; i10 < 3; i10++) {
            ((C6130D) this.zzf.get(i10)).m(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        this.zzl = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        FetchPlaceRequest fetchPlaceRequestNewInstance = FetchPlaceRequest.newInstance(placeId, configuration.zzb());
        PlacesClient placesClient = this.zzl;
        AbstractC5516j abstractC5516jZzd = placesClient != null ? placesClient.zzd(fetchPlaceRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5516jZzd != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzba
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzbi.zzl(this.zza, configuration, (FetchPlaceResponse) obj);
                }
            };
            abstractC5516jZzd.g(new InterfaceC5513g() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzav
                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5516jZzd != null) {
            abstractC5516jZzd.e(new InterfaceC5512f() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaw
                @Override // Vd.InterfaceC5512f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzbi.zzm(this.zza, placeId, exc);
                }
            });
        }
    }

    public final void zzg(final LatLng coordinates, final zzbc configuration) {
        Intrinsics.j(coordinates, "coordinates");
        Intrinsics.j(configuration, "configuration");
        for (int i10 = 0; i10 < 3; i10++) {
            ((C6130D) this.zzf.get(i10)).m(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        PlacesClient placesClientZzc = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        this.zzl = placesClientZzc;
        AbstractC5516j abstractC5516jZze = placesClientZzc != null ? placesClientZzc.zze(coordinates) : null;
        if (abstractC5516jZze != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzax
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    String str = (String) obj;
                    Intrinsics.g(str);
                    this.zza.zzf(str, configuration);
                    return Unit.f143329a;
                }
            };
            abstractC5516jZze.g(new InterfaceC5513g() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzay
                @Override // Vd.InterfaceC5513g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5516jZze != null) {
            abstractC5516jZze.e(new InterfaceC5512f() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaz
                @Override // Vd.InterfaceC5512f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzbi.zzn(this.zza, coordinates, exc);
                }
            });
        }
    }

    public final void zzh() {
        this.zzi.m(Unit.f143329a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList zzj() {
        List<PhotoMetadata> photoMetadatas;
        ArrayList arrayList = new ArrayList();
        Place place = (Place) this.zzb.e();
        if (place != null && (photoMetadatas = place.getPhotoMetadatas()) != null) {
            int size = photoMetadatas.size();
            for (int i10 = 0; i10 < size; i10++) {
                PhotoMetadata photoMetadata = photoMetadatas.get(i10);
                Uri uriZzc = photoMetadata.zzc();
                String uri = null;
                String string = uriZzc != null ? uriZzc.toString() : null;
                AuthorAttributions authorAttributions = photoMetadata.getAuthorAttributions();
                AuthorAttribution authorAttribution = authorAttributions != null ? authorAttributions.asList().get(0) : null;
                C6130D c6130d = (C6130D) CollectionsKt.v0(this.zzg, i10);
                zzbp zzbpVar = c6130d != null ? (zzbp) c6130d.e() : null;
                Intrinsics.h(zzbpVar, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.placedetails.PlaceImage.ImageUri");
                String string2 = ((zzbl) zzbpVar).zza().toString();
                Intrinsics.i(string2, "toString(...)");
                C6130D c6130d2 = (C6130D) CollectionsKt.v0(this.zzf, i10);
                zzbp zzbpVar2 = c6130d2 != null ? (zzbp) c6130d2.e() : null;
                zzbl zzblVar = zzbpVar2 instanceof zzbl ? (zzbl) zzbpVar2 : null;
                String string3 = zzblVar != null ? zzblVar.zza().toString() : null;
                String name = authorAttribution != null ? authorAttribution.getName() : null;
                String photoUri = authorAttribution != null ? authorAttribution.getPhotoUri() : null;
                if (authorAttribution != null) {
                    uri = authorAttribution.getUri();
                }
                arrayList.add(new com.google.android.libraries.places.widget.model.zzi(string2, string3, string, name, photoUri, uri));
            }
        }
        return arrayList;
    }

    public final zzoz zzi() {
        zzoy zzoyVarZze = zze();
        if (zzoyVarZze != null) {
            return zzoyVarZze.zzd();
        }
        return null;
    }
}

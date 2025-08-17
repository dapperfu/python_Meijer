package com.google.android.libraries.places.widget.internal.placedetails;

import Td.AbstractC5232j;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.app.Application;
import android.net.Uri;
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import androidx.view.C6011b;
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
import qv.C16648k;
import qv.C16658p;

/* loaded from: classes6.dex */
public final class zzbi extends C6011b {
    public static final /* synthetic */ int zza = 0;
    private final C5988D zzb;
    private final AbstractC5985A zzc;
    private final C5988D zzd;
    private final AbstractC5985A zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;
    private final C5988D zzi;
    private final C5988D zzj;
    private zzoy zzk;
    private PlacesClient zzl;

    public final AbstractC5985A zza() {
        return this.zzc;
    }

    public final AbstractC5985A zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzh;
    }

    public final C5988D zzd() {
        return this.zzj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(Application app) {
        super(app);
        Intrinsics.j(app, "app");
        C5988D c5988d = new C5988D();
        this.zzb = c5988d;
        this.zzc = c5988d;
        C5988D c5988d2 = new C5988D();
        this.zzd = c5988d2;
        this.zze = c5988d2;
        List listS = CollectionsKt.s(new C5988D(), new C5988D(), new C5988D());
        this.zzf = listS;
        this.zzg = new ArrayList();
        this.zzh = listS;
        C5988D c5988d3 = new C5988D();
        this.zzi = c5988d3;
        this.zzj = c5988d3;
    }

    static /* synthetic */ Unit zzl(zzbi zzbiVar, zzbc zzbcVar, FetchPlaceResponse fetchPlaceResponse) {
        List list;
        C5988D c5988d = zzbiVar.zzb;
        Place place = fetchPlaceResponse.getPlace();
        c5988d.m(place);
        if (zzbcVar.zza()) {
            List<PhotoMetadata> photoMetadatas = place.getPhotoMetadatas();
            int i10 = 0;
            if (photoMetadatas == null) {
                FS.log_i("PlaceDetailsViewModel", "No photo metadatas, falling back to placeholder image.");
                List list2 = zzbiVar.zzf;
                ((C5988D) list2.get(0)).m(zzbo.zza);
                C5988D c5988d2 = (C5988D) list2.get(1);
                zzbn zzbnVar = zzbn.zza;
                c5988d2.m(zzbnVar);
                ((C5988D) list2.get(2)).m(zzbnVar);
            } else if (photoMetadatas.isEmpty()) {
                ((C5988D) zzbiVar.zzf.get(0)).m(zzbo.zza);
            } else {
                while (true) {
                    list = zzbiVar.zzf;
                    if (list.size() >= photoMetadatas.size()) {
                        break;
                    }
                    list.add(new C5988D());
                }
                List list3 = zzbiVar.zzg;
                int size = photoMetadatas.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(new C5988D());
                }
                list3.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (PhotoMetadata photoMetadata : photoMetadatas) {
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzc(), (C5988D) list.get(i10)));
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzd(), (C5988D) list3.get(i10)));
                    i10++;
                }
                for (int size2 = photoMetadatas.size(); size2 < 3; size2++) {
                    ((C5988D) list.get(size2)).m(zzbn.zza);
                }
                C16648k.d(d0.a(zzbiVar), null, null, new zzbe(arrayList2, zzbiVar, null), 3, null);
            }
        }
        return Unit.f142422a;
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
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
        builder.setMaxWidth(Boxing.d(i10));
        builder.setMaxHeight(Boxing.d(i10));
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestBuild = builder.build();
        FS.log_i("PlaceDetailsViewModel", "Resolving photo URI.");
        PlacesClient placesClient = this.zzl;
        AbstractC5232j abstractC5232jZzc = placesClient != null ? placesClient.zzc(fetchResolvedPhotoUriRequestBuild, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5232jZzc != null) {
            final zzbf zzbfVar = new zzbf(c16658p);
            abstractC5232jZzc.g(new InterfaceC5229g(zzbfVar) { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbh
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.j(zzbfVar, "function");
                    this.zza = zzbfVar;
                }

                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (abstractC5232jZzc != null) {
            abstractC5232jZzc.e(new zzbg(c16658p));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
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
            ((C5988D) this.zzf.get(i10)).m(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        this.zzl = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        FetchPlaceRequest fetchPlaceRequestNewInstance = FetchPlaceRequest.newInstance(placeId, configuration.zzb());
        PlacesClient placesClient = this.zzl;
        AbstractC5232j abstractC5232jZzd = placesClient != null ? placesClient.zzd(fetchPlaceRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (abstractC5232jZzd != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzba
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzbi.zzl(this.zza, configuration, (FetchPlaceResponse) obj);
                }
            };
            abstractC5232jZzd.g(new InterfaceC5229g() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzav
                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5232jZzd != null) {
            abstractC5232jZzd.e(new InterfaceC5228f() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaw
                @Override // Td.InterfaceC5228f
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
            ((C5988D) this.zzf.get(i10)).m(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        PlacesClient placesClientZzc = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        this.zzl = placesClientZzc;
        AbstractC5232j abstractC5232jZze = placesClientZzc != null ? placesClientZzc.zze(coordinates) : null;
        if (abstractC5232jZze != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzax
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    String str = (String) obj;
                    Intrinsics.g(str);
                    this.zza.zzf(str, configuration);
                    return Unit.f142422a;
                }
            };
            abstractC5232jZze.g(new InterfaceC5229g() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzay
                @Override // Td.InterfaceC5229g
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (abstractC5232jZze != null) {
            abstractC5232jZze.e(new InterfaceC5228f() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaz
                @Override // Td.InterfaceC5228f
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzbi.zzn(this.zza, coordinates, exc);
                }
            });
        }
    }

    public final void zzh() {
        this.zzi.m(Unit.f142422a);
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
                C5988D c5988d = (C5988D) CollectionsKt.v0(this.zzg, i10);
                zzbp zzbpVar = c5988d != null ? (zzbp) c5988d.e() : null;
                Intrinsics.h(zzbpVar, "null cannot be cast to non-null type com.google.android.libraries.places.widget.internal.placedetails.PlaceImage.ImageUri");
                String string2 = ((zzbl) zzbpVar).zza().toString();
                Intrinsics.i(string2, "toString(...)");
                C5988D c5988d2 = (C5988D) CollectionsKt.v0(this.zzf, i10);
                zzbp zzbpVar2 = c5988d2 != null ? (zzbp) c5988d2.e() : null;
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

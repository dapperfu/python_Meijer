package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.places.Place;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceLocation;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceType;
import com.radiusnetworks.flybuy.sdk.data.places.PlacesRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nJi\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142$\u0010\t\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/PlacesOperation;", "", "placesRepository", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;", "(Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;)V", "retrieveCoordinate", "", "placeId", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "suggest", "query", "types", "", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "countryCodes", "latitude", "", "longitude", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PlacesOperation {
    private final PlacesRepository placesRepository;

    public PlacesOperation(PlacesRepository placesRepository) {
        Intrinsics.j(placesRepository, "placesRepository");
        this.placesRepository = placesRepository;
    }

    public final void retrieveCoordinate(String placeId, Function2<? super PlaceLocation, ? super SdkError, Unit> callback) {
        Intrinsics.j(placeId, "placeId");
        this.placesRepository.retrieveCoordinate(placeId, callback);
    }

    public final void suggest(String query, List<? extends PlaceType> types, List<String> countryCodes, Double latitude, Double longitude, Function2<? super List<Place>, ? super SdkError, Unit> callback) {
        Intrinsics.j(query, "query");
        Intrinsics.j(types, "types");
        Intrinsics.j(countryCodes, "countryCodes");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlaceType) it.next()).getTypeString());
        }
        this.placesRepository.suggest(query, arrayList, countryCodes, latitude, longitude, callback);
    }
}

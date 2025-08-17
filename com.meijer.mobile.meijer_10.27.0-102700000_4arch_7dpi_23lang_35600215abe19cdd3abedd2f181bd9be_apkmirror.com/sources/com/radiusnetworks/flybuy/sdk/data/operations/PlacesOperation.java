package com.radiusnetworks.flybuy.sdk.data.operations;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.places.Place;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceLocation;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceType;
import com.radiusnetworks.flybuy.sdk.data.places.PlacesRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nJU\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122$\u0010\t\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/PlacesOperation;", "", "placesRepository", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;", "(Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;)V", "retrieveCoordinate", "", "placeId", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "suggest", "query", "type", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;", "latitude", "", "longitude", "", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceType;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
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

    public final void suggest(String query, PlaceType type, Double latitude, Double longitude, Function2<? super List<Place>, ? super SdkError, Unit> callback) {
        Intrinsics.j(query, "query");
        Intrinsics.j(type, "type");
        this.placesRepository.suggest(query, type.getTypeString(), latitude, longitude, callback);
    }
}

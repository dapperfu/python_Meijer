package com.radiusnetworks.flybuy.sdk.data.places;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&JY\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2&\b\u0002\u0010\u0006\u001a \u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H&¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesRepository;", "", "retrieveCoordinate", "", "placeId", "", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "suggest", "query", "type", "proximityLatitude", "", "proximityLongitude", "", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlacesRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void suggest$default(PlacesRepository placesRepository, String str, String str2, Double d10, Double d11, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: suggest");
            }
            if ((i10 & 16) != 0) {
                function2 = null;
            }
            placesRepository.suggest(str, str2, d10, d11, function2);
        }
    }

    void retrieveCoordinate(String placeId, Function2<? super PlaceLocation, ? super SdkError, Unit> callback);

    void suggest(String query, String type, Double proximityLatitude, Double proximityLongitude, Function2<? super List<Place>, ? super SdkError, Unit> callback);
}

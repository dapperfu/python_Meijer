package En;

import Cn.AddressInfo;
import Vd.AbstractC5516j;
import Vd.C5519m;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LEn/B;", "", "<init>", "()V", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "sessionToken", "LVd/j;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "results", "", "LEn/A;", "b", "(Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;LVd/j;)Ljava/util/List;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "placesClient", "addressPrediction", "LCn/a;", "a", "(Lcom/google/android/libraries/places/api/net/PlacesClient;LEn/A;)LCn/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class B {
    public final AddressInfo a(PlacesClient placesClient, AddressPrediction addressPrediction) {
        String name;
        String name2;
        String name3;
        String shortName;
        String name4;
        List<AddressComponent> listAsList;
        Intrinsics.j(placesClient, "placesClient");
        Intrinsics.j(addressPrediction, "addressPrediction");
        try {
            AddressComponents addressComponents = ((FetchPlaceResponse) C5519m.b(placesClient.fetchPlace(FetchPlaceRequest.builder(addressPrediction.getPlaceId(), CollectionsKt.p(Place.Field.ID, Place.Field.ADDRESS_COMPONENTS)).setSessionToken(addressPrediction.getSessionToken()).build()), 5000L, TimeUnit.MILLISECONDS)).getPlace().getAddressComponents();
            if (addressComponents == null || (listAsList = addressComponents.asList()) == null) {
                name = "";
                name2 = name;
                name3 = name2;
                shortName = name3;
                name4 = shortName;
            } else {
                List<AddressComponent> list = listAsList;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                name = "";
                name2 = name;
                name3 = name2;
                shortName = name3;
                name4 = shortName;
                for (AddressComponent addressComponent : list) {
                    if (addressComponent.getTypes().contains(PlaceTypes.STREET_NUMBER)) {
                        name = addressComponent.getName();
                        Intrinsics.i(name, "getName(...)");
                    } else if (addressComponent.getTypes().contains(PlaceTypes.ROUTE)) {
                        name2 = addressComponent.getName();
                        Intrinsics.i(name2, "getName(...)");
                    } else if (addressComponent.getTypes().contains(PlaceTypes.LOCALITY)) {
                        name3 = addressComponent.getName();
                        Intrinsics.i(name3, "getName(...)");
                    } else if (addressComponent.getTypes().contains(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1)) {
                        shortName = addressComponent.getShortName();
                        if (shortName == null) {
                            shortName = "";
                        }
                    } else if (addressComponent.getTypes().contains(PlaceTypes.POSTAL_CODE)) {
                        name4 = addressComponent.getName();
                        Intrinsics.i(name4, "getName(...)");
                    }
                    arrayList.add(Unit.f143329a);
                }
            }
            return new AddressInfo(name, name2, name3, shortName, name4);
        } catch (TimeoutException e10) {
            qw.a.INSTANCE.f(e10, "Address prediction call timed out", new Object[0]);
            return null;
        }
    }

    public final List<AddressPrediction> b(AutocompleteSessionToken sessionToken, AbstractC5516j<FindAutocompletePredictionsResponse> results) {
        Intrinsics.j(sessionToken, "sessionToken");
        Intrinsics.j(results, "results");
        try {
            List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) C5519m.b(results, 5000L, TimeUnit.MILLISECONDS)).getAutocompletePredictions();
            Intrinsics.g(autocompletePredictions);
            List<AutocompletePrediction> list = autocompletePredictions;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (AutocompletePrediction autocompletePrediction : list) {
                String placeId = autocompletePrediction.getPlaceId();
                Intrinsics.i(placeId, "getPlaceId(...)");
                String string = autocompletePrediction.getPrimaryText(null).toString();
                Intrinsics.i(string, "toString(...)");
                String string2 = autocompletePrediction.getSecondaryText(null).toString();
                Intrinsics.i(string2, "toString(...)");
                arrayList.add(new AddressPrediction(sessionToken, placeId, string, string2));
            }
            return arrayList;
        } catch (TimeoutException e10) {
            qw.a.INSTANCE.f(e10, "Address prediction call timed out", new Object[0]);
            return CollectionsKt.m();
        }
    }
}

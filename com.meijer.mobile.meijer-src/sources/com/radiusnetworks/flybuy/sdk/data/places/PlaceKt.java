package com.radiusnetworks.flybuy.sdk.data.places;

import com.radiusnetworks.flybuy.api.mapbox.model.GetSearchBoxSuggestionsResponse;
import com.radiusnetworks.flybuy.api.mapbox.model.Suggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toSuggestions", "", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "Lcom/radiusnetworks/flybuy/api/mapbox/model/GetSearchBoxSuggestionsResponse;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PlaceKt {
    public static final List<Place> toSuggestions(GetSearchBoxSuggestionsResponse getSearchBoxSuggestionsResponse) {
        Intrinsics.j(getSearchBoxSuggestionsResponse, "<this>");
        List<Suggestion> suggestions = getSearchBoxSuggestionsResponse.getSuggestions();
        if (suggestions == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(suggestions, 10));
        Iterator<T> it = suggestions.iterator();
        while (it.hasNext()) {
            arrayList.add(new Place((Suggestion) it.next()));
        }
        return arrayList;
    }
}

package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.radiusnetworks.flybuy.api.mapbox.MapboxApi;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.error.CommonError;
import com.radiusnetworks.flybuy.sdk.data.operations.PlacesOperation;
import com.radiusnetworks.flybuy.sdk.data.places.Place;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceLocation;
import com.radiusnetworks.flybuy.sdk.data.places.PlaceType;
import com.radiusnetworks.flybuy.sdk.data.places.PlacesConfig;
import com.radiusnetworks.flybuy.sdk.data.places.PlacesDataStore;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.manager.builder.PlaceSuggestionOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u001c\u0010\u0015\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00120\u0016J:\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\"\u0010\u0015\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00120\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/PlacesManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "handler", "Landroid/os/Handler;", "value", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;", "placesConfig", "getPlacesConfig$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;", "setPlacesConfig$core_defaultRelease", "(Lcom/radiusnetworks/flybuy/sdk/data/places/PlacesConfig;)V", "getPlacesOperation", "Lcom/radiusnetworks/flybuy/sdk/data/operations/PlacesOperation;", "retrieve", "", "place", "Lcom/radiusnetworks/flybuy/sdk/data/places/Place;", "callback", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/places/PlaceLocation;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "suggest", "query", "", "options", "Lcom/radiusnetworks/flybuy/sdk/manager/builder/PlaceSuggestionOptions;", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PlacesManager {
    private final Context applicationContext;
    private final Handler handler;
    private PlacesConfig placesConfig;

    public PlacesManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final PlacesOperation getPlacesOperation() {
        Context context = this.applicationContext;
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        PlacesDataStore placesRepository = new PlacesDataStore(applicationContext);
        Intrinsics.j(placesRepository, "placesRepository");
        return new PlacesOperation(placesRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suggest$lambda$1$lambda$0(PlacesManager this$0, String query, List placeTypes, PlaceSuggestionOptions options, Function2 callback) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(query, "$query");
        Intrinsics.j(placeTypes, "$placeTypes");
        Intrinsics.j(options, "$options");
        Intrinsics.j(callback, "$callback");
        this$0.getPlacesOperation().suggest(query, placeTypes, options.getCountryCodes(), options.getLatitude(), options.getLongitude(), callback);
    }

    /* renamed from: getPlacesConfig$core_defaultRelease, reason: from getter */
    public final PlacesConfig getPlacesConfig() {
        return this.placesConfig;
    }

    public final void retrieve(Place place, Function2<? super PlaceLocation, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(place, "place");
        Intrinsics.j(callback, "callback");
        try {
            if (this.placesConfig == null) {
                callback.invoke(null, CommonError.INSTANCE.exceptionWith("Places has not been configured for your app."));
            } else {
                getPlacesOperation().retrieveCoordinate(place.getId(), callback);
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void setPlacesConfig$core_defaultRelease(PlacesConfig placesConfig) {
        String mapboxAccessToken;
        MapboxApi mapboxApi = MapboxApi.INSTANCE;
        if (placesConfig == null || (mapboxAccessToken = placesConfig.getMapboxAccessToken()) == null) {
            mapboxAccessToken = "";
        }
        mapboxApi.setTokenKey(mapboxAccessToken);
        this.placesConfig = placesConfig;
    }

    public final void suggest(final String query, final PlaceSuggestionOptions options, final Function2<? super List<Place>, ? super SdkError, Unit> callback) throws Exception {
        Exception exc;
        Intrinsics.j(query, "query");
        Intrinsics.j(options, "options");
        Intrinsics.j(callback, "callback");
        try {
            try {
                if (this.placesConfig == null) {
                    callback.invoke(null, CommonError.INSTANCE.exceptionWith("Places has not been configured for your app."));
                    return;
                }
                final List<PlaceType> listE = options.getPlaceTypes().isEmpty() ? CollectionsKt.e(PlaceType.ADDRESS) : options.getPlaceTypes();
                this.handler.removeCallbacksAndMessages(null);
                Handler handler = this.handler;
                try {
                    Runnable runnable = new Runnable() { // from class: com.radiusnetworks.flybuy.sdk.manager.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            PlacesManager.suggest$lambda$1$lambda$0(this.f120956a, query, listE, options, callback);
                        }
                    };
                    PlacesConfig placesConfig = this.placesConfig;
                    handler.postDelayed(runnable, placesConfig != null ? placesConfig.getSuggestionRequestDelayMillis() : 0L);
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    LogExtensionsKt.logd(this, true, exc, "catchAndThrow caught exception", new Object[0]);
                    com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", exc);
                    throw exc;
                }
            } catch (Exception e11) {
                exc = e11;
                LogExtensionsKt.logd(this, true, exc, "catchAndThrow caught exception", new Object[0]);
                com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", exc);
                throw exc;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}

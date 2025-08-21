package com.radiusnetworks.flybuy.sdk.manager.locationrequest;

import android.content.Context;
import android.location.Location;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J2\u0010\f\u001a\u00020\n2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\n0\u000eH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "locationProviders", "", "Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager$LocationProvider;", "addLocationProvider", "", "provider", "requestLocation", "callback", "Lkotlin/Function1;", "Landroid/location/Location;", "Lkotlin/ParameterName;", "name", "location", "requestLocation$core_defaultRelease", "LocationProvider", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LocationRequestManager {
    private final Context applicationContext;
    private final Set<LocationProvider> locationProviders;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/locationrequest/LocationRequestManager$LocationProvider;", "", "requestLocation", "", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "Landroid/location/Location;", "Lkotlin/ParameterName;", "name", "location", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface LocationProvider {
        void requestLocation(Context context, Function1<? super Location, Unit> callback);
    }

    public LocationRequestManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.locationProviders = new LinkedHashSet();
    }

    public final void addLocationProvider(LocationProvider provider) {
        Intrinsics.j(provider, "provider");
        this.locationProviders.add(provider);
    }

    public final void requestLocation$core_defaultRelease(Function1<? super Location, Unit> callback) {
        Intrinsics.j(callback, "callback");
        if (this.locationProviders.isEmpty()) {
            callback.invoke(null);
            return;
        }
        LocationProvider locationProvider = (LocationProvider) CollectionsKt.t0(this.locationProviders);
        if (locationProvider != null) {
            locationProvider.requestLocation(this.applicationContext, callback);
        }
    }
}

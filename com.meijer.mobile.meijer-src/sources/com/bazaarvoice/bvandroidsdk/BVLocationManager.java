package com.bazaarvoice.bvandroidsdk;

import Xa.j;
import Xa.l;
import Xa.m;
import Xa.n;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;

@Deprecated
/* loaded from: classes4.dex */
public class BVLocationManager {
    public static final String ACTION_GEOFENCE_VISIT = "com.bazaarvoice.bvandroidsdk.action.GEOFENCE_VISIT";
    private static final String EXTRA_BV_VISIT = "extra_bv_visit";
    private static final String EXTRA_DID_START = "extra_did_start";
    private static final String TAG = "BVLocationManager";
    private static BVLocationManager instance;
    private Context appContext;
    private m placeManager;
    private final LocationListener proxyLocationListener;
    private final M6.a<BVLocationListener> visitListeners;

    public interface BVLocationListener {
        void didBeginVisit(BVVisit bVVisit);

        void didEndVisit(BVVisit bVVisit);
    }

    static class LocationListener extends l {
        private final BVLocationManager bvLocationManager;
        private final Gson gson;
        private final M6.a<BVLocationListener> visitListeners;

        @Override // Xa.l
        public void onVisitEnd(n nVar) {
            LocationAnalyticsManager.sendLocationEventForGimbalVisit(nVar, "Exit");
            callbackRegisteredListeners(nVar, false);
        }

        @Override // Xa.l
        public void onVisitStart(n nVar) {
            LocationAnalyticsManager.sendLocationEventForGimbalVisit(nVar, "Entry");
            callbackRegisteredListeners(nVar, true);
        }

        LocationListener(BVLocationManager bVLocationManager, M6.a<BVLocationListener> aVar, Gson gson) {
            this.bvLocationManager = bVLocationManager;
            this.visitListeners = aVar;
            this.gson = gson;
        }

        private void callbackRegisteredListeners(n nVar, boolean z10) {
            Xa.a aVarA = nVar.c().a();
            String value = aVarA.getValue(PlaceAttribute.Type.getKey());
            String value2 = aVarA.getValue(PlaceAttribute.ClientId.getKey());
            if (value2 != null && value2.equalsIgnoreCase(BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getClientId()) && value != null && value.equalsIgnoreCase(PlaceType.Geofence.getValue())) {
                BVVisit bVVisitAttributesToVisit = this.bvLocationManager.attributesToVisit(aVarA, nVar.b());
                Intent intent = new Intent(BVLocationManager.ACTION_GEOFENCE_VISIT);
                intent.putExtra(BVLocationManager.EXTRA_BV_VISIT, this.gson.x(bVVisitAttributesToVisit));
                intent.putExtra(BVLocationManager.EXTRA_DID_START, z10);
                for (BVLocationListener bVLocationListener : this.visitListeners.c()) {
                    if (bVLocationListener != null) {
                        if (z10) {
                            bVLocationListener.didBeginVisit(bVVisitAttributesToVisit);
                        } else {
                            bVLocationListener.didEndVisit(bVVisitAttributesToVisit);
                        }
                    } else {
                        this.visitListeners.d(bVLocationListener);
                    }
                }
            }
        }
    }

    public static boolean didStart(Intent intent) {
        return intent.getBooleanExtra(EXTRA_DID_START, true);
    }

    public static BVVisit getBvVisit(Intent intent) {
        return (BVVisit) BVSDK.getInstance().getBvWorkerData().getGson().o(intent.getStringExtra(EXTRA_BV_VISIT), BVVisit.class);
    }

    public static BVLocationManager getInstance() {
        if (instance == null) {
            instance = new BVLocationManager();
        }
        return instance;
    }

    public void addLocationVisitListener(BVLocationListener bVLocationListener) {
        if (bVLocationListener == null || this.visitListeners.b(bVLocationListener)) {
            return;
        }
        this.visitListeners.a(bVLocationListener);
    }

    BVVisit attributesToVisit(Xa.a aVar, long j10) {
        return new BVVisit(aVar.getValue(PlaceAttribute.Name.getKey()), aVar.getValue(PlaceAttribute.Address.getKey()), aVar.getValue(PlaceAttribute.City.getKey()), aVar.getValue(PlaceAttribute.State.getKey()), aVar.getValue(PlaceAttribute.Zip.getKey()), aVar.getValue(PlaceAttribute.StoreId.getKey()), j10);
    }

    public void removeLocationVisitListener(BVLocationListener bVLocationListener) {
        if (bVLocationListener != null) {
            this.visitListeners.d(bVLocationListener);
        }
    }

    public void stopMonitoringLocation() {
        this.placeManager.e();
        j.c();
    }

    private BVLocationManager() {
        BVSDK bvsdk = BVSDK.getInstance();
        BVUserProvidedData bvUserProvidedData = bvsdk.getBvUserProvidedData();
        this.appContext = bvUserProvidedData.getAppContext();
        j.a(bvUserProvidedData.getApplication(), bvUserProvidedData.getBvConfig().getApiKeyLocation());
        M6.a<BVLocationListener> aVar = new M6.a<>();
        this.visitListeners = aVar;
        LocationListener locationListener = new LocationListener(this, aVar, bvsdk.getBvWorkerData().getGson());
        this.proxyLocationListener = locationListener;
        m mVarC = m.c();
        this.placeManager = mVarC;
        mVarC.b(locationListener);
    }

    public void startMonitoringLocation() {
        j.b();
        this.placeManager.d();
    }
}

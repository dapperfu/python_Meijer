package Un;

import com.meijer.mobile.meijer.service.GeoFenceTransitionsIntentService;
import lu.InterfaceC15612a;
import xm.C18197h;
import yo.k;

/* loaded from: classes10.dex */
public final class c implements InterfaceC15612a<GeoFenceTransitionsIntentService> {
    public static void a(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService, C18197h c18197h) {
        geoFenceTransitionsIntentService.notificationManager = c18197h;
    }

    public static void b(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService, k kVar) {
        geoFenceTransitionsIntentService.userManager = kVar;
    }
}

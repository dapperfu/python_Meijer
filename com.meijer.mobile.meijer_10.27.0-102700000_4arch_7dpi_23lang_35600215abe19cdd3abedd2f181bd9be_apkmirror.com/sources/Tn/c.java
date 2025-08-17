package Tn;

import com.meijer.mobile.meijer.service.GeoFenceTransitionsIntentService;
import pu.InterfaceC16421a;
import wm.C17838h;
import yo.k;

/* loaded from: classes9.dex */
public final class c implements InterfaceC16421a<GeoFenceTransitionsIntentService> {
    public static void a(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService, C17838h c17838h) {
        geoFenceTransitionsIntentService.notificationManager = c17838h;
    }

    public static void b(GeoFenceTransitionsIntentService geoFenceTransitionsIntentService, k kVar) {
        geoFenceTransitionsIntentService.userManager = kVar;
    }
}

package Ul;

import java.util.List;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LUl/b;", "Lkk/a;", "carouselType", "", "", "beaconUrls", "a", "(LUl/b;Lkk/a;Ljava/util/List;)LUl/b;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    public static final BeaconsTracker a(BeaconsTracker beaconsTracker, EnumC15218a carouselType, List<String> beaconUrls) {
        Intrinsics.j(beaconsTracker, "<this>");
        Intrinsics.j(carouselType, "carouselType");
        Intrinsics.j(beaconUrls, "beaconUrls");
        List listP0 = CollectionsKt.P0(beaconsTracker.i(), carouselType == EnumC15218a.f142567a ? beaconUrls : CollectionsKt.m());
        List<String> listJ = beaconsTracker.j();
        if (carouselType != EnumC15218a.f142568b) {
            beaconUrls = CollectionsKt.m();
        }
        return BeaconsTracker.b(beaconsTracker, null, null, null, null, null, null, listP0, CollectionsKt.P0(listJ, beaconUrls), 63, null);
    }
}

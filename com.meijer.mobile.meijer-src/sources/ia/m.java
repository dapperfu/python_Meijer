package ia;

import Z9.Geofence;
import android.location.Location;
import ja.GeofenceGroup;
import ja.GeofenceResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lia/m;", "", "", "limit", "<init>", "(I)V", "Landroid/location/Location;", "currentLocation", "Lja/b;", "geofenceResponse", "", "LZ9/a;", "a", "(Landroid/location/Location;Lja/b;)Ljava/util/List;", "I", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Location f137469a;

        public a(Location location) {
            this.f137469a = location;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Geofence geofence = (Geofence) t10;
            Location location = new Location("gps");
            location.setLongitude(geofence.getLon());
            location.setLatitude(geofence.getLat());
            Double dValueOf = Double.valueOf(location.distanceTo(this.f137469a) - geofence.getRadius());
            Geofence geofence2 = (Geofence) t11;
            Location location2 = new Location("gps");
            location2.setLongitude(geofence2.getLon());
            location2.setLatitude(geofence2.getLat());
            return ComparisonsKt.d(dValueOf, Double.valueOf(location2.distanceTo(this.f137469a) - geofence2.getRadius()));
        }
    }

    public List<Geofence> a(Location currentLocation, GeofenceResponse geofenceResponse) {
        Intrinsics.j(currentLocation, "currentLocation");
        Intrinsics.j(geofenceResponse, "geofenceResponse");
        List<GeofenceGroup> listA = geofenceResponse.a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((GeofenceGroup) it.next()).a());
        }
        List<Geofence> listZ0 = CollectionsKt.Z0(arrayList, new a(currentLocation));
        return this.limit > listZ0.size() ? listZ0 : listZ0.subList(0, this.limit);
    }

    public m(int i10) {
        this.limit = i10;
    }
}

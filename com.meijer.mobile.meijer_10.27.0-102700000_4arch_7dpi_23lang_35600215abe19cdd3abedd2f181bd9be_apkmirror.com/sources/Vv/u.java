package Vv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"LVv/u;", "", "<init>", "()V", "LQv/s;", "failedRoute", "", "b", "(LQv/s;)V", PlaceTypes.ROUTE, "a", "", "c", "(LQv/s;)Z", "", "Ljava/util/Set;", "_failedRoutes", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<Qv.s> _failedRoutes = new LinkedHashSet();

    public final synchronized void a(Qv.s route) {
        Intrinsics.j(route, "route");
        this._failedRoutes.remove(route);
    }

    public final synchronized void b(Qv.s failedRoute) {
        Intrinsics.j(failedRoute, "failedRoute");
        this._failedRoutes.add(failedRoute);
    }

    public final synchronized boolean c(Qv.s route) {
        Intrinsics.j(route, "route");
        return this._failedRoutes.contains(route);
    }
}

package Ad;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C6522d;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* loaded from: classes6.dex */
public final class Y extends AbstractC15136a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    LocationRequest f230a;

    @Deprecated
    public static Y B(String str, LocationRequest locationRequest) {
        return new Y(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return C6535q.a(this.f230a, ((Y) obj).f230a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f230a.hashCode();
    }

    public final String toString() {
        return this.f230a.toString();
    }

    Y(LocationRequest locationRequest, List list, boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6522d c6522d = (C6522d) it.next();
                    com.google.android.gms.common.util.t.a(workSource, c6522d.f64835a, c6522d.f64836b);
                }
            }
            aVar.n(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.l(2);
        }
        if (z12) {
            aVar.m(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.f230a = aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f230a, i10, false);
        C15137b.b(parcel, iA);
    }
}

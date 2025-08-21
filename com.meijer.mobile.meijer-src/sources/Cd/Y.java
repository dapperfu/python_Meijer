package Cd;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C6647d;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* loaded from: classes6.dex */
public final class Y extends AbstractC15707a {
    public static final Parcelable.Creator<Y> CREATOR = new Z();

    /* renamed from: a, reason: collision with root package name */
    LocationRequest f4226a;

    @Deprecated
    public static Y B(String str, LocationRequest locationRequest) {
        return new Y(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y) {
            return C6660q.a(this.f4226a, ((Y) obj).f4226a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4226a.hashCode();
    }

    public final String toString() {
        return this.f4226a.toString();
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
                    C6647d c6647d = (C6647d) it.next();
                    com.google.android.gms.common.util.t.a(workSource, c6647d.f65675a, c6647d.f65676b);
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
        this.f4226a = aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f4226a, i10, false);
        C15708b.b(parcel, iA);
    }
}

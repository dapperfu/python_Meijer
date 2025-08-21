package com.google.android.gms.location;

import Ld.z;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class LocationResult extends AbstractC15707a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f85581a;

    /* renamed from: b, reason: collision with root package name */
    static final List f85580b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    public List<Location> T() {
        return this.f85581a;
    }

    public Location B() {
        int size = this.f85581a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f85581a.get(size - 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f85581a.equals(locationResult.f85581a);
        }
        if (this.f85581a.size() != locationResult.f85581a.size()) {
            return false;
        }
        Iterator it = locationResult.f85581a.iterator();
        for (Location location : this.f85581a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !C6660q.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C6660q.b(this.f85581a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationResult");
        int i10 = z.f18199d;
        List list = this.f85581a;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z.a((Location) it.next(), sb2);
            sb2.append(", ");
            z10 = true;
        }
        if (z10) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    LocationResult(List list) {
        this.f85581a = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 1, T(), false);
        C15708b.b(parcel, iA);
    }
}

package com.google.android.gms.location;

import Jd.z;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class LocationResult extends AbstractC15136a implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f84741a;

    /* renamed from: b, reason: collision with root package name */
    static final List f84740b = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new c();

    public List<Location> T() {
        return this.f84741a;
    }

    public Location B() {
        int size = this.f84741a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f84741a.get(size - 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f84741a.equals(locationResult.f84741a);
        }
        if (this.f84741a.size() != locationResult.f84741a.size()) {
            return false;
        }
        Iterator it = locationResult.f84741a.iterator();
        for (Location location : this.f84741a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !C6535q.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C6535q.b(this.f84741a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocationResult");
        int i10 = z.f14862d;
        List list = this.f84741a;
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
        this.f84741a = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 1, T(), false);
        C15137b.b(parcel, iA);
    }
}

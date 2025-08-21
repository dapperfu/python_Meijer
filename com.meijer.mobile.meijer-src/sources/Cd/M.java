package Cd;

import Ld.AbstractC4021k;
import com.google.android.gms.location.LocationAvailability;
import jd.C14987j;

/* loaded from: classes6.dex */
final class M implements C14987j.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationAvailability f4201a;

    @Override // jd.C14987j.b
    public final void b() {
    }

    M(O o10, LocationAvailability locationAvailability) {
        this.f4201a = locationAvailability;
    }

    @Override // jd.C14987j.b
    public final /* synthetic */ void a(Object obj) {
        ((AbstractC4021k) obj).a(this.f4201a);
    }
}

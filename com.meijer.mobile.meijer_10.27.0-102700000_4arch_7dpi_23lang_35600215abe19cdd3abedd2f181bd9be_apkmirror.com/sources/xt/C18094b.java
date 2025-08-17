package xt;

import android.location.Location;
import ut.C17315a;

/* renamed from: xt.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18094b implements InterfaceC18093a {
    private static Location b(C17315a c17315a) {
        Location location = new Location(c17315a.f163453c);
        location.setLatitude(c17315a.f163451a);
        location.setLongitude(c17315a.f163452b);
        return location;
    }

    @Override // xt.InterfaceC18093a
    public final float a(C17315a c17315a, C17315a c17315a2) {
        return b(c17315a).distanceTo(b(c17315a2));
    }
}

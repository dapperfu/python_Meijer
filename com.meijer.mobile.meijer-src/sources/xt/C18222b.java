package xt;

import android.location.Location;
import ut.C17467a;

/* renamed from: xt.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18222b implements InterfaceC18221a {
    private static Location b(C17467a c17467a) {
        Location location = new Location(c17467a.f164531c);
        location.setLatitude(c17467a.f164529a);
        location.setLongitude(c17467a.f164530b);
        return location;
    }

    @Override // xt.InterfaceC18221a
    public final float a(C17467a c17467a, C17467a c17467a2) {
        return b(c17467a).distanceTo(b(c17467a2));
    }
}

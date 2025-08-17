package xg;

import Dd.sa;
import android.graphics.Point;
import android.graphics.Rect;
import wg.InterfaceC17820a;

/* loaded from: classes7.dex */
public final class m implements InterfaceC17820a {

    /* renamed from: a, reason: collision with root package name */
    private final sa f169632a;

    @Override // wg.InterfaceC17820a
    public final String a() {
        return this.f169632a.c0();
    }

    @Override // wg.InterfaceC17820a
    public final Rect b() {
        Point[] pointArrK0 = this.f169632a.K0();
        if (pointArrK0 == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrK0) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // wg.InterfaceC17820a
    public final String c() {
        return this.f169632a.q0();
    }

    @Override // wg.InterfaceC17820a
    public final int d() {
        return this.f169632a.T();
    }

    @Override // wg.InterfaceC17820a
    public final Point[] e() {
        return this.f169632a.K0();
    }

    @Override // wg.InterfaceC17820a
    public final int getFormat() {
        return this.f169632a.B();
    }

    public m(sa saVar) {
        this.f169632a = saVar;
    }
}

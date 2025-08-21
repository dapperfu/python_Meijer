package zg;

import Fd.sa;
import android.graphics.Point;
import android.graphics.Rect;
import yg.InterfaceC18313a;

/* loaded from: classes8.dex */
public final class m implements InterfaceC18313a {

    /* renamed from: a, reason: collision with root package name */
    private final sa f172781a;

    @Override // yg.InterfaceC18313a
    public final String a() {
        return this.f172781a.b0();
    }

    @Override // yg.InterfaceC18313a
    public final Rect b() {
        Point[] pointArrI0 = this.f172781a.I0();
        if (pointArrI0 == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrI0) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // yg.InterfaceC18313a
    public final String c() {
        return this.f172781a.r0();
    }

    @Override // yg.InterfaceC18313a
    public final int d() {
        return this.f172781a.T();
    }

    @Override // yg.InterfaceC18313a
    public final Point[] e() {
        return this.f172781a.I0();
    }

    @Override // yg.InterfaceC18313a
    public final int getFormat() {
        return this.f172781a.B();
    }

    public m(sa saVar) {
        this.f172781a = saVar;
    }
}

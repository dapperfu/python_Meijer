package zg;

import Fd.C3588z8;
import android.graphics.Point;
import android.graphics.Rect;
import yg.InterfaceC18313a;

/* loaded from: classes8.dex */
public final class o implements InterfaceC18313a {

    /* renamed from: a, reason: collision with root package name */
    private final C3588z8 f172790a;

    @Override // yg.InterfaceC18313a
    public final String a() {
        return this.f172790a.f10403c;
    }

    @Override // yg.InterfaceC18313a
    public final Rect b() {
        C3588z8 c3588z8 = this.f172790a;
        if (c3588z8.f10405e == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c3588z8.f10405e;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // yg.InterfaceC18313a
    public final String c() {
        return this.f172790a.f10402b;
    }

    @Override // yg.InterfaceC18313a
    public final int d() {
        return this.f172790a.f10404d;
    }

    @Override // yg.InterfaceC18313a
    public final Point[] e() {
        return this.f172790a.f10405e;
    }

    @Override // yg.InterfaceC18313a
    public final int getFormat() {
        return this.f172790a.f10401a;
    }

    public o(C3588z8 c3588z8) {
        this.f172790a = c3588z8;
    }
}

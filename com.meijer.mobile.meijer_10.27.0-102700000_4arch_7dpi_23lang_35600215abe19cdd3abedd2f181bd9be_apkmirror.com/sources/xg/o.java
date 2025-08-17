package xg;

import Dd.C3366z8;
import android.graphics.Point;
import android.graphics.Rect;
import wg.InterfaceC17820a;

/* loaded from: classes7.dex */
public final class o implements InterfaceC17820a {

    /* renamed from: a, reason: collision with root package name */
    private final C3366z8 f169641a;

    @Override // wg.InterfaceC17820a
    public final String a() {
        return this.f169641a.f6370c;
    }

    @Override // wg.InterfaceC17820a
    public final Rect b() {
        C3366z8 c3366z8 = this.f169641a;
        if (c3366z8.f6372e == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = c3366z8.f6372e;
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

    @Override // wg.InterfaceC17820a
    public final String c() {
        return this.f169641a.f6369b;
    }

    @Override // wg.InterfaceC17820a
    public final int d() {
        return this.f169641a.f6371d;
    }

    @Override // wg.InterfaceC17820a
    public final Point[] e() {
        return this.f169641a.f6372e;
    }

    @Override // wg.InterfaceC17820a
    public final int getFormat() {
        return this.f169641a.f6368a;
    }

    public o(C3366z8 c3366z8) {
        this.f169641a = c3366z8;
    }
}

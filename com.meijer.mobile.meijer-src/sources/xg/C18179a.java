package xg;

import Bg.b;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.r;
import yg.InterfaceC18313a;

/* renamed from: xg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C18179a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18313a f170748a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f170749b;

    /* renamed from: c, reason: collision with root package name */
    private final Point[] f170750c;

    public Point[] a() {
        return this.f170750c;
    }

    public String b() {
        return this.f170748a.a();
    }

    public int c() {
        int format = this.f170748a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public String d() {
        return this.f170748a.c();
    }

    public int e() {
        return this.f170748a.d();
    }

    public C18179a(InterfaceC18313a interfaceC18313a, Matrix matrix) {
        this.f170748a = (InterfaceC18313a) r.l(interfaceC18313a);
        Rect rectB = interfaceC18313a.b();
        if (rectB != null && matrix != null) {
            b.c(rectB, matrix);
        }
        this.f170749b = rectB;
        Point[] pointArrE = interfaceC18313a.e();
        if (pointArrE != null && matrix != null) {
            b.b(pointArrE, matrix);
        }
        this.f170750c = pointArrE;
    }
}

package vg;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.r;
import wg.InterfaceC17820a;
import zg.C18456b;

/* renamed from: vg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C17567a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC17820a f164712a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f164713b;

    /* renamed from: c, reason: collision with root package name */
    private final Point[] f164714c;

    public Point[] a() {
        return this.f164714c;
    }

    public String b() {
        return this.f164712a.a();
    }

    public int c() {
        int format = this.f164712a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public String d() {
        return this.f164712a.c();
    }

    public int e() {
        return this.f164712a.d();
    }

    public C17567a(InterfaceC17820a interfaceC17820a, Matrix matrix) {
        this.f164712a = (InterfaceC17820a) r.l(interfaceC17820a);
        Rect rectB = interfaceC17820a.b();
        if (rectB != null && matrix != null) {
            C18456b.c(rectB, matrix);
        }
        this.f164713b = rectB;
        Point[] pointArrE = interfaceC17820a.e();
        if (pointArrE != null && matrix != null) {
            C18456b.b(pointArrE, matrix);
        }
        this.f164714c = pointArrE;
    }
}

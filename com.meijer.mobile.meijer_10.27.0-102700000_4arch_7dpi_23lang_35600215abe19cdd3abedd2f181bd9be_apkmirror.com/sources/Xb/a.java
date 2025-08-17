package Xb;

import Vb.h;
import Yb.b;
import cc.f;
import ic.n;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static a f39186f;

    /* renamed from: a, reason: collision with root package name */
    public f f39187a;

    /* renamed from: b, reason: collision with root package name */
    private Vb.f f39188b;

    /* renamed from: c, reason: collision with root package name */
    public Vb.a f39189c;

    /* renamed from: d, reason: collision with root package name */
    public final n f39190d = new n();

    /* renamed from: e, reason: collision with root package name */
    public b f39191e;

    public static a a() {
        if (f39186f == null) {
            f39186f = new a();
        }
        return f39186f;
    }

    private a() {
        UUID[] uuidArrC = h.c();
        this.f39188b = new Vb.f();
        this.f39189c = new Vb.a(uuidArrC);
        this.f39187a = new f("gimbalBeacons");
    }
}

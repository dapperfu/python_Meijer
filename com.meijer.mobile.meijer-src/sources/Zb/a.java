package Zb;

import Xb.h;
import ac.C5680b;
import ec.f;
import java.util.UUID;
import kc.n;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static a f43664f;

    /* renamed from: a, reason: collision with root package name */
    public f f43665a;

    /* renamed from: b, reason: collision with root package name */
    private Xb.f f43666b;

    /* renamed from: c, reason: collision with root package name */
    public Xb.a f43667c;

    /* renamed from: d, reason: collision with root package name */
    public final n f43668d = new n();

    /* renamed from: e, reason: collision with root package name */
    public C5680b f43669e;

    public static a a() {
        if (f43664f == null) {
            f43664f = new a();
        }
        return f43664f;
    }

    private a() {
        UUID[] uuidArrC = h.c();
        this.f43666b = new Xb.f();
        this.f43667c = new Xb.a(uuidArrC);
        this.f43665a = new f("gimbalBeacons");
    }
}

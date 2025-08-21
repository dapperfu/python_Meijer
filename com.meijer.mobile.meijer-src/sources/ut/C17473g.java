package ut;

import android.content.Context;
import android.provider.Settings;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ut.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C17473g implements Db.k, InterfaceC17471e {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f164559j = C13785b.a(C17473g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Context f164560a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Object> f164561b;

    /* renamed from: c, reason: collision with root package name */
    private final C17474h f164562c;

    /* renamed from: d, reason: collision with root package name */
    private final zt.n f164563d;

    /* renamed from: e, reason: collision with root package name */
    private Db.b f164564e;

    /* renamed from: f, reason: collision with root package name */
    private Nb.c f164565f;

    /* renamed from: g, reason: collision with root package name */
    private final Dt.g f164566g;

    /* renamed from: h, reason: collision with root package name */
    private final Dt.f f164567h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f164568i = false;

    @Override // ut.InterfaceC17471e
    public final void a() {
        c();
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("allowGeofence".equals(str) || "overrideGeofence".equals(str)) {
            c();
        }
    }

    public final void c() {
        Gb.f fVarX;
        Gb.f fVarX2 = this.f164564e.x();
        Gb.f fVar = Gb.f.ON;
        if ((fVarX2 == fVar || (fVarX2 == Gb.f.NOT_SET && this.f164568i)) && Settings.System.getInt(this.f164560a.getContentResolver(), "airplane_mode_on", 0) == 0 && ((fVarX = this.f164564e.x()) == fVar || (fVarX == Gb.f.NOT_SET && this.f164564e.p()))) {
            this.f164562c.e();
            this.f164567h.a();
        } else {
            this.f164562c.f();
            this.f164567h.b();
        }
    }

    public final void d() {
        synchronized (this.f164561b) {
            try {
                Iterator<Object> it = this.f164561b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C17473g(Context context, C17474h c17474h, zt.n nVar, Dt.g gVar, Dt.f fVar, Db.b bVar, Nb.c cVar) {
        this.f164560a = context;
        this.f164562c = c17474h;
        this.f164563d = nVar;
        this.f164566g = gVar;
        this.f164567h = fVar;
        this.f164564e = bVar;
        this.f164565f = cVar;
        bVar.g(this, "allowGeofence");
        bVar.g(this, "overrideGeofence");
        this.f164561b = new ArrayList<>();
    }

    @Override // ut.InterfaceC17471e
    public final void b() {
        c();
    }
}

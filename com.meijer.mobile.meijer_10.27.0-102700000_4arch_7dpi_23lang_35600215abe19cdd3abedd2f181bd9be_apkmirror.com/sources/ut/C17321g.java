package ut;

import android.content.Context;
import android.provider.Settings;
import cb.C6380a;
import cb.C6381b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ut.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C17321g implements Bb.k, InterfaceC17319e {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f163481j = C6381b.a(C17321g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Context f163482a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Object> f163483b;

    /* renamed from: c, reason: collision with root package name */
    private final C17322h f163484c;

    /* renamed from: d, reason: collision with root package name */
    private final zt.n f163485d;

    /* renamed from: e, reason: collision with root package name */
    private Bb.b f163486e;

    /* renamed from: f, reason: collision with root package name */
    private Lb.c f163487f;

    /* renamed from: g, reason: collision with root package name */
    private final Dt.g f163488g;

    /* renamed from: h, reason: collision with root package name */
    private final Dt.f f163489h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163490i = false;

    @Override // ut.InterfaceC17319e
    public final void a() {
        c();
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("allowGeofence".equals(str) || "overrideGeofence".equals(str)) {
            c();
        }
    }

    public final void c() {
        Eb.f fVarX;
        Eb.f fVarX2 = this.f163486e.x();
        Eb.f fVar = Eb.f.ON;
        if ((fVarX2 == fVar || (fVarX2 == Eb.f.NOT_SET && this.f163490i)) && Settings.System.getInt(this.f163482a.getContentResolver(), "airplane_mode_on", 0) == 0 && ((fVarX = this.f163486e.x()) == fVar || (fVarX == Eb.f.NOT_SET && this.f163486e.p()))) {
            this.f163484c.e();
            this.f163489h.a();
        } else {
            this.f163484c.f();
            this.f163489h.b();
        }
    }

    public final void d() {
        synchronized (this.f163483b) {
            try {
                Iterator<Object> it = this.f163483b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C17321g(Context context, C17322h c17322h, zt.n nVar, Dt.g gVar, Dt.f fVar, Bb.b bVar, Lb.c cVar) {
        this.f163482a = context;
        this.f163484c = c17322h;
        this.f163485d = nVar;
        this.f163488g = gVar;
        this.f163489h = fVar;
        this.f163486e = bVar;
        this.f163487f = cVar;
        bVar.g(this, "allowGeofence");
        bVar.g(this, "overrideGeofence");
        this.f163483b = new ArrayList<>();
    }

    @Override // ut.InterfaceC17319e
    public final void b() {
        c();
    }
}

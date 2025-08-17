package ob;

import Bb.e;
import Bb.k;
import Lb.g;
import cb.C6382c;
import cb.C6383d;

/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16010a implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final C6382c f153227d = C6383d.a("SIGHTINGS");

    /* renamed from: a, reason: collision with root package name */
    public boolean f153228a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f153229b;

    /* renamed from: c, reason: collision with root package name */
    public Bb.b f153230c;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (!"Sightings_Logs".equals(str) || obj == null) {
            return;
        }
        this.f153229b = ((Boolean) obj).booleanValue();
    }

    public C16010a(g gVar, e eVar, Bb.b bVar) {
        this.f153230c = bVar;
        this.f153228a = gVar.f17945b;
        this.f153229b = eVar.f();
        eVar.h(this, "Sightings_Logs");
    }
}

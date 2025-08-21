package qb;

import Db.e;
import Db.k;
import Nb.g;
import eb.C13786c;
import eb.C13787d;

/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16618a implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final C13786c f158079d = C13787d.a("SIGHTINGS");

    /* renamed from: a, reason: collision with root package name */
    public boolean f158080a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f158081b;

    /* renamed from: c, reason: collision with root package name */
    public Db.b f158082c;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (!"Sightings_Logs".equals(str) || obj == null) {
            return;
        }
        this.f158081b = ((Boolean) obj).booleanValue();
    }

    public C16618a(g gVar, e eVar, Db.b bVar) {
        this.f158082c = bVar;
        this.f158080a = gVar.f20765b;
        this.f158081b = eVar.f();
        eVar.h(this, "Sightings_Logs");
    }
}

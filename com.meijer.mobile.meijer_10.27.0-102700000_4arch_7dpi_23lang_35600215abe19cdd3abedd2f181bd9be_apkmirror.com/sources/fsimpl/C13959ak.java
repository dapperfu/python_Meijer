package fsimpl;

/* renamed from: fsimpl.ak, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13959ak {

    /* renamed from: a, reason: collision with root package name */
    private final C14013ck f131616a;

    /* renamed from: b, reason: collision with root package name */
    private final bU f131617b;

    /* renamed from: c, reason: collision with root package name */
    private final aO f131618c;

    /* renamed from: d, reason: collision with root package name */
    private final C13968at f131619d;

    /* renamed from: e, reason: collision with root package name */
    private final aZ f131620e;

    /* renamed from: f, reason: collision with root package name */
    private final dG f131621f;

    /* renamed from: g, reason: collision with root package name */
    private final bV f131622g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f131623h;

    public C13959ak(C14013ck c14013ck, bU bUVar, aO aOVar, C13968at c13968at, aZ aZVar, dG dGVar, bV bVVar, boolean z10) {
        this.f131616a = c14013ck;
        this.f131617b = bUVar;
        this.f131618c = aOVar;
        this.f131619d = c13968at;
        this.f131620e = aZVar;
        this.f131621f = dGVar;
        this.f131622g = bVVar;
        this.f131623h = z10;
    }

    public C13957ai a(InterfaceC13976ba interfaceC13976ba, C14060ee c14060ee, C13966ar c13966ar) {
        return new C13957ai(this.f131616a, c14060ee, this.f131617b.a().a("canvas", false), this.f131621f, interfaceC13976ba, this.f131618c, this.f131619d, this.f131620e, this.f131622g, this.f131623h, c13966ar == null || c13966ar.s());
    }

    public void a(C13957ai c13957ai) {
        this.f131617b.a().a(c13957ai.e());
    }
}

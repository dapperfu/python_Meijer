package fsimpl;

/* renamed from: fsimpl.ak, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14084ak {

    /* renamed from: a, reason: collision with root package name */
    private final C14138ck f132866a;

    /* renamed from: b, reason: collision with root package name */
    private final bU f132867b;

    /* renamed from: c, reason: collision with root package name */
    private final aO f132868c;

    /* renamed from: d, reason: collision with root package name */
    private final C14093at f132869d;

    /* renamed from: e, reason: collision with root package name */
    private final aZ f132870e;

    /* renamed from: f, reason: collision with root package name */
    private final dG f132871f;

    /* renamed from: g, reason: collision with root package name */
    private final bV f132872g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f132873h;

    public C14084ak(C14138ck c14138ck, bU bUVar, aO aOVar, C14093at c14093at, aZ aZVar, dG dGVar, bV bVVar, boolean z10) {
        this.f132866a = c14138ck;
        this.f132867b = bUVar;
        this.f132868c = aOVar;
        this.f132869d = c14093at;
        this.f132870e = aZVar;
        this.f132871f = dGVar;
        this.f132872g = bVVar;
        this.f132873h = z10;
    }

    public C14082ai a(InterfaceC14101ba interfaceC14101ba, C14185ee c14185ee, C14091ar c14091ar) {
        return new C14082ai(this.f132866a, c14185ee, this.f132867b.a().a("canvas", false), this.f132871f, interfaceC14101ba, this.f132868c, this.f132869d, this.f132870e, this.f132872g, this.f132873h, c14091ar == null || c14091ar.s());
    }

    public void a(C14082ai c14082ai) {
        this.f132867b.a().a(c14082ai.e());
    }
}

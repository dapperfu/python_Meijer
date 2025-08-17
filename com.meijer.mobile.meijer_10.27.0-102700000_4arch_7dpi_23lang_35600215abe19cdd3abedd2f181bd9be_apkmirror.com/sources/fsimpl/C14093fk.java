package fsimpl;

/* renamed from: fsimpl.fk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14093fk extends AbstractC14091fi {

    /* renamed from: a, reason: collision with root package name */
    private final String f132255a;

    /* renamed from: b, reason: collision with root package name */
    private final String f132256b;

    /* renamed from: c, reason: collision with root package name */
    private final long f132257c;

    /* renamed from: d, reason: collision with root package name */
    private final int f132258d;

    /* renamed from: e, reason: collision with root package name */
    private final long f132259e;

    /* renamed from: f, reason: collision with root package name */
    private final long f132260f;

    /* renamed from: g, reason: collision with root package name */
    private final int f132261g;

    public C14093fk(String str, String str2, long j10, int i10, long j11, long j12, int i11) {
        this.f132255a = str;
        this.f132256b = str2;
        this.f132257c = j10;
        this.f132258d = i10;
        this.f132259e = j11;
        this.f132260f = j12;
        this.f132261g = i11;
    }

    @Override // fsimpl.InterfaceC14090fh
    public void a(gh ghVar, fH fHVar) {
        int iA = ghVar.a(this.f132255a);
        int iA2 = ghVar.a(this.f132256b);
        cK.a(ghVar);
        cK.a(ghVar, iA);
        cK.b(ghVar, iA2);
        cK.a(ghVar, this.f132257c);
        cK.b(ghVar, this.f132258d);
        cK.c(ghVar, this.f132259e);
        cK.d(ghVar, this.f132260f);
        cK.c(ghVar, this.f132261g);
        fHVar.a(a(ghVar, (byte) 22, cK.b(ghVar)));
    }
}

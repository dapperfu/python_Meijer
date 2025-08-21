package fsimpl;

/* renamed from: fsimpl.fk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14218fk extends AbstractC14216fi {

    /* renamed from: a, reason: collision with root package name */
    private final String f133505a;

    /* renamed from: b, reason: collision with root package name */
    private final String f133506b;

    /* renamed from: c, reason: collision with root package name */
    private final long f133507c;

    /* renamed from: d, reason: collision with root package name */
    private final int f133508d;

    /* renamed from: e, reason: collision with root package name */
    private final long f133509e;

    /* renamed from: f, reason: collision with root package name */
    private final long f133510f;

    /* renamed from: g, reason: collision with root package name */
    private final int f133511g;

    public C14218fk(String str, String str2, long j10, int i10, long j11, long j12, int i11) {
        this.f133505a = str;
        this.f133506b = str2;
        this.f133507c = j10;
        this.f133508d = i10;
        this.f133509e = j11;
        this.f133510f = j12;
        this.f133511g = i11;
    }

    @Override // fsimpl.InterfaceC14215fh
    public void a(gh ghVar, fH fHVar) {
        int iA = ghVar.a(this.f133505a);
        int iA2 = ghVar.a(this.f133506b);
        cK.a(ghVar);
        cK.a(ghVar, iA);
        cK.b(ghVar, iA2);
        cK.a(ghVar, this.f133507c);
        cK.b(ghVar, this.f133508d);
        cK.c(ghVar, this.f133509e);
        cK.d(ghVar, this.f133510f);
        cK.c(ghVar, this.f133511g);
        fHVar.a(a(ghVar, (byte) 22, cK.b(ghVar)));
    }
}

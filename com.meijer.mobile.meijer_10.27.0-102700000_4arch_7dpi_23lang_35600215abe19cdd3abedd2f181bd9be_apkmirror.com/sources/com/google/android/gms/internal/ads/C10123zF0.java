package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.zF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10123zF0 implements InterfaceC8951oH0, OE0 {

    /* renamed from: b, reason: collision with root package name */
    private final Uri f80389b;

    /* renamed from: c, reason: collision with root package name */
    private final C9011ou0 f80390c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9374sF0 f80391d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9450t0 f80392e;

    /* renamed from: f, reason: collision with root package name */
    private final C8623lE f80393f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f80395h;

    /* renamed from: j, reason: collision with root package name */
    private long f80397j;

    /* renamed from: l, reason: collision with root package name */
    private X0 f80399l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f80400m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ EF0 f80401n;

    /* renamed from: g, reason: collision with root package name */
    private final N0 f80394g = new N0();

    /* renamed from: i, reason: collision with root package name */
    private boolean f80396i = true;

    /* renamed from: a, reason: collision with root package name */
    private final long f80388a = QE0.a();

    /* renamed from: k, reason: collision with root package name */
    private C8030fk0 f80398k = g(0);

    static /* bridge */ /* synthetic */ void f(C10123zF0 c10123zF0, long j10, long j11) {
        c10123zF0.f80394g.f68790a = j10;
        c10123zF0.f80397j = j11;
        c10123zF0.f80396i = true;
        c10123zF0.f80400m = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8951oH0
    public final void zzg() {
        this.f80395h = true;
    }

    public C10123zF0(EF0 ef0, Uri uri, InterfaceC9305rh0 interfaceC9305rh0, InterfaceC9374sF0 interfaceC9374sF0, InterfaceC9450t0 interfaceC9450t0, C8623lE c8623lE) {
        this.f80401n = ef0;
        this.f80389b = uri;
        this.f80390c = new C9011ou0(interfaceC9305rh0);
        this.f80391d = interfaceC9374sF0;
        this.f80392e = interfaceC9450t0;
        this.f80393f = c8623lE;
    }

    private final C8030fk0 g(long j10) {
        C7815dj0 c7815dj0 = new C7815dj0();
        c7815dj0.d(this.f80389b);
        c7815dj0.c(j10);
        c7815dj0.a(6);
        c7815dj0.b(EF0.f66374N);
        return c7815dj0.e();
    }

    @Override // com.google.android.gms.internal.ads.OE0
    public final void a(GQ gq2) {
        long jMax = !this.f80400m ? this.f80397j : Math.max(EF0.N(this.f80401n, true), this.f80397j);
        int iR = gq2.r();
        X0 x02 = this.f80399l;
        x02.getClass();
        x02.c(gq2, iR);
        x02.a(jMax, 1, iR, 0, null);
        this.f80400m = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:13|(2:15|16)|17|20|21|(5:23|119|24|25|(16:27|28|123|37|(1:39)(1:40)|41|(1:43)(1:44)|45|(1:47)(1:48)|49|(1:51)(1:52)|53|(4:55|113|56|(14:58|59|(1:65)|66|(1:71)(1:70)|72|(1:74)|75|(1:77)|78|(1:(3:121|80|(5:117|82|83|(3:130|85|134)(1:133)|132)(2:129|90))(1:131))|(3:93|(1:95)|96)|97|(2:127|135)(1:128))(6:115|60|61|(0)|66|(11:68|71|72|(0)|75|(0)|78|(2:(0)(0)|132)|(0)|97|(0)(0))(0)))(4:61|(0)|66|(0)(0))|(2:101|(1:103))|104|105)(3:29|111|30))(1:36)|31|123|37|(0)(0)|41|(0)(0)|45|(0)(0)|49|(0)(0)|53|(0)(0)|(0)|104|105) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[LOOP:0: B:3:0x0004->B:128:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6 A[EDGE_INSN: B:131:0x01e6->B:91:0x01e6 BREAK  A[LOOP:1: B:79:0x01a4->B:132:0x01a4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191 A[Catch: all -> 0x008c, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #7 {all -> 0x008c, blocks: (B:37:0x00a4, B:39:0x00af, B:41:0x00bb, B:43:0x00c5, B:45:0x00d1, B:47:0x00db, B:49:0x00e7, B:51:0x00f1, B:53:0x0103, B:55:0x010d, B:56:0x0113, B:65:0x0141, B:66:0x0148, B:68:0x0155, B:70:0x015d, B:72:0x017a, B:74:0x0191, B:75:0x0196, B:77:0x019a, B:60:0x011d, B:63:0x0133, B:30:0x0074, B:35:0x0092), top: B:123:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    @Override // com.google.android.gms.internal.ads.InterfaceC8951oH0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10123zF0.zzh():void");
    }
}

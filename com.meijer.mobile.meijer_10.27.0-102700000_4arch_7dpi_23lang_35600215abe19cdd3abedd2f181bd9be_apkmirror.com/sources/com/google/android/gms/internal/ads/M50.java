package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class M50 implements InterfaceC9715vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68518a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f68519b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9010ou f68520c;

    /* renamed from: d, reason: collision with root package name */
    private final B50 f68521d;

    /* renamed from: e, reason: collision with root package name */
    private final N40 f68522e;

    /* renamed from: f, reason: collision with root package name */
    private final C8715m60 f68523f;

    /* renamed from: g, reason: collision with root package name */
    private final Z80 f68524g;

    /* renamed from: h, reason: collision with root package name */
    private final C9356s60 f68525h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q f68526i;

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean zza() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CL j(L40 l40) {
        CL clP = this.f68520c.p();
        GB gb2 = new GB();
        gb2.f(this.f68518a);
        gb2.k(((J50) l40).f67770a);
        gb2.j(this.f68523f);
        clP.b(gb2.l());
        clP.a(new XE().q());
        return clP;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(Mc.Y1 r9, java.lang.String r10, com.google.android.gms.internal.ads.C9501tX r11, com.google.android.gms.internal.ads.InterfaceC9608uX r12) throws org.json.JSONException, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M50.a(Mc.Y1, java.lang.String, com.google.android.gms.internal.ads.tX, com.google.android.gms.internal.ads.uX):boolean");
    }

    final /* synthetic */ void h() {
        this.f68521d.g0(V60.d(6, null, null));
    }

    final void i(int i10) {
        this.f68525h.L().a(i10);
    }

    public M50(Context context, Executor executor, AbstractC9010ou abstractC9010ou, N40 n40, B50 b50, C9356s60 c9356s60, C8715m60 c8715m60) {
        this.f68518a = context;
        this.f68519b = executor;
        this.f68520c = abstractC9010ou;
        this.f68522e = n40;
        this.f68521d = b50;
        this.f68525h = c9356s60;
        this.f68523f = c8715m60;
        this.f68524g = abstractC9010ou.F();
    }
}

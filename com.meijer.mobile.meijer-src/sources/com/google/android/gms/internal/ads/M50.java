package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class M50 implements InterfaceC9840vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69358a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f69359b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9135ou f69360c;

    /* renamed from: d, reason: collision with root package name */
    private final B50 f69361d;

    /* renamed from: e, reason: collision with root package name */
    private final N40 f69362e;

    /* renamed from: f, reason: collision with root package name */
    private final C8840m60 f69363f;

    /* renamed from: g, reason: collision with root package name */
    private final Z80 f69364g;

    /* renamed from: h, reason: collision with root package name */
    private final C9481s60 f69365h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q f69366i;

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean zza() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CL j(L40 l40) {
        CL clP = this.f69360c.p();
        GB gb2 = new GB();
        gb2.f(this.f69358a);
        gb2.k(((J50) l40).f68610a);
        gb2.j(this.f69363f);
        clP.b(gb2.l());
        clP.a(new XE().q());
        return clP;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(Oc.Y1 r9, java.lang.String r10, com.google.android.gms.internal.ads.C9626tX r11, com.google.android.gms.internal.ads.InterfaceC9733uX r12) throws org.json.JSONException, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.M50.a(Oc.Y1, java.lang.String, com.google.android.gms.internal.ads.tX, com.google.android.gms.internal.ads.uX):boolean");
    }

    final /* synthetic */ void h() {
        this.f69361d.C(V60.d(6, null, null));
    }

    final void i(int i10) {
        this.f69365h.L().a(i10);
    }

    public M50(Context context, Executor executor, AbstractC9135ou abstractC9135ou, N40 n40, B50 b50, C9481s60 c9481s60, C8840m60 c8840m60) {
        this.f69358a = context;
        this.f69359b = executor;
        this.f69360c = abstractC9135ou;
        this.f69362e = n40;
        this.f69361d = b50;
        this.f69365h = c9481s60;
        this.f69363f = c8840m60;
        this.f69364g = abstractC9135ou.F();
    }
}

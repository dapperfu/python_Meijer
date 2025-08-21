package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.As, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6695As extends AbstractC9772us implements Pu0 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicInteger f66044o = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private String f66045d;

    /* renamed from: e, reason: collision with root package name */
    private final C6898Gr f66046e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66047f;

    /* renamed from: g, reason: collision with root package name */
    private final C10307zs f66048g;

    /* renamed from: h, reason: collision with root package name */
    private final C7956ds f66049h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f66050i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f66051j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f66052k;

    /* renamed from: l, reason: collision with root package name */
    private final String f66053l;

    /* renamed from: m, reason: collision with root package name */
    private final int f66054m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f66055n;

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void b() {
        this.f66047f = true;
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void c(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void l(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void p(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
    }

    public final String t() {
        return this.f66045d;
    }

    public final boolean v() {
        return this.f66055n;
    }

    public static int s() {
        return f66044o.get();
    }

    private final void x() {
        int iA = (int) this.f66048g.a();
        int iA2 = (int) this.f66049h.a(this.f66050i);
        int iPosition = this.f66050i.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        int iO = AbstractC10198yr.O();
        int iQ = AbstractC10198yr.Q();
        String str = this.f66045d;
        g(str, w(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        r23.f66055n = true;
        f(r24, r4, (int) r23.f66049h.a(r23.f66050i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d5). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6695As.n(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void q(InterfaceC9430rh0 interfaceC9430rh0, C8155fk0 c8155fk0, boolean z10) {
        if (interfaceC9430rh0 instanceof C8910mo0) {
            this.f66048g.b((C8910mo0) interfaceC9430rh0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us, com.google.android.gms.common.api.i
    public final void release() {
        f66044o.decrementAndGet();
    }

    public final ByteBuffer u() {
        synchronized (this.f66052k) {
            try {
                ByteBuffer byteBuffer = this.f66050i;
                if (byteBuffer != null && !this.f66051j) {
                    byteBuffer.flip();
                    this.f66051j = true;
                }
                this.f66047f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f66050i;
    }

    public C6695As(InterfaceC6932Hr interfaceC6932Hr, C6898Gr c6898Gr) {
        String strZzr;
        int iZzf;
        super(interfaceC6932Hr);
        this.f66046e = c6898Gr;
        this.f66048g = new C10307zs();
        this.f66049h = new C7956ds();
        this.f66052k = new Object();
        if (interfaceC6932Hr != null) {
            strZzr = interfaceC6932Hr.zzr();
        } else {
            strZzr = null;
        }
        this.f66053l = (String) AbstractC6714Bf0.d(strZzr).b("");
        if (interfaceC6932Hr != null) {
            iZzf = interfaceC6932Hr.zzf();
        } else {
            iZzf = 0;
        }
        this.f66054m = iZzf;
        f66044o.incrementAndGet();
    }

    protected static final String w(String str) {
        return "cache:".concat(String.valueOf(Sc.g.h(str)));
    }
}

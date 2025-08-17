package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.As, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6570As extends AbstractC9647us implements Pu0 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicInteger f65204o = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private String f65205d;

    /* renamed from: e, reason: collision with root package name */
    private final C6773Gr f65206e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f65207f;

    /* renamed from: g, reason: collision with root package name */
    private final C10182zs f65208g;

    /* renamed from: h, reason: collision with root package name */
    private final C7831ds f65209h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f65210i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f65211j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f65212k;

    /* renamed from: l, reason: collision with root package name */
    private final String f65213l;

    /* renamed from: m, reason: collision with root package name */
    private final int f65214m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f65215n;

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void b() {
        this.f65207f = true;
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void c(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void l(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void p(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
    }

    public final String t() {
        return this.f65205d;
    }

    public final boolean v() {
        return this.f65215n;
    }

    public static int s() {
        return f65204o.get();
    }

    private final void x() {
        int iA = (int) this.f65208g.a();
        int iA2 = (int) this.f65209h.a(this.f65210i);
        int iPosition = this.f65210i.position();
        int iRound = Math.round(iA2 * (iPosition / iA));
        int iO = AbstractC10073yr.O();
        int iQ = AbstractC10073yr.Q();
        String str = this.f65205d;
        g(str, w(str), iPosition, iA, iRound, iA2, iRound > 0, iO, iQ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
    
        r23.f65215n = true;
        f(r24, r4, (int) r23.f65209h.a(r23.f65210i));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ec, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d5). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6570As.n(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.Pu0
    public final void q(InterfaceC9305rh0 interfaceC9305rh0, C8030fk0 c8030fk0, boolean z10) {
        if (interfaceC9305rh0 instanceof C8785mo0) {
            this.f65208g.b((C8785mo0) interfaceC9305rh0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us, com.google.android.gms.common.api.i
    public final void release() {
        f65204o.decrementAndGet();
    }

    public final ByteBuffer u() {
        synchronized (this.f65212k) {
            try {
                ByteBuffer byteBuffer = this.f65210i;
                if (byteBuffer != null && !this.f65211j) {
                    byteBuffer.flip();
                    this.f65211j = true;
                }
                this.f65207f = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f65210i;
    }

    public C6570As(InterfaceC6807Hr interfaceC6807Hr, C6773Gr c6773Gr) {
        String strZzr;
        int iZzf;
        super(interfaceC6807Hr);
        this.f65206e = c6773Gr;
        this.f65208g = new C10182zs();
        this.f65209h = new C7831ds();
        this.f65212k = new Object();
        if (interfaceC6807Hr != null) {
            strZzr = interfaceC6807Hr.zzr();
        } else {
            strZzr = null;
        }
        this.f65213l = (String) AbstractC6589Bf0.d(strZzr).b("");
        if (interfaceC6807Hr != null) {
            iZzf = interfaceC6807Hr.zzf();
        } else {
            iZzf = 0;
        }
        this.f65214m = iZzf;
        f65204o.incrementAndGet();
    }

    protected static final String w(String str) {
        return "cache:".concat(String.valueOf(Qc.g.h(str)));
    }
}

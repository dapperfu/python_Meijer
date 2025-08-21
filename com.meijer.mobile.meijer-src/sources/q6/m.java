package q6;

import h6.C14478i;
import j6.InterfaceC14951c;
import p6.C16407b;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157994a;

    /* renamed from: b, reason: collision with root package name */
    private final C16407b f157995b;

    /* renamed from: c, reason: collision with root package name */
    private final C16407b f157996c;

    /* renamed from: d, reason: collision with root package name */
    private final p6.n f157997d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f157998e;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.p(oVar, abstractC16860b, this);
    }

    public C16407b b() {
        return this.f157995b;
    }

    public String c() {
        return this.f157994a;
    }

    public C16407b d() {
        return this.f157996c;
    }

    public p6.n e() {
        return this.f157997d;
    }

    public boolean f() {
        return this.f157998e;
    }

    public m(String str, C16407b c16407b, C16407b c16407b2, p6.n nVar, boolean z10) {
        this.f157994a = str;
        this.f157995b = c16407b;
        this.f157996c = c16407b2;
        this.f157997d = nVar;
        this.f157998e = z10;
    }
}

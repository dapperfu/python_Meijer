package p6;

import android.graphics.Path;
import g6.C14209i;
import i6.C14696g;
import i6.InterfaceC14692c;
import o6.C15997a;
import o6.C16000d;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f155600a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f155601b;

    /* renamed from: c, reason: collision with root package name */
    private final String f155602c;

    /* renamed from: d, reason: collision with root package name */
    private final C15997a f155603d;

    /* renamed from: e, reason: collision with root package name */
    private final C16000d f155604e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f155605f;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new C14696g(oVar, abstractC16472b, this);
    }

    public C15997a b() {
        return this.f155603d;
    }

    public Path.FillType c() {
        return this.f155601b;
    }

    public String d() {
        return this.f155602c;
    }

    public C16000d e() {
        return this.f155604e;
    }

    public boolean f() {
        return this.f155605f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f155600a + '}';
    }

    public p(String str, boolean z10, Path.FillType fillType, C15997a c15997a, C16000d c16000d, boolean z11) {
        this.f155602c = str;
        this.f155600a = z10;
        this.f155601b = fillType;
        this.f155603d = c15997a;
        this.f155604e = c16000d;
        this.f155605f = z11;
    }
}

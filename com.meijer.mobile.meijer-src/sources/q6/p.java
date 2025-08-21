package q6;

import android.graphics.Path;
import h6.C14478i;
import j6.C14955g;
import j6.InterfaceC14951c;
import p6.C16406a;
import p6.C16409d;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f158004a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f158005b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158006c;

    /* renamed from: d, reason: collision with root package name */
    private final C16406a f158007d;

    /* renamed from: e, reason: collision with root package name */
    private final C16409d f158008e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f158009f;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new C14955g(oVar, abstractC16860b, this);
    }

    public C16406a b() {
        return this.f158007d;
    }

    public Path.FillType c() {
        return this.f158005b;
    }

    public String d() {
        return this.f158006c;
    }

    public C16409d e() {
        return this.f158008e;
    }

    public boolean f() {
        return this.f158009f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f158004a + '}';
    }

    public p(String str, boolean z10, Path.FillType fillType, C16406a c16406a, C16409d c16409d, boolean z11) {
        this.f158006c = str;
        this.f158004a = z10;
        this.f158005b = fillType;
        this.f158007d = c16406a;
        this.f158008e = c16409d;
        this.f158009f = z11;
    }
}

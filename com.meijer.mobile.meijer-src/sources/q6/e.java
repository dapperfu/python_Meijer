package q6;

import android.graphics.Path;
import h6.C14478i;
import j6.C14956h;
import j6.InterfaceC14951c;
import p6.C16407b;
import p6.C16408c;
import p6.C16409d;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f157911a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f157912b;

    /* renamed from: c, reason: collision with root package name */
    private final C16408c f157913c;

    /* renamed from: d, reason: collision with root package name */
    private final C16409d f157914d;

    /* renamed from: e, reason: collision with root package name */
    private final p6.f f157915e;

    /* renamed from: f, reason: collision with root package name */
    private final p6.f f157916f;

    /* renamed from: g, reason: collision with root package name */
    private final String f157917g;

    /* renamed from: h, reason: collision with root package name */
    private final C16407b f157918h;

    /* renamed from: i, reason: collision with root package name */
    private final C16407b f157919i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f157920j;

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new C14956h(oVar, c14478i, abstractC16860b, this);
    }

    public p6.f b() {
        return this.f157916f;
    }

    public Path.FillType c() {
        return this.f157912b;
    }

    public C16408c d() {
        return this.f157913c;
    }

    public g e() {
        return this.f157911a;
    }

    public String f() {
        return this.f157917g;
    }

    public C16409d g() {
        return this.f157914d;
    }

    public p6.f h() {
        return this.f157915e;
    }

    public boolean i() {
        return this.f157920j;
    }

    public e(String str, g gVar, Path.FillType fillType, C16408c c16408c, C16409d c16409d, p6.f fVar, p6.f fVar2, C16407b c16407b, C16407b c16407b2, boolean z10) {
        this.f157911a = gVar;
        this.f157912b = fillType;
        this.f157913c = c16408c;
        this.f157914d = c16409d;
        this.f157915e = fVar;
        this.f157916f = fVar2;
        this.f157917g = str;
        this.f157918h = c16407b;
        this.f157919i = c16407b2;
        this.f157920j = z10;
    }
}

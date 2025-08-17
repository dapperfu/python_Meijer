package p6;

import android.graphics.Path;
import g6.C14209i;
import i6.C14697h;
import i6.InterfaceC14692c;
import o6.C15998b;
import o6.C15999c;
import o6.C16000d;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f155507a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f155508b;

    /* renamed from: c, reason: collision with root package name */
    private final C15999c f155509c;

    /* renamed from: d, reason: collision with root package name */
    private final C16000d f155510d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.f f155511e;

    /* renamed from: f, reason: collision with root package name */
    private final o6.f f155512f;

    /* renamed from: g, reason: collision with root package name */
    private final String f155513g;

    /* renamed from: h, reason: collision with root package name */
    private final C15998b f155514h;

    /* renamed from: i, reason: collision with root package name */
    private final C15998b f155515i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f155516j;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new C14697h(oVar, c14209i, abstractC16472b, this);
    }

    public o6.f b() {
        return this.f155512f;
    }

    public Path.FillType c() {
        return this.f155508b;
    }

    public C15999c d() {
        return this.f155509c;
    }

    public g e() {
        return this.f155507a;
    }

    public String f() {
        return this.f155513g;
    }

    public C16000d g() {
        return this.f155510d;
    }

    public o6.f h() {
        return this.f155511e;
    }

    public boolean i() {
        return this.f155516j;
    }

    public e(String str, g gVar, Path.FillType fillType, C15999c c15999c, C16000d c16000d, o6.f fVar, o6.f fVar2, C15998b c15998b, C15998b c15998b2, boolean z10) {
        this.f155507a = gVar;
        this.f155508b = fillType;
        this.f155509c = c15999c;
        this.f155510d = c16000d;
        this.f155511e = fVar;
        this.f155512f = fVar2;
        this.f155513g = str;
        this.f155514h = c15998b;
        this.f155515i = c15998b2;
        this.f155516j = z10;
    }
}

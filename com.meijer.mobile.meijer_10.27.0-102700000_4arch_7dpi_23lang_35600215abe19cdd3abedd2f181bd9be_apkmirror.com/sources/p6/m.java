package p6;

import g6.C14209i;
import i6.InterfaceC14692c;
import o6.C15998b;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155590a;

    /* renamed from: b, reason: collision with root package name */
    private final C15998b f155591b;

    /* renamed from: c, reason: collision with root package name */
    private final C15998b f155592c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.n f155593d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f155594e;

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.p(oVar, abstractC16472b, this);
    }

    public C15998b b() {
        return this.f155591b;
    }

    public String c() {
        return this.f155590a;
    }

    public C15998b d() {
        return this.f155592c;
    }

    public o6.n e() {
        return this.f155593d;
    }

    public boolean f() {
        return this.f155594e;
    }

    public m(String str, C15998b c15998b, C15998b c15998b2, o6.n nVar, boolean z10) {
        this.f155590a = str;
        this.f155591b = c15998b;
        this.f155592c = c15998b2;
        this.f155593d = nVar;
        this.f155594e = z10;
    }
}

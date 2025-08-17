package mh;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.c0;
import ih.C14724c;
import jh.InterfaceC14896e;
import lh.C15409a;

/* renamed from: mh.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15622c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14896e f150087a;

    /* renamed from: b, reason: collision with root package name */
    private final C14724c f150088b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f150089c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15625f f150090d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f150091e;

    /* renamed from: f, reason: collision with root package name */
    private final String f150092f;

    /* renamed from: g, reason: collision with root package name */
    private final LDContext f150093g;

    /* renamed from: h, reason: collision with root package name */
    private final C15629j f150094h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f150095i;

    /* renamed from: j, reason: collision with root package name */
    private final String f150096j;

    /* renamed from: k, reason: collision with root package name */
    private final Boolean f150097k;

    /* renamed from: l, reason: collision with root package name */
    private final C15409a f150098l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f150099m;

    public C15622c(String str, InterfaceC14896e interfaceC14896e, C14724c c14724c, c0 c0Var, InterfaceC15625f interfaceC15625f, String str2, boolean z10, LDContext lDContext, C15629j c15629j, boolean z11, Boolean bool, C15409a c15409a, boolean z12) {
        this.f150096j = str;
        this.f150087a = interfaceC14896e;
        this.f150088b = c14724c;
        this.f150089c = c0Var;
        this.f150090d = interfaceC15625f;
        this.f150092f = str2;
        this.f150091e = z10;
        this.f150093g = lDContext;
        this.f150094h = c15629j;
        this.f150095i = z11;
        this.f150097k = bool;
        this.f150098l = c15409a;
        this.f150099m = z12;
    }

    public C14724c a() {
        return this.f150088b;
    }

    public c0 b() {
        return this.f150089c;
    }

    public InterfaceC15625f c() {
        return this.f150090d;
    }

    public String d() {
        return this.f150092f;
    }

    public InterfaceC14896e e() {
        return this.f150087a;
    }

    public LDContext f() {
        return this.f150093g;
    }

    public C15629j g() {
        return this.f150094h;
    }

    public String h() {
        return this.f150096j;
    }

    public C15409a i() {
        return this.f150098l;
    }

    public boolean j() {
        return this.f150091e;
    }

    public boolean k() {
        return this.f150095i;
    }

    public boolean l() {
        return this.f150099m;
    }

    protected C15622c m(LDContext lDContext) {
        return new C15622c(this.f150096j, this.f150087a, this.f150088b, this.f150089c, this.f150090d, this.f150092f, this.f150091e, lDContext, this.f150094h, this.f150095i, this.f150097k, this.f150098l, this.f150099m);
    }

    protected C15622c(C15622c c15622c) {
        this(c15622c.f150096j, c15622c.f150087a, c15622c.f150088b, c15622c.f150089c, c15622c.f150090d, c15622c.f150092f, c15622c.f150091e, c15622c.f150093g, c15622c.f150094h, c15622c.f150095i, c15622c.f150097k, c15622c.f150098l, c15622c.f150099m);
    }
}

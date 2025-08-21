package nh;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.c0;
import jh.C15034c;
import kh.InterfaceC15130e;
import mh.C15718a;

/* renamed from: nh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C15945c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15130e f152445a;

    /* renamed from: b, reason: collision with root package name */
    private final C15034c f152446b;

    /* renamed from: c, reason: collision with root package name */
    private final c0 f152447c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15948f f152448d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f152449e;

    /* renamed from: f, reason: collision with root package name */
    private final String f152450f;

    /* renamed from: g, reason: collision with root package name */
    private final LDContext f152451g;

    /* renamed from: h, reason: collision with root package name */
    private final C15952j f152452h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f152453i;

    /* renamed from: j, reason: collision with root package name */
    private final String f152454j;

    /* renamed from: k, reason: collision with root package name */
    private final Boolean f152455k;

    /* renamed from: l, reason: collision with root package name */
    private final C15718a f152456l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f152457m;

    public C15945c(String str, InterfaceC15130e interfaceC15130e, C15034c c15034c, c0 c0Var, InterfaceC15948f interfaceC15948f, String str2, boolean z10, LDContext lDContext, C15952j c15952j, boolean z11, Boolean bool, C15718a c15718a, boolean z12) {
        this.f152454j = str;
        this.f152445a = interfaceC15130e;
        this.f152446b = c15034c;
        this.f152447c = c0Var;
        this.f152448d = interfaceC15948f;
        this.f152450f = str2;
        this.f152449e = z10;
        this.f152451g = lDContext;
        this.f152452h = c15952j;
        this.f152453i = z11;
        this.f152455k = bool;
        this.f152456l = c15718a;
        this.f152457m = z12;
    }

    public C15034c a() {
        return this.f152446b;
    }

    public c0 b() {
        return this.f152447c;
    }

    public InterfaceC15948f c() {
        return this.f152448d;
    }

    public String d() {
        return this.f152450f;
    }

    public InterfaceC15130e e() {
        return this.f152445a;
    }

    public LDContext f() {
        return this.f152451g;
    }

    public C15952j g() {
        return this.f152452h;
    }

    public String h() {
        return this.f152454j;
    }

    public C15718a i() {
        return this.f152456l;
    }

    public boolean j() {
        return this.f152449e;
    }

    public boolean k() {
        return this.f152453i;
    }

    public boolean l() {
        return this.f152457m;
    }

    protected C15945c m(LDContext lDContext) {
        return new C15945c(this.f152454j, this.f152445a, this.f152446b, this.f152447c, this.f152448d, this.f152450f, this.f152449e, lDContext, this.f152452h, this.f152453i, this.f152455k, this.f152456l, this.f152457m);
    }

    protected C15945c(C15945c c15945c) {
        this(c15945c.f152454j, c15945c.f152445a, c15945c.f152446b, c15945c.f152447c, c15945c.f152448d, c15945c.f152450f, c15945c.f152449e, c15945c.f152451g, c15945c.f152452h, c15945c.f152453i, c15945c.f152455k, c15945c.f152456l, c15945c.f152457m);
    }
}

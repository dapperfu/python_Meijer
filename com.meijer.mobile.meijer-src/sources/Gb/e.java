package Gb;

import Qb.j;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private a f11286a;

    /* renamed from: b, reason: collision with root package name */
    private Long f11287b;

    /* renamed from: c, reason: collision with root package name */
    private Long f11288c;

    /* renamed from: d, reason: collision with root package name */
    private Long f11289d;

    /* renamed from: e, reason: collision with root package name */
    private String f11290e;

    /* renamed from: f, reason: collision with root package name */
    private String f11291f;

    /* renamed from: g, reason: collision with root package name */
    private String f11292g;

    /* renamed from: h, reason: collision with root package name */
    private String f11293h;

    /* renamed from: i, reason: collision with root package name */
    private String f11294i;

    /* renamed from: j, reason: collision with root package name */
    private Long f11295j;

    public enum a {
        None,
        AwaitingUpdate,
        AwaitingRegistration,
        Registered,
        AwaitingReset
    }

    public Long a() {
        return this.f11288c;
    }

    public String b() {
        return this.f11293h;
    }

    public String c() {
        return this.f11294i;
    }

    public Long d() {
        return this.f11289d;
    }

    public String e() {
        return this.f11292g;
    }

    public a f() {
        return this.f11286a;
    }

    public Long g() {
        return this.f11295j;
    }

    public Long h() {
        return this.f11287b;
    }

    public String i() {
        return this.f11290e;
    }

    public String j() {
        return this.f11291f;
    }

    public boolean k() {
        return a.Registered == f();
    }

    public void l(Long l10) {
        this.f11288c = l10;
    }

    public void m(String str) {
        this.f11294i = str;
    }

    public void n(Long l10) {
        this.f11289d = l10;
    }

    public void o(String str) {
        this.f11292g = str;
    }

    public void p(a aVar) {
        this.f11286a = aVar;
    }

    public void q(Long l10) {
        this.f11295j = l10;
    }

    public void r(Long l10) {
        this.f11287b = l10;
    }

    public void s(String str) {
        this.f11290e = str;
    }

    public void t(String str) {
        this.f11291f = str;
    }

    public e u(j jVar) {
        this.f11287b = jVar.g();
        this.f11288c = jVar.b();
        this.f11289d = jVar.d();
        this.f11292g = jVar.f();
        if (jVar.h() != null) {
            this.f11290e = jVar.h();
        }
        if (jVar.e() != null) {
            this.f11291f = jVar.e();
        }
        if (jVar.c() != null) {
            this.f11294i = jVar.c();
            return this;
        }
        this.f11294i = jVar.f();
        return this;
    }
}

package Eb;

import Ob.j;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private a f7734a;

    /* renamed from: b, reason: collision with root package name */
    private Long f7735b;

    /* renamed from: c, reason: collision with root package name */
    private Long f7736c;

    /* renamed from: d, reason: collision with root package name */
    private Long f7737d;

    /* renamed from: e, reason: collision with root package name */
    private String f7738e;

    /* renamed from: f, reason: collision with root package name */
    private String f7739f;

    /* renamed from: g, reason: collision with root package name */
    private String f7740g;

    /* renamed from: h, reason: collision with root package name */
    private String f7741h;

    /* renamed from: i, reason: collision with root package name */
    private String f7742i;

    /* renamed from: j, reason: collision with root package name */
    private Long f7743j;

    public enum a {
        None,
        AwaitingUpdate,
        AwaitingRegistration,
        Registered,
        AwaitingReset
    }

    public Long a() {
        return this.f7736c;
    }

    public String b() {
        return this.f7741h;
    }

    public String c() {
        return this.f7742i;
    }

    public Long d() {
        return this.f7737d;
    }

    public String e() {
        return this.f7740g;
    }

    public a f() {
        return this.f7734a;
    }

    public Long g() {
        return this.f7743j;
    }

    public Long h() {
        return this.f7735b;
    }

    public String i() {
        return this.f7738e;
    }

    public String j() {
        return this.f7739f;
    }

    public boolean k() {
        return a.Registered == f();
    }

    public void l(Long l10) {
        this.f7736c = l10;
    }

    public void m(String str) {
        this.f7742i = str;
    }

    public void n(Long l10) {
        this.f7737d = l10;
    }

    public void o(String str) {
        this.f7740g = str;
    }

    public void p(a aVar) {
        this.f7734a = aVar;
    }

    public void q(Long l10) {
        this.f7743j = l10;
    }

    public void r(Long l10) {
        this.f7735b = l10;
    }

    public void s(String str) {
        this.f7738e = str;
    }

    public void t(String str) {
        this.f7739f = str;
    }

    public e u(j jVar) {
        this.f7735b = jVar.g();
        this.f7736c = jVar.b();
        this.f7737d = jVar.d();
        this.f7740g = jVar.f();
        if (jVar.h() != null) {
            this.f7738e = jVar.h();
        }
        if (jVar.e() != null) {
            this.f7739f = jVar.e();
        }
        if (jVar.c() != null) {
            this.f7742i = jVar.c();
            return this;
        }
        this.f7742i = jVar.f();
        return this;
    }
}

package Sc;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private String f33540a;

    /* renamed from: b, reason: collision with root package name */
    private List f33541b;

    /* renamed from: c, reason: collision with root package name */
    private String f33542c;

    /* renamed from: d, reason: collision with root package name */
    private Hc.c f33543d;

    /* renamed from: e, reason: collision with root package name */
    private String f33544e;

    /* renamed from: f, reason: collision with root package name */
    private String f33545f;

    /* renamed from: g, reason: collision with root package name */
    private Double f33546g;

    /* renamed from: h, reason: collision with root package name */
    private String f33547h;

    /* renamed from: i, reason: collision with root package name */
    private String f33548i;

    /* renamed from: j, reason: collision with root package name */
    private Ec.r f33549j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33550k;

    /* renamed from: l, reason: collision with root package name */
    private View f33551l;

    /* renamed from: m, reason: collision with root package name */
    private View f33552m;

    /* renamed from: n, reason: collision with root package name */
    private Object f33553n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f33554o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    private boolean f33555p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f33556q;

    /* renamed from: r, reason: collision with root package name */
    private float f33557r;

    public abstract void E(View view, Map<String, View> map, Map<String, View> map2);

    public void F(View view) {
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    public void q(View view) {
    }

    public void s() {
    }

    public final void A(boolean z10) {
        this.f33555p = z10;
    }

    public final void B(String str) {
        this.f33548i = str;
    }

    public final void C(Double d10) {
        this.f33546g = d10;
    }

    public final void D(String str) {
        this.f33547h = str;
    }

    public final View G() {
        return this.f33552m;
    }

    public final Ec.r H() {
        return this.f33549j;
    }

    public final Object I() {
        return this.f33553n;
    }

    public final void J(Object obj) {
        this.f33553n = obj;
    }

    public final void K(Ec.r rVar) {
        this.f33549j = rVar;
    }

    public View a() {
        return this.f33551l;
    }

    public final String b() {
        return this.f33545f;
    }

    public final String c() {
        return this.f33542c;
    }

    public final String d() {
        return this.f33544e;
    }

    public final Bundle g() {
        return this.f33554o;
    }

    public final String h() {
        return this.f33540a;
    }

    public final Hc.c i() {
        return this.f33543d;
    }

    public final List<Hc.c> j() {
        return this.f33541b;
    }

    public float k() {
        return this.f33557r;
    }

    public final boolean l() {
        return this.f33556q;
    }

    public final boolean m() {
        return this.f33555p;
    }

    public final String n() {
        return this.f33548i;
    }

    public final Double o() {
        return this.f33546g;
    }

    public final String p() {
        return this.f33547h;
    }

    public boolean r() {
        return this.f33550k;
    }

    public final void t(String str) {
        this.f33545f = str;
    }

    public final void u(String str) {
        this.f33542c = str;
    }

    public final void v(String str) {
        this.f33544e = str;
    }

    public final void w(String str) {
        this.f33540a = str;
    }

    public final void x(Hc.c cVar) {
        this.f33543d = cVar;
    }

    public final void y(List<Hc.c> list) {
        this.f33541b = list;
    }

    public final void z(boolean z10) {
        this.f33556q = z10;
    }
}

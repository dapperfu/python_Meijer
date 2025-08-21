package lh;

import com.launchdarkly.sdk.android.V;
import com.launchdarkly.sdk.android.i0;
import jh.C15034c;
import nh.C15943a;
import o2.InterfaceC16068a;

/* renamed from: lh.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15495e {

    /* renamed from: a, reason: collision with root package name */
    private String f149609a;

    /* renamed from: b, reason: collision with root package name */
    private String f149610b;

    /* renamed from: c, reason: collision with root package name */
    private String f149611c;

    /* renamed from: d, reason: collision with root package name */
    private String f149612d;

    /* renamed from: e, reason: collision with root package name */
    C15034c f149613e = C15034c.r(V.a(), C15495e.class.getSimpleName());

    private void j(String str, InterfaceC16068a<String> interfaceC16068a, String str2, C15034c c15034c) {
        if (str2 == null) {
            interfaceC16068a.accept(str2);
            return;
        }
        String strG = i0.g(str2);
        String strL = i0.l(strG);
        if (strL != null) {
            c15034c.q("Issue setting {} value '{}'. {}", str, strG, strL);
        } else {
            interfaceC16068a.accept(strG);
        }
    }

    public C15495e e(String str) {
        j("applicationId", new InterfaceC16068a() { // from class: lh.d
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                this.f149608a.f149609a = (String) obj;
            }
        }, str, this.f149613e);
        return this;
    }

    public C15495e f(String str) {
        j("applicationName", new InterfaceC16068a() { // from class: lh.b
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                this.f149606a.f149610b = (String) obj;
            }
        }, str, this.f149613e);
        return this;
    }

    public C15495e g(String str) {
        j("applicationVersion", new InterfaceC16068a() { // from class: lh.c
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                this.f149607a.f149611c = (String) obj;
            }
        }, str, this.f149613e);
        return this;
    }

    public C15495e h(String str) {
        j("applicationVersionName", new InterfaceC16068a() { // from class: lh.a
            @Override // o2.InterfaceC16068a
            public final void accept(Object obj) {
                this.f149605a.f149612d = (String) obj;
            }
        }, str, this.f149613e);
        return this;
    }

    public C15943a i() {
        return new C15943a(this.f149609a, this.f149611c, this.f149610b, this.f149612d);
    }
}

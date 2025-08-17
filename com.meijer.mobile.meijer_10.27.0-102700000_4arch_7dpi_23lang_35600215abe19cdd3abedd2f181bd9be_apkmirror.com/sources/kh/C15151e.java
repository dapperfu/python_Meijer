package kh;

import com.launchdarkly.sdk.android.V;
import com.launchdarkly.sdk.android.i0;
import ih.C14724c;
import mh.C15620a;
import o2.InterfaceC15993a;

/* renamed from: kh.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C15151e {

    /* renamed from: a, reason: collision with root package name */
    private String f141926a;

    /* renamed from: b, reason: collision with root package name */
    private String f141927b;

    /* renamed from: c, reason: collision with root package name */
    private String f141928c;

    /* renamed from: d, reason: collision with root package name */
    private String f141929d;

    /* renamed from: e, reason: collision with root package name */
    C14724c f141930e = C14724c.r(V.a(), C15151e.class.getSimpleName());

    private void j(String str, InterfaceC15993a<String> interfaceC15993a, String str2, C14724c c14724c) {
        if (str2 == null) {
            interfaceC15993a.accept(str2);
            return;
        }
        String strG = i0.g(str2);
        String strL = i0.l(strG);
        if (strL != null) {
            c14724c.q("Issue setting {} value '{}'. {}", str, strG, strL);
        } else {
            interfaceC15993a.accept(strG);
        }
    }

    public C15151e e(String str) {
        j("applicationId", new InterfaceC15993a() { // from class: kh.d
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f141925a.f141926a = (String) obj;
            }
        }, str, this.f141930e);
        return this;
    }

    public C15151e f(String str) {
        j("applicationName", new InterfaceC15993a() { // from class: kh.b
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f141923a.f141927b = (String) obj;
            }
        }, str, this.f141930e);
        return this;
    }

    public C15151e g(String str) {
        j("applicationVersion", new InterfaceC15993a() { // from class: kh.c
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f141924a.f141928c = (String) obj;
            }
        }, str, this.f141930e);
        return this;
    }

    public C15151e h(String str) {
        j("applicationVersionName", new InterfaceC15993a() { // from class: kh.a
            @Override // o2.InterfaceC15993a
            public final void accept(Object obj) {
                this.f141922a.f141929d = (String) obj;
            }
        }, str, this.f141930e);
        return this;
    }

    public C15620a i() {
        return new C15620a(this.f141926a, this.f141928c, this.f141927b, this.f141929d);
    }
}

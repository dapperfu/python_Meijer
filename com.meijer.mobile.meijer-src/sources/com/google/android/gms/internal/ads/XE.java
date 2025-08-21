package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class XE {

    /* renamed from: a, reason: collision with root package name */
    private final Set f72124a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f72125b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set f72126c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set f72127d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set f72128e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set f72129f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set f72130g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set f72131h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set f72132i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set f72133j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set f72134k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set f72135l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f72136m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Set f72137n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private K40 f72138o;

    public final XE p(K40 k40) {
        this.f72138o = k40;
        return this;
    }

    public final ZE q() {
        return new ZE(this, null);
    }

    public final XE d(InterfaceC4376a interfaceC4376a, Executor executor) {
        this.f72126c.add(new ZF(interfaceC4376a, executor));
        return this;
    }

    public final XE e(InterfaceC7784cC interfaceC7784cC, Executor executor) {
        this.f72132i.add(new ZF(interfaceC7784cC, executor));
        return this;
    }

    public final XE f(InterfaceC9279qC interfaceC9279qC, Executor executor) {
        this.f72135l.add(new ZF(interfaceC9279qC, executor));
        return this;
    }

    public final XE g(InterfaceC9706uC interfaceC9706uC, Executor executor) {
        this.f72129f.add(new ZF(interfaceC9706uC, executor));
        return this;
    }

    public final XE h(ZB zb2, Executor executor) {
        this.f72128e.add(new ZF(zb2, executor));
        return this;
    }

    public final XE i(PC pc2, Executor executor) {
        this.f72131h.add(new ZF(pc2, executor));
        return this;
    }

    public final XE j(InterfaceC7573aD interfaceC7573aD, Executor executor) {
        this.f72130g.add(new ZF(interfaceC7573aD, executor));
        return this;
    }

    public final XE k(Qc.p pVar, Executor executor) {
        this.f72137n.add(new ZF(pVar, executor));
        return this;
    }

    public final XE l(InterfaceC8960nD interfaceC8960nD, Executor executor) {
        this.f72136m.add(new ZF(interfaceC8960nD, executor));
        return this;
    }

    public final XE m(InterfaceC10243zD interfaceC10243zD, Executor executor) {
        this.f72125b.add(new ZF(interfaceC10243zD, executor));
        return this;
    }

    public final XE n(Hc.c cVar, Executor executor) {
        this.f72134k.add(new ZF(cVar, executor));
        return this;
    }

    public final XE o(InterfaceC8326hG interfaceC8326hG, Executor executor) {
        this.f72127d.add(new ZF(interfaceC8326hG, executor));
        return this;
    }
}

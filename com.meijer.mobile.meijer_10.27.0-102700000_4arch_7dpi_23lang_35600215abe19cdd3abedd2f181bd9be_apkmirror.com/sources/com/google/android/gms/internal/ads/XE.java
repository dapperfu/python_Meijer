package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class XE {

    /* renamed from: a, reason: collision with root package name */
    private final Set f71284a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Set f71285b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final Set f71286c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Set f71287d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Set f71288e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Set f71289f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Set f71290g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    private final Set f71291h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Set f71292i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private final Set f71293j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Set f71294k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    private final Set f71295l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final Set f71296m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private final Set f71297n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private K40 f71298o;

    public final XE p(K40 k40) {
        this.f71298o = k40;
        return this;
    }

    public final ZE q() {
        return new ZE(this, null);
    }

    public final XE d(InterfaceC4098a interfaceC4098a, Executor executor) {
        this.f71286c.add(new ZF(interfaceC4098a, executor));
        return this;
    }

    public final XE e(InterfaceC7659cC interfaceC7659cC, Executor executor) {
        this.f71292i.add(new ZF(interfaceC7659cC, executor));
        return this;
    }

    public final XE f(InterfaceC9154qC interfaceC9154qC, Executor executor) {
        this.f71295l.add(new ZF(interfaceC9154qC, executor));
        return this;
    }

    public final XE g(InterfaceC9581uC interfaceC9581uC, Executor executor) {
        this.f71289f.add(new ZF(interfaceC9581uC, executor));
        return this;
    }

    public final XE h(ZB zb2, Executor executor) {
        this.f71288e.add(new ZF(zb2, executor));
        return this;
    }

    public final XE i(PC pc2, Executor executor) {
        this.f71291h.add(new ZF(pc2, executor));
        return this;
    }

    public final XE j(InterfaceC7448aD interfaceC7448aD, Executor executor) {
        this.f71290g.add(new ZF(interfaceC7448aD, executor));
        return this;
    }

    public final XE k(Oc.p pVar, Executor executor) {
        this.f71297n.add(new ZF(pVar, executor));
        return this;
    }

    public final XE l(InterfaceC8835nD interfaceC8835nD, Executor executor) {
        this.f71296m.add(new ZF(interfaceC8835nD, executor));
        return this;
    }

    public final XE m(InterfaceC10118zD interfaceC10118zD, Executor executor) {
        this.f71285b.add(new ZF(interfaceC10118zD, executor));
        return this;
    }

    public final XE n(Fc.c cVar, Executor executor) {
        this.f71294k.add(new ZF(cVar, executor));
        return this;
    }

    public final XE o(InterfaceC8201hG interfaceC8201hG, Executor executor) {
        this.f71287d.add(new ZF(interfaceC8201hG, executor));
        return this;
    }
}

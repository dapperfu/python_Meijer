package com.google.mlkit.common.internal;

import Cd.AbstractC2988f;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import qg.C16525a;
import rg.C16786a;
import rg.C16788c;
import sg.C16956a;
import sg.C16957b;
import sg.C16959d;
import sg.C16964i;
import sg.C16965j;
import sg.C16969n;
import tg.C17097b;

/* loaded from: classes7.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC2988f.n(C16969n.f160504b, C6245c.e(C17097b.class).b(q.l(C16964i.class)).f(new g() { // from class: pg.a
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C17097b((C16964i) interfaceC6246d.a(C16964i.class));
            }
        }).d(), C6245c.e(C16965j.class).f(new g() { // from class: pg.b
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16965j();
            }
        }).d(), C6245c.e(C16788c.class).b(q.o(C16788c.a.class)).f(new g() { // from class: pg.c
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16788c(interfaceC6246d.d(C16788c.a.class));
            }
        }).d(), C6245c.e(C16959d.class).b(q.n(C16965j.class)).f(new g() { // from class: pg.d
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16959d(interfaceC6246d.f(C16965j.class));
            }
        }).d(), C6245c.e(C16956a.class).f(new g() { // from class: pg.e
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return C16956a.a();
            }
        }).d(), C6245c.e(C16957b.class).b(q.l(C16956a.class)).f(new g() { // from class: pg.f
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16957b((C16956a) interfaceC6246d.a(C16956a.class));
            }
        }).d(), C6245c.e(C16525a.class).b(q.l(C16964i.class)).f(new g() { // from class: pg.g
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16525a((C16964i) interfaceC6246d.a(C16964i.class));
            }
        }).d(), C6245c.m(C16788c.a.class).b(q.n(C16525a.class)).f(new g() { // from class: pg.h
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C16788c.a(C16786a.class, interfaceC6246d.f(C16525a.class));
            }
        }).d());
    }
}

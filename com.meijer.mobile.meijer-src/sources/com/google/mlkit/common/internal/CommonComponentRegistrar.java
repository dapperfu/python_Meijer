package com.google.mlkit.common.internal;

import Ed.AbstractC3191f;
import com.google.firebase.components.ComponentRegistrar;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import java.util.List;
import sg.C17073a;
import tg.C17260a;
import tg.C17262c;
import ug.C17403a;
import ug.C17404b;
import ug.C17406d;
import ug.C17411i;
import ug.C17412j;
import ug.C17416n;
import vg.C17672b;

/* loaded from: classes8.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC3191f.n(C17416n.f163990b, C13676c.e(C17672b.class).b(q.l(C17411i.class)).f(new g() { // from class: rg.a
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17672b((C17411i) interfaceC13677d.a(C17411i.class));
            }
        }).d(), C13676c.e(C17412j.class).f(new g() { // from class: rg.b
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17412j();
            }
        }).d(), C13676c.e(C17262c.class).b(q.o(C17262c.a.class)).f(new g() { // from class: rg.c
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17262c(interfaceC13677d.b(C17262c.a.class));
            }
        }).d(), C13676c.e(C17406d.class).b(q.n(C17412j.class)).f(new g() { // from class: rg.d
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17406d(interfaceC13677d.g(C17412j.class));
            }
        }).d(), C13676c.e(C17403a.class).f(new g() { // from class: rg.e
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return C17403a.a();
            }
        }).d(), C13676c.e(C17404b.class).b(q.l(C17403a.class)).f(new g() { // from class: rg.f
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17404b((C17403a) interfaceC13677d.a(C17403a.class));
            }
        }).d(), C13676c.e(C17073a.class).b(q.l(C17411i.class)).f(new g() { // from class: rg.g
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17073a((C17411i) interfaceC13677d.a(C17411i.class));
            }
        }).d(), C13676c.m(C17262c.a.class).b(q.n(C17073a.class)).f(new g() { // from class: rg.h
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C17262c.a(C17260a.class, interfaceC13677d.g(C17073a.class));
            }
        }).d());
    }
}

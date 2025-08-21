package com.google.mlkit.vision.barcode.internal;

import Fd.AbstractC3400j0;
import com.google.firebase.components.ComponentRegistrar;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import java.util.List;
import ug.C17406d;
import ug.C17411i;
import zg.C18487f;
import zg.h;

/* loaded from: classes8.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC3400j0.n(C13676c.e(h.class).b(q.l(C17411i.class)).f(new g() { // from class: zg.c
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new h((C17411i) interfaceC13677d.a(C17411i.class));
            }
        }).d(), C13676c.e(C18487f.class).b(q.l(h.class)).b(q.l(C17406d.class)).b(q.l(C17411i.class)).f(new g() { // from class: zg.d
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new C18487f((h) interfaceC13677d.a(h.class), (C17406d) interfaceC13677d.a(C17406d.class), (C17411i) interfaceC13677d.a(C17411i.class));
            }
        }).d());
    }
}

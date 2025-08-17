package com.google.mlkit.vision.barcode.internal;

import Dd.AbstractC3178j0;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import sg.C16959d;
import sg.C16964i;
import xg.C18050f;
import xg.h;

/* loaded from: classes7.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC3178j0.n(C6245c.e(h.class).b(q.l(C16964i.class)).f(new g() { // from class: xg.c
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new h((C16964i) interfaceC6246d.a(C16964i.class));
            }
        }).d(), C6245c.e(C18050f.class).b(q.l(h.class)).b(q.l(C16959d.class)).b(q.l(C16964i.class)).f(new g() { // from class: xg.d
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new C18050f((h) interfaceC6246d.a(h.class), (C16959d) interfaceC6246d.a(C16959d.class), (C16964i) interfaceC6246d.a(C16964i.class));
            }
        }).d());
    }
}

package com.google.mlkit.vision.common.internal;

import Ed.N5;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import java.util.List;

/* loaded from: classes7.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return N5.n(C6245c.e(a.class).b(q.o(a.C1295a.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return new a(interfaceC6246d.d(a.C1295a.class));
            }
        }).d());
    }
}

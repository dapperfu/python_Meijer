package com.google.mlkit.vision.common.internal;

import Gd.N5;
import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import java.util.List;

/* loaded from: classes8.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return N5.n(C13676c.e(a.class).b(q.o(a.C1304a.class)).f(new g() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return new a(interfaceC13677d.b(a.C1304a.class));
            }
        }).d());
    }
}

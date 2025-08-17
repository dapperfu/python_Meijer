package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import cg.h;
import com.google.firebase.abt.BuildConfig;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes7.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(InterfaceC6246d interfaceC6246d) {
        return new a((Context) interfaceC6246d.a(Context.class), interfaceC6246d.f(Ze.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(Ze.a.class)).f(new g() { // from class: Ye.a
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return AbtRegistrar.a(interfaceC6246d);
            }
        }).d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}

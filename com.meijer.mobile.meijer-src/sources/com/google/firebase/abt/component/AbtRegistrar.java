package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import bf.InterfaceC6375a;
import com.google.firebase.abt.BuildConfig;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import eg.h;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes8.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(InterfaceC13677d interfaceC13677d) {
        return new a((Context) interfaceC13677d.a(Context.class), interfaceC13677d.g(InterfaceC6375a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.e(a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.j(InterfaceC6375a.class)).f(new g() { // from class: af.a
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return AbtRegistrar.a(interfaceC13677d);
            }
        }).d(), h.b(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}

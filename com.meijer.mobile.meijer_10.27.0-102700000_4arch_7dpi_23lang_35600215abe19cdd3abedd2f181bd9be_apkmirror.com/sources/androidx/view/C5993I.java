package androidx.view;

import androidx.view.AbstractC6023l;
import androidx.view.C6013d;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: androidx.lifecycle.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5993I implements InterfaceC6027p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55164a;

    /* renamed from: b, reason: collision with root package name */
    private final C6013d.a f55165b;

    @Override // androidx.view.InterfaceC6027p
    public void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f55165b.a(interfaceC6030s, aVar, this.f55164a);
    }

    C5993I(Object obj) {
        this.f55164a = obj;
        this.f55165b = C6013d.f55242c.c(obj.getClass());
    }
}

package androidx.view;

import androidx.view.AbstractC6165l;
import androidx.view.C6155d;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: androidx.lifecycle.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6135I implements InterfaceC6169p {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55388a;

    /* renamed from: b, reason: collision with root package name */
    private final C6155d.a f55389b;

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f55389b.a(interfaceC6172s, aVar, this.f55388a);
    }

    C6135I(Object obj) {
        this.f55388a = obj;
        this.f55389b = C6155d.f55466c.c(obj.getClass());
    }
}

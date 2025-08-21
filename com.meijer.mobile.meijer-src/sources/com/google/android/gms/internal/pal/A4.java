package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes6.dex */
public final class A4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private List f83316i;

    public A4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", ya2, i10, 31);
        this.f83316i = null;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f83583e.O(-1L);
        this.f83583e.K(-1L);
        if (this.f83316i == null) {
            this.f83316i = (List) this.f83584f.invoke(null, this.f83580b.b());
        }
        List list = this.f83316i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f83583e) {
            this.f83583e.O(((Long) this.f83316i.get(0)).longValue());
            this.f83583e.K(((Long) this.f83316i.get(1)).longValue());
        }
    }
}

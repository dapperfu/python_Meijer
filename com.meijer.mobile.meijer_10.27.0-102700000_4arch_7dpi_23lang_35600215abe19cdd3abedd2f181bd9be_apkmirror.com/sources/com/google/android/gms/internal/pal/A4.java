package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes6.dex */
public final class A4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private List f82476i;

    public A4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", ya2, i10, 31);
        this.f82476i = null;
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f82743e.O(-1L);
        this.f82743e.K(-1L);
        if (this.f82476i == null) {
            this.f82476i = (List) this.f82744f.invoke(null, this.f82740b.b());
        }
        List list = this.f82476i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f82743e) {
            this.f82743e.O(((Long) this.f82476i.get(0)).longValue());
            this.f82743e.K(((Long) this.f82476i.get(1)).longValue());
        }
    }
}

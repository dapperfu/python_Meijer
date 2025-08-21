package kw;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class a implements Iterator<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f148922a;

    /* renamed from: b, reason: collision with root package name */
    private int f148923b = 0;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f148923b < Array.getLength(this.f148922a);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f148922a;
        int i10 = this.f148923b;
        this.f148923b = i10 + 1;
        return Array.get(obj, i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }

    public a(Object obj) {
        if (obj.getClass().isArray()) {
            this.f148922a = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }
}

package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class A<P> {

    /* renamed from: b, reason: collision with root package name */
    private static final We.a f88128b = We.a.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final Map<We.a, List<P>> f88129a;

    class a implements Iterable<P> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f88130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f88131b;

        a(List list, List list2) {
            this.f88130a = list;
            this.f88131b = list2;
        }

        @Override // java.lang.Iterable
        public Iterator<P> iterator() {
            return new c(this.f88130a.iterator(), this.f88131b.iterator(), null);
        }
    }

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<We.a, List<P>> f88133a = new HashMap();

        public A<P> a() {
            return new A<>(this.f88133a, null);
        }

        public b<P> b(We.a aVar, P p10) throws GeneralSecurityException {
            List<P> list;
            if (aVar.c() != 0 && aVar.c() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (this.f88133a.containsKey(aVar)) {
                list = this.f88133a.get(aVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f88133a.put(aVar, arrayList);
                list = arrayList;
            }
            list.add(p10);
            return this;
        }
    }

    private static class c<P> implements Iterator<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<P> f88134a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator<P> f88135b;

        /* synthetic */ c(Iterator it, Iterator it2, a aVar) {
            this(it, it2);
        }

        private c(Iterator<P> it, Iterator<P> it2) {
            this.f88134a = it;
            this.f88135b = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88134a.hasNext() || this.f88135b.hasNext();
        }

        @Override // java.util.Iterator
        public P next() {
            return this.f88134a.hasNext() ? this.f88134a.next() : this.f88135b.next();
        }
    }

    /* synthetic */ A(Map map, a aVar) {
        this(map);
    }

    private A(Map<We.a, List<P>> map) {
        this.f88129a = map;
    }

    public Iterable<P> a(byte[] bArr) {
        List<P> list = this.f88129a.get(f88128b);
        List<P> list2 = bArr.length >= 5 ? this.f88129a.get(We.a.b(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new a(list2, list);
    }
}

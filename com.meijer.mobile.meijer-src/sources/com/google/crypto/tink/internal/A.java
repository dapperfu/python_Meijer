package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class A<P> {

    /* renamed from: b, reason: collision with root package name */
    private static final Ye.a f88968b = Ye.a.a(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Ye.a, List<P>> f88969a;

    class a implements Iterable<P> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f88970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f88971b;

        a(List list, List list2) {
            this.f88970a = list;
            this.f88971b = list2;
        }

        @Override // java.lang.Iterable
        public Iterator<P> iterator() {
            return new c(this.f88970a.iterator(), this.f88971b.iterator(), null);
        }
    }

    public static class b<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Ye.a, List<P>> f88973a = new HashMap();

        public A<P> a() {
            return new A<>(this.f88973a, null);
        }

        public b<P> b(Ye.a aVar, P p10) throws GeneralSecurityException {
            List<P> list;
            if (aVar.c() != 0 && aVar.c() != 5) {
                throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
            }
            if (this.f88973a.containsKey(aVar)) {
                list = this.f88973a.get(aVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f88973a.put(aVar, arrayList);
                list = arrayList;
            }
            list.add(p10);
            return this;
        }
    }

    private static class c<P> implements Iterator<P> {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<P> f88974a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator<P> f88975b;

        /* synthetic */ c(Iterator it, Iterator it2, a aVar) {
            this(it, it2);
        }

        private c(Iterator<P> it, Iterator<P> it2) {
            this.f88974a = it;
            this.f88975b = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88974a.hasNext() || this.f88975b.hasNext();
        }

        @Override // java.util.Iterator
        public P next() {
            return this.f88974a.hasNext() ? this.f88974a.next() : this.f88975b.next();
        }
    }

    /* synthetic */ A(Map map, a aVar) {
        this(map);
    }

    private A(Map<Ye.a, List<P>> map) {
        this.f88969a = map;
    }

    public Iterable<P> a(byte[] bArr) {
        List<P> list = this.f88969a.get(f88968b);
        List<P> list2 = bArr.length >= 5 ? this.f88969a.get(Ye.a.b(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new a(list2, list);
    }
}

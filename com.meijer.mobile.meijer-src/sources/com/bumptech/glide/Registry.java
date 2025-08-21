package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import d7.o;
import d7.p;
import d7.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k7.C15108f;
import k7.InterfaceC15107e;
import n7.C15919a;
import s7.C17028a;

/* loaded from: classes4.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final q f64483a;

    /* renamed from: b, reason: collision with root package name */
    private final C15919a f64484b;

    /* renamed from: c, reason: collision with root package name */
    private final n7.e f64485c;

    /* renamed from: d, reason: collision with root package name */
    private final n7.f f64486d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f64487e;

    /* renamed from: f, reason: collision with root package name */
    private final C15108f f64488f;

    /* renamed from: g, reason: collision with root package name */
    private final n7.b f64489g;

    /* renamed from: h, reason: collision with root package name */
    private final n7.d f64490h = new n7.d();

    /* renamed from: i, reason: collision with root package name */
    private final n7.c f64491i = new n7.c();

    /* renamed from: j, reason: collision with root package name */
    private final o2.f<List<Throwable>> f64492j;

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f64485c.d(cls, cls2)) {
            for (Class cls5 : this.f64488f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f64485c.b(cls, cls4), this.f64488f.a(cls4, cls5), this.f64492j));
            }
        }
        return arrayList;
    }

    public <Data> Registry a(Class<Data> cls, X6.d<Data> dVar) {
        this.f64484b.a(cls, dVar);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, X6.j<TResource> jVar) {
        this.f64486d.a(cls, jVar);
        return this;
    }

    public <Data, TResource> Registry c(Class<Data> cls, Class<TResource> cls2, X6.i<Data, TResource> iVar) {
        e("legacy_append", cls, cls2, iVar);
        return this;
    }

    public <Model, Data> Registry d(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f64483a.a(cls, cls2, pVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, X6.i<Data, TResource> iVar) {
        this.f64485c.a(str, iVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f64489g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.q<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVarA = this.f64491i.a(cls, cls2, cls3);
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVar = null;
        if (this.f64491i.c(qVarA)) {
            return null;
        }
        if (qVarA != null) {
            return qVarA;
        }
        List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            qVar = new com.bumptech.glide.load.engine.q<>(cls4, cls5, cls6, listF, this.f64492j);
        }
        this.f64491i.d(cls4, cls5, cls6, qVar);
        return qVar;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f64483a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.f64490h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f64483a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f64485c.d(it.next(), cls2)) {
                    if (!this.f64488f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f64490h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> X6.j<X> k(Z6.c<X> cVar) throws NoResultEncoderAvailableException {
        X6.j<X> jVarB = this.f64486d.b(cVar.c());
        if (jVarB != null) {
            return jVarB;
        }
        throw new NoResultEncoderAvailableException(cVar.c());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f64487e.a(x10);
    }

    public <X> X6.d<X> m(X x10) throws NoSourceEncoderAvailableException {
        X6.d<X> dVarB = this.f64484b.b(x10.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(Z6.c<?> cVar) {
        return this.f64486d.b(cVar.c()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f64489g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f64487e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC15107e<TResource, Transcode> interfaceC15107e) {
        this.f64488f.c(cls, cls2, interfaceC15107e);
        return this;
    }

    public final Registry r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f64485c.e(arrayList);
        return this;
    }

    public Registry() {
        o2.f<List<Throwable>> fVarE = C17028a.e();
        this.f64492j = fVarE;
        this.f64483a = new q(fVarE);
        this.f64484b = new C15919a();
        this.f64485c = new n7.e();
        this.f64486d = new n7.f();
        this.f64487e = new com.bumptech.glide.load.data.f();
        this.f64488f = new C15108f();
        this.f64489g = new n7.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }
}

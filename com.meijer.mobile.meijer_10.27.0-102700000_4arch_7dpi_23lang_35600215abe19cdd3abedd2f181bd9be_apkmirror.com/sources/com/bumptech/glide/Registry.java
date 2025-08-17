package com.bumptech.glide;

import b7.o;
import b7.p;
import b7.q;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import i7.C14705f;
import i7.InterfaceC14704e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l7.C15385a;
import q7.C16480a;

/* loaded from: classes4.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final q f63643a;

    /* renamed from: b, reason: collision with root package name */
    private final C15385a f63644b;

    /* renamed from: c, reason: collision with root package name */
    private final l7.e f63645c;

    /* renamed from: d, reason: collision with root package name */
    private final l7.f f63646d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f63647e;

    /* renamed from: f, reason: collision with root package name */
    private final C14705f f63648f;

    /* renamed from: g, reason: collision with root package name */
    private final l7.b f63649g;

    /* renamed from: h, reason: collision with root package name */
    private final l7.d f63650h = new l7.d();

    /* renamed from: i, reason: collision with root package name */
    private final l7.c f63651i = new l7.c();

    /* renamed from: j, reason: collision with root package name */
    private final o2.f<List<Throwable>> f63652j;

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
        for (Class cls4 : this.f63645c.d(cls, cls2)) {
            for (Class cls5 : this.f63648f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f63645c.b(cls, cls4), this.f63648f.a(cls4, cls5), this.f63652j));
            }
        }
        return arrayList;
    }

    public <Data> Registry a(Class<Data> cls, V6.d<Data> dVar) {
        this.f63644b.a(cls, dVar);
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, V6.j<TResource> jVar) {
        this.f63646d.a(cls, jVar);
        return this;
    }

    public <Data, TResource> Registry c(Class<Data> cls, Class<TResource> cls2, V6.i<Data, TResource> iVar) {
        e("legacy_append", cls, cls2, iVar);
        return this;
    }

    public <Model, Data> Registry d(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f63643a.a(cls, cls2, pVar);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, V6.i<Data, TResource> iVar) {
        this.f63645c.a(str, iVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f63649g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.q<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVarA = this.f63651i.a(cls, cls2, cls3);
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVar = null;
        if (this.f63651i.c(qVarA)) {
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
            qVar = new com.bumptech.glide.load.engine.q<>(cls4, cls5, cls6, listF, this.f63652j);
        }
        this.f63651i.d(cls4, cls5, cls6, qVar);
        return qVar;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f63643a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.f63650h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f63643a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f63645c.d(it.next(), cls2)) {
                    if (!this.f63648f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f63650h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> V6.j<X> k(X6.c<X> cVar) throws NoResultEncoderAvailableException {
        V6.j<X> jVarB = this.f63646d.b(cVar.c());
        if (jVarB != null) {
            return jVarB;
        }
        throw new NoResultEncoderAvailableException(cVar.c());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f63647e.a(x10);
    }

    public <X> V6.d<X> m(X x10) throws NoSourceEncoderAvailableException {
        V6.d<X> dVarB = this.f63644b.b(x10.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(X6.c<?> cVar) {
        return this.f63646d.b(cVar.c()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f63649g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f63647e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC14704e<TResource, Transcode> interfaceC14704e) {
        this.f63648f.c(cls, cls2, interfaceC14704e);
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
        this.f63645c.e(arrayList);
        return this;
    }

    public Registry() {
        o2.f<List<Throwable>> fVarE = C16480a.e();
        this.f63652j = fVarE;
        this.f63643a = new q(fVarE);
        this.f63644b = new C15385a();
        this.f63645c = new l7.e();
        this.f63646d = new l7.f();
        this.f63647e = new com.bumptech.glide.load.data.f();
        this.f63648f = new C14705f();
        this.f63649g = new l7.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }
}

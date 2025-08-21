package com.bumptech.glide;

import a7.InterfaceC5665b;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import o7.C16082g;
import o7.InterfaceC16081f;
import r7.f;

/* loaded from: classes4.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final l<?, ?> f64523k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5665b f64524a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b<Registry> f64525b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.g f64526c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f64527d;

    /* renamed from: e, reason: collision with root package name */
    private final List<InterfaceC16081f<Object>> f64528e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f64529f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f64530g;

    /* renamed from: h, reason: collision with root package name */
    private final e f64531h;

    /* renamed from: i, reason: collision with root package name */
    private final int f64532i;

    /* renamed from: j, reason: collision with root package name */
    private C16082g f64533j;

    public synchronized C16082g d() {
        try {
            if (this.f64533j == null) {
                this.f64533j = this.f64527d.build().P();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f64533j;
    }

    public <X> com.bumptech.glide.request.target.k<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f64526c.a(imageView, cls);
    }

    public InterfaceC5665b b() {
        return this.f64524a;
    }

    public List<InterfaceC16081f<Object>> c() {
        return this.f64528e;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l) this.f64529f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f64529f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f64523k : lVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f64530g;
    }

    public e g() {
        return this.f64531h;
    }

    public int h() {
        return this.f64532i;
    }

    public Registry i() {
        return this.f64525b.get();
    }

    public d(Context context, InterfaceC5665b interfaceC5665b, f.b<Registry> bVar, com.bumptech.glide.request.target.g gVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<InterfaceC16081f<Object>> list, com.bumptech.glide.load.engine.j jVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f64524a = interfaceC5665b;
        this.f64526c = gVar;
        this.f64527d = aVar;
        this.f64528e = list;
        this.f64529f = map;
        this.f64530g = jVar;
        this.f64531h = eVar;
        this.f64532i = i10;
        this.f64525b = r7.f.a(bVar);
    }
}

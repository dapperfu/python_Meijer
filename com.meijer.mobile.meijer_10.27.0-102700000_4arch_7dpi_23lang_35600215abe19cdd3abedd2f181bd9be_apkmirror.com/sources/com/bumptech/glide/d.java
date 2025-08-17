package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import m7.C15572g;
import m7.InterfaceC15571f;
import p7.f;

/* loaded from: classes4.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final l<?, ?> f63683k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Y6.b f63684a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b<Registry> f63685b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.g f63686c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f63687d;

    /* renamed from: e, reason: collision with root package name */
    private final List<InterfaceC15571f<Object>> f63688e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f63689f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f63690g;

    /* renamed from: h, reason: collision with root package name */
    private final e f63691h;

    /* renamed from: i, reason: collision with root package name */
    private final int f63692i;

    /* renamed from: j, reason: collision with root package name */
    private C15572g f63693j;

    public synchronized C15572g d() {
        try {
            if (this.f63693j == null) {
                this.f63693j = this.f63687d.build().P();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f63693j;
    }

    public <X> com.bumptech.glide.request.target.k<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f63686c.a(imageView, cls);
    }

    public Y6.b b() {
        return this.f63684a;
    }

    public List<InterfaceC15571f<Object>> c() {
        return this.f63688e;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l) this.f63689f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f63689f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f63683k : lVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f63690g;
    }

    public e g() {
        return this.f63691h;
    }

    public int h() {
        return this.f63692i;
    }

    public Registry i() {
        return this.f63685b.get();
    }

    public d(Context context, Y6.b bVar, f.b<Registry> bVar2, com.bumptech.glide.request.target.g gVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<InterfaceC15571f<Object>> list, com.bumptech.glide.load.engine.j jVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f63684a = bVar;
        this.f63686c = gVar;
        this.f63687d = aVar;
        this.f63688e = list;
        this.f63689f = map;
        this.f63690g = jVar;
        this.f63691h = eVar;
        this.f63692i = i10;
        this.f63685b = p7.f.a(bVar2);
    }
}

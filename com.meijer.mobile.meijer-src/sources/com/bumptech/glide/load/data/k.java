package com.bumptech.glide.load.data;

import a7.InterfaceC5665b;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.C;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final C f64624a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5665b f64625a;

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f64625a);
        }

        public a(InterfaceC5665b interfaceC5665b) {
            this.f64625a = interfaceC5665b;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f64624a.c();
    }

    public void c() {
        this.f64624a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f64624a.reset();
        return this.f64624a;
    }

    public k(InputStream inputStream, InterfaceC5665b interfaceC5665b) {
        C c10 = new C(inputStream, interfaceC5665b);
        this.f64624a = c10;
        c10.mark(5242880);
    }
}

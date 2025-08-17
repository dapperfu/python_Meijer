package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.C;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final C f63784a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Y6.b f63785a;

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f63785a);
        }

        public a(Y6.b bVar) {
            this.f63785a = bVar;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f63784a.c();
    }

    public void c() {
        this.f63784a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f63784a.reset();
        return this.f63784a;
    }

    public k(InputStream inputStream, Y6.b bVar) {
        C c10 = new C(inputStream, bVar);
        this.f63784a = c10;
        c10.mark(5242880);
    }
}

package com.bumptech.glide.load.engine;

import Z6.a;
import java.io.File;

/* loaded from: classes4.dex */
class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final V6.d<DataType> f63822a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f63823b;

    /* renamed from: c, reason: collision with root package name */
    private final V6.g f63824c;

    @Override // Z6.a.b
    public boolean a(File file) {
        return this.f63822a.b(this.f63823b, file, this.f63824c);
    }

    e(V6.d<DataType> dVar, DataType datatype, V6.g gVar) {
        this.f63822a = dVar;
        this.f63823b = datatype;
        this.f63824c = gVar;
    }
}

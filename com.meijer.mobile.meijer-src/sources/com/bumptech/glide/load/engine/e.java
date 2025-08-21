package com.bumptech.glide.load.engine;

import b7.InterfaceC6336a;
import java.io.File;

/* loaded from: classes4.dex */
class e<DataType> implements InterfaceC6336a.b {

    /* renamed from: a, reason: collision with root package name */
    private final X6.d<DataType> f64662a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f64663b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.g f64664c;

    @Override // b7.InterfaceC6336a.b
    public boolean a(File file) {
        return this.f64662a.b(this.f64663b, file, this.f64664c);
    }

    e(X6.d<DataType> dVar, DataType datatype, X6.g gVar) {
        this.f64662a = dVar;
        this.f64663b = datatype;
        this.f64664c = gVar;
    }
}

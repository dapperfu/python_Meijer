package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class q<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f63979a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.f<List<Throwable>> f63980b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f63981c;

    /* renamed from: d, reason: collision with root package name */
    private final String f63982d;

    private X6.c<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, V6.g gVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f63981c.size();
        X6.c<Transcode> cVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                cVarA = this.f63981c.get(i12).a(eVar, i10, i11, gVar, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (cVarA != null) {
                break;
            }
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new GlideException(this.f63982d, new ArrayList(list));
    }

    public X6.c<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, V6.g gVar, int i10, int i11, i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) p7.k.d(this.f63980b.b());
        try {
            return b(eVar, gVar, i10, i11, aVar, list);
        } finally {
            this.f63980b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f63981c.toArray()) + '}';
    }

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, o2.f<List<Throwable>> fVar) {
        this.f63979a = cls;
        this.f63980b = fVar;
        this.f63981c = (List) p7.k.c(list);
        this.f63982d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }
}

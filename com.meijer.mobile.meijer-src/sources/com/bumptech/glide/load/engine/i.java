package com.bumptech.glide.load.engine;

import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k7.InterfaceC15107e;

/* loaded from: classes4.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f64737a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends X6.i<DataType, ResourceType>> f64738b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15107e<ResourceType, Transcode> f64739c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f<List<Throwable>> f64740d;

    /* renamed from: e, reason: collision with root package name */
    private final String f64741e;

    interface a<ResourceType> {
        Z6.c<ResourceType> a(Z6.c<ResourceType> cVar);
    }

    private Z6.c<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, X6.g gVar) throws GlideException {
        List<Throwable> list = (List) r7.k.d(this.f64740d.b());
        try {
            return c(eVar, i10, i11, gVar, list);
        } finally {
            this.f64740d.a(list);
        }
    }

    private Z6.c<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, X6.g gVar, List<Throwable> list) throws GlideException {
        int size = this.f64738b.size();
        Z6.c<ResourceType> cVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            X6.i<DataType, ResourceType> iVar = this.f64738b.get(i12);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    cVarB = iVar.b(eVar.a(), i10, i11, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    FS.log_v("DecodePath", "Failed to decode data for " + iVar, e10);
                }
                list.add(e10);
            }
            if (cVarB != null) {
                break;
            }
        }
        if (cVarB != null) {
            return cVarB;
        }
        throw new GlideException(this.f64741e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f64737a + ", decoders=" + this.f64738b + ", transcoder=" + this.f64739c + '}';
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends X6.i<DataType, ResourceType>> list, InterfaceC15107e<ResourceType, Transcode> interfaceC15107e, o2.f<List<Throwable>> fVar) {
        this.f64737a = cls;
        this.f64738b = list;
        this.f64739c = interfaceC15107e;
        this.f64740d = fVar;
        this.f64741e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Z6.c<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, X6.g gVar, a<ResourceType> aVar) throws GlideException {
        return this.f64739c.a(aVar.a(b(eVar, i10, i11, gVar)), gVar);
    }
}

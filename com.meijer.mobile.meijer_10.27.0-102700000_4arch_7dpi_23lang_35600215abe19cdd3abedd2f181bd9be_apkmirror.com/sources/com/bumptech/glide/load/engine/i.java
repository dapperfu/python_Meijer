package com.bumptech.glide.load.engine;

import android.util.Log;
import com.fullstory.FS;
import i7.InterfaceC14704e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f63897a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends V6.i<DataType, ResourceType>> f63898b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14704e<ResourceType, Transcode> f63899c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.f<List<Throwable>> f63900d;

    /* renamed from: e, reason: collision with root package name */
    private final String f63901e;

    interface a<ResourceType> {
        X6.c<ResourceType> a(X6.c<ResourceType> cVar);
    }

    private X6.c<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, V6.g gVar) throws GlideException {
        List<Throwable> list = (List) p7.k.d(this.f63900d.b());
        try {
            return c(eVar, i10, i11, gVar, list);
        } finally {
            this.f63900d.a(list);
        }
    }

    private X6.c<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, V6.g gVar, List<Throwable> list) throws GlideException {
        int size = this.f63898b.size();
        X6.c<ResourceType> cVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            V6.i<DataType, ResourceType> iVar = this.f63898b.get(i12);
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
        throw new GlideException(this.f63901e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f63897a + ", decoders=" + this.f63898b + ", transcoder=" + this.f63899c + '}';
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends V6.i<DataType, ResourceType>> list, InterfaceC14704e<ResourceType, Transcode> interfaceC14704e, o2.f<List<Throwable>> fVar) {
        this.f63897a = cls;
        this.f63898b = list;
        this.f63899c = interfaceC14704e;
        this.f63900d = fVar;
        this.f63901e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public X6.c<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, V6.g gVar, a<ResourceType> aVar) throws GlideException {
        return this.f63899c.a(aVar.a(b(eVar, i10, i11, gVar)), gVar);
    }
}

package Iv;

import Fv.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LIv/F;", "LDv/b;", "LIv/E;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LIv/E;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LIv/E;", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class F implements Dv.b<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final F f14390a = new F();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = Fv.l.d("kotlinx.serialization.json.JsonPrimitive", e.i.f11113a, new Fv.f[0], null, 8, null);

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        i iVarG = r.d(decoder).g();
        if (iVarG instanceof E) {
            return (E) iVarG;
        }
        throw Jv.A.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.b(iVarG.getClass()), iVarG.toString());
    }

    @Override // Dv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Gv.f encoder, E value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        if (value instanceof z) {
            encoder.p(A.f14382a, z.INSTANCE);
        } else {
            encoder.p(w.f14447a, (v) value);
        }
    }

    private F() {
    }
}

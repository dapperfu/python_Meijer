package Ev;

import Bv.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LEv/F;", "Lzv/b;", "LEv/E;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LEv/E;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LEv/E;", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class F implements zv.b<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final F f8592a = new F();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = Bv.l.d("kotlinx.serialization.json.JsonPrimitive", e.i.f3708a, new Bv.f[0], null, 8, null);

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.InterfaceC18555a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E c(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        i iVarJ = r.d(decoder).j();
        if (iVarJ instanceof E) {
            return (E) iVarJ;
        }
        throw Fv.A.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.b(iVarJ.getClass()), iVarJ.toString());
    }

    @Override // zv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Cv.f encoder, E value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        r.h(encoder);
        if (value instanceof z) {
            encoder.D(A.f8584a, z.INSTANCE);
        } else {
            encoder.D(w.f8649a, (v) value);
        }
    }

    private F() {
    }
}

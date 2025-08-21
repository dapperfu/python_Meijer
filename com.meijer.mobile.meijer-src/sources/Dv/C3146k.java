package Dv;

import Bv.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LDv/k;", "Lzv/b;", "", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;B)V", "LCv/e;", "decoder", "f", "(LCv/e;)Ljava/lang/Byte;", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Dv.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3146k implements zv.b<Byte> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3146k f6760a = new C3146k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = new PrimitiveDescriptor("kotlin.Byte", e.b.f3701a);

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.h
    public /* bridge */ /* synthetic */ void b(Cv.f fVar, Object obj) {
        g(fVar, ((Number) obj).byteValue());
    }

    @Override // zv.InterfaceC18555a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Byte c(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return Byte.valueOf(decoder.G());
    }

    public void g(Cv.f encoder, byte value) {
        Intrinsics.j(encoder, "encoder");
        encoder.f(value);
    }

    private C3146k() {
    }
}

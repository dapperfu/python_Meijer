package Dv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LDv/G0;", "Lzv/b;", "Lkotlin/UShort;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;S)V", "LCv/e;", "decoder", "f", "(LCv/e;)S", "LBv/f;", "b", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class G0 implements zv.b<UShort> {

    /* renamed from: a, reason: collision with root package name */
    public static final G0 f6696a = new G0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.f descriptor = B.a("kotlin.UShort", Av.a.C(ShortCompanionObject.f143746a));

    @Override // zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a */
    public Bv.f getDescriptor() {
        return descriptor;
    }

    @Override // zv.h
    public /* bridge */ /* synthetic */ void b(Cv.f fVar, Object obj) {
        g(fVar, ((UShort) obj).getData());
    }

    public short f(Cv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return UShort.b(decoder.y(getDescriptor()).r());
    }

    public void g(Cv.f encoder, short value) {
        Intrinsics.j(encoder, "encoder");
        encoder.x(getDescriptor()).q(value);
    }

    private G0() {
    }

    @Override // zv.InterfaceC18555a
    public /* bridge */ /* synthetic */ Object c(Cv.e eVar) {
        return UShort.a(f(eVar));
    }
}

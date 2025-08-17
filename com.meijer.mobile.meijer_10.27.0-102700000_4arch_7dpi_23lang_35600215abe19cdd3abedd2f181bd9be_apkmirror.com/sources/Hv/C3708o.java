package Hv;

import Fv.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LHv/o;", "LDv/b;", "", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;C)V", "LGv/e;", "decoder", "f", "(LGv/e;)Ljava/lang/Character;", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Hv.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3708o implements Dv.b<Character> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3708o f13349a = new C3708o();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = new PrimitiveDescriptor("kotlin.Char", e.c.f11107a);

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.h
    public /* bridge */ /* synthetic */ void b(Gv.f fVar, Object obj) {
        g(fVar, ((Character) obj).charValue());
    }

    @Override // Dv.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return Character.valueOf(decoder.t());
    }

    public void g(Gv.f encoder, char value) {
        Intrinsics.j(encoder, "encoder");
        encoder.w(value);
    }

    private C3708o() {
    }
}

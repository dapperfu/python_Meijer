package Hv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"LHv/T;", "", "T", "LDv/b;", "serializer", "<init>", "(LDv/b;)V", "LGv/f;", "encoder", "value", "", "b", "(LGv/f;Ljava/lang/Object;)V", "LGv/e;", "decoder", "d", "(LGv/e;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LDv/b;", "LFv/f;", "LFv/f;", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class T<T> implements Dv.b<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dv.b<T> serializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fv.f descriptor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && T.class == other.getClass() && Intrinsics.e(this.serializer, ((T) other).serializer);
    }

    public T(Dv.b<T> serializer) {
        Intrinsics.j(serializer, "serializer");
        this.serializer = serializer;
        this.descriptor = new m0(serializer.getDescriptor());
    }

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a, reason: from getter */
    public Fv.f getDescriptor() {
        return this.descriptor;
    }

    @Override // Dv.h
    public void b(Gv.f encoder, T value) {
        Intrinsics.j(encoder, "encoder");
        if (value == null) {
            encoder.r();
        } else {
            encoder.y();
            encoder.p(this.serializer, value);
        }
    }

    @Override // Dv.a
    public T d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return decoder.B() ? (T) decoder.G(this.serializer) : (T) decoder.i();
    }

    public int hashCode() {
        return this.serializer.hashCode();
    }
}

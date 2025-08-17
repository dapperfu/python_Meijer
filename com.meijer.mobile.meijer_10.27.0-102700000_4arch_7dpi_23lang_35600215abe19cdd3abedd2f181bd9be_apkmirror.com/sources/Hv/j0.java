package Hv;

import Hv.AbstractC3700h0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00028\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013*\u00028\u0001H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0010*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\nH$¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00028\u00012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LHv/j0;", "Element", "Array", "LHv/h0;", "Builder", "LHv/p;", "LDv/b;", "primitiveSerializer", "<init>", "(LDv/b;)V", "", "u", "(LHv/h0;)I", "y", "(LHv/h0;)Ljava/lang/Object;", "size", "", "v", "(LHv/h0;I)V", "", "i", "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "x", "(LHv/h0;ILjava/lang/Object;)V", "t", "()LHv/h0;", "w", "()Ljava/lang/Object;", "LGv/d;", "encoder", "content", "z", "(LGv/d;Ljava/lang/Object;I)V", "LGv/f;", "value", "b", "(LGv/f;Ljava/lang/Object;)V", "LGv/e;", "decoder", "d", "(LGv/e;)Ljava/lang/Object;", "LFv/f;", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class j0<Element, Array, Builder extends AbstractC3700h0<Array>> extends AbstractC3709p<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fv.f descriptor;

    protected abstract Array w();

    protected abstract void z(Gv.d encoder, Array content, int size);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Dv.b<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.j(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new C3702i0(primitiveSerializer.getDescriptor());
    }

    @Override // Hv.AbstractC3709p, Dv.b, Dv.h, Dv.a
    /* renamed from: a, reason: from getter */
    public final Fv.f getDescriptor() {
        return this.descriptor;
    }

    @Override // Hv.AbstractC3709p, Dv.h
    public final void b(Gv.f encoder, Array value) {
        Intrinsics.j(encoder, "encoder");
        int iJ = j(value);
        Fv.f fVar = this.descriptor;
        Gv.d dVarX = encoder.x(fVar, iJ);
        z(dVarX, value, iJ);
        dVarX.a(fVar);
    }

    @Override // Hv.AbstractC3685a, Dv.a
    public final Array d(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return k(decoder, null);
    }

    @Override // Hv.AbstractC3685a
    protected final Iterator<Element> i(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(Builder builder) {
        Intrinsics.j(builder, "<this>");
        return builder.getPosition();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(Builder builder, int i10) {
        Intrinsics.j(builder, "<this>");
        builder.b(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3709p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(Builder builder, int i10, Element element) {
        Intrinsics.j(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final Array q(Builder builder) {
        Intrinsics.j(builder, "<this>");
        return (Array) builder.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Builder f() {
        return p(w());
    }
}

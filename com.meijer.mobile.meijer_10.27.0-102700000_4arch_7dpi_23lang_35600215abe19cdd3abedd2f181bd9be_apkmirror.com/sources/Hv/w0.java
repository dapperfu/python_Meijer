package Hv;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LHv/w0;", "LDv/b;", "Lkotlin/UByteArray;", "LHv/j0;", "Lkotlin/UByte;", "LHv/v0;", "<init>", "()V", "", "A", "([B)I", "D", "([B)LHv/v0;", "B", "()[B", "LGv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LGv/c;ILHv/v0;Z)V", "LGv/d;", "encoder", "content", "size", "E", "(LGv/d;[BI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes13.dex */
public final class w0 extends j0<UByte, UByteArray, v0> implements Dv.b<UByteArray> {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f13384c = new w0();

    protected byte[] B() {
        return UByteArray.f(0);
    }

    private w0() {
        super(Ev.a.q(UByte.INSTANCE));
    }

    protected int A(byte[] collectionSize) {
        Intrinsics.j(collectionSize, "$this$collectionSize");
        return UByteArray.s(collectionSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3709p, Hv.AbstractC3685a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Gv.c decoder, int index, v0 builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(UByte.b(decoder.u(getDescriptor(), index).E()));
    }

    protected v0 D(byte[] toBuilder) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        return new v0(toBuilder, null);
    }

    protected void E(Gv.d encoder, byte[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.n(getDescriptor(), i10).h(UByteArray.q(content, i10));
        }
    }

    @Override // Hv.AbstractC3685a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((UByteArray) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // Hv.AbstractC3685a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((UByteArray) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // Hv.j0
    public /* bridge */ /* synthetic */ void z(Gv.d dVar, UByteArray uByteArray, int i10) {
        E(dVar, uByteArray.getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), i10);
    }

    @Override // Hv.j0
    public /* bridge */ /* synthetic */ UByteArray w() {
        return UByteArray.a(B());
    }
}

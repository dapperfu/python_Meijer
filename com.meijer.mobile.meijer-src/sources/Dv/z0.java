package Dv;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LDv/z0;", "Lzv/b;", "Lkotlin/UIntArray;", "LDv/j0;", "Lkotlin/UInt;", "LDv/y0;", "<init>", "()V", "", "A", "([I)I", "D", "([I)LDv/y0;", "B", "()[I", "LCv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LCv/c;ILDv/y0;Z)V", "LCv/d;", "encoder", "content", "size", "E", "(LCv/d;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes14.dex */
public final class z0 extends j0<UInt, UIntArray, y0> implements zv.b<UIntArray> {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f6814c = new z0();

    protected int[] B() {
        return UIntArray.f(0);
    }

    private z0() {
        super(Av.a.r(UInt.INSTANCE));
    }

    protected int A(int[] collectionSize) {
        Intrinsics.j(collectionSize, "$this$collectionSize");
        return UIntArray.s(collectionSize);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3151p, Dv.AbstractC3127a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Cv.c decoder, int index, y0 builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(UInt.b(decoder.o(getDescriptor(), index).k()));
    }

    protected y0 D(int[] toBuilder) {
        Intrinsics.j(toBuilder, "$this$toBuilder");
        return new y0(toBuilder, null);
    }

    protected void E(Cv.d encoder, int[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.u(getDescriptor(), i10).A(UIntArray.q(content, i10));
        }
    }

    @Override // Dv.AbstractC3127a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return A(((UIntArray) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // Dv.AbstractC3127a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return D(((UIntArray) obj).getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String());
    }

    @Override // Dv.j0
    public /* bridge */ /* synthetic */ void z(Cv.d dVar, UIntArray uIntArray, int i10) {
        E(dVar, uIntArray.getCom.google.android.libraries.places.api.model.PlaceTypes.STORAGE java.lang.String(), i10);
    }

    @Override // Dv.j0
    public /* bridge */ /* synthetic */ UIntArray w() {
        return UIntArray.a(B());
    }
}

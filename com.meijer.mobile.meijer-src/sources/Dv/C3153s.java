package Dv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LDv/s;", "Lzv/b;", "", "LDv/j0;", "", "LDv/r;", "<init>", "()V", "", "A", "([D)I", "D", "([D)LDv/r;", "B", "()[D", "LCv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LCv/c;ILDv/r;Z)V", "LCv/d;", "encoder", "content", "size", "E", "(LCv/d;[DI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Dv.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3153s extends j0<Double, double[], r> implements zv.b<double[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final C3153s f6783c = new C3153s();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public double[] w() {
        return new double[0];
    }

    private C3153s() {
        super(Av.a.y(DoubleCompanionObject.f143727a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(double[] dArr) {
        Intrinsics.j(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3151p, Dv.AbstractC3127a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Cv.c decoder, int index, r builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(decoder.D(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public r p(double[] dArr) {
        Intrinsics.j(dArr, "<this>");
        return new r(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Cv.d encoder, double[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.i(getDescriptor(), i10, content[i10]);
        }
    }
}

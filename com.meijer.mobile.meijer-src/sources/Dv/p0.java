package Dv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LDv/p0;", "Lzv/b;", "", "LDv/j0;", "", "LDv/o0;", "<init>", "()V", "", "A", "([S)I", "D", "([S)LDv/o0;", "B", "()[S", "LCv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LCv/c;ILDv/o0;Z)V", "LCv/d;", "encoder", "content", "size", "E", "(LCv/d;[SI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class p0 extends j0<Short, short[], o0> implements zv.b<short[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f6776c = new p0();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public short[] w() {
        return new short[0];
    }

    private p0() {
        super(Av.a.C(ShortCompanionObject.f143746a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(short[] sArr) {
        Intrinsics.j(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3151p, Dv.AbstractC3127a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Cv.c decoder, int index, o0 builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(decoder.A(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public o0 p(short[] sArr) {
        Intrinsics.j(sArr, "<this>");
        return new o0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Cv.d encoder, short[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.v(getDescriptor(), i10, content[i10]);
        }
    }
}

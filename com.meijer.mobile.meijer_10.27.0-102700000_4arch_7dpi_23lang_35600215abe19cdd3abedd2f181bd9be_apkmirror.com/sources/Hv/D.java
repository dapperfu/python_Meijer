package Hv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LHv/D;", "LDv/b;", "", "LHv/j0;", "", "LHv/C;", "<init>", "()V", "A", "([I)I", "D", "([I)LHv/C;", "B", "()[I", "LGv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LGv/c;ILHv/C;Z)V", "LGv/d;", "encoder", "content", "size", "E", "(LGv/d;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class D extends j0<Integer, int[], C> implements Dv.b<int[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final D f13266c = new D();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int[] w() {
        return new int[0];
    }

    private D() {
        super(Ev.a.A(IntCompanionObject.f142824a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3709p, Hv.AbstractC3685a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Gv.c decoder, int index, C builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(decoder.F(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C p(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return new C(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Gv.d encoder, int[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.f(getDescriptor(), i10, content[i10]);
        }
    }
}

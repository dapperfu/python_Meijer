package Hv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LHv/n;", "LDv/b;", "", "LHv/j0;", "", "LHv/m;", "<init>", "()V", "", "A", "([C)I", "D", "([C)LHv/m;", "B", "()[C", "LGv/c;", "decoder", "index", "builder", "", "checkIndex", "", "C", "(LGv/c;ILHv/m;Z)V", "LGv/d;", "encoder", "content", "size", "E", "(LGv/d;[CI)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Hv.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3707n extends j0<Character, char[], C3706m> implements Dv.b<char[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final C3707n f13348c = new C3707n();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.j0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public char[] w() {
        return new char[0];
    }

    private C3707n() {
        super(Ev.a.x(CharCompanionObject.f142811a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3709p, Hv.AbstractC3685a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(Gv.c decoder, int index, C3706m builder, boolean checkIndex) {
        Intrinsics.j(decoder, "decoder");
        Intrinsics.j(builder, "builder");
        builder.e(decoder.z(getDescriptor(), index));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3706m p(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        return new C3706m(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.j0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(Gv.d encoder, char[] content, int size) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.k(getDescriptor(), i10, content[i10]);
        }
    }
}

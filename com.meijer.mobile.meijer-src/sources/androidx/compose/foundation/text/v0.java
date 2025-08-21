package androidx.compose.foundation.text;

import kotlin.Metadata;
import z1.InterfaceC18417E;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/v0;", "Lz1/E;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Lz1/E;II)V", "offset", "b", "(I)I", "a", "Lz1/E;", "c", "I", "d", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class v0 implements InterfaceC18417E {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18417E delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalLength;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int transformedLength;

    @Override // z1.InterfaceC18417E
    public int a(int offset) {
        int iA = this.delegate.a(offset);
        if (offset >= 0 && offset <= this.transformedLength) {
            w0.h(iA, this.originalLength, offset);
        }
        return iA;
    }

    @Override // z1.InterfaceC18417E
    public int b(int offset) {
        int iB = this.delegate.b(offset);
        if (offset >= 0 && offset <= this.originalLength) {
            w0.g(iB, this.transformedLength, offset);
        }
        return iB;
    }

    public v0(InterfaceC18417E interfaceC18417E, int i10, int i11) {
        this.delegate = interfaceC18417E;
        this.originalLength = i10;
        this.transformedLength = i11;
    }
}

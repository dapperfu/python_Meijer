package Dv;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LDv/f;", "LDv/h0;", "", "bufferWithData", "<init>", "([Z)V", "", "requiredCapacity", "", "b", "(I)V", "", "c", "e", "(Z)V", "f", "()[Z", "a", "[Z", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Dv.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3137f extends AbstractC3142h0<boolean[]> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean[] buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    public final void e(boolean c10) {
        AbstractC3142h0.c(this, 0, 1, null);
        boolean[] zArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        zArr[position] = c10;
    }

    public C3137f(boolean[] bufferWithData) {
        Intrinsics.j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = bufferWithData.length;
        b(10);
    }

    @Override // Dv.AbstractC3142h0
    public void b(int requiredCapacity) {
        boolean[] zArr = this.buffer;
        if (zArr.length < requiredCapacity) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, RangesKt.f(requiredCapacity, zArr.length * 2));
            Intrinsics.i(zArrCopyOf, "copyOf(...)");
            this.buffer = zArrCopyOf;
        }
    }

    @Override // Dv.AbstractC3142h0
    /* renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    @Override // Dv.AbstractC3142h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.i(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}

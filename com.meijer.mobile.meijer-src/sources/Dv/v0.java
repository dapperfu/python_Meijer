package Dv;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LDv/v0;", "LDv/h0;", "Lkotlin/UByteArray;", "bufferWithData", "<init>", "([BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UByte;", "c", "e", "(B)V", "f", "()[B", "a", "[B", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes14.dex */
public final class v0 extends AbstractC3142h0<UByteArray> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private byte[] buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    public /* synthetic */ v0(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public final void e(byte c10) {
        AbstractC3142h0.c(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        UByteArray.w(bArr, position, c10);
    }

    private v0(byte[] bufferWithData) {
        Intrinsics.j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UByteArray.s(bufferWithData);
        b(10);
    }

    @Override // Dv.AbstractC3142h0
    public void b(int requiredCapacity) {
        if (UByteArray.s(this.buffer) < requiredCapacity) {
            byte[] bArr = this.buffer;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, RangesKt.f(requiredCapacity, UByteArray.s(bArr) * 2));
            Intrinsics.i(bArrCopyOf, "copyOf(...)");
            this.buffer = UByteArray.h(bArrCopyOf);
        }
    }

    @Override // Dv.AbstractC3142h0
    /* renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.i(bArrCopyOf, "copyOf(...)");
        return UByteArray.h(bArrCopyOf);
    }

    @Override // Dv.AbstractC3142h0
    public /* bridge */ /* synthetic */ UByteArray a() {
        return UByteArray.a(f());
    }
}

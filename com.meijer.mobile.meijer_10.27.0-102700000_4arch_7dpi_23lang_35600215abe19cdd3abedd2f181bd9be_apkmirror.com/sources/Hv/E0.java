package Hv;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LHv/E0;", "LHv/h0;", "Lkotlin/UShortArray;", "bufferWithData", "<init>", "([SLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "b", "(I)V", "Lkotlin/UShort;", "c", "e", "(S)V", "f", "()[S", "a", "[S", "buffer", "value", "I", "d", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@ExperimentalUnsignedTypes
/* loaded from: classes13.dex */
public final class E0 extends AbstractC3700h0<UShortArray> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private short[] buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int position;

    public /* synthetic */ E0(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    public final void e(short c10) {
        AbstractC3700h0.c(this, 0, 1, null);
        short[] sArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        UShortArray.x(sArr, position, c10);
    }

    private E0(short[] bufferWithData) {
        Intrinsics.j(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UShortArray.s(bufferWithData);
        b(10);
    }

    @Override // Hv.AbstractC3700h0
    public void b(int requiredCapacity) {
        if (UShortArray.s(this.buffer) < requiredCapacity) {
            short[] sArr = this.buffer;
            short[] sArrCopyOf = Arrays.copyOf(sArr, RangesKt.f(requiredCapacity, UShortArray.s(sArr) * 2));
            Intrinsics.i(sArrCopyOf, "copyOf(...)");
            this.buffer = UShortArray.h(sArrCopyOf);
        }
    }

    @Override // Hv.AbstractC3700h0
    /* renamed from: d, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.buffer, getPosition());
        Intrinsics.i(sArrCopyOf, "copyOf(...)");
        return UShortArray.h(sArrCopyOf);
    }

    @Override // Hv.AbstractC3700h0
    public /* bridge */ /* synthetic */ UShortArray a() {
        return UShortArray.a(f());
    }
}

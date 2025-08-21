package Fv;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LFv/q;", "LFv/j;", "LFv/x;", "writer", "", "forceQuoting", "<init>", "(LFv/x;Z)V", "", "v", "", "i", "(I)V", "", "j", "(J)V", "", "e", "(B)V", "", "l", "(S)V", "c", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Fv.q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3607q extends C3600j {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3607q(InterfaceC3613x writer, boolean z10) {
        super(writer);
        Intrinsics.j(writer, "writer");
        this.forceQuoting = z10;
    }

    @Override // Fv.C3600j
    public void e(byte v10) {
        boolean z10 = this.forceQuoting;
        String strM = UByte.m(UByte.b(v10));
        if (z10) {
            n(strM);
        } else {
            k(strM);
        }
    }

    @Override // Fv.C3600j
    public void i(int v10) {
        boolean z10 = this.forceQuoting;
        String string = Long.toString(UInt.b(v10) & 4294967295L, 10);
        if (z10) {
            n(string);
        } else {
            k(string);
        }
    }

    @Override // Fv.C3600j
    public void j(long v10) {
        boolean z10 = this.forceQuoting;
        long jB = ULong.b(v10);
        if (z10) {
            n(C3606p.a(jB, 10));
        } else {
            k(C3606p.a(jB, 10));
        }
    }

    @Override // Fv.C3600j
    public void l(short v10) {
        boolean z10 = this.forceQuoting;
        String strM = UShort.m(UShort.b(v10));
        if (z10) {
            n(strM);
        } else {
            k(strM);
        }
    }
}

package r0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lr0/b;", "corner", "Lr0/h;", "b", "(Lr0/b;)Lr0/h;", "LH1/h;", "size", "c", "(F)Lr0/h;", "", "percent", "a", "(I)Lr0/h;", "topStart", "topEnd", "bottomEnd", "bottomStart", "d", "(FFFF)Lr0/h;", "Lr0/h;", "f", "()Lr0/h;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16692i {

    /* renamed from: a, reason: collision with root package name */
    private static final RoundedCornerShape f157756a = a(50);

    public static final RoundedCornerShape b(InterfaceC16685b interfaceC16685b) {
        return new RoundedCornerShape(interfaceC16685b, interfaceC16685b, interfaceC16685b, interfaceC16685b);
    }

    public static final RoundedCornerShape d(float f10, float f11, float f12, float f13) {
        return new RoundedCornerShape(C16686c.b(f10), C16686c.b(f11), C16686c.b(f12), C16686c.b(f13));
    }

    public static /* synthetic */ RoundedCornerShape e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = H1.h.p(0);
        }
        if ((i10 & 2) != 0) {
            f11 = H1.h.p(0);
        }
        if ((i10 & 4) != 0) {
            f12 = H1.h.p(0);
        }
        if ((i10 & 8) != 0) {
            f13 = H1.h.p(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final RoundedCornerShape f() {
        return f157756a;
    }

    public static final RoundedCornerShape a(int i10) {
        return b(C16686c.a(i10));
    }

    public static final RoundedCornerShape c(float f10) {
        return b(C16686c.b(f10));
    }
}

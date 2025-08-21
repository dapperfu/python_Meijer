package r0;

import H1.t;
import U0.k;
import V0.AbstractC5480m1;
import V0.D1;
import i0.C14592e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lr0/a;", "LV0/D1;", "Lr0/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lr0/b;Lr0/b;Lr0/b;Lr0/b;)V", "LU0/k;", "size", "LH1/t;", "layoutDirection", "LH1/d;", "density", "LV0/m1;", "a", "(JLH1/t;LH1/d;)LV0/m1;", "", "e", "(JFFFFLH1/t;)LV0/m1;", "c", "(Lr0/b;Lr0/b;Lr0/b;Lr0/b;)Lr0/a;", "all", "b", "(Lr0/b;)Lr0/a;", "Lr0/b;", "i", "()Lr0/b;", "h", "f", "d", "g", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16798a implements D1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16799b topStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16799b topEnd;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16799b bottomEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16799b bottomStart;

    public abstract AbstractC16798a c(InterfaceC16799b topStart, InterfaceC16799b topEnd, InterfaceC16799b bottomEnd, InterfaceC16799b bottomStart);

    public abstract AbstractC5480m1 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection);

    public static /* synthetic */ AbstractC16798a d(AbstractC16798a abstractC16798a, InterfaceC16799b interfaceC16799b, InterfaceC16799b interfaceC16799b2, InterfaceC16799b interfaceC16799b3, InterfaceC16799b interfaceC16799b4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            interfaceC16799b = abstractC16798a.topStart;
        }
        if ((i10 & 2) != 0) {
            interfaceC16799b2 = abstractC16798a.topEnd;
        }
        if ((i10 & 4) != 0) {
            interfaceC16799b3 = abstractC16798a.bottomEnd;
        }
        if ((i10 & 8) != 0) {
            interfaceC16799b4 = abstractC16798a.bottomStart;
        }
        return abstractC16798a.c(interfaceC16799b, interfaceC16799b2, interfaceC16799b3, interfaceC16799b4);
    }

    @Override // V0.D1
    public final AbstractC5480m1 a(long size, t layoutDirection, H1.d density) {
        float fA = this.topStart.a(size, density);
        float fA2 = this.topEnd.a(size, density);
        float fA3 = this.bottomEnd.a(size, density);
        float fA4 = this.bottomStart.a(size, density);
        float fH = k.h(size);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fH) {
            float f13 = fH / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (!(fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f)) {
            C14592e.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return e(size, fA, fA2, fA3, fA4, layoutDirection);
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC16799b getBottomEnd() {
        return this.bottomEnd;
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC16799b getBottomStart() {
        return this.bottomStart;
    }

    /* renamed from: h, reason: from getter */
    public final InterfaceC16799b getTopEnd() {
        return this.topEnd;
    }

    /* renamed from: i, reason: from getter */
    public final InterfaceC16799b getTopStart() {
        return this.topStart;
    }

    public AbstractC16798a(InterfaceC16799b interfaceC16799b, InterfaceC16799b interfaceC16799b2, InterfaceC16799b interfaceC16799b3, InterfaceC16799b interfaceC16799b4) {
        this.topStart = interfaceC16799b;
        this.topEnd = interfaceC16799b2;
        this.bottomEnd = interfaceC16799b3;
        this.bottomStart = interfaceC16799b4;
    }

    public final AbstractC16798a b(InterfaceC16799b all) {
        return c(all, all, all, all);
    }
}

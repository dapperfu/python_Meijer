package m0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR+\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lm0/d;", "Lm0/F;", "Lkotlin/Function2;", "LH1/d;", "LH1/b;", "Lm0/E;", "Lkotlin/ExtensionFunctionType;", "calculation", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "density", "constraints", "a", "(LH1/d;J)Lm0/E;", "Lkotlin/jvm/functions/Function2;", "b", "J", "cachedConstraints", "", "c", "F", "cachedDensity", "d", "Lm0/E;", "cachedSizes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15629d implements InterfaceC15620F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<H1.d, H1.b, C15619E> calculation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long cachedConstraints = H1.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedDensity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C15619E cachedSizes;

    @Override // m0.InterfaceC15620F
    public C15619E a(H1.d density, long constraints) {
        if (this.cachedSizes != null && H1.b.f(this.cachedConstraints, constraints) && this.cachedDensity == density.getDensity()) {
            C15619E c15619e = this.cachedSizes;
            Intrinsics.g(c15619e);
            return c15619e;
        }
        this.cachedConstraints = constraints;
        this.cachedDensity = density.getDensity();
        C15619E c15619eInvoke = this.calculation.invoke(density, H1.b.a(constraints));
        this.cachedSizes = c15619eInvoke;
        return c15619eInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15629d(Function2<? super H1.d, ? super H1.b, C15619E> function2) {
        this.calculation = function2;
    }
}

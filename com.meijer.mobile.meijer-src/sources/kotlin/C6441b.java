package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Lc0/a;", "Lc0/m;", "a", "(FF)Lc0/a;", "Lc0/m;", "positiveInfinityBounds1D", "Lc0/n;", "b", "Lc0/n;", "positiveInfinityBounds2D", "Lc0/o;", "c", "Lc0/o;", "positiveInfinityBounds3D", "Lc0/p;", "d", "Lc0/p;", "positiveInfinityBounds4D", "e", "negativeInfinityBounds1D", "f", "negativeInfinityBounds2D", "g", "negativeInfinityBounds3D", "h", "negativeInfinityBounds4D", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6441b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6456m f60822a = C6461r.a(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    private static final C6457n f60823b = C6461r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    private static final C6458o f60824c = C6461r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    private static final C6459p f60825d = C6461r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    private static final C6456m f60826e = C6461r.a(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    private static final C6457n f60827f = C6461r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    private static final C6458o f60828g = C6461r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    private static final C6459p f60829h = C6461r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C6439a<Float, C6456m> a(float f10, float f11) {
        return new C6439a<>(Float.valueOf(f10), q0.i(FloatCompanionObject.f143729a), Float.valueOf(f11), null, 8, null);
    }

    public static /* synthetic */ C6439a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}

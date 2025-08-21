package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lc0/q;", "V", "Lc0/r0;", "", "playTimeMillis", "start", "end", "startVelocity", "g", "(Lc0/r0;JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "Lc0/u0;", "playTime", "e", "(Lc0/u0;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lc0/s;", "f", "(Lc0/q;FF)Lc0/s;", "", "a", "[I", "EmptyIntArray", "", "b", "[F", "EmptyFloatArray", "Lc0/u;", "c", "Lc0/u;", "EmptyArcSpline", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f61050a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f61051b = new float[0];

    /* renamed from: c, reason: collision with root package name */
    private static final C6464u f61052c = new C6464u(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"c0/s0$a", "Lc0/s;", "", "index", "Lc0/J;", "a", "(I)Lc0/J;", "", "[Lc0/J;", "anims", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC6462s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C6423J[] anims;

        @Override // kotlin.InterfaceC6462s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6423J get(int index) {
            return this.anims[index];
        }

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(AbstractC6460q abstractC6460q, float f10, float f11) {
            int size = abstractC6460q.getSize();
            C6423J[] c6423jArr = new C6423J[size];
            for (int i10 = 0; i10 < size; i10++) {
                c6423jArr[i10] = new C6423J(f10, f11, abstractC6460q.a(i10));
            }
            this.anims = c6423jArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"c0/s0$b", "Lc0/s;", "", "index", "Lc0/J;", "a", "(I)Lc0/J;", "Lc0/J;", "anim", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC6462s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C6423J anim;

        @Override // kotlin.InterfaceC6462s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6423J get(int index) {
            return this.anim;
        }

        b(float f10, float f11) {
            this.anim = new C6423J(f10, f11, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AbstractC6460q> InterfaceC6462s f(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final long e(u0<?> u0Var, long j10) {
        long delayMillis = j10 - u0Var.getDelayMillis();
        long jC = u0Var.getDurationMillis();
        if (delayMillis < 0) {
            delayMillis = 0;
        }
        if (delayMillis > jC) {
            return jC;
        }
        return delayMillis;
    }

    public static final <V extends AbstractC6460q> V g(r0<V> r0Var, long j10, V v10, V v11, V v12) {
        return (V) r0Var.d(j10 * 1000000, v10, v11, v12);
    }
}

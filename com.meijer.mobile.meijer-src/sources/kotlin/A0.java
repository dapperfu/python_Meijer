package kotlin;

import Z.AbstractC5617o;
import Z.AbstractC5619q;
import kotlin.AbstractC6460q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b/\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0018\u00109\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0018\u0010:\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0018\u0010;\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0018\u0010=\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Lc0/A0;", "Lc0/q;", "V", "Lc0/u0;", "LZ/o;", "timestamps", "LZ/q;", "Lc0/z0;", "keyframes", "", "durationMillis", "delayMillis", "Lc0/C;", "defaultEasing", "Lc0/t;", "initialArcMode", "<init>", "(LZ/o;LZ/q;IILc0/C;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialValue", "targetValue", "initialVelocity", "", "k", "(Lc0/q;Lc0/q;Lc0/q;)V", "timeMillis", "", "i", "(I)F", "index", "", "asFraction", "j", "(IIZ)F", "h", "(I)I", "", "playTimeNanos", "d", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "f", "a", "LZ/o;", "b", "LZ/q;", "c", "I", "()I", "e", "Lc0/C;", "", "g", "[I", "modes", "", "[F", "times", "Lc0/q;", "valueVector", "velocityVector", "lastInitialValue", "l", "lastTargetValue", "m", "posArray", "n", "slopeArray", "Lc0/u;", "o", "Lc0/u;", "arcSpline", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class A0<V extends AbstractC6460q> implements u0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5617o timestamps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5619q<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6416C defaultEasing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int initialArcMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int[] modes;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float[] times;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lastInitialValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V lastTargetValue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float[] posArray;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] slopeArray;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private C6464u arcSpline;

    public /* synthetic */ A0(AbstractC5617o abstractC5617o, AbstractC5619q abstractC5619q, int i10, int i11, InterfaceC6416C interfaceC6416C, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5617o, abstractC5619q, i10, i11, interfaceC6416C, i12);
    }

    private A0(AbstractC5617o abstractC5617o, AbstractC5619q<VectorizedKeyframeSpecElementInfo<V>> abstractC5619q, int i10, int i11, InterfaceC6416C interfaceC6416C, int i12) {
        this.timestamps = abstractC5617o;
        this.keyframes = abstractC5619q;
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.defaultEasing = interfaceC6416C;
        this.initialArcMode = i12;
        this.modes = s0.f61050a;
        this.times = s0.f61051b;
        this.posArray = s0.f61051b;
        this.slopeArray = s0.f61051b;
        this.arcSpline = s0.f61052c;
    }

    private final int h(int timeMillis) {
        int iB = AbstractC5617o.b(this.timestamps, timeMillis, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float j(int index, int timeMillis, boolean asFraction) {
        InterfaceC6416C easing;
        float f10;
        AbstractC5617o abstractC5617o = this.timestamps;
        if (index >= abstractC5617o._size - 1) {
            f10 = timeMillis;
        } else {
            int iE = abstractC5617o.e(index);
            int iE2 = this.timestamps.e(index + 1);
            if (timeMillis == iE) {
                f10 = iE;
            } else {
                int i10 = iE2 - iE;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(iE);
                if (vectorizedKeyframeSpecElementInfoB == null || (easing = vectorizedKeyframeSpecElementInfoB.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f11 = i10;
                float fA = easing.a((timeMillis - iE) / f11);
                if (asFraction) {
                    return fA;
                }
                f10 = (f11 * fA) + iE;
            }
        }
        return f10 / 1000;
    }

    private final void k(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        boolean z10 = this.arcSpline != s0.f61052c;
        if (this.valueVector == null) {
            this.valueVector = (V) C6461r.g(initialValue);
            this.velocityVector = (V) C6461r.g(initialVelocity);
            int i10 = this.timestamps._size;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.timestamps.e(i11) / 1000;
            }
            this.times = fArr2;
            int i12 = this.timestamps._size;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(this.timestamps.e(i13));
                int arcMode = vectorizedKeyframeSpecElementInfoB != null ? vectorizedKeyframeSpecElementInfoB.getArcMode() : this.initialArcMode;
                if (!C6463t.c(arcMode, C6463t.INSTANCE.a())) {
                    z10 = true;
                }
                iArr[i13] = arcMode;
            }
            this.modes = iArr;
        }
        if (z10) {
            if (this.arcSpline != s0.f61052c && Intrinsics.e(this.lastInitialValue, initialValue) && Intrinsics.e(this.lastTargetValue, targetValue)) {
                return;
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i14 = this.timestamps._size;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iE = this.timestamps.e(i15);
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB2 = this.keyframes.b(iE);
                if (iE == 0 && vectorizedKeyframeSpecElementInfoB2 == null) {
                    fArr = new float[size];
                    for (int i16 = 0; i16 < size; i16++) {
                        fArr[i16] = initialValue.a(i16);
                    }
                } else if (iE == getDurationMillis() && vectorizedKeyframeSpecElementInfoB2 == null) {
                    fArr = new float[size];
                    for (int i17 = 0; i17 < size; i17++) {
                        fArr[i17] = targetValue.a(i17);
                    }
                } else {
                    Intrinsics.g(vectorizedKeyframeSpecElementInfoB2);
                    AbstractC6460q abstractC6460qC = vectorizedKeyframeSpecElementInfoB2.c();
                    float[] fArr4 = new float[size];
                    for (int i18 = 0; i18 < size; i18++) {
                        fArr4[i18] = abstractC6460qC.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.arcSpline = new C6464u(this.modes, this.times, fArr3);
        }
    }

    @Override // kotlin.u0
    /* renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // kotlin.u0
    /* renamed from: e, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    private final float i(int timeMillis) {
        return j(h(timeMillis), timeMillis, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [c0.q] */
    /* JADX WARN: Type inference failed for: r2v9, types: [c0.q] */
    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        ?? C10;
        ?? C11;
        int iE = (int) s0.e(this, playTimeNanos / 1000000);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB = this.keyframes.b(iE);
        if (vectorizedKeyframeSpecElementInfoB != null) {
            return (V) vectorizedKeyframeSpecElementInfoB.c();
        }
        if (iE >= getDurationMillis()) {
            return targetValue;
        }
        if (iE <= 0) {
            return initialValue;
        }
        k(initialValue, targetValue, initialVelocity);
        V v10 = this.valueVector;
        Intrinsics.g(v10);
        int i10 = 0;
        if (this.arcSpline != s0.f61052c) {
            float fI = i(iE);
            float[] fArr = this.posArray;
            this.arcSpline.a(fI, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v10.e(i10, fArr[i10]);
                i10++;
            }
            return v10;
        }
        int iH = h(iE);
        float fJ = j(iH, iE, true);
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB2 = this.keyframes.b(this.timestamps.e(iH));
        if (vectorizedKeyframeSpecElementInfoB2 != null && (C11 = vectorizedKeyframeSpecElementInfoB2.c()) != 0) {
            initialValue = C11;
        }
        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoB3 = this.keyframes.b(this.timestamps.e(iH + 1));
        if (vectorizedKeyframeSpecElementInfoB3 != null && (C10 = vectorizedKeyframeSpecElementInfoB3.c()) != 0) {
            targetValue = C10;
        }
        int size = v10.getSize();
        while (i10 < size) {
            v10.e(i10, (initialValue.a(i10) * (1 - fJ)) + (targetValue.a(i10) * fJ));
            i10++;
        }
        return v10;
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long jE = s0.e(this, playTimeNanos / 1000000);
        if (jE < 0) {
            return initialVelocity;
        }
        k(initialValue, targetValue, initialVelocity);
        V v10 = this.velocityVector;
        Intrinsics.g(v10);
        int i10 = 0;
        if (this.arcSpline != s0.f61052c) {
            float fI = i((int) jE);
            float[] fArr = this.slopeArray;
            this.arcSpline.b(fI, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v10.e(i10, fArr[i10]);
                i10++;
            }
        } else {
            AbstractC6460q abstractC6460qG = s0.g(this, jE - 1, initialValue, targetValue, initialVelocity);
            AbstractC6460q abstractC6460qG2 = s0.g(this, jE, initialValue, targetValue, initialVelocity);
            int size = abstractC6460qG.getSize();
            while (i10 < size) {
                v10.e(i10, (abstractC6460qG.a(i10) - abstractC6460qG2.a(i10)) * 1000.0f);
                i10++;
            }
        }
        return v10;
    }
}

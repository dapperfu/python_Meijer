package h1;

import j1.C14920a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\"\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0016\u0010'\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010!R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u0006/"}, d2 = {"Lh1/c;", "", "", "isDataDifferential", "Lh1/c$a;", "strategy", "<init>", "(ZLh1/c$a;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "e", "()V", "Z", "()Z", "Lh1/c$a;", "I", "minSampleSize", "", "Lh1/a;", "[Lh1/a;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14439c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a strategy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableTimeArray;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lh1/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h1.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f134647a = new a("Lsq2", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f134648b = new a("Impulse", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f134649c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f134650d;

        static {
            a[] aVarArrA = a();
            f134649c = aVarArrA;
            f134650d = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f134647a, f134648b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f134649c.clone();
        }

        private a(String str, int i10) {
        }
    }

    public C14439c(boolean z10, a aVar) {
        this.isDataDifferential = z10;
        this.strategy = aVar;
        if (z10 && aVar.equals(a.f134647a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.minSampleSize = i11;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public final float d(float maximumVelocity) {
        if (!(maximumVelocity > 0.0f)) {
            C14920a.b("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? RangesKt.j(fC, maximumVelocity) : RangesKt.e(fC, -maximumVelocity);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h1.c$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f134648b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f134647a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return C14441e.i(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i10 = (this.index + 1) % 20;
        this.index = i10;
        C14441e.j(this.samples, i10, timeMillis, dataPoint);
    }

    public final float c() {
        float f10;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i10 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i10];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i11 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i10];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == a.f134647a || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = dataPointAtTime3.getDataPoint();
            fArr2[i11] = -time;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i11 < this.minSampleSize) {
            return 0.0f;
        }
        int i12 = b.$EnumSwitchMapping$0[this.strategy.ordinal()];
        if (i12 == 1) {
            f10 = C14441e.f(fArr, fArr2, i11, this.isDataDifferential);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = b(fArr, fArr2, i11);
        }
        return f10 * 1000;
    }

    public final void e() {
        ArraysKt.F(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public /* synthetic */ C14439c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.f134647a : aVar);
    }

    public C14439c(boolean z10) {
        this(z10, a.f134648b);
    }
}

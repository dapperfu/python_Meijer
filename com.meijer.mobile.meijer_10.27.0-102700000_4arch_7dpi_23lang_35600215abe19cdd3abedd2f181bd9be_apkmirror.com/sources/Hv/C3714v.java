package Hv;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"LHv/v;", "", "LFv/f;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(LFv/f;Lkotlin/jvm/functions/Function2;)V", "elementsCount", "", "e", "(I)[J", "index", "", "b", "(I)V", "c", "()I", "a", "d", "LFv/f;", "Lkotlin/jvm/functions/Function2;", "", "J", "lowerMarks", "[J", "highMarksArray", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Hv.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3714v {

    /* renamed from: e, reason: collision with root package name */
    private static final a f13374e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f13375f = new long[0];

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Fv.f descriptor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<Fv.f, Integer, Boolean> readIfAbsent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long lowerMarks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long[] highMarksArray;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LHv/v$a;", "", "<init>", "()V", "", "EMPTY_HIGH_MARKS", "[J", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Hv.v$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3714v(Fv.f descriptor, Function2<? super Fv.f, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = f13375f;
        } else {
            this.lowerMarks = 0L;
            this.highMarksArray = e(elementsCount);
        }
    }

    private final void b(int index) {
        int i10 = (index >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i10] = jArr[i10] | (1 << (index & 63));
    }

    private final int c() {
        int length = this.highMarksArray.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.highMarksArray[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i13)).booleanValue()) {
                    this.highMarksArray[i10] = j10;
                    return i13;
                }
            }
            this.highMarksArray[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int elementsCount) {
        long[] jArr = new long[(elementsCount - 1) >>> 6];
        if ((elementsCount & 63) != 0) {
            jArr[ArraysKt.l0(jArr)] = (-1) << elementsCount;
        }
        return jArr;
    }

    public final void a(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            b(index);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j10 = this.lowerMarks;
            if (j10 == -1) {
                if (elementsCount > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.lowerMarks |= 1 << iNumberOfTrailingZeros;
        } while (!this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}

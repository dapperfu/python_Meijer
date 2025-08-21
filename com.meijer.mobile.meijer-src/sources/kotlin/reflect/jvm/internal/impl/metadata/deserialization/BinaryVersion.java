package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class BinaryVersion {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f146398f = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f146399a;

    /* renamed from: b, reason: collision with root package name */
    private final int f146400b;

    /* renamed from: c, reason: collision with root package name */
    private final int f146401c;

    /* renamed from: d, reason: collision with root package name */
    private final int f146402d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Integer> f146403e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(int... numbers) {
        List<Integer> listM;
        Intrinsics.j(numbers, "numbers");
        this.f146399a = numbers;
        Integer numN0 = ArraysKt.n0(numbers, 0);
        this.f146400b = numN0 != null ? numN0.intValue() : -1;
        Integer numN02 = ArraysKt.n0(numbers, 1);
        this.f146401c = numN02 != null ? numN02.intValue() : -1;
        Integer numN03 = ArraysKt.n0(numbers, 2);
        this.f146402d = numN03 != null ? numN03.intValue() : -1;
        if (numbers.length <= 3) {
            listM = CollectionsKt.m();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listM = CollectionsKt.j1(ArraysKt.f(numbers).subList(3, numbers.length));
        }
        this.f146403e = listM;
    }

    public final int a() {
        return this.f146400b;
    }

    public final int b() {
        return this.f146401c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f146400b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f146401c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f146402d >= i12;
    }

    public final boolean d(BinaryVersion version) {
        Intrinsics.j(version, "version");
        return c(version.f146400b, version.f146401c, version.f146402d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f146400b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f146401c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f146402d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !Intrinsics.e(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f146400b == binaryVersion.f146400b && this.f146401c == binaryVersion.f146401c && this.f146402d == binaryVersion.f146402d && Intrinsics.e(this.f146403e, binaryVersion.f146403e);
    }

    protected final boolean f(BinaryVersion ourVersion) {
        Intrinsics.j(ourVersion, "ourVersion");
        int i10 = this.f146400b;
        return i10 == 0 ? ourVersion.f146400b == 0 && this.f146401c == ourVersion.f146401c : i10 == ourVersion.f146400b && this.f146401c <= ourVersion.f146401c;
    }

    public final int[] g() {
        return this.f146399a;
    }

    public int hashCode() {
        int i10 = this.f146400b;
        int i11 = i10 + (i10 * 31) + this.f146401c;
        int i12 = i11 + (i11 * 31) + this.f146402d;
        return i12 + (i12 * 31) + this.f146403e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        if (arrayList.isEmpty()) {
            return zzbz.UNKNOWN_CONTENT_TYPE;
        }
        return CollectionsKt.B0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}

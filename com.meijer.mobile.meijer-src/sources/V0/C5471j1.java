package V0;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"LV0/j1;", "LV0/z1;", "", "LV0/q0;", "colors", "", "stops", "LU0/f;", "start", "end", "LV0/I1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "LU0/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/util/List;", "f", "g", "J", "h", "i", "I", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: V0.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5471j1 extends z1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<C5489q0> colors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Float> stops;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long start;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long end;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int tileMode;

    public /* synthetic */ C5471j1(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5471j1)) {
            return false;
        }
        C5471j1 c5471j1 = (C5471j1) other;
        return Intrinsics.e(this.colors, c5471j1.colors) && Intrinsics.e(this.stops, c5471j1.stops) && U0.f.j(this.start, c5471j1.start) && U0.f.j(this.end, c5471j1.end) && I1.f(this.tileMode, c5471j1.tileMode);
    }

    private C5471j1(List<C5489q0> list, List<Float> list2, long j10, long j11, int i10) {
        this.colors = list;
        this.stops = list2;
        this.start = j10;
        this.end = j11;
        this.tileMode = i10;
    }

    @Override // V0.z1
    public Shader b(long size) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.start >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.start & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.start & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.end >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.end & 4294967295L)) == Float.POSITIVE_INFINITY ? size & 4294967295L : this.end & 4294967295L));
        return A1.a(U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)), this.colors, this.stops, this.tileMode);
    }

    public int hashCode() {
        int iHashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + U0.f.o(this.start)) * 31) + U0.f.o(this.end)) * 31) + I1.g(this.tileMode);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.start & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) U0.f.s(this.start)) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.end & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) U0.f.s(this.end)) + ", ";
        }
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) I1.h(this.tileMode)) + ')';
    }
}

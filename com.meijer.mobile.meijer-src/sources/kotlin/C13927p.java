package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001c\u0010\t\u001a\u00020\u0005*\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0019\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf0/p;", "T", "", "<init>", "()V", "", "d", "", "position", "a", "(Ljava/lang/Object;F)V", "", "c", "()[F", "", "b", "()Ljava/util/List;", "", "Ljava/util/List;", "getKeys$foundation_release", "keys", "[F", "getPositions$foundation_release", "setPositions$foundation_release", "([F)V", "positions", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13927p<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> keys = new ArrayList();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float[] positions;

    private final void d() {
        float[] fArrCopyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        Intrinsics.i(fArrCopyOf, "copyOf(...)");
        this.positions = fArrCopyOf;
    }

    public final void a(T t10, float f10) {
        this.keys.add(t10);
        if (this.positions.length < this.keys.size()) {
            d();
        }
        this.positions[this.keys.size() - 1] = f10;
    }

    public final List<T> b() {
        return this.keys;
    }

    public final float[] c() {
        return ArraysKt.v(this.positions, 0, this.keys.size());
    }

    public C13927p() {
        float[] fArr = new float[5];
        for (int i10 = 0; i10 < 5; i10++) {
            fArr[i10] = Float.NaN;
        }
        this.positions = fArr;
    }
}

package Uv;

import com.google.android.gms.common.api.a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, d2 = {"LUv/y;", "", "<init>", "()V", "", PreferencesHelper.PREF_ID, "value", "h", "(II)LUv/y;", "", "f", "(I)Z", "a", "(I)I", "i", "()I", "d", "defaultValue", "e", "other", "", "g", "(LUv/y;)V", "I", "set", "", "b", "[I", "values", "headerTableSize", "c", "initialWindowSize", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int set;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] values = new int[10];

    public final boolean f(int id2) {
        return ((1 << id2) & this.set) != 0;
    }

    public final int a(int id2) {
        return this.values[id2];
    }

    public final int b() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return 65535;
    }

    public final int d() {
        return (this.set & 8) != 0 ? this.values[3] : a.e.API_PRIORITY_OTHER;
    }

    public final int e(int defaultValue) {
        return (this.set & 32) != 0 ? this.values[5] : defaultValue;
    }

    public final void g(y other) {
        Intrinsics.j(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.f(i10)) {
                h(i10, other.a(i10));
            }
        }
    }

    public final y h(int id2, int value) {
        if (id2 >= 0) {
            int[] iArr = this.values;
            if (id2 < iArr.length) {
                this.set = (1 << id2) | this.set;
                iArr[id2] = value;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.set);
    }
}

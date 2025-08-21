package B2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.S;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LB2/k;", "T", "", "<init>", "()V", "LB2/H;", "newState", "c", "(LB2/H;)LB2/H;", "Lpv/B;", "a", "Lpv/B;", "getCachedValue$annotations", "cachedValue", "()LB2/H;", "currentState", "Lpv/f;", "b", "()Lpv/f;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2914k<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<H<T>> cachedValue;

    public final H<T> a() {
        return this.cachedValue.getValue();
    }

    public final InterfaceC16561f<H<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B2.H<T> c(B2.H<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            pv.B<B2.H<T>> r0 = r5.cachedValue
        L7:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            B2.H r2 = (B2.H) r2
            boolean r3 = r2 instanceof B2.A
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            B2.L r3 = B2.L.f2235b
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof B2.C2908e
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            int r4 = r2.getVersion()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof B2.q
            if (r3 == 0) goto L38
        L31:
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L7
            return r2
        L38:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2914k.c(B2.H):B2.H");
    }

    public C2914k() {
        L l10 = L.f2235b;
        Intrinsics.h(l10, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = S.a(l10);
    }
}

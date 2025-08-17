package v1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"Lv1/J;", "", "Lv1/o0;", "layout", "<init>", "(Lv1/o0;)V", "", "offset", "", "upstream", "cache", "primary", "", "a", "(IZZZ)F", "b", "(I)F", "c", "d", "e", "Lv1/o0;", "getLayout", "()Lv1/o0;", "I", "cachedKey", "F", "cachedValue", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17456J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0 layout;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int cachedKey = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float cachedValue;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1f
            v1.o0 r2 = r5.layout
            android.text.Layout r2 = r2.getLayout()
            int r2 = v1.C17458L.a(r2, r6, r7)
            v1.o0 r3 = r5.layout
            int r3 = r3.v(r2)
            v1.o0 r4 = r5.layout
            int r2 = r4.p(r2)
            if (r6 == r3) goto L21
            if (r6 != r2) goto L1f
            goto L21
        L1f:
            r2 = r1
            goto L22
        L21:
            r2 = r0
        L22:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L2f
            r0 = r1
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.cachedKey
            if (r0 != r3) goto L37
            float r6 = r5.cachedValue
            return r6
        L37:
            if (r9 == 0) goto L40
            v1.o0 r9 = r5.layout
            float r6 = r9.A(r6, r7)
            goto L46
        L40:
            v1.o0 r9 = r5.layout
            float r6 = r9.D(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.cachedKey = r3
            r5.cachedValue = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C17456J.a(int, boolean, boolean, boolean):float");
    }

    public final float b(int offset) {
        return a(offset, false, false, true);
    }

    public final float c(int offset) {
        return a(offset, true, true, true);
    }

    public final float d(int offset) {
        return a(offset, false, false, false);
    }

    public final float e(int offset) {
        return a(offset, true, true, false);
    }

    public C17456J(o0 o0Var) {
        this.layout = o0Var;
    }
}

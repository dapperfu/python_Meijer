package vs;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\n\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnk/b;", "", "sellUnit", "", "filterEaches", "Lbk/a;", "d", "(Lnk/b;Ljava/lang/String;Z)Lbk/a;", "", "discountUnit", "c", "(DLjava/lang/String;Ljava/lang/String;Z)Lbk/a;", "products_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17734n {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bk.AbstractC6392a c(double r2, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L10
            boolean r1 = kotlin.text.StringsKt.s0(r5)
            if (r1 != 0) goto La
            goto Lb
        La:
            r5 = r0
        Lb:
            if (r5 != 0) goto Le
            goto L10
        Le:
            r4 = r5
            goto L1a
        L10:
            if (r4 == 0) goto L19
            boolean r5 = kotlin.text.StringsKt.s0(r4)
            if (r5 != 0) goto L19
            goto L1a
        L19:
            r4 = r0
        L1a:
            bk.a$a r5 = bk.AbstractC6392a.INSTANCE
            int r1 = us.C17457C.f164393L
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bk.a r2 = r5.d(r1, r2)
            if (r4 == 0) goto L48
            if (r6 == 0) goto L38
            java.lang.String r3 = "ea"
            r6 = 1
            boolean r3 = kotlin.text.StringsKt.H(r4, r3, r6)
            if (r3 == 0) goto L38
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L48
            int r3 = us.C17457C.f164429z
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r0}
            bk.a r3 = r5.d(r3, r4)
            if (r3 == 0) goto L48
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.C17734n.c(double, java.lang.String, java.lang.String, boolean):bk.a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final bk.AbstractC6392a d(nk.b r3, java.lang.String r4, boolean r5) {
        /*
            r0 = 0
            if (r4 == 0) goto Ld
            boolean r1 = kotlin.text.StringsKt.s0(r4)
            if (r1 != 0) goto La
            goto Lb
        La:
            r4 = r0
        Lb:
            if (r4 != 0) goto L1b
        Ld:
            java.lang.String r4 = r3.getUnit()
            if (r4 == 0) goto L1a
            boolean r1 = kotlin.text.StringsKt.s0(r4)
            if (r1 != 0) goto L1a
            goto L1b
        L1a:
            r4 = r0
        L1b:
            java.lang.String r1 = r3.getPriceText()
            if (r1 == 0) goto L39
            java.lang.String r2 = r3.getFormattedValue()
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r2 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r0
        L2d:
            if (r1 == 0) goto L39
            bk.a$a r2 = bk.AbstractC6392a.INSTANCE
            bk.a r1 = r2.c(r1)
            if (r1 != 0) goto L38
            goto L39
        L38:
            return r1
        L39:
            if (r4 == 0) goto L5b
            if (r5 == 0) goto L47
            java.lang.String r5 = "ea"
            r1 = 1
            boolean r5 = kotlin.text.StringsKt.H(r4, r5, r1)
            if (r5 == 0) goto L47
            goto L48
        L47:
            r0 = r4
        L48:
            if (r0 == 0) goto L5b
            bk.a$a r4 = bk.AbstractC6392a.INSTANCE
            int r5 = us.C17457C.f164429z
            java.lang.String r3 = r3.getFormattedValue()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            bk.a r3 = r4.d(r5, r3)
            return r3
        L5b:
            bk.a$a r4 = bk.AbstractC6392a.INSTANCE
            java.lang.String r3 = r3.getFormattedValue()
            bk.a r3 = r4.c(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.C17734n.d(nk.b, java.lang.String, boolean):bk.a");
    }
}

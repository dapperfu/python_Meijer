package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f122663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedObject f122664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, TrackedObject trackedObject) {
        super(1);
        this.f122663a = eVar;
        this.f122664b = trackedObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            android.view.View r5 = (android.view.View) r5
            java.lang.String r0 = "statusIconView"
            kotlin.jvm.internal.Intrinsics.j(r5, r0)
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e r0 = r4.f122663a
            boolean r5 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e.a(r0, r5)
            if (r5 == 0) goto L7c
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.e r5 = r4.f122663a
            com.scandit.datacapture.barcode.batch.data.TrackedObject r0 = r4.f122664b
            boolean r1 = r5.f122705f
            if (r1 != 0) goto L7c
            r1 = 1
            r5.f122705f = r1
            kotlin.jvm.functions.Function1 r2 = r5.f122708i
            if (r2 == 0) goto L29
            int r0 = r0.getIdentifier()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r0)
        L29:
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h r0 = r5.f122707h
            if (r0 == 0) goto L7c
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r2 = r0.f122734o
            int r2 = r2.ordinal()
            java.lang.String r3 = "onFinished"
            if (r2 == 0) goto L52
            if (r2 == r1) goto L3a
            goto L7a
        L3a:
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.d r1 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.d
            r1.<init>(r5)
            kotlin.jvm.internal.Intrinsics.j(r1, r3)
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r5 = r0.f122734o
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122711b
            if (r5 != r2) goto L4e
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r5 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122710a
            r0.a(r5, r1)
            goto L7a
        L4e:
            r1.invoke()
            goto L7a
        L52:
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.c r1 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.c
            r1.<init>(r5)
            kotlin.jvm.internal.Intrinsics.j(r1, r3)
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r5 = r0.f122734o
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122710a
            if (r5 != r2) goto L77
            android.widget.TextView r5 = r0.f122727h
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r2 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r2)
            boolean r5 = kotlin.text.StringsKt.r0(r5)
            if (r5 != 0) goto L77
            com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a r5 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.a.f122711b
            r0.a(r5, r1)
            goto L7a
        L77:
            r1.invoke()
        L7a:
            kotlin.Unit r5 = kotlin.Unit.f142422a
        L7c:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.b.invoke(java.lang.Object):java.lang.Object");
    }
}

package com.radiusnetworks.flybuy.sdk.sync;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/sync/AnalyticsSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticsSyncWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsSyncWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.j(context, "context");
        Intrinsics.j(workerParams, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.radiusnetworks.flybuy.sdk.sync.a
            if (r0 == 0) goto L13
            r0 = r5
            com.radiusnetworks.flybuy.sdk.sync.a r0 = (com.radiusnetworks.flybuy.sdk.sync.a) r0
            int r1 = r0.f121027c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121027c = r1
            goto L18
        L13:
            com.radiusnetworks.flybuy.sdk.sync.a r0 = new com.radiusnetworks.flybuy.sdk.sync.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f121025a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f121027c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            com.radiusnetworks.flybuy.sdk.sync.c r5 = new com.radiusnetworks.flybuy.sdk.sync.c
            r2 = 0
            r5.<init>(r2)
            r0.f121027c = r3
            java.lang.Object r5 = mv.C15784P.g(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.sync.AnalyticsSyncWorker.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

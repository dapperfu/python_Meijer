package com.scandit.datacapture.core.internal.sdk.common.async;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/async/MainThreadHelper;", "Lcom/scandit/datacapture/core/internal/sdk/common/async/IMainThreadHelper;", "<init>", "()V", "Lkotlin/Function0;", "", "block", "runOnMainThread", "(Lkotlin/jvm/functions/Function0;)V", "", "delay", "postDelayed", "(JLkotlin/jvm/functions/Function0;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class MainThreadHelper implements IMainThreadHelper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f125403a = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.common.async.IMainThreadHelper
    public void postDelayed(long delay, final Function0<Unit> block) {
        Intrinsics.j(block, "block");
        this.f125403a.postDelayed(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.common.async.b
            @Override // java.lang.Runnable
            public final void run() {
                MainThreadHelper.a(block);
            }
        }, delay);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.common.async.IMainThreadHelper
    public void runOnMainThread(final Function0<Unit> block) {
        Intrinsics.j(block, "block");
        if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            this.f125403a.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.common.async.c
                @Override // java.lang.Runnable
                public final void run() {
                    MainThreadHelper.b(block);
                }
            });
        }
    }
}

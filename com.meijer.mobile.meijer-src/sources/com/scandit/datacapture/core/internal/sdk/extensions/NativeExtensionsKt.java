package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeBoolCallable;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "callback", "", "andThen", "(Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;Lcom/scandit/datacapture/core/common/async/Callback;)Lkotlin/Unit;", "Ljava/lang/Runnable;", "(Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;Ljava/lang/Runnable;)Lkotlin/Unit;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class NativeExtensionsKt {
    public static final Unit andThen(NativeWrappedFuture nativeWrappedFuture, final Callback<? super Boolean> callback) {
        Intrinsics.j(nativeWrappedFuture, "<this>");
        if (callback == null) {
            return null;
        }
        nativeWrappedFuture.then(new NativeBoolCallable() { // from class: com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt$asNative$1
            @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeBoolCallable
            public void run(boolean result) {
                callback.run(Boolean.valueOf(result));
            }
        });
        return Unit.f143329a;
    }

    public static final Unit andThen(NativeWrappedFuture nativeWrappedFuture, final Runnable runnable) {
        Intrinsics.j(nativeWrappedFuture, "<this>");
        if (runnable == null) {
            return null;
        }
        nativeWrappedFuture.then(new NativeBoolCallable() { // from class: com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt$asNative$2
            @Override // com.scandit.datacapture.core.internal.sdk.common.async.NativeBoolCallable
            public void run(boolean result) {
                runnable.run();
            }
        });
        return Unit.f143329a;
    }
}

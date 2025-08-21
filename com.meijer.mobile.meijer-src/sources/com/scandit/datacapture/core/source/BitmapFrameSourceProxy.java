package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0003H'J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSourceProxy;", "", "currentState", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "getDesiredState", "_frameSourceImpl", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;", "_switchToDesiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "switchToDesiredState", "", "whenDone", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeFrameDataCollectionFrameSource.class)
/* loaded from: classes12.dex */
public interface BitmapFrameSourceProxy {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void switchToDesiredState(BitmapFrameSourceProxy bitmapFrameSourceProxy, FrameSourceState desiredState, Callback<? super Boolean> callback) {
            Intrinsics.j(desiredState, "desiredState");
            NativeExtensionsKt.andThen(bitmapFrameSourceProxy._switchToDesiredState(desiredState), callback);
        }
    }

    @NativeImpl
    NativeFrameSource _frameSourceImpl();

    @NativeImpl
    NativeFrameDataCollectionFrameSource _impl();

    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState);

    @ProxyFunction(property = "currentState")
    FrameSourceState getCurrentState();

    @ProxyFunction(property = "desiredState")
    FrameSourceState getDesiredState();

    void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone);
}

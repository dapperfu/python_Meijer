package com.scandit.datacapture.core.source;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.SingleBitmapFrameDataCollection;
import com.scandit.datacapture.core.internal.module.source.a0;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeBitmapConfig;
import com.scandit.datacapture.core.internal.sdk.source.NativeBitmapInfo;
import com.scandit.datacapture.core.internal.sdk.source.NativeByteOrder;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource;
import com.scandit.datacapture.core.internal.sdk.source.NativeSingleBitmapFrameDataCollection;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002#$B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010!\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/BitmapFrameSourceProxy;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;", "impl", "Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;", "frames", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;)V", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "()Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataCollectionFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "", "switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;Lcom/scandit/datacapture/core/common/async/Callback;)V", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/source/FrameSourceListener;)V", "removeListener", "Lcom/scandit/datacapture/core/internal/module/source/SingleBitmapFrameDataCollection;", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "Companion", "com/scandit/datacapture/core/source/a", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BitmapFrameSource implements FrameSource, BitmapFrameSourceProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BitmapFrameSourceProxyAdapter f125875a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet f125876b;

    @Keep
    private final SingleBitmapFrameDataCollection frames;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/source/BitmapFrameSource$Companion;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "of", "(Landroid/graphics/Bitmap;)Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "", "json", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/BitmapFrameSource;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BitmapFrameSource fromJson(String json) {
            Intrinsics.j(json, "json");
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(new JsonValue(json).getByKeyAsString("image", ""));
            if (bitmapBitmapFromBase64 == null) {
                return null;
            }
            return of(bitmapBitmapFromBase64);
        }

        @JvmStatic
        public final BitmapFrameSource of(Bitmap bitmap) {
            NativeByteOrder nativeByteOrder;
            Intrinsics.j(bitmap, "bitmap");
            Intrinsics.j(bitmap, "bitmap");
            if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                throw new IllegalArgumentException("Creating BitmapFrameSource is supported only from ARGB_8888 Bitmaps.");
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getWidth() * 4);
            byteBufferAllocate.order(ByteOrder.nativeOrder());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.rewind();
            byte[] bArr = new byte[byteBufferAllocate.remaining()];
            byteBufferAllocate.get(bArr);
            NativeBitmapConfig nativeBitmapConfig = NativeBitmapConfig.ARGB_8888;
            ByteOrder byteOrderNativeOrder = ByteOrder.nativeOrder();
            if (Intrinsics.e(byteOrderNativeOrder, ByteOrder.BIG_ENDIAN)) {
                nativeByteOrder = NativeByteOrder.BIG_ENDIAN;
            } else {
                if (!Intrinsics.e(byteOrderNativeOrder, ByteOrder.LITTLE_ENDIAN)) {
                    throw new IllegalStateException(("Unknown order " + byteOrderNativeOrder).toString());
                }
                nativeByteOrder = NativeByteOrder.LITTLE_ENDIAN;
            }
            NativeSingleBitmapFrameDataCollection nativeSingleBitmapFrameDataCollectionCreate = NativeSingleBitmapFrameDataCollection.create(NativeBitmapInfo.create(nativeBitmapConfig, nativeByteOrder, bArr, bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth() * 4, 0));
            Intrinsics.i(nativeSingleBitmapFrameDataCollectionCreate, "create(...)");
            SingleBitmapFrameDataCollection singleBitmapFrameDataCollection = new SingleBitmapFrameDataCollection(nativeSingleBitmapFrameDataCollectionCreate);
            NativeFrameDataCollectionFrameSource nativeFrameDataCollectionFrameSourceCreate = NativeFrameDataCollectionFrameSource.create(singleBitmapFrameDataCollection.a());
            Intrinsics.g(nativeFrameDataCollectionFrameSourceCreate);
            return new BitmapFrameSource(nativeFrameDataCollectionFrameSourceCreate, singleBitmapFrameDataCollection);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BitmapFrameSource fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    public static final BitmapFrameSource of(Bitmap bitmap) {
        return INSTANCE.of(bitmap);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    /* renamed from: _frameSourceImpl */
    public NativeFrameSource getF125879c() {
        return this.f125875a.getF125879c();
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeFrameDataCollectionFrameSource getF125877a() {
        return this.f125875a.getF125877a();
    }

    @Override // com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    public NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState) {
        Intrinsics.j(desiredState, "desiredState");
        return this.f125875a._switchToDesiredState(desiredState);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    public FrameSourceState getCurrentState() {
        return this.f125875a.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    public FrameSourceState getDesiredState() {
        return this.f125875a.getDesiredState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone) {
        Intrinsics.j(desiredState, "desiredState");
        this.f125875a.switchToDesiredState(desiredState, whenDone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapFrameSource(NativeFrameDataCollectionFrameSource impl, SingleBitmapFrameDataCollection frames) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(frames, "frames");
        this.frames = frames;
        this.f125875a = new BitmapFrameSourceProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f125876b = new CopyOnWriteArraySet();
        impl.addListenerAsync(new a0(new a(this), this));
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f125876b.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f125876b.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }
}

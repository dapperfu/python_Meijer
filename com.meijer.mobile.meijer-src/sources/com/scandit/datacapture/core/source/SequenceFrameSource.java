package com.scandit.datacapture.core.source;

import android.media.Image;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.module.source.BufferStack;
import com.scandit.datacapture.core.internal.module.source.M;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.a0;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.extensions.ImageExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataGeneratorFrameSource;
import com.scandit.datacapture.core.source.SequenceFrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0003123B?\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J%\u0010(\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)J\u0015\u0010(\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,R\u0014\u0010/\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010\u0017\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00064"}, d2 = {"Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSource;", "Lcom/scandit/datacapture/core/source/SequenceFrameSourceProxy;", "Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataGeneratorFrameSource;", "impl", "Lcom/scandit/datacapture/core/source/CameraPosition;", "captureDevicePosition", "", "captureDeviceOrientation", "Lcom/scandit/datacapture/core/internal/module/source/BufferStack;", "buffers", "Lkotlin/Function1;", "", "", "bufferProcessingFinished", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataGeneratorFrameSource;Lcom/scandit/datacapture/core/source/CameraPosition;ILcom/scandit/datacapture/core/internal/module/source/BufferStack;Lkotlin/jvm/functions/Function1;)V", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_frameSourceImpl", "()Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/source/NativeFrameDataGeneratorFrameSource;", "Lcom/scandit/datacapture/core/source/FrameSourceState;", "desiredState", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "Lcom/scandit/datacapture/core/common/async/Callback;", "", "whenDone", "switchToDesiredState", "(Lcom/scandit/datacapture/core/source/FrameSourceState;Lcom/scandit/datacapture/core/common/async/Callback;)V", "Lcom/scandit/datacapture/core/source/FrameSourceListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/source/FrameSourceListener;)V", "removeListener", "width", "height", "buffer", "addFrame", "(II[B)V", "Landroid/media/Image;", "frame", "(Landroid/media/Image;)V", "getCurrentState", "()Lcom/scandit/datacapture/core/source/FrameSourceState;", "currentState", "getDesiredState", "Companion", "com/scandit/datacapture/core/source/f", "com/scandit/datacapture/core/source/g", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SequenceFrameSource implements FrameSource, SequenceFrameSourceProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CameraPosition f126848a;

    /* renamed from: b, reason: collision with root package name */
    private final int f126849b;

    /* renamed from: c, reason: collision with root package name */
    private final BufferStack f126850c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f126851d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ SequenceFrameSourceProxyAdapter f126852e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashMap f126853f;

    /* renamed from: g, reason: collision with root package name */
    private final g f126854g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f126855h;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0005\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/source/SequenceFrameSource$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraPosition;", "cameraPosition", "Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "create", "(Lcom/scandit/datacapture/core/source/CameraPosition;)Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "", "captureDeviceOrientation", "Lcom/scandit/datacapture/core/source/SequenceFrameSourceProcessListener;", "sequenceFrameSourceProcess", "(Lcom/scandit/datacapture/core/source/CameraPosition;ILcom/scandit/datacapture/core/source/SequenceFrameSourceProcessListener;)Lcom/scandit/datacapture/core/source/SequenceFrameSource;", "BUFFER_STACK_SIZE", "I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(byte[] it) {
            Intrinsics.j(it, "it");
        }

        @JvmStatic
        public final SequenceFrameSource create(CameraPosition cameraPosition) {
            Intrinsics.j(cameraPosition, "cameraPosition");
            return create(cameraPosition, 90, new SequenceFrameSourceProcessListener() { // from class: com.scandit.datacapture.core.source.h
                @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProcessListener
                public final void processingFinished(byte[] bArr) {
                    SequenceFrameSource.Companion.a(bArr);
                }
            });
        }

        @JvmStatic
        public final SequenceFrameSource create(CameraPosition cameraPosition, int captureDeviceOrientation, SequenceFrameSourceProcessListener sequenceFrameSourceProcess) {
            Intrinsics.j(cameraPosition, "cameraPosition");
            Intrinsics.j(sequenceFrameSourceProcess, "sequenceFrameSourceProcess");
            NativeFrameDataGeneratorFrameSource nativeFrameDataGeneratorFrameSourceCreate = NativeFrameDataGeneratorFrameSource.create();
            Intrinsics.i(nativeFrameDataGeneratorFrameSourceCreate, "create(...)");
            return new SequenceFrameSource(nativeFrameDataGeneratorFrameSourceCreate, cameraPosition, captureDeviceOrientation, null, new e(sequenceFrameSourceProcess), 8, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SequenceFrameSource(NativeFrameDataGeneratorFrameSource impl, CameraPosition captureDevicePosition, int i10, BufferStack buffers, Function1<? super byte[], Unit> bufferProcessingFinished) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(captureDevicePosition, "captureDevicePosition");
        Intrinsics.j(buffers, "buffers");
        Intrinsics.j(bufferProcessingFinished, "bufferProcessingFinished");
        this.f126848a = captureDevicePosition;
        this.f126849b = i10;
        this.f126850c = buffers;
        this.f126851d = bufferProcessingFinished;
        this.f126852e = new SequenceFrameSourceProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.f126853f = new LinkedHashMap();
        this.f126854g = new g(this);
        this.f126855h = new CopyOnWriteArraySet();
        impl.addListenerAsync(new a0(new f(this), this));
    }

    @JvmStatic
    public static final SequenceFrameSource create(CameraPosition cameraPosition) {
        return INSTANCE.create(cameraPosition);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @NativeImpl
    public NativeFrameSource _frameSourceImpl() {
        return this.f126852e.getF126858c();
    }

    @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeFrameDataGeneratorFrameSource getF126856a() {
        return this.f126852e.getF126856a();
    }

    @Override // com.scandit.datacapture.core.source.SequenceFrameSourceProxy
    @ProxyFunction(nativeName = "switchToDesiredStateAsyncAndroid")
    public NativeWrappedFuture _switchToDesiredState(FrameSourceState desiredState) {
        Intrinsics.j(desiredState, "desiredState");
        return this.f126852e._switchToDesiredState(desiredState);
    }

    public final void addFrame(int width, int height, byte[] buffer) {
        Intrinsics.j(buffer, "buffer");
        if (buffer.length != ((width * height) * 12) / 8) {
            throw new AssertionError("Invalid image format: only NV21 format allowed");
        }
        NativeCameraFrameData nativeCameraFrameDataCreate = NativeCameraFrameData.create(width, height, buffer, this.f126854g, this.f126849b, this.f126848a == CameraPosition.USER_FACING ? NativeAxis.X : NativeAxis.NONE, NativeCameraCaptureParameters.create(), null);
        Intrinsics.i(nativeCameraFrameDataCreate, "create(...)");
        LinkedHashMap linkedHashMap = this.f126853f;
        NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataCreate.asFrameData();
        Intrinsics.i(nativeFrameDataAsFrameData, "asFrameData(...)");
        linkedHashMap.put(nativeCameraFrameDataCreate, nativeFrameDataAsFrameData);
        getF126856a().addFrame((NativeFrameData) this.f126853f.get(nativeCameraFrameDataCreate));
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "currentState")
    public FrameSourceState getCurrentState() {
        return this.f126852e.getCurrentState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    @ProxyFunction(property = "desiredState")
    public FrameSourceState getDesiredState() {
        return this.f126852e.getDesiredState();
    }

    @Override // com.scandit.datacapture.core.source.FrameSource, com.scandit.datacapture.core.source.BitmapFrameSourceProxy
    public void switchToDesiredState(FrameSourceState desiredState, Callback<? super Boolean> whenDone) {
        Intrinsics.j(desiredState, "desiredState");
        this.f126852e.switchToDesiredState(desiredState, whenDone);
    }

    public static final void access$returnToPool(SequenceFrameSource sequenceFrameSource, NativeCameraFrameData nativeCameraFrameData) {
        sequenceFrameSource.f126853f.remove(nativeCameraFrameData);
        byte[] bArrTakeBuffer = nativeCameraFrameData.takeBuffer();
        if (bArrTakeBuffer != null) {
            sequenceFrameSource.f126851d.invoke(bArrTakeBuffer);
            sequenceFrameSource.f126850c.a(bArrTakeBuffer);
        }
    }

    @JvmStatic
    public static final SequenceFrameSource create(CameraPosition cameraPosition, int i10, SequenceFrameSourceProcessListener sequenceFrameSourceProcessListener) {
        return INSTANCE.create(cameraPosition, i10, sequenceFrameSourceProcessListener);
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void addListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f126855h.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @Override // com.scandit.datacapture.core.source.FrameSource
    public void removeListener(FrameSourceListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f126855h.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void addFrame(Image frame) {
        Intrinsics.j(frame, "frame");
        if (frame.getFormat() == 35) {
            NativeCameraFrameData nativeCameraFrameDataConvertToFrameData$default = ImageExtensionsKt.convertToFrameData$default(frame, this.f126850c, this.f126854g, this.f126849b, this.f126848a == CameraPosition.USER_FACING, false, null, 32, null);
            if (nativeCameraFrameDataConvertToFrameData$default != null) {
                LinkedHashMap linkedHashMap = this.f126853f;
                NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataConvertToFrameData$default.asFrameData();
                Intrinsics.i(nativeFrameDataAsFrameData, "asFrameData(...)");
                linkedHashMap.put(nativeCameraFrameDataConvertToFrameData$default, nativeFrameDataAsFrameData);
                getF126856a().addFrame((NativeFrameData) this.f126853f.get(nativeCameraFrameDataConvertToFrameData$default));
                return;
            }
            return;
        }
        throw new AssertionError("Invalid image format: only YUV_420_888 format allowed");
    }

    public /* synthetic */ SequenceFrameSource(NativeFrameDataGeneratorFrameSource nativeFrameDataGeneratorFrameSource, CameraPosition cameraPosition, int i10, BufferStack bufferStack, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeFrameDataGeneratorFrameSource, cameraPosition, i10, (i11 & 8) != 0 ? new M() : bufferStack, function1);
    }
}

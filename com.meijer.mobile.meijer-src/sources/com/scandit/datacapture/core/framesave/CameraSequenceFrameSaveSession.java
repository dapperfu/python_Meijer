package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.framesave.SingleFrameRecorder;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\tJ\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "addToContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "removeFromContext", "start", "()V", "stop", "Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSessionListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSessionListener;)V", "removeListener", "onFrameSaveSuccess", "onFrameSaveFinished", "Ljava/util/concurrent/CopyOnWriteArraySet;", "d", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/b", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CameraSequenceFrameSaveSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final File f125112a;

    /* renamed from: b, reason: collision with root package name */
    private SingleFrameRecorder f125113b;

    /* renamed from: c, reason: collision with root package name */
    private final b f125114c = new b(this);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    private boolean f125116e;

    /* renamed from: f, reason: collision with root package name */
    private int f125117f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f125118g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession$Companion;", "", "Ljava/io/File;", "localPath", "Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession;", "create", "(Ljava/io/File;)Lcom/scandit/datacapture/core/framesave/CameraSequenceFrameSaveSession;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSequenceFrameSaveSession create(File localPath) {
            Intrinsics.j(localPath, "localPath");
            return new CameraSequenceFrameSaveSession(localPath, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final CameraSequenceFrameSaveSession create(File file) {
        return INSTANCE.create(file);
    }

    public final void stop() {
        this.f125116e = false;
        this.f125118g = true;
    }

    public final void addListener(CameraSequenceFrameSaveSessionListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.add(listener)) {
            listener.onObservationStarted();
        }
    }

    public final void addToContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        dataCaptureContext.addFrameListener(this.f125114c);
    }

    public final CopyOnWriteArraySet<CameraSequenceFrameSaveSessionListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    public final void onFrameSaveFinished() {
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((CameraSequenceFrameSaveSessionListener) it.next()).onFrameSave(this.f125117f, true);
        }
    }

    public final void onFrameSaveSuccess() {
        this.f125117f++;
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((CameraSequenceFrameSaveSessionListener) it.next()).onFrameSave(this.f125117f, false);
        }
    }

    public final void removeFromContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        dataCaptureContext.removeFrameListener(this.f125114c);
    }

    public final void removeListener(CameraSequenceFrameSaveSessionListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped();
        }
    }

    public final void start() {
        File nextFrameSequenceDirectoryName = FileExtensionsKt.getNextFrameSequenceDirectoryName(this.f125112a);
        nextFrameSequenceDirectoryName.mkdir();
        SingleFrameRecorder.Companion companion = SingleFrameRecorder.INSTANCE;
        String absolutePath = nextFrameSequenceDirectoryName.getAbsolutePath();
        Intrinsics.i(absolutePath, "getAbsolutePath(...)");
        this.f125113b = companion.create(absolutePath);
        this.f125117f = 0;
        this.f125118g = false;
        this.f125116e = true;
    }

    public CameraSequenceFrameSaveSession(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this.f125112a = file;
    }
}

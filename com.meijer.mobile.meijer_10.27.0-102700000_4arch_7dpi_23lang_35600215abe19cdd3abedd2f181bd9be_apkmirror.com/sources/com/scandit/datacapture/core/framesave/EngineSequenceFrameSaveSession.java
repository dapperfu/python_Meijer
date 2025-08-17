package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveConfiguration;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveSession;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\"#J\u0010\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_getFrameSaveSession", "()Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "frameSaveSession", "", "_setFrameSaveSession", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSession;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "addToContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "removeFromContext", "start", "()V", "stop", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;)V", "removeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/c", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EngineSequenceFrameSaveSession implements FrameSaveSession, SequenceFrameSaveSessionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SequenceFrameSaveSessionProxyAdapter f124167a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion;", "", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "create", "()Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "builder", "()Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "Builder", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/framesave/FileFormat;", "format", "fileFormat", "(Lcom/scandit/datacapture/core/framesave/FileFormat;)Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "Ljava/io/File;", "directory", "saveToLocalDirectory", "(Ljava/io/File;)Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession$Companion$Builder;", "Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "build", "()Lcom/scandit/datacapture/core/framesave/EngineSequenceFrameSaveSession;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        @SourceDebugExtension
        public static final class Builder {

            /* renamed from: b, reason: collision with root package name */
            private File f124170b;

            /* renamed from: a, reason: collision with root package name */
            private FileFormat f124169a = FileFormat.SC_RAW;

            /* renamed from: c, reason: collision with root package name */
            private final String f124171c = "";

            public final EngineSequenceFrameSaveSession build() {
                NativeSequenceFrameSaveConfiguration nativeSequenceFrameSaveConfigurationForRemoteStorage;
                String absolutePath = AppAndroidEnvironment.INSTANCE.getApplicationContext().getCacheDir().getAbsolutePath();
                File file = this.f124170b;
                if (file == null || (nativeSequenceFrameSaveConfigurationForRemoteStorage = NativeSequenceFrameSaveConfiguration.forLocalStorage(absolutePath, file.getAbsolutePath(), this.f124169a, this.f124171c)) == null) {
                    nativeSequenceFrameSaveConfigurationForRemoteStorage = NativeSequenceFrameSaveConfiguration.forRemoteStorage(absolutePath, this.f124169a, this.f124171c);
                }
                NativeSequenceFrameSaveSession nativeSequenceFrameSaveSessionCreate = NativeSequenceFrameSaveSession.create(nativeSequenceFrameSaveConfigurationForRemoteStorage);
                Intrinsics.g(nativeSequenceFrameSaveSessionCreate);
                return new EngineSequenceFrameSaveSession(nativeSequenceFrameSaveSessionCreate, null);
            }

            public final Builder fileFormat(FileFormat format) {
                Intrinsics.j(format, "format");
                this.f124169a = format;
                return this;
            }

            public final Builder saveToLocalDirectory(File directory) {
                Intrinsics.j(directory, "directory");
                this.f124170b = directory;
                return this;
            }
        }

        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final EngineSequenceFrameSaveSession create() {
            return builder().build();
        }
    }

    @JvmStatic
    public static final Companion.Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final EngineSequenceFrameSaveSession create() {
        return INSTANCE.create();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    /* renamed from: _frameSaveSessionImpl */
    public NativeFrameSaveSession getF124178c() {
        return this.f124167a.getF124178c();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public FrameSaveSession _getFrameSaveSession() {
        return this.f124167a._getFrameSaveSession();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeSequenceFrameSaveSession getF124176a() {
        return this.f124167a.getF124176a();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxySetter
    public void _setFrameSaveSession(FrameSaveSession frameSaveSession) {
        Intrinsics.j(frameSaveSession, "frameSaveSession");
        this.f124167a._setFrameSaveSession(frameSaveSession);
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void addToContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124167a.addToContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void removeFromContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124167a.removeFromContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyFunction
    public void start() {
        this.f124167a.start();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    @ProxyFunction
    public void stop() {
        this.f124167a.stop();
    }

    public final void addListener(FrameSaveSessionListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final CopyOnWriteArraySet<FrameSaveSessionListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    public final void removeListener(FrameSaveSessionListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EngineSequenceFrameSaveSession(NativeSequenceFrameSaveSession nativeSequenceFrameSaveSession, DefaultConstructorMarker defaultConstructorMarker) {
        this.f124167a = new SequenceFrameSaveSessionProxyAdapter(nativeSequenceFrameSaveSession, null, 2, 0 == true ? 1 : 0);
        nativeSequenceFrameSaveSession.addListenerAsync(new FrameSaveSessionListenerReversedAdapter(new c(this), this, null, 4, null));
    }
}

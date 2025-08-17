package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveConfiguration;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001e\u001fJ\u0010\u0010\u0004\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "addToContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "disable", "()V", "enable", "removeFromContext", "save", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;)V", "removeListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Companion", "com/scandit/datacapture/core/framesave/a", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BurstFrameSaveSession implements FrameSaveSession, BurstFrameSaveSessionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_BURST_SIZE = 3;

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BurstFrameSaveSessionProxyAdapter f124151a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion;", "", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "create", "()Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "", "burstSize", "(I)Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "builder", "()Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "DEFAULT_BURST_SIZE", "I", "Builder", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/framesave/FileFormat;", "format", "fileFormat", "(Lcom/scandit/datacapture/core/framesave/FileFormat;)Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "", "size", "burstSize", "(I)Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "Ljava/io/File;", "directory", "saveToLocalDirectory", "(Ljava/io/File;)Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession$Companion$Builder;", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "build", "()Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSession;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
        @SourceDebugExtension
        public static final class Builder {

            /* renamed from: c, reason: collision with root package name */
            private File f124155c;

            /* renamed from: a, reason: collision with root package name */
            private int f124153a = 3;

            /* renamed from: b, reason: collision with root package name */
            private FileFormat f124154b = FileFormat.SC_RAW;

            /* renamed from: d, reason: collision with root package name */
            private final String f124156d = "";

            public final BurstFrameSaveSession build() {
                NativeBurstFrameSaveConfiguration nativeBurstFrameSaveConfigurationForRemoteStorage;
                File file = this.f124155c;
                if (file == null || (nativeBurstFrameSaveConfigurationForRemoteStorage = NativeBurstFrameSaveConfiguration.forLocalStorage(file.getAbsolutePath(), this.f124153a, this.f124154b, this.f124156d)) == null) {
                    nativeBurstFrameSaveConfigurationForRemoteStorage = NativeBurstFrameSaveConfiguration.forRemoteStorage(this.f124153a, this.f124154b, this.f124156d);
                }
                NativeBurstFrameSaveSession nativeBurstFrameSaveSessionCreate = NativeBurstFrameSaveSession.create(nativeBurstFrameSaveConfigurationForRemoteStorage);
                Intrinsics.g(nativeBurstFrameSaveSessionCreate);
                return new BurstFrameSaveSession(nativeBurstFrameSaveSessionCreate, null);
            }

            public final Builder burstSize(int size) {
                this.f124153a = size;
                return this;
            }

            public final Builder fileFormat(FileFormat format) {
                Intrinsics.j(format, "format");
                this.f124154b = format;
                return this;
            }

            public final Builder saveToLocalDirectory(File directory) {
                Intrinsics.j(directory, "directory");
                this.f124155c = directory;
                return this;
            }
        }

        @JvmStatic
        public final BurstFrameSaveSession create() {
            return builder().build();
        }

        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }

        @Deprecated
        @JvmStatic
        public final BurstFrameSaveSession create(int burstSize) {
            return builder().burstSize(burstSize).build();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final Companion.Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final BurstFrameSaveSession create() {
        return INSTANCE.create();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    /* renamed from: _frameSaveSessionImpl */
    public NativeFrameSaveSession getF124159c() {
        return this.f124151a.getF124159c();
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBurstFrameSaveSession getF124157a() {
        return this.f124151a.getF124157a();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void addToContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124151a.addToContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void disable() {
        this.f124151a.disable();
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void enable() {
        this.f124151a.enable();
    }

    @Override // com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void removeFromContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124151a.removeFromContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    @ProxyFunction
    public void save() {
        this.f124151a.save();
    }

    @Deprecated
    @JvmStatic
    public static final BurstFrameSaveSession create(int i10) {
        return INSTANCE.create(i10);
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
    public BurstFrameSaveSession(NativeBurstFrameSaveSession nativeBurstFrameSaveSession, DefaultConstructorMarker defaultConstructorMarker) {
        this.f124151a = new BurstFrameSaveSessionProxyAdapter(nativeBurstFrameSaveSession, null, 2, 0 == true ? 1 : 0);
        nativeBurstFrameSaveSession.addListenerAsync(new FrameSaveSessionListenerReversedAdapter(new a(this), this, null, 4, null));
    }
}

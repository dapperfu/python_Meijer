package com.scandit.datacapture.core.internal.sdk.init;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u000eH&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader;", "", "loadedLibs", "", "", "Lcom/scandit/datacapture/core/internal/sdk/init/LoadMethod;", "getLoadedLibs", "()Ljava/util/Map;", "workaroundApplied", "", "getWorkaroundApplied", "()Z", "buildLogs", "clearLogs", "", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface LibraryLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f125495a;

    String buildLogs();

    void clearLogs();

    Map<String, LoadMethod> getLoadedLibs();

    boolean getWorkaroundApplied();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader$Companion;", "", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader;", "getInstance", "()Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f125495a = new Companion();

        public final synchronized LibraryLoader getInstance() throws IllegalStateException {
            LibraryLoaderInternal instance$scandit_capture_core;
            instance$scandit_capture_core = LibraryLoaderInternal.INSTANCE.getInstance$scandit_capture_core();
            if (instance$scandit_capture_core == null) {
                throw new IllegalStateException("Library loader is null,either Scandit content providers haven't started yet, or some unexpected error happened.");
            }
            return instance$scandit_capture_core;
        }

        private Companion() {
        }
    }
}

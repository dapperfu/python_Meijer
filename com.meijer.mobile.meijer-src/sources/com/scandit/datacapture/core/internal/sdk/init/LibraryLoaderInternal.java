package com.scandit.datacapture.core.internal.sdk.init;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.scandit.datacapture.core.internal.module.init.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ!\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH&¢\u0006\u0002\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoader;", "loadingFailed", "", "getLoadingFailed", "()Z", "loadLibsIfNeeded", "soLibNames", "", "", "([Ljava/lang/String;)Z", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LibraryLoaderInternal extends LibraryLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126448a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal$Companion;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "getOrCreateInstance", "(Landroid/content/Context;)Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "<set-?>", "b", "Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "getInstance$scandit_capture_core", "()Lcom/scandit/datacapture/core/internal/sdk/init/LibraryLoaderInternal;", "instance", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126448a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static /* synthetic */ e f126449b;

        public final synchronized LibraryLoaderInternal getOrCreateInstance(Context context) {
            e eVar;
            try {
                Intrinsics.j(context, "context");
                eVar = f126449b;
                if (eVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.i(applicationContext, "getApplicationContext(...)");
                    ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Intrinsics.g(applicationInfo);
                    Bundle bundle = applicationInfo.metaData;
                    eVar = new e(applicationContext, bundle != null ? bundle.getBoolean("com.scandit.core.LoadingAllowedToFail", false) : false);
                    f126449b = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return eVar;
        }

        public final LibraryLoaderInternal getInstance$scandit_capture_core() {
            return f126449b;
        }

        private Companion() {
        }
    }

    boolean getLoadingFailed();

    boolean loadLibsIfNeeded(String... soLibNames);
}

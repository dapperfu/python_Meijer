package com.scandit.datacapture.core.internal.sdk.init;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.module.b;
import com.scandit.datacapture.core.internal.module.data.NativeDataDecodingFactory;
import com.scandit.datacapture.core.internal.module.data.a;
import com.scandit.datacapture.core.internal.module.device.NativeDeviceHolder;
import com.scandit.datacapture.core.internal.module.device.d;
import com.scandit.datacapture.core.internal.module.https.NativeHttps;
import com.scandit.datacapture.core.internal.module.https.c;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.ThreadCreatorImpl;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageConverter;
import com.scandit.datacapture.core.internal.sdk.license.CoreLicenseTextProvider;
import com.scandit.datacapture.core.internal.sdk.license.LicenseTextProvider;
import com.scandit.datacapture.core.internal.sdk.localization.AndroidLocalizer;
import com.scandit.internal.sdk.bar.Filesystem;
import com.scandit.internal.sdk.bar.LocalizerHandler;
import com.scandit.internal.sdk.bar.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/init/CoreLibraryLoader;", "", "Landroid/content/Context;", "context", "", "ensureInitialized", "(Landroid/content/Context;)V", "", "<set-?>", "a", "Z", "isInitialized$scandit_capture_core", "()Z", "isInitialized", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CoreLibraryLoader {
    public static final CoreLibraryLoader INSTANCE = new CoreLibraryLoader();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static volatile boolean isInitialized;

    @JvmStatic
    public static final void ensureInitialized(Context context) {
        Intrinsics.j(context, "context");
        LicenseTextProvider.INSTANCE.addLicenseTextProvider(new CoreLicenseTextProvider());
        if (LibraryLoaderInternal.INSTANCE.getOrCreateInstance(context).loadLibsIfNeeded(PlaceTypes.BAR, "sdc-core")) {
            isInitialized = true;
            AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.i(applicationContext, "getApplicationContext(...)");
            appAndroidEnvironment.setApplicationContext(applicationContext);
            ThreadFactory.setFactory(new ThreadCreatorImpl(context.getResources().getInteger(R.integer.scandit_thread_priority)));
            NativeDataDecodingFactory.setDataDecoding(new a());
            Filesystem.setInstance(new com.scandit.datacapture.core.internal.module.a(context));
            LocalizerHandler.setDefaultLocalizer(new AndroidLocalizer(context));
            NativeHttps.setFactory(new c());
            NativeDeviceHolder.setCurrentDevice(new d(new com.scandit.datacapture.core.internal.module.device.c(context)));
            BatterySavingManager.INSTANCE.makeInstance$scandit_capture_core(context);
            NativeImageConverter.setInstance(new b());
        }
    }

    public final boolean isInitialized$scandit_capture_core() {
        return isInitialized;
    }

    private CoreLibraryLoader() {
    }
}

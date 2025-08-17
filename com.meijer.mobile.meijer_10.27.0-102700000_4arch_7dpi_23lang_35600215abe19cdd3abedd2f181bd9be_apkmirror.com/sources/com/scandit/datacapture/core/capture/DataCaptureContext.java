package com.scandit.datacapture.core.capture;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.provider.Settings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.imu.ImuDataCollector;
import com.scandit.datacapture.core.internal.module.capture.NativeDeviceIdUtils;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.AssetResourceLoader;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.init.CoreLibraryLoader;
import com.scandit.datacapture.core.internal.sdk.license.LicenseTextProvider;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.internal.sdk.transport.ble.BluetoothDataTransport;
import com.scandit.datacapture.core.license.LicenseInfo;
import com.scandit.datacapture.core.license.OpenSourceSoftwareLicenseInfo;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0005YZ[\\]B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0097\u0001¢\u0006\u0004\b \u0010!J%\u0010$\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00162\u0006\u0010'\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00162\u0006\u0010'\u001a\u00020+¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b1\u00100J\u0015\u00102\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b2\u00100J\r\u00103\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0016¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u00020\u0016¢\u0006\u0004\b6\u00104J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u00162\u0006\u0010:\u001a\u000207¢\u0006\u0004\b;\u0010<R$\u0010C\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR \u0010I\u001a\b\u0012\u0004\u0012\u00020&0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010L\u001a\b\u0012\u0004\u0012\u00020+0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006^"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;", "adapter", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_addModeAsyncWrapped", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_context", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "_removeAllModesAsyncWrapped", "()Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_removeCurrentModeAsyncWrapped", "_removeModeAsyncWrapped", "dataCaptureContext", "", "_setContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_setFrameSourceAsyncWrapped", "(Lcom/scandit/datacapture/core/source/FrameSource;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_setModeAsyncWrapped", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "applySettings", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;)V", "Ljava/lang/Runnable;", "whenDone", "setFrameSource", "(Lcom/scandit/datacapture/core/source/FrameSource;Ljava/lang/Runnable;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;", "listener", "addListener", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextListener;)V", "removeListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;", "addFrameListener", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;)V", "removeFrameListener", "addMode", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;)V", "setMode", "removeMode", "removeCurrentMode", "()V", "removeAllModes", "release", "", "_isCameraTimestampsRealtime", "()Z", "enable", "_setShouldUseImuData", "(Z)V", "b", "Lcom/scandit/datacapture/core/source/FrameSource;", "get_frameSource$scandit_capture_core", "()Lcom/scandit/datacapture/core/source/FrameSource;", "set_frameSource$scandit_capture_core", "(Lcom/scandit/datacapture/core/source/FrameSource;)V", "_frameSource", "Ljava/util/concurrent/CopyOnWriteArraySet;", "g", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getListeners$scandit_capture_core", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "h", "getFrameListeners$scandit_capture_core", "frameListeners", "getFrameSource", "Lcom/scandit/datacapture/core/license/LicenseInfo;", "getLicenseInfo", "()Lcom/scandit/datacapture/core/license/LicenseInfo;", "licenseInfo", "", "get_modes$scandit_capture_core", "()Ljava/util/List;", "_modes", "get_activeMode$scandit_capture_core", "()Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_activeMode", "Companion", "com/scandit/datacapture/core/capture/a", "com/scandit/datacapture/core/capture/b", "com/scandit/datacapture/core/capture/c", "com/scandit/datacapture/core/capture/d", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class DataCaptureContext implements DataCaptureContextProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    public static final String DEVICE_ID;

    /* renamed from: k, reason: collision with root package name */
    private static DataCaptureContext f124030k;

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextProxyAdapter f124031a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private FrameSource _frameSource;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f124033c;

    /* renamed from: d, reason: collision with root package name */
    private DataCaptureMode f124034d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f124035e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f124036f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArraySet listeners;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArraySet frameListeners;

    /* renamed from: i, reason: collision with root package name */
    private final e f124039i;

    /* renamed from: j, reason: collision with root package name */
    private final ImuDataCollector f124040j;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0006JQ\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContext$Companion;", "", "", "licenseKey", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "forLicenseKey", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "frameworkName", "frameworkVersion", "deviceName", "externalId", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "_forAllProperties$scandit_capture_core", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;)Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "_forAllProperties", "Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "builder", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/capture/DataCaptureContextBuilder;", "initialize", "Lcom/scandit/datacapture/core/license/OpenSourceSoftwareLicenseInfo;", "getOpenSourceSoftwareLicenseInfo", "()Lcom/scandit/datacapture/core/license/OpenSourceSoftwareLicenseInfo;", "getOpenSourceSoftwareLicenseInfo$annotations", "()V", "openSourceSoftwareLicenseInfo", "getSharedInstance", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getSharedInstance$annotations", "sharedInstance", "DEVICE_ID", "Ljava/lang/String;", "EMPTY_LICENSE_KEY", "FRAMEWORK_NAME", "UNINITIALIZED_DEVICE_ID", "_sharedInstance", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getOpenSourceSoftwareLicenseInfo$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final DataCaptureContext initialize(String licenseKey, String frameworkName, String frameworkVersion, String deviceName, String externalId, DataCaptureContextSettings settings) {
            Intrinsics.j(licenseKey, "licenseKey");
            Intrinsics.j(settings, "settings");
            AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
            File noBackupFilesDir = appAndroidEnvironment.getApplicationContext().getNoBackupFilesDir();
            Intrinsics.i(noBackupFilesDir, "getNoBackupFilesDir(...)");
            String absolutePath = noBackupFilesDir.getAbsolutePath();
            String str = Build.VERSION.RELEASE;
            String str2 = frameworkName == null ? "native" : frameworkName;
            String str3 = Build.MODEL;
            String packageName = appAndroidEnvironment.getApplicationContext().getPackageName();
            Context context = appAndroidEnvironment.getApplicationContext();
            Intrinsics.j(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.scandit.device_id", 0);
            DataCaptureContextProxyAdapter dataCaptureContextProxyAdapter = null;
            Object[] objArr = 0;
            String string = sharedPreferences.getString("device_id", null);
            if (string == null) {
                String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                string = (string2 == null || string2.length() < 16) ? null : string2;
                if (string == null) {
                    String string3 = UUID.randomUUID().toString();
                    Intrinsics.i(string3, "toString(...)");
                    string = "bad1d000" + StringsKt.Q(string3, "-", "", false, 4, null);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("device_id", string);
                    editorEdit.apply();
                }
            }
            String str4 = string;
            String str5 = deviceName == null ? "" : deviceName;
            String str6 = externalId == null ? "" : externalId;
            ArrayList arrayList = new ArrayList(com.scandit.datacapture.core.internal.module.capture.b.a(appAndroidEnvironment.getApplicationContext()));
            AssetManager assets = appAndroidEnvironment.getApplicationContext().getAssets();
            Intrinsics.i(assets, "getAssets(...)");
            NativeDataCaptureContext nativeDataCaptureContextInitialize = NativeDataCaptureContext.initialize(licenseKey, absolutePath, str, str2, frameworkVersion, str3, packageName, str4, str5, str6, arrayList, new AssetResourceLoader(assets), false, settings.getF124057a());
            DataCaptureContext dataCaptureContext = DataCaptureContext.f124030k;
            if (dataCaptureContext == null) {
                Intrinsics.g(nativeDataCaptureContextInitialize);
                dataCaptureContext = new DataCaptureContext(nativeDataCaptureContextInitialize, dataCaptureContextProxyAdapter, 2, objArr == true ? 1 : 0);
            }
            DataCaptureContext.f124030k = dataCaptureContext;
            return dataCaptureContext;
        }

        public static /* synthetic */ DataCaptureContext initialize$default(Companion companion, String str, String str2, String str3, String str4, String str5, DataCaptureContextSettings dataCaptureContextSettings, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = "native";
            }
            String str6 = str2;
            String str7 = (i10 & 4) != 0 ? null : str3;
            String str8 = (i10 & 8) != 0 ? null : str4;
            String str9 = (i10 & 16) != 0 ? null : str5;
            if ((i10 & 32) != 0) {
                dataCaptureContextSettings = new DataCaptureContextSettings();
            }
            return companion.initialize(str, str6, str7, str8, str9, dataCaptureContextSettings);
        }

        @JvmStatic
        public final DataCaptureContext _forAllProperties$scandit_capture_core(String licenseKey, String frameworkName, String frameworkVersion, String deviceName, String externalId, DataCaptureContextSettings settings) {
            Intrinsics.j(licenseKey, "licenseKey");
            Intrinsics.j(frameworkName, "frameworkName");
            Intrinsics.j(settings, "settings");
            return new DataCaptureContext(licenseKey, frameworkName, frameworkVersion, deviceName, externalId, settings, null);
        }

        @JvmStatic
        public final DataCaptureContextBuilder builder(String licenseKey) {
            Intrinsics.j(licenseKey, "licenseKey");
            return new DataCaptureContextBuilder(licenseKey);
        }

        @JvmStatic
        public final DataCaptureContext forLicenseKey(String licenseKey) {
            Intrinsics.j(licenseKey, "licenseKey");
            return builder(licenseKey).build();
        }

        public final OpenSourceSoftwareLicenseInfo getOpenSourceSoftwareLicenseInfo() {
            return new OpenSourceSoftwareLicenseInfo(LicenseTextProvider.INSTANCE.getLicenseText());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final File access$getWorkingDirectory(Companion companion) {
            companion.getClass();
            File noBackupFilesDir = AppAndroidEnvironment.INSTANCE.getApplicationContext().getNoBackupFilesDir();
            Intrinsics.i(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }

        public final DataCaptureContext getSharedInstance() {
            DataCaptureContext dataCaptureContext = DataCaptureContext.f124030k;
            if (dataCaptureContext == null) {
                return initialize("");
            }
            return dataCaptureContext;
        }

        @JvmStatic
        public final DataCaptureContext initialize(String licenseKey) {
            Intrinsics.j(licenseKey, "licenseKey");
            return initialize(licenseKey, "native", null, null, null, new DataCaptureContextSettings());
        }
    }

    public DataCaptureContext(NativeDataCaptureContext impl, DataCaptureContextProxyAdapter adapter) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(adapter, "adapter");
        this.f124031a = adapter;
        this.f124033c = new ArrayList();
        Object obj = new Object();
        this.f124035e = obj;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.listeners = copyOnWriteArraySet;
        this.frameListeners = new CopyOnWriteArraySet();
        e eVar = new e(this);
        this.f124039i = eVar;
        this.f124040j = new ImuDataCollector(new c(this));
        _setContext(this);
        int i10 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ProxyCache proxyCache = null;
        impl.addListenerAsync(new DataCaptureContextListenerReversedAdapter(new b(this), this, proxyCache, i10, defaultConstructorMarker), NativeDataCaptureContext.getListenerPriorityUser());
        impl.addFrameListenerAsync(new DataCaptureContextFrameListenerReversedAdapter(new a(this), this, proxyCache, i10, defaultConstructorMarker));
        synchronized (obj) {
            copyOnWriteArraySet.add(new d());
            Unit unit = Unit.f142422a;
        }
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        appAndroidEnvironment.getAppLifecycleListener().registerOnActivityStoppedCallback(eVar);
        getF124053a().setDataTransports(CollectionsKt.g(new BluetoothDataTransport(appAndroidEnvironment.getApplicationContext())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureContext this$0, FrameSource frameSource, Runnable runnable) {
        Intrinsics.j(this$0, "this$0");
        this$0._frameSource = frameSource;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DataCaptureContext this$0, DataCaptureMode mode) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(mode, "$mode");
        this$0.getClass();
        mode._setDataCaptureContext(null);
        this$0.f124033c.remove(mode);
        if (Intrinsics.e(mode, this$0.f124034d)) {
            this$0.f124034d = null;
            if (this$0.f124033c.isEmpty()) {
                return;
            }
            this$0.f124034d = (DataCaptureMode) CollectionsKt.D0(this$0.f124033c);
        }
    }

    @JvmStatic
    public static final DataCaptureContextBuilder builder(String str) {
        return INSTANCE.builder(str);
    }

    @JvmStatic
    public static final DataCaptureContext forLicenseKey(String str) {
        return INSTANCE.forLicenseKey(str);
    }

    public static final OpenSourceSoftwareLicenseInfo getOpenSourceSoftwareLicenseInfo() {
        return INSTANCE.getOpenSourceSoftwareLicenseInfo();
    }

    public static final DataCaptureContext getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    @JvmStatic
    public static final DataCaptureContext initialize(String str) {
        return INSTANCE.initialize(str);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "addModeAsyncWrapped")
    public NativeWrappedFuture _addModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        return this.f124031a._addModeAsyncWrapped(mode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    public DataCaptureContext _context() {
        return this.f124031a._context();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeDataCaptureContext getF124053a() {
        return this.f124031a.getF124053a();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "removeAllModesAsyncWrapped")
    public NativeWrappedFuture _removeAllModesAsyncWrapped() {
        return this.f124031a._removeAllModesAsyncWrapped();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "removeCurrentModeAsyncWrapped")
    public NativeWrappedFuture _removeCurrentModeAsyncWrapped() {
        return this.f124031a._removeCurrentModeAsyncWrapped();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "removeModeAsyncWrapped")
    public NativeWrappedFuture _removeModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        return this.f124031a._removeModeAsyncWrapped(mode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxySetter
    public void _setContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124031a._setContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "setFrameSourceAsyncWrapped")
    public NativeWrappedFuture _setFrameSourceAsyncWrapped(FrameSource frameSource) {
        return this.f124031a._setFrameSourceAsyncWrapped(frameSource);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "setModeAsyncWrapped")
    public NativeWrappedFuture _setModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        return this.f124031a._setModeAsyncWrapped(mode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    @ProxyFunction(nativeName = "applySettings")
    public void applySettings(DataCaptureContextSettings settings) {
        Intrinsics.j(settings, "settings");
        this.f124031a.applySettings(settings);
    }

    @JvmOverloads
    public final void setFrameSource(FrameSource frameSource) {
        setFrameSource$default(this, frameSource, null, 2, null);
    }

    static {
        String strHashDeviceId;
        if (CoreLibraryLoader.INSTANCE.isInitialized$scandit_capture_core()) {
            strHashDeviceId = NativeDeviceIdUtils.hashDeviceId(new com.scandit.datacapture.core.internal.module.device.e(AppAndroidEnvironment.INSTANCE.getApplicationContext()).a());
            Intrinsics.g(strHashDeviceId);
        } else {
            strHashDeviceId = "UNINITIALIZED_DEVICE_ID";
        }
        DEVICE_ID = strHashDeviceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DataCaptureContext this$0, DataCaptureMode mode) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(mode, "$mode");
        this$0.getClass();
        mode._setDataCaptureContext(this$0);
        CollectionsKt.J(this$0.f124033c, new f(mode));
        this$0.f124034d = mode;
        this$0.f124033c.add(mode);
    }

    @JvmStatic
    public static final DataCaptureContext initialize(String str, String str2, String str3, String str4, String str5, DataCaptureContextSettings dataCaptureContextSettings) {
        return INSTANCE.initialize(str, str2, str3, str4, str5, dataCaptureContextSettings);
    }

    public static /* synthetic */ void setFrameSource$default(DataCaptureContext dataCaptureContext, FrameSource frameSource, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        dataCaptureContext.setFrameSource(frameSource, runnable);
    }

    public final void _setShouldUseImuData(boolean enable) {
        this.f124040j.setEnabled(enable);
        getF124053a().setShouldUseImuDataAsync(enable);
    }

    public final void addFrameListener(DataCaptureContextFrameListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.frameListeners.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addListener(DataCaptureContextListener listener) {
        boolean z10;
        Intrinsics.j(listener, "listener");
        synchronized (this.f124035e) {
            z10 = this.listeners.add(listener) ? this.f124036f : false;
        }
        if (z10) {
            listener.onObservationStarted(this);
        }
    }

    public final void addMode(final DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeExtensionsKt.andThen(_addModeAsyncWrapped(mode), new Runnable() { // from class: Zt.c
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.a(this.f43268a, mode);
            }
        });
    }

    public final CopyOnWriteArraySet<DataCaptureContextFrameListener> getFrameListeners$scandit_capture_core() {
        return this.frameListeners;
    }

    /* renamed from: getFrameSource, reason: from getter */
    public final FrameSource get_frameSource() {
        return this._frameSource;
    }

    public final CopyOnWriteArraySet<DataCaptureContextListener> getListeners$scandit_capture_core() {
        return this.listeners;
    }

    /* renamed from: get_activeMode$scandit_capture_core, reason: from getter */
    public final /* synthetic */ DataCaptureMode getF124034d() {
        return this.f124034d;
    }

    public final FrameSource get_frameSource$scandit_capture_core() {
        return this._frameSource;
    }

    public final /* synthetic */ List get_modes$scandit_capture_core() {
        return this.f124033c;
    }

    public final void release() {
        AppAndroidEnvironment.INSTANCE.getAppLifecycleListener().deregisterOnActivityStoppedCallback(this.f124039i);
        getF124053a().disposeAsync();
    }

    public final void removeFrameListener(DataCaptureContextFrameListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.frameListeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeListener(DataCaptureContextListener listener) {
        boolean z10;
        Intrinsics.j(listener, "listener");
        synchronized (this.f124035e) {
            z10 = this.listeners.remove(listener) ? this.f124036f : false;
        }
        if (z10) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeMode(final DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeExtensionsKt.andThen(_removeModeAsyncWrapped(mode), new Runnable() { // from class: Zt.f
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.b(this.f43275a, mode);
            }
        });
    }

    @JvmOverloads
    public final void setFrameSource(final FrameSource frameSource, final Runnable whenDone) {
        NativeExtensionsKt.andThen(_setFrameSourceAsyncWrapped(frameSource), new Runnable() { // from class: Zt.d
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.a(this.f43270a, frameSource, whenDone);
            }
        });
    }

    public final void setMode(final DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeExtensionsKt.andThen(_setModeAsyncWrapped(mode), new Runnable() { // from class: Zt.e
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.c(this.f43273a, mode);
            }
        });
    }

    public final void set_frameSource$scandit_capture_core(FrameSource frameSource) {
        this._frameSource = frameSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureContext this$0, DataCaptureMode mode) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(mode, "$mode");
        this$0.getClass();
        mode._setDataCaptureContext(this$0);
        CollectionsKt.J(this$0.f124033c, new f(mode));
        this$0.f124034d = mode;
        this$0.f124033c.add(mode);
    }

    public final boolean _isCameraTimestampsRealtime() {
        Camera camera;
        NativeAndroidCamera nativeAndroidCamera_impl;
        FrameSource frameSource = get_frameSource();
        if (frameSource instanceof Camera) {
            camera = (Camera) frameSource;
        } else {
            camera = null;
        }
        if (camera != null && (nativeAndroidCamera_impl = camera.getF125871a()) != null && nativeAndroidCamera_impl.isTimestampRealtime()) {
            return true;
        }
        return false;
    }

    public final LicenseInfo getLicenseInfo() {
        NativeLicenseInfo licenseInfo = getF124053a().getLicenseInfo();
        if (licenseInfo != null) {
            return new LicenseInfo(licenseInfo);
        }
        return null;
    }

    public final void removeAllModes() {
        NativeExtensionsKt.andThen(_removeAllModesAsyncWrapped(), new Runnable() { // from class: Zt.b
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.a(this.f43267a);
            }
        });
    }

    public final void removeCurrentMode() {
        NativeExtensionsKt.andThen(_removeCurrentModeAsyncWrapped(), new Runnable() { // from class: Zt.a
            @Override // java.lang.Runnable
            public final void run() {
                DataCaptureContext.b(this.f43266a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DataCaptureContext this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f124034d = null;
        Iterator it = this$0.f124033c.iterator();
        while (it.hasNext()) {
            ((DataCaptureMode) it.next())._setDataCaptureContext(null);
        }
        this$0.f124033c.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DataCaptureContext this$0) {
        Intrinsics.j(this$0, "this$0");
        DataCaptureMode dataCaptureMode = this$0.f124034d;
        if (dataCaptureMode != null) {
            dataCaptureMode._setDataCaptureContext(null);
            this$0.f124033c.remove(dataCaptureMode);
            if (Intrinsics.e(dataCaptureMode, this$0.f124034d)) {
                this$0.f124034d = null;
                if (this$0.f124033c.isEmpty()) {
                    return;
                }
                this$0.f124034d = (DataCaptureMode) CollectionsKt.D0(this$0.f124033c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ DataCaptureContext(NativeDataCaptureContext nativeDataCaptureContext, DataCaptureContextProxyAdapter dataCaptureContextProxyAdapter, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContext, (i10 & 2) != 0 ? new DataCaptureContextProxyAdapter(nativeDataCaptureContext, null, 2, 0 == true ? 1 : 0) : dataCaptureContextProxyAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureContext(String str, String str2, String str3, String str4, String str5, DataCaptureContextSettings dataCaptureContextSettings, DefaultConstructorMarker defaultConstructorMarker) {
        String absolutePath = Companion.access$getWorkingDirectory(INSTANCE).getAbsolutePath();
        String str6 = Build.VERSION.RELEASE;
        String str7 = str2 == null ? "native" : str2;
        String str8 = Build.MODEL;
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        String packageName = appAndroidEnvironment.getApplicationContext().getPackageName();
        String strA = new com.scandit.datacapture.core.internal.module.device.e(appAndroidEnvironment.getApplicationContext()).a();
        String str9 = str4 == null ? "" : str4;
        String str10 = str5 == null ? "" : str5;
        ArrayList arrayList = new ArrayList(com.scandit.datacapture.core.internal.module.capture.b.a(appAndroidEnvironment.getApplicationContext()));
        AssetManager assets = appAndroidEnvironment.getApplicationContext().getAssets();
        Intrinsics.i(assets, "getAssets(...)");
        NativeDataCaptureContext nativeDataCaptureContextCreateWithDeviceName = NativeDataCaptureContext.createWithDeviceName(str, absolutePath, str6, str7, str3, str8, packageName, strA, str9, str10, arrayList, new AssetResourceLoader(assets), false, dataCaptureContextSettings.getF124057a());
        Intrinsics.i(nativeDataCaptureContextCreateWithDeviceName, "createWithDeviceName(...)");
        this(nativeDataCaptureContextCreateWithDeviceName, null, 2, 0 == true ? 1 : 0);
    }
}

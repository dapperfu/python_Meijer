package com.scandit.datacapture.barcode.internal.sdk.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettingsDefaults;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/pick/ui/BarcodePickSettingsDefaults;", "", "", "a", "Z", "getSoundEnabled", "()Z", "getSoundEnabled$annotations", "()V", "soundEnabled", "b", "getHapticsEnabled", "getHapticsEnabled$annotations", "hapticsEnabled", "c", "getCachingEnabled", "getCachingEnabled$annotations", "cachingEnabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickSettingsDefaults {
    public static final BarcodePickSettingsDefaults INSTANCE = new BarcodePickSettingsDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean soundEnabled = NativeBarcodePickSettingsDefaults.soundEnabled();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final boolean hapticsEnabled = NativeBarcodePickSettingsDefaults.hapticsEnabled();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean cachingEnabled = NativeBarcodePickSettingsDefaults.enableCaching();

    @JvmStatic
    public static /* synthetic */ void getCachingEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getHapticsEnabled$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getSoundEnabled$annotations() {
    }

    public static final boolean getCachingEnabled() {
        return cachingEnabled;
    }

    public static final boolean getHapticsEnabled() {
        return hapticsEnabled;
    }

    public static final boolean getSoundEnabled() {
        return soundEnabled;
    }

    private BarcodePickSettingsDefaults() {
    }
}

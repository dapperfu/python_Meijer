package com.scandit.datacapture.core.internal.sdk.license;

import com.scandit.datacapture.core.internal.sdk.capture.NativeOpenSourceSoftwareLicenseInfo;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/license/CoreLicenseTextProvider;", "Lcom/scandit/datacapture/core/internal/sdk/license/ModuleLicenseTextProvider;", "<init>", "()V", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", PreferencesHelper.PREF_ID, "getLicenseText", "licenseText", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CoreLicenseTextProvider implements ModuleLicenseTextProvider {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id = "Core-Module";

    @Override // com.scandit.datacapture.core.internal.sdk.license.ModuleLicenseTextProvider
    public String getId() {
        return this.id;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.license.ModuleLicenseTextProvider
    public String getLicenseText() {
        String licenseText = NativeOpenSourceSoftwareLicenseInfo.getLicenseText();
        Intrinsics.i(licenseText, "getLicenseText(...)");
        return licenseText;
    }
}

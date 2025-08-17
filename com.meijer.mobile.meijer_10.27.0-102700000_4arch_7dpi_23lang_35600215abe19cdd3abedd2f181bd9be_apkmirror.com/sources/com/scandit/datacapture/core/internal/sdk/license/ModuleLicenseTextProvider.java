package com.scandit.datacapture.core.internal.sdk.license;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/license/ModuleLicenseTextProvider;", "", PreferencesHelper.PREF_ID, "", "getId", "()Ljava/lang/String;", "licenseText", "getLicenseText", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ModuleLicenseTextProvider {
    String getId();

    String getLicenseText();
}

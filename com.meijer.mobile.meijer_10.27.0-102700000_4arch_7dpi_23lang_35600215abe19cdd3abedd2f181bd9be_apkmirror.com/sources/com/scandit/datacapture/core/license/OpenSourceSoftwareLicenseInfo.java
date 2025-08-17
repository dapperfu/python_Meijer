package com.scandit.datacapture.core.license;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/license/OpenSourceSoftwareLicenseInfo;", "", "", "licenseText", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getLicenseText", "()Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class OpenSourceSoftwareLicenseInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String licenseText;

    public OpenSourceSoftwareLicenseInfo(String licenseText) {
        Intrinsics.j(licenseText, "licenseText");
        this.licenseText = licenseText;
    }

    public final String getLicenseText() {
        return this.licenseText;
    }
}

package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionLicenseInfo;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionLicenseInfo;", "", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionLicenseInfo;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionLicenseInfo;)V", "", "toJson", "()Ljava/lang/String;", "", "Lcom/scandit/datacapture/barcode/data/Symbology;", "getLicensedSymbologies", "()Ljava/util/Set;", "licensedSymbologies", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSelectionLicenseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeSelectionLicenseInfo f123777a;

    public BarcodeSelectionLicenseInfo(NativeBarcodeSelectionLicenseInfo impl) {
        Intrinsics.j(impl, "impl");
        this.f123777a = impl;
    }

    public final Set<Symbology> getLicensedSymbologies() {
        HashSet<Symbology> licensedSymbologies = this.f123777a.getLicensedSymbologies();
        Intrinsics.i(licensedSymbologies, "getLicensedSymbologies(...)");
        return licensedSymbologies;
    }

    public final String toJson() {
        String json = this.f123777a.toJson();
        Intrinsics.i(json, "toJson(...)");
        return json;
    }
}

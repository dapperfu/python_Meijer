package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.SparkScanViewMiniPreview;
import com.scandit.datacapture.barcode.spark.ui.SparkScanToastSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class s implements SparkScanViewToastPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final x f124225a;

    /* renamed from: b, reason: collision with root package name */
    public final SparkScanViewSettings f124226b;

    /* renamed from: c, reason: collision with root package name */
    public final y f124227c;

    /* renamed from: d, reason: collision with root package name */
    public n f124228d;

    /* renamed from: e, reason: collision with root package name */
    public final r f124229e;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void a(n toast) {
        q qVar;
        Intrinsics.j(toast, "toast");
        SparkScanToastSettings toastSettings = this.f124226b.getToastSettings();
        if (toast instanceof g) {
            String targetModeEnabledMessage = toastSettings.getTargetModeEnabledMessage();
            if (targetModeEnabledMessage == null) {
                targetModeEnabledMessage = ((g) toast).f124207c;
            }
            Integer toastBackgroundColor = toastSettings.getToastBackgroundColor();
            int iIntValue = toastBackgroundColor != null ? toastBackgroundColor.intValue() : ((g) toast).f124208d;
            Integer toastTextColor = toastSettings.getToastTextColor();
            qVar = new q(targetModeEnabledMessage, iIntValue, toastTextColor != null ? toastTextColor.intValue() : toast.f124218a);
        } else if (toast instanceof f) {
            String targetModeDisabledMessage = toastSettings.getTargetModeDisabledMessage();
            if (targetModeDisabledMessage == null) {
                targetModeDisabledMessage = ((f) toast).f124206c;
            }
            Integer toastBackgroundColor2 = toastSettings.getToastBackgroundColor();
            int iIntValue2 = toastBackgroundColor2 != null ? toastBackgroundColor2.intValue() : toast.f124219b;
            Integer toastTextColor2 = toastSettings.getToastTextColor();
            qVar = new q(targetModeDisabledMessage, iIntValue2, toastTextColor2 != null ? toastTextColor2.intValue() : toast.f124218a);
        } else if (toast instanceof b) {
            String continuousModeEnabledMessage = toastSettings.getContinuousModeEnabledMessage();
            if (continuousModeEnabledMessage == null) {
                continuousModeEnabledMessage = ((b) toast).f124199c;
            }
            Integer toastBackgroundColor3 = toastSettings.getToastBackgroundColor();
            int iIntValue3 = toastBackgroundColor3 != null ? toastBackgroundColor3.intValue() : ((b) toast).f124200d;
            Integer toastTextColor3 = toastSettings.getToastTextColor();
            qVar = new q(continuousModeEnabledMessage, iIntValue3, toastTextColor3 != null ? toastTextColor3.intValue() : toast.f124218a);
        } else if (toast instanceof a) {
            String continuousModeDisabledMessage = toastSettings.getContinuousModeDisabledMessage();
            if (continuousModeDisabledMessage == null) {
                continuousModeDisabledMessage = ((a) toast).f124198c;
            }
            Integer toastBackgroundColor4 = toastSettings.getToastBackgroundColor();
            int iIntValue4 = toastBackgroundColor4 != null ? toastBackgroundColor4.intValue() : toast.f124219b;
            Integer toastTextColor4 = toastSettings.getToastTextColor();
            qVar = new q(continuousModeDisabledMessage, iIntValue4, toastTextColor4 != null ? toastTextColor4.intValue() : toast.f124218a);
        } else if (toast instanceof e) {
            String scanPausedMessage = toastSettings.getScanPausedMessage();
            if (scanPausedMessage == null) {
                scanPausedMessage = ((e) toast).f124205c;
            }
            Integer toastBackgroundColor5 = toastSettings.getToastBackgroundColor();
            int iIntValue5 = toastBackgroundColor5 != null ? toastBackgroundColor5.intValue() : toast.f124219b;
            Integer toastTextColor5 = toastSettings.getToastTextColor();
            qVar = new q(scanPausedMessage, iIntValue5, toastTextColor5 != null ? toastTextColor5.intValue() : toast.f124218a);
        } else if (toast instanceof i) {
            String torchEnabledMessage = toastSettings.getTorchEnabledMessage();
            if (torchEnabledMessage == null) {
                torchEnabledMessage = ((i) toast).f124210c;
            }
            Integer toastBackgroundColor6 = toastSettings.getToastBackgroundColor();
            int iIntValue6 = toastBackgroundColor6 != null ? toastBackgroundColor6.intValue() : ((i) toast).f124211d;
            Integer toastTextColor6 = toastSettings.getToastTextColor();
            qVar = new q(torchEnabledMessage, iIntValue6, toastTextColor6 != null ? toastTextColor6.intValue() : toast.f124218a);
        } else if (toast instanceof h) {
            String torchDisabledMessage = toastSettings.getTorchDisabledMessage();
            if (torchDisabledMessage == null) {
                torchDisabledMessage = ((h) toast).f124209c;
            }
            Integer toastBackgroundColor7 = toastSettings.getToastBackgroundColor();
            int iIntValue7 = toastBackgroundColor7 != null ? toastBackgroundColor7.intValue() : toast.f124219b;
            Integer toastTextColor7 = toastSettings.getToastTextColor();
            qVar = new q(torchDisabledMessage, iIntValue7, toastTextColor7 != null ? toastTextColor7.intValue() : toast.f124218a);
        } else if (toast instanceof l) {
            String zoomedInMessage = toastSettings.getZoomedInMessage();
            if (zoomedInMessage == null) {
                zoomedInMessage = ((l) toast).f124215c;
            }
            Integer toastBackgroundColor8 = toastSettings.getToastBackgroundColor();
            int iIntValue8 = toastBackgroundColor8 != null ? toastBackgroundColor8.intValue() : ((l) toast).f124216d;
            Integer toastTextColor8 = toastSettings.getToastTextColor();
            qVar = new q(zoomedInMessage, iIntValue8, toastTextColor8 != null ? toastTextColor8.intValue() : toast.f124218a);
        } else if (toast instanceof m) {
            String zoomedOutMessage = toastSettings.getZoomedOutMessage();
            if (zoomedOutMessage == null) {
                zoomedOutMessage = ((m) toast).f124217c;
            }
            Integer toastBackgroundColor9 = toastSettings.getToastBackgroundColor();
            int iIntValue9 = toastBackgroundColor9 != null ? toastBackgroundColor9.intValue() : toast.f124219b;
            Integer toastTextColor9 = toastSettings.getToastTextColor();
            qVar = new q(zoomedOutMessage, iIntValue9, toastTextColor9 != null ? toastTextColor9.intValue() : toast.f124218a);
        } else if (toast instanceof j) {
            String userFacingCameraEnabledMessage = toastSettings.getUserFacingCameraEnabledMessage();
            if (userFacingCameraEnabledMessage == null) {
                userFacingCameraEnabledMessage = ((j) toast).f124212c;
            }
            Integer toastBackgroundColor10 = toastSettings.getToastBackgroundColor();
            int iIntValue10 = toastBackgroundColor10 != null ? toastBackgroundColor10.intValue() : ((j) toast).f124213d;
            Integer toastTextColor10 = toastSettings.getToastTextColor();
            qVar = new q(userFacingCameraEnabledMessage, iIntValue10, toastTextColor10 != null ? toastTextColor10.intValue() : toast.f124218a);
        } else if (toast instanceof k) {
            String worldFacingCameraEnabledMessage = toastSettings.getWorldFacingCameraEnabledMessage();
            if (worldFacingCameraEnabledMessage == null) {
                worldFacingCameraEnabledMessage = ((k) toast).f124214c;
            }
            Integer toastBackgroundColor11 = toastSettings.getToastBackgroundColor();
            int iIntValue11 = toastBackgroundColor11 != null ? toastBackgroundColor11.intValue() : toast.f124219b;
            Integer toastTextColor11 = toastSettings.getToastTextColor();
            qVar = new q(worldFacingCameraEnabledMessage, iIntValue11, toastTextColor11 != null ? toastTextColor11.intValue() : toast.f124218a);
        } else if (toast instanceof c) {
            String str = ((c) toast).f124201c;
            Integer toastBackgroundColor12 = toastSettings.getToastBackgroundColor();
            int iIntValue12 = toastBackgroundColor12 != null ? toastBackgroundColor12.intValue() : toast.f124219b;
            Integer toastTextColor12 = toastSettings.getToastTextColor();
            qVar = new q(str, iIntValue12, toastTextColor12 != null ? toastTextColor12.intValue() : toast.f124218a);
        } else {
            if (!(toast instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = (d) toast;
            qVar = new q(dVar.f124202c, dVar.f124203d, dVar.f124204e);
        }
        if (!this.f124226b.getToastSettings().getToastEnabled() || qVar.f124221a.length() <= 0) {
            return;
        }
        ((z) this.f124227c).f124234a.removeCallbacksAndMessages(null);
        this.f124228d = toast;
        this.f124225a.a(qVar.f124221a, qVar.f124222b, qVar.f124223c);
        n nVar = this.f124228d;
        if ((nVar instanceof e) || (nVar instanceof d)) {
            return;
        }
        ((z) this.f124227c).a(this.f124229e, this.f124226b.getToastSettings().getToastDuration());
    }

    public s(SparkScanViewMiniPreview toastHolder, SparkScanViewSettings settings) {
        z handler = new z();
        Intrinsics.j(toastHolder, "toastHolder");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(handler, "handler");
        this.f124225a = toastHolder;
        this.f124226b = settings;
        this.f124227c = handler;
        this.f124229e = new r(this);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void release() {
        ((z) this.f124227c).f124234a.removeCallbacksAndMessages(null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.ui.toast.SparkScanViewToastPresenter
    public final void a() {
        n nVar = this.f124228d;
        if (nVar instanceof e) {
            this.f124228d = null;
            this.f124225a.i();
        } else if (nVar instanceof d) {
            this.f124228d = null;
            this.f124225a.i();
        }
    }
}

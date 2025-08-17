package com.scandit.datacapture.barcode.count.serialization;

import android.content.Context;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountNotInListActionSettings;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightType;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.AnchorDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountViewDeserializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "", "json", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "viewFromJson", "(Landroid/content/Context;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "view", "", "updateViewFromJson", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;Ljava/lang/String;)V", "", "b", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "warnings", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeCountViewDeserializer {
    public static final String KEY_HW_TRIGGER_ENABLED = "hardwareTriggerEnabled";
    public static final String KEY_HW_TRIGGER_KEY_CODE = "hardwareTriggerKeyCode";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f120737a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f120738b;

    public final List<String> getWarnings() {
        return this.f120738b;
    }

    public final void updateViewFromJson(BarcodeCountView view, String json) {
        BarcodeFilterHighlightSettings barcodeFilterHighlightSettings_create;
        BarcodeCountToolbarSettings barcodeCountToolbarSettings;
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        this.f120737a.clear();
        JsonValue jsonValue = new JsonValue(json);
        if (jsonValue.contains("style")) {
            this.f120737a.add("Can't use while updating: \"style\"");
        }
        Boolean boolValueOf = !jsonValue.contains("shouldDisableModeOnExitButtonTapped") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldDisableModeOnExitButtonTapped", false));
        if (boolValueOf != null) {
            view.setShouldDisableModeOnExitButtonTapped(boolValueOf.booleanValue());
        }
        Boolean boolValueOf2 = !jsonValue.contains("shouldShowClearHighlightsButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowClearHighlightsButton", false));
        if (boolValueOf2 != null) {
            view.setShouldShowClearHighlightsButton(boolValueOf2.booleanValue());
        }
        Boolean boolValueOf3 = !jsonValue.contains("shouldShowExitButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowExitButton", false));
        if (boolValueOf3 != null) {
            view.setShouldShowExitButton(boolValueOf3.booleanValue());
        }
        Boolean boolValueOf4 = !jsonValue.contains("shouldShowFloatingShutterButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowFloatingShutterButton", false));
        if (boolValueOf4 != null) {
            view.setShouldShowFloatingShutterButton(boolValueOf4.booleanValue());
        }
        Boolean boolValueOf5 = !jsonValue.contains("shouldShowListButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowListButton", false));
        if (boolValueOf5 != null) {
            view.setShouldShowListButton(boolValueOf5.booleanValue());
        }
        Boolean boolValueOf6 = !jsonValue.contains("shouldShowShutterButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowShutterButton", false));
        if (boolValueOf6 != null) {
            view.setShouldShowShutterButton(boolValueOf6.booleanValue());
        }
        Boolean boolValueOf7 = !jsonValue.contains("shouldShowSingleScanButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowSingleScanButton", false));
        if (boolValueOf7 != null) {
            view.setShouldShowSingleScanButton(boolValueOf7.booleanValue());
        }
        Boolean boolValueOf8 = !jsonValue.contains("shouldShowStatusModeButton") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowStatusModeButton", false));
        if (boolValueOf8 != null) {
            view.setShouldShowStatusModeButton(boolValueOf8.booleanValue());
        }
        Boolean boolValueOf9 = !jsonValue.contains("shouldShowToolbar") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowToolbar", false));
        if (boolValueOf9 != null) {
            view.setShouldShowToolbar(boolValueOf9.booleanValue());
        }
        Boolean boolValueOf10 = !jsonValue.contains("shouldShowUserGuidanceView") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowUserGuidanceView", false));
        if (boolValueOf10 != null) {
            view.setShouldShowUserGuidanceView(boolValueOf10.booleanValue());
        }
        Boolean boolValueOf11 = !jsonValue.contains("shouldShowListProgressBar") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowListProgressBar", false));
        if (boolValueOf11 != null) {
            view.setShouldShowListProgressBar(boolValueOf11.booleanValue());
        }
        Boolean boolValueOf12 = !jsonValue.contains("tapToUncountEnabled") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("tapToUncountEnabled", false));
        if (boolValueOf12 != null) {
            view.setTapToUncountEnabled(boolValueOf12.booleanValue());
        }
        Boolean boolValueOf13 = !jsonValue.contains("shouldShowStatusIconsOnScan") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowStatusIconsOnScan", false));
        if (boolValueOf13 != null) {
            view.setShouldShowStatusIconsOnScan(boolValueOf13.booleanValue());
        }
        Boolean boolValueOf14 = !jsonValue.contains("shouldShowScanAreaGuides") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowScanAreaGuides", false));
        if (boolValueOf14 != null) {
            view.setShouldShowScanAreaGuides(boolValueOf14.booleanValue());
        }
        Brush brushA = a(jsonValue, "recognizedBrush");
        if (brushA != null) {
            view.setRecognizedBrush(brushA);
        }
        Brush brushA2 = a(jsonValue, "notInListBrush");
        if (brushA2 != null) {
            view.setNotInListBrush(brushA2);
        }
        Brush brushA3 = a(jsonValue, "acceptedBrush");
        if (brushA3 != null) {
            view.setAcceptedBrush(brushA3);
        }
        Brush brushA4 = a(jsonValue, "rejectedBrush");
        if (brushA4 != null) {
            view.setRejectedBrush(brushA4);
        }
        Boolean boolValueOf15 = !jsonValue.contains("shouldShowHints") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowHints", false));
        if (boolValueOf15 != null) {
            view.setShouldShowHints(boolValueOf15.booleanValue());
        }
        JsonValue byKeyAsObject = jsonValue.getByKeyAsObject("filterSettings", null);
        if (byKeyAsObject == null) {
            barcodeFilterHighlightSettings_create = null;
        } else {
            barcodeFilterHighlightSettings_create = BarcodeFilterHighlightSettings.INSTANCE._create();
            Brush brushA5 = a(byKeyAsObject, "brush");
            if (brushA5 != null) {
                barcodeFilterHighlightSettings_create._setBrush(brushA5);
            }
            BarcodeFilterHighlightType barcodeFilterHighlightType = BarcodeFilterHighlightType.BRUSH;
            Intrinsics.e(byKeyAsObject.getByKeyAsString("highlightType", ""), "brush");
            barcodeFilterHighlightSettings_create._setHighlightType(barcodeFilterHighlightType);
        }
        if (barcodeFilterHighlightSettings_create != null) {
            view.setFilterSettings(barcodeFilterHighlightSettings_create);
        }
        String byKeyAsString = !jsonValue.contains("clearHighlightsButtonText") ? null : jsonValue.getByKeyAsString("clearHighlightsButtonText", "");
        if (byKeyAsString != null) {
            view.setClearHighlightsButtonText(byKeyAsString);
        }
        String byKeyAsString2 = !jsonValue.contains("exitButtonText") ? null : jsonValue.getByKeyAsString("exitButtonText", "");
        if (byKeyAsString2 != null) {
            view.setExitButtonText(byKeyAsString2);
        }
        String byKeyAsString3 = !jsonValue.contains("clearHighlightsButtonContentDescription") ? null : jsonValue.getByKeyAsString("clearHighlightsButtonContentDescription", "");
        if (byKeyAsString3 != null) {
            view.setClearHighlightsButtonContentDescription(byKeyAsString3);
        }
        String byKeyAsString4 = !jsonValue.contains("exitButtonContentDescription") ? null : jsonValue.getByKeyAsString("exitButtonContentDescription", "");
        if (byKeyAsString4 != null) {
            view.setExitButtonContentDescription(byKeyAsString4);
        }
        String byKeyAsString5 = !jsonValue.contains("floatingShutterButtonContentDescription") ? null : jsonValue.getByKeyAsString("floatingShutterButtonContentDescription", "");
        if (byKeyAsString5 != null) {
            view.setFloatingShutterButtonContentDescription(byKeyAsString5);
        }
        String byKeyAsString6 = !jsonValue.contains("listButtonContentDescription") ? null : jsonValue.getByKeyAsString("listButtonContentDescription", "");
        if (byKeyAsString6 != null) {
            view.setListButtonContentDescription(byKeyAsString6);
        }
        String byKeyAsString7 = !jsonValue.contains("singleScanButtonContentDescription") ? null : jsonValue.getByKeyAsString("singleScanButtonContentDescription", "");
        if (byKeyAsString7 != null) {
            view.setSingleScanButtonContentDescription(byKeyAsString7);
        }
        String byKeyAsString8 = !jsonValue.contains("shutterButtonContentDescription") ? null : jsonValue.getByKeyAsString("shutterButtonContentDescription", "");
        if (byKeyAsString8 != null) {
            view.setShutterButtonContentDescription(byKeyAsString8);
        }
        String byKeyAsString9 = !jsonValue.contains("statusModeButtonContentDescription") ? null : jsonValue.getByKeyAsString("statusModeButtonContentDescription", "");
        if (byKeyAsString9 != null) {
            view.setStatusModeButtonContentDescription(byKeyAsString9);
        }
        JsonValue byKeyAsObject2 = jsonValue.getByKeyAsObject("toolbarSettings", null);
        if (byKeyAsObject2 == null) {
            barcodeCountToolbarSettings = null;
        } else {
            barcodeCountToolbarSettings = new BarcodeCountToolbarSettings();
            String byKeyAsString10 = !byKeyAsObject2.contains("audioOnButtonText") ? null : byKeyAsObject2.getByKeyAsString("audioOnButtonText", "");
            if (byKeyAsString10 != null) {
                barcodeCountToolbarSettings.setAudioOnButtonText(byKeyAsString10);
            }
            String byKeyAsString11 = !byKeyAsObject2.contains("audioOffButtonText") ? null : byKeyAsObject2.getByKeyAsString("audioOffButtonText", "");
            if (byKeyAsString11 != null) {
                barcodeCountToolbarSettings.setAudioOffButtonText(byKeyAsString11);
            }
            String byKeyAsString12 = !byKeyAsObject2.contains("audioButtonContentDescription") ? null : byKeyAsObject2.getByKeyAsString("audioButtonContentDescription", "");
            if (byKeyAsString12 != null) {
                barcodeCountToolbarSettings.setAudioButtonContentDescription(byKeyAsString12);
            }
            String byKeyAsString13 = !byKeyAsObject2.contains("vibrationOnButtonText") ? null : byKeyAsObject2.getByKeyAsString("vibrationOnButtonText", "");
            if (byKeyAsString13 != null) {
                barcodeCountToolbarSettings.setVibrationOnButtonText(byKeyAsString13);
            }
            String byKeyAsString14 = !byKeyAsObject2.contains("vibrationOffButtonText") ? null : byKeyAsObject2.getByKeyAsString("vibrationOffButtonText", "");
            if (byKeyAsString14 != null) {
                barcodeCountToolbarSettings.setVibrationOffButtonText(byKeyAsString14);
            }
            String byKeyAsString15 = !byKeyAsObject2.contains("vibrationButtonContentDescription") ? null : byKeyAsObject2.getByKeyAsString("vibrationButtonContentDescription", "");
            if (byKeyAsString15 != null) {
                barcodeCountToolbarSettings.setVibrationButtonContentDescription(byKeyAsString15);
            }
            String byKeyAsString16 = !byKeyAsObject2.contains("strapModeOnButtonText") ? null : byKeyAsObject2.getByKeyAsString("strapModeOnButtonText", "");
            if (byKeyAsString16 != null) {
                barcodeCountToolbarSettings.setStrapModeOnButtonText(byKeyAsString16);
            }
            String byKeyAsString17 = !byKeyAsObject2.contains("strapModeOffButtonText") ? null : byKeyAsObject2.getByKeyAsString("strapModeOffButtonText", "");
            if (byKeyAsString17 != null) {
                barcodeCountToolbarSettings.setStrapModeOffButtonText(byKeyAsString17);
            }
            String byKeyAsString18 = !byKeyAsObject2.contains("strapModeButtonContentDescription") ? null : byKeyAsObject2.getByKeyAsString("strapModeButtonContentDescription", "");
            if (byKeyAsString18 != null) {
                barcodeCountToolbarSettings.setStrapModeButtonContentDescription(byKeyAsString18);
            }
            String byKeyAsString19 = !byKeyAsObject2.contains("colorSchemeOnButtonText") ? null : byKeyAsObject2.getByKeyAsString("colorSchemeOnButtonText", "");
            if (byKeyAsString19 != null) {
                barcodeCountToolbarSettings.setColorSchemeOnButtonText(byKeyAsString19);
            }
            String byKeyAsString20 = !byKeyAsObject2.contains("colorSchemeOffButtonText") ? null : byKeyAsObject2.getByKeyAsString("colorSchemeOffButtonText", "");
            if (byKeyAsString20 != null) {
                barcodeCountToolbarSettings.setColorSchemeOffButtonText(byKeyAsString20);
            }
            String byKeyAsString21 = !byKeyAsObject2.contains("colorSchemeButtonContentDescription") ? null : byKeyAsObject2.getByKeyAsString("colorSchemeButtonContentDescription", "");
            if (byKeyAsString21 != null) {
                barcodeCountToolbarSettings.setColorSchemeButtonContentDescription(byKeyAsString21);
            }
        }
        if (barcodeCountToolbarSettings != null) {
            view.setToolbarSettings(barcodeCountToolbarSettings);
        }
        BarcodeCountNotInListActionSettings barcodeCountNotInListActionSettings = new BarcodeCountNotInListActionSettings();
        JsonValue byKeyAsObject3 = jsonValue.getByKeyAsObject("barcodeNotInListActionSettings", null);
        if (byKeyAsObject3 != null) {
            barcodeCountNotInListActionSettings = new BarcodeCountNotInListActionSettings();
            Boolean boolValueOf16 = !byKeyAsObject3.contains("enabled") ? null : Boolean.valueOf(byKeyAsObject3.getByKeyAsBoolean("enabled", false));
            if (boolValueOf16 != null) {
                barcodeCountNotInListActionSettings.setEnabled(boolValueOf16.booleanValue());
            }
            String byKeyAsString22 = !byKeyAsObject3.contains("acceptButtonText") ? null : byKeyAsObject3.getByKeyAsString("acceptButtonText", "");
            if (byKeyAsString22 != null) {
                barcodeCountNotInListActionSettings.setAcceptButtonText(byKeyAsString22);
            }
            String byKeyAsString23 = !byKeyAsObject3.contains("acceptButtonContentDescription") ? null : byKeyAsObject3.getByKeyAsString("acceptButtonContentDescription", "");
            if (byKeyAsString23 != null) {
                barcodeCountNotInListActionSettings.setAcceptButtonContentDescription(byKeyAsString23);
            }
            String byKeyAsString24 = !byKeyAsObject3.contains("rejectButtonText") ? null : byKeyAsObject3.getByKeyAsString("rejectButtonText", "");
            if (byKeyAsString24 != null) {
                barcodeCountNotInListActionSettings.setRejectButtonText(byKeyAsString24);
            }
            String byKeyAsString25 = !byKeyAsObject3.contains("rejectButtonContentDescription") ? null : byKeyAsObject3.getByKeyAsString("rejectButtonContentDescription", "");
            if (byKeyAsString25 != null) {
                barcodeCountNotInListActionSettings.setRejectButtonContentDescription(byKeyAsString25);
            }
            String byKeyAsString26 = !byKeyAsObject3.contains("cancelButtonText") ? null : byKeyAsObject3.getByKeyAsString("cancelButtonText", "");
            if (byKeyAsString26 != null) {
                barcodeCountNotInListActionSettings.setCancelButtonText(byKeyAsString26);
            }
            String byKeyAsString27 = !byKeyAsObject3.contains("cancelButtonContentDescription") ? null : byKeyAsObject3.getByKeyAsString("cancelButtonContentDescription", "");
            if (byKeyAsString27 != null) {
                barcodeCountNotInListActionSettings.setCancelButtonContentDescription(byKeyAsString27);
            }
            String byKeyAsString28 = !byKeyAsObject3.contains("barcodeAcceptedHint") ? null : byKeyAsObject3.getByKeyAsString("barcodeAcceptedHint", "");
            if (byKeyAsString28 != null) {
                barcodeCountNotInListActionSettings.setBarcodeAcceptedHint(byKeyAsString28);
            }
            String byKeyAsString29 = !byKeyAsObject3.contains("barcodeRejectedHint") ? null : byKeyAsObject3.getByKeyAsString("barcodeRejectedHint", "");
            if (byKeyAsString29 != null) {
                barcodeCountNotInListActionSettings.setBarcodeRejectedHint(byKeyAsString29);
            }
        }
        view.setBarcodeNotInListActionSettings(barcodeCountNotInListActionSettings);
        String byKeyAsString30 = !jsonValue.contains("textForBarcodesNotInListDetectedHint") ? null : jsonValue.getByKeyAsString("textForBarcodesNotInListDetectedHint", "");
        if (byKeyAsString30 != null) {
            view.setTextForBarcodesNotInListDetectedHint(byKeyAsString30);
        }
        String byKeyAsString31 = !jsonValue.contains("textForTapShutterToScanHint") ? null : jsonValue.getByKeyAsString("textForTapShutterToScanHint", "");
        if (byKeyAsString31 != null) {
            view.setTextForTapShutterToScanHint(byKeyAsString31);
        }
        String byKeyAsString32 = !jsonValue.contains("textForScanningHint") ? null : jsonValue.getByKeyAsString("textForScanningHint", "");
        if (byKeyAsString32 != null) {
            view.setTextForScanningHint(byKeyAsString32);
        }
        String byKeyAsString33 = !jsonValue.contains("textForMoveCloserAndRescanHint") ? null : jsonValue.getByKeyAsString("textForMoveCloserAndRescanHint", "");
        if (byKeyAsString33 != null) {
            view.setTextForMoveCloserAndRescanHint(byKeyAsString33);
        }
        String byKeyAsString34 = !jsonValue.contains("textForMoveFurtherAndRescanHint") ? null : jsonValue.getByKeyAsString("textForMoveFurtherAndRescanHint", "");
        if (byKeyAsString34 != null) {
            view.setTextForMoveFurtherAndRescanHint(byKeyAsString34);
        }
        String byKeyAsString35 = !jsonValue.contains("textForTapToUncountHint") ? null : jsonValue.getByKeyAsString("textForTapToUncountHint", "");
        if (byKeyAsString35 != null) {
            view.setTextForTapToUncountHint(byKeyAsString35);
        }
        Boolean boolValueOf17 = !jsonValue.contains("shouldShowTorchControl") ? null : Boolean.valueOf(jsonValue.getByKeyAsBoolean("shouldShowTorchControl", false));
        if (boolValueOf17 != null) {
            view.setShouldShowTorchControl(boolValueOf17.booleanValue());
        }
        String byKeyAsString36 = !jsonValue.contains("torchControlPosition") ? null : jsonValue.getByKeyAsString("torchControlPosition", "");
        Anchor anchorFromJson = byKeyAsString36 != null ? AnchorDeserializer.fromJson(byKeyAsString36) : null;
        if (anchorFromJson != null) {
            view.setTorchControlPosition(anchorFromJson);
        }
        if (jsonValue.contains("scanningDelayMs")) {
            view.set_scanningDelayMs(jsonValue.getByKeyAsInt("scanningDelayMs", 0));
        }
        if (jsonValue.getByKeyAsBoolean(KEY_HW_TRIGGER_ENABLED, false)) {
            view.enableHardwareTrigger(jsonValue.contains(KEY_HW_TRIGGER_KEY_CODE) ? Integer.valueOf(jsonValue.getByKeyAsInt(KEY_HW_TRIGGER_KEY_CODE, 0)) : null);
        }
        this.f120737a.addAll(jsonValue._getWarnings());
    }

    public final BarcodeCountView viewFromJson(Context context, DataCaptureContext dataCaptureContext, BarcodeCount mode, String json) {
        Intrinsics.j(context, "context");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        BarcodeCountViewStyle barcodeCountViewStyle = BarcodeCountViewStyle.ICON;
        String byKeyAsString = jsonValue.getByKeyAsString("style", "");
        if (Intrinsics.e(byKeyAsString, "dot")) {
            barcodeCountViewStyle = BarcodeCountViewStyle.DOT;
        } else {
            Intrinsics.e(byKeyAsString, BarcodePickDeserializer.FIELD_ICON);
        }
        jsonValue._removeKeys(CollectionsKt.g("style"));
        BarcodeCountView barcodeCountViewNewInstance = BarcodeCountView.INSTANCE.newInstance(context, dataCaptureContext, mode, barcodeCountViewStyle);
        updateViewFromJson(barcodeCountViewNewInstance, jsonValue.jsonString());
        return barcodeCountViewNewInstance;
    }

    public BarcodeCountViewDeserializer() {
        ArrayList arrayList = new ArrayList();
        this.f120737a = arrayList;
        this.f120738b = arrayList;
    }

    private static Brush a(JsonValue jsonValue, String str) {
        if (!jsonValue.contains(str)) {
            return null;
        }
        try {
            return jsonValue.requireByKeyAsBrush(str);
        } catch (Exception unused) {
            return null;
        }
    }
}

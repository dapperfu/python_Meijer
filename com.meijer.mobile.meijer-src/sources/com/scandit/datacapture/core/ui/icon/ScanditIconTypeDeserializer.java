package com.scandit.datacapture.core.ui.icon;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconTypeDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ScanditIconTypeDeserializer {
    public static final ScanditIconTypeDeserializer INSTANCE = new ScanditIconTypeDeserializer();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @JvmStatic
    public static final ScanditIconType fromJson(String json) {
        Intrinsics.j(json, "json");
        switch (json.hashCode()) {
            case -2060414595:
                if (json.equals("chevronDown")) {
                    return ScanditIconType.CHEVRON_DOWN;
                }
                break;
            case -2060186398:
                if (json.equals("chevronLeft")) {
                    return ScanditIconType.CHEVRON_LEFT;
                }
                break;
            case -2050581597:
                if (json.equals("fragileItem")) {
                    return ScanditIconType.FRAGILE_ITEM;
                }
                break;
            case -1970865964:
                if (json.equals("starOutlined")) {
                    return ScanditIconType.STAR_OUTLINED;
                }
                break;
            case -1834264542:
                if (json.equals("lowStock")) {
                    return ScanditIconType.LOW_STOCK;
                }
                break;
            case -1741915245:
                if (json.equals("arrowRight")) {
                    return ScanditIconType.ARROW_RIGHT;
                }
                break;
            case -1528289465:
                if (json.equals("inspectItem")) {
                    return ScanditIconType.INSPECT_ITEM;
                }
                break;
            case -1026432949:
                if (json.equals("arrowDown")) {
                    return ScanditIconType.ARROW_DOWN;
                }
                break;
            case -1026204752:
                if (json.equals("arrowLeft")) {
                    return ScanditIconType.ARROW_LEFT;
                }
                break;
            case -868987588:
                if (json.equals("toPick")) {
                    return ScanditIconType.TO_PICK;
                }
                break;
            case -734027644:
                if (json.equals("arrowUp")) {
                    return ScanditIconType.ARROW_UP;
                }
                break;
            case -546521504:
                if (json.equals("wrongItem")) {
                    return ScanditIconType.WRONG_ITEM;
                }
                break;
            case -216871206:
                if (json.equals("exclamationMark")) {
                    return ScanditIconType.EXCLAMATION_MARK;
                }
                break;
            case -172338221:
                if (json.equals("questionMark")) {
                    return ScanditIconType.QUESTION_MARK;
                }
                break;
            case -92832808:
                if (json.equals("expiredItem")) {
                    return ScanditIconType.EXPIRED_ITEM;
                }
                break;
            case 106934957:
                if (json.equals("print")) {
                    return ScanditIconType.PRINT;
                }
                break;
            case 113213285:
                if (json.equals("xMark")) {
                    return ScanditIconType.X_MARK;
                }
                break;
            case 149277543:
                if (json.equals("starHalfFilled")) {
                    return ScanditIconType.STAR_HALF_FILLED;
                }
                break;
            case 399321045:
                if (json.equals("checkmark")) {
                    return ScanditIconType.CHECKMARK;
                }
                break;
            case 564392097:
                if (json.equals("chevronRight")) {
                    return ScanditIconType.CHEVRON_RIGHT;
                }
                break;
            case 949810742:
                if (json.equals("chevronUp")) {
                    return ScanditIconType.CHEVRON_UP;
                }
                break;
            case 1413880404:
                if (json.equals("starFilled")) {
                    return ScanditIconType.STAR_FILLED;
                }
                break;
        }
        throw new IllegalArgumentException("No match found for ".concat(json));
    }

    private ScanditIconTypeDeserializer() {
    }
}

package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.AnchorDeserializer;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.module.ui.control.layout.ControlLayout;
import com.scandit.datacapture.core.internal.sdk.common.camera.CameraSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.torch.TorchSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.zoom.ZoomSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "currentControls", "Lkotlin/Function4;", "Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer$ControlAction;", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "", "callback", "deserializeControl", "(Landroid/content/Context;Lcom/scandit/datacapture/core/json/JsonValue;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "ControlAction", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ControlDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private static final PointWithUnit f125433a = PointWithUnitUtilsKt.PointWithUnit(-1.0f, -1.0f, MeasureUnit.PIXEL);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer$ControlAction;", "", "ADD", "UPDATE", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class ControlAction {
        public static final ControlAction ADD;
        public static final ControlAction UPDATE;

        /* renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ ControlAction[] f125434a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f125435b;

        public static EnumEntries<ControlAction> getEntries() {
            return f125435b;
        }

        public static ControlAction valueOf(String str) {
            return (ControlAction) Enum.valueOf(ControlAction.class, str);
        }

        public static ControlAction[] values() {
            return (ControlAction[]) f125434a.clone();
        }

        static {
            ControlAction controlAction = new ControlAction("ADD", 0);
            ADD = controlAction;
            ControlAction controlAction2 = new ControlAction("UPDATE", 1);
            UPDATE = controlAction2;
            ControlAction[] controlActionArr = {controlAction, controlAction2};
            f125434a = controlActionArr;
            f125435b = EnumEntriesKt.a(controlActionArr);
        }

        private ControlAction(String str, int i10) {
        }
    }

    public final void deserializeControl(Context context, JsonValue json, List<? extends Control> currentControls, Function4<? super Control, ? super ControlAction, ? super Anchor, ? super PointWithUnit, Unit> callback) {
        Object control;
        ControlAction controlAction;
        Anchor anchorFromJson;
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        Intrinsics.j(currentControls, "currentControls");
        Intrinsics.j(callback, "callback");
        String strRequireByKeyAsString = json.requireByKeyAsString("type");
        if (Intrinsics.e(strRequireByKeyAsString, "linearGroup")) {
            control = LinearControlGroupDeserializer.fromJson(context, json);
            controlAction = ControlAction.ADD;
        } else {
            int iHashCode = strRequireByKeyAsString.hashCode();
            Object obj = null;
            if (iHashCode != -1367751899) {
                if (iHashCode != 3744723) {
                    if (iHashCode == 110547964 && strRequireByKeyAsString.equals("torch")) {
                        Iterator<T> it = currentControls.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((Control) next) instanceof TorchSwitchControl) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (Control) obj;
                    }
                } else if (strRequireByKeyAsString.equals("zoom")) {
                    Iterator<T> it2 = currentControls.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((Control) next2) instanceof ZoomSwitchControl) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (Control) obj;
                }
            } else if (strRequireByKeyAsString.equals("camera")) {
                Iterator<T> it3 = currentControls.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (((Control) next3) instanceof CameraSwitchControl) {
                        obj = next3;
                        break;
                    }
                }
                obj = (Control) obj;
            }
            if (obj == null) {
                int iHashCode2 = strRequireByKeyAsString.hashCode();
                if (iHashCode2 == -1367751899) {
                    if (strRequireByKeyAsString.equals("camera")) {
                        control = CameraSwitchControlDeserializer.fromJson(context, json);
                        controlAction = ControlAction.ADD;
                    }
                    throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                }
                if (iHashCode2 == 3744723) {
                    if (strRequireByKeyAsString.equals("zoom")) {
                        control = ZoomSwitchControlDeserializer.fromJson(context, json);
                        controlAction = ControlAction.ADD;
                    }
                    throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                }
                if (iHashCode2 == 110547964 && strRequireByKeyAsString.equals("torch")) {
                    control = TorchSwitchControlDeserializer.fromJson(context, json);
                    controlAction = ControlAction.ADD;
                }
                throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
            }
            if (obj instanceof TorchSwitchControl) {
                TorchSwitchControlDeserializer.updateFromJson((TorchSwitchControl) obj, json);
            } else if (obj instanceof CameraSwitchControl) {
                CameraSwitchControlDeserializer.updateFromJson((CameraSwitchControl) obj, json);
            } else if (obj instanceof ZoomSwitchControl) {
                ZoomSwitchControlDeserializer.updateFromJson((ZoomSwitchControl) obj, json);
            }
            controlAction = ControlAction.UPDATE;
            control = obj;
        }
        String byKeyAsString = json.getByKeyAsString("anchor", "none");
        if (Intrinsics.e(byKeyAsString, "none")) {
            int i10 = ControlLayout.f125193c;
            Intrinsics.j(control, "control");
            anchorFromJson = control instanceof TorchSwitchControl ? Anchor.TOP_LEFT : control instanceof CameraSwitchControl ? Anchor.TOP_RIGHT : ((control instanceof ZoomSwitchControl) || (control instanceof LinearControlGroup)) ? Anchor.BOTTOM_RIGHT : Anchor.TOP_LEFT;
        } else {
            anchorFromJson = AnchorDeserializer.fromJson(byKeyAsString);
        }
        PointWithUnit pointWithUnit = f125433a;
        PointWithUnit byKeyAsPointWithUnit = json.getByKeyAsPointWithUnit("offset", pointWithUnit);
        if (Intrinsics.e(byKeyAsPointWithUnit, pointWithUnit)) {
            byKeyAsPointWithUnit = AnchorExtensionsKt.getDefaultOffset(anchorFromJson);
        }
        callback.invoke(control, controlAction, anchorFromJson, byKeyAsPointWithUnit);
    }
}

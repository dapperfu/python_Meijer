package com.scandit.datacapture.core.internal.sdk.engine;

import com.scandit.datacapture.core.internal.sdk.engine.EngineProperty;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEngineProperty", "Lcom/scandit/datacapture/core/internal/sdk/engine/EngineProperty;", "Lcom/scandit/datacapture/core/internal/sdk/engine/NativeProperty;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnginePropertyKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativePropertyType.values().length];
            try {
                iArr[NativePropertyType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativePropertyType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NativePropertyType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NativePropertyType.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NativePropertyType.FOCUS_STRATEGY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NativePropertyType.REGION_STRATEGY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NativePropertyType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EngineProperty toEngineProperty(NativeProperty nativeProperty) {
        Intrinsics.j(nativeProperty, "<this>");
        NativePropertyType nativePropertyType = nativeProperty.type;
        switch (nativePropertyType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nativePropertyType.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new EngineProperty.DataInt(nativeProperty);
            case 2:
                return new EngineProperty.DataFloat(nativeProperty);
            case 3:
                return new EngineProperty.DataString(nativeProperty);
            case 4:
                return new EngineProperty.DataBool(nativeProperty);
        }
    }
}

package com.scandit.datacapture.barcode.find.ui;

import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u0001:\u0001;BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB1\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000eBG\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u000fBE\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010:\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindViewSettings;", "", "", "inListItemColor", "notInListItemColor", "progressBarStartColor", "progressBarFinishColor", "", "soundEnabled", "hapticEnabled", BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, "<init>", "(IIIIZZZLjava/lang/Integer;)V", "(IIZZ)V", "(IIZZZLjava/lang/Integer;)V", "(IIIIZZ)V", "", "name", "value", "", "_setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "toJson", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getInListItemColor", "b", "getNotInListItemColor", "c", "getProgressBarStartColor", "d", "getProgressBarFinishColor", "e", "Z", "getSoundEnabled", "()Z", "f", "getHapticEnabled", "g", "getHardwareTriggerEnabled", "h", "Ljava/lang/Integer;", "getHardwareTriggerKeyCode", "()Ljava/lang/Integer;", "Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "i", "Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "getForcedScreenCategory$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;", "setForcedScreenCategory$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/find/ui/ScreenSizeCategory;)V", "forcedScreenCategory", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFindViewSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int inListItemColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int notInListItemColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int progressBarStartColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int progressBarFinishColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean soundEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hapticEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean hardwareTriggerEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Integer hardwareTriggerKeyCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ ScreenSizeCategory forcedScreenCategory;

    public BarcodeFindViewSettings() {
        this(0, 0, 0, 0, false, false, false, null, l3.f92484c, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(BarcodeFindViewSettings.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings");
        BarcodeFindViewSettings barcodeFindViewSettings = (BarcodeFindViewSettings) other;
        return this.inListItemColor == barcodeFindViewSettings.inListItemColor && this.notInListItemColor == barcodeFindViewSettings.notInListItemColor && this.progressBarStartColor == barcodeFindViewSettings.progressBarStartColor && this.progressBarFinishColor == barcodeFindViewSettings.progressBarFinishColor && this.soundEnabled == barcodeFindViewSettings.soundEnabled && this.hapticEnabled == barcodeFindViewSettings.hapticEnabled && this.hardwareTriggerEnabled == barcodeFindViewSettings.hardwareTriggerEnabled && Intrinsics.e(this.hardwareTriggerKeyCode, barcodeFindViewSettings.hardwareTriggerKeyCode) && this.forcedScreenCategory == barcodeFindViewSettings.forcedScreenCategory;
    }

    public BarcodeFindViewSettings(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, Integer num) {
        this.inListItemColor = i10;
        this.notInListItemColor = i11;
        this.progressBarStartColor = i12;
        this.progressBarFinishColor = i13;
        this.soundEnabled = z10;
        this.hapticEnabled = z11;
        this.hardwareTriggerEnabled = z12;
        this.hardwareTriggerKeyCode = num;
    }

    public final void _setProperty(String name, Object value) {
        Intrinsics.j(name, "name");
        if (Intrinsics.e(name, "screenCategory") && (value instanceof String)) {
            this.forcedScreenCategory = ScreenSizeCategory.INSTANCE.fromJson((String) value);
        }
    }

    /* renamed from: getForcedScreenCategory$scandit_barcode_capture, reason: from getter */
    public final ScreenSizeCategory getForcedScreenCategory() {
        return this.forcedScreenCategory;
    }

    public final boolean getHapticEnabled() {
        return this.hapticEnabled;
    }

    public final boolean getHardwareTriggerEnabled() {
        return this.hardwareTriggerEnabled;
    }

    public final Integer getHardwareTriggerKeyCode() {
        return this.hardwareTriggerKeyCode;
    }

    public final int getInListItemColor() {
        return this.inListItemColor;
    }

    public final int getNotInListItemColor() {
        return this.notInListItemColor;
    }

    public final int getProgressBarFinishColor() {
        return this.progressBarFinishColor;
    }

    public final int getProgressBarStartColor() {
        return this.progressBarStartColor;
    }

    public final boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    public int hashCode() {
        int iHashCode = (Boolean.hashCode(this.hardwareTriggerEnabled) + ((Boolean.hashCode(this.hapticEnabled) + ((Boolean.hashCode(this.soundEnabled) + (((((((this.inListItemColor * 31) + this.notInListItemColor) * 31) + this.progressBarStartColor) * 31) + this.progressBarFinishColor) * 31)) * 31)) * 31)) * 31;
        Integer num = this.hardwareTriggerKeyCode;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        ScreenSizeCategory screenSizeCategory = this.forcedScreenCategory;
        return iIntValue + (screenSizeCategory != null ? screenSizeCategory.hashCode() : 0);
    }

    public final void setForcedScreenCategory$scandit_barcode_capture(ScreenSizeCategory screenSizeCategory) {
        this.forcedScreenCategory = screenSizeCategory;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inListItemColor", com.scandit.datacapture.barcode.internal.module.extensions.a.a(this.inListItemColor));
        jSONObject.put("notInListItemColor", com.scandit.datacapture.barcode.internal.module.extensions.a.a(this.notInListItemColor));
        jSONObject.put("progressBarStartColor", com.scandit.datacapture.barcode.internal.module.extensions.a.a(this.progressBarStartColor));
        jSONObject.put("progressBarFinishColor", com.scandit.datacapture.barcode.internal.module.extensions.a.a(this.progressBarFinishColor));
        jSONObject.put("soundEnabled", this.soundEnabled);
        jSONObject.put("hapticEnabled", this.hapticEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, this.hardwareTriggerEnabled);
        jSONObject.put(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, this.hardwareTriggerKeyCode);
        ScreenSizeCategory screenSizeCategory = this.forcedScreenCategory;
        if (screenSizeCategory != null) {
            jSONObject.put("screenCategory", screenSizeCategory.getF121004a());
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ BarcodeFindViewSettings(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -13712946 : i10, (i14 & 2) != 0 ? -1 : i11, (i14 & 4) != 0 ? 784453375 : i12, (i14 & 8) != 0 ? -1746868481 : i13, (i14 & 16) != 0 ? true : z10, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? false : z12, (i14 & 128) != 0 ? null : num);
    }

    public /* synthetic */ BarcodeFindViewSettings(int i10, int i11, boolean z10, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -13712946 : i10, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? true : z10, (i12 & 8) != 0 ? true : z11);
    }

    public BarcodeFindViewSettings(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, 784453375, -1746868481, z10, z11, false, (Integer) null);
    }

    public /* synthetic */ BarcodeFindViewSettings(int i10, int i11, boolean z10, boolean z11, boolean z12, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -13712946 : i10, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? true : z10, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : num);
    }

    public BarcodeFindViewSettings(int i10, int i11, boolean z10, boolean z11, boolean z12, Integer num) {
        this(i10, i11, 784453375, -1746868481, z10, z11, z12, num);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BarcodeFindViewSettings(int r2, int r3, int r4, int r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L7
            r2 = -13712946(0xffffffffff2ec1ce, float:-2.3229196E38)
        L7:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            r3 = -1
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L13
            r4 = 784453375(0x2ec1ceff, float:8.813394E-11)
        L13:
            r9 = r8 & 8
            if (r9 == 0) goto L1a
            r5 = -1746868481(0xffffffff97e0e6ff, float:-1.4533972E-24)
        L1a:
            r9 = r8 & 16
            r0 = 1
            if (r9 == 0) goto L20
            r6 = r0
        L20:
            r8 = r8 & 32
            if (r8 == 0) goto L2c
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L33
        L2c:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L33:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings.<init>(int, int, int, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public BarcodeFindViewSettings(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        this(i10, i11, i12, i13, z10, z11, false, (Integer) null);
    }
}

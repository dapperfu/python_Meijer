package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.icon.ScanditIconDeserializer;
import com.scandit.datacapture.core.ui.icon.ScanditIconSerializer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "", "toJson", "()Ljava/lang/String;", "Companion", "BarcodePickStatusIconStyleWithColors", "BarcodePickStatusIconStyleWithIcon", "BarcodePickStatusIconStyleWithScanditIcon", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithColors;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithIcon;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithScanditIcon;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class BarcodePickStatusIconStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithColors;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "iconColor", "iconBackgroundColor", "", "text", "<init>", "(IILjava/lang/String;)V", "toJson", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "copy", "(IILjava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithColors;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIconColor", "b", "getIconBackgroundColor", "c", "Ljava/lang/String;", "getText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BarcodePickStatusIconStyleWithColors extends BarcodePickStatusIconStyle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconColor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int iconBackgroundColor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String text;

        public static /* synthetic */ BarcodePickStatusIconStyleWithColors copy$default(BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors, int i10, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = barcodePickStatusIconStyleWithColors.iconColor;
            }
            if ((i12 & 2) != 0) {
                i11 = barcodePickStatusIconStyleWithColors.iconBackgroundColor;
            }
            if ((i12 & 4) != 0) {
                str = barcodePickStatusIconStyleWithColors.text;
            }
            return barcodePickStatusIconStyleWithColors.copy(i10, i11, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIconColor() {
            return this.iconColor;
        }

        /* renamed from: component2, reason: from getter */
        public final int getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final BarcodePickStatusIconStyleWithColors copy(int iconColor, int iconBackgroundColor, String text) {
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithColors(iconColor, iconBackgroundColor, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodePickStatusIconStyleWithColors)) {
                return false;
            }
            BarcodePickStatusIconStyleWithColors barcodePickStatusIconStyleWithColors = (BarcodePickStatusIconStyleWithColors) other;
            return this.iconColor == barcodePickStatusIconStyleWithColors.iconColor && this.iconBackgroundColor == barcodePickStatusIconStyleWithColors.iconBackgroundColor && Intrinsics.e(this.text, barcodePickStatusIconStyleWithColors.text);
        }

        public int hashCode() {
            return this.text.hashCode() + ((Integer.hashCode(this.iconBackgroundColor) + (Integer.hashCode(this.iconColor) * 31)) * 31);
        }

        public String toString() {
            return "BarcodePickStatusIconStyleWithColors(iconColor=" + this.iconColor + ", iconBackgroundColor=" + this.iconBackgroundColor + ", text=" + this.text + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodePickStatusIconStyleWithColors(int i10, int i11, String text) {
            super(null);
            Intrinsics.j(text, "text");
            this.iconColor = i10;
            this.iconBackgroundColor = i11;
            this.text = text;
        }

        public final int getIconBackgroundColor() {
            return this.iconBackgroundColor;
        }

        public final int getIconColor() {
            return this.iconColor;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "colors");
            jSONObject.put("text", this.text);
            jSONObject.put("iconColor", this.iconColor);
            jSONObject.put("iconBackgroundColor", this.iconBackgroundColor);
            String string = jSONObject.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithIcon;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "", "text", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "toJson", "()Ljava/lang/String;", "component1", "()Landroid/graphics/Bitmap;", "component2", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithIcon;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "getIcon", "b", "Ljava/lang/String;", "getText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BarcodePickStatusIconStyleWithIcon extends BarcodePickStatusIconStyle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap icon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String text;

        public static /* synthetic */ BarcodePickStatusIconStyleWithIcon copy$default(BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon, Bitmap bitmap, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bitmap = barcodePickStatusIconStyleWithIcon.icon;
            }
            if ((i10 & 2) != 0) {
                str = barcodePickStatusIconStyleWithIcon.text;
            }
            return barcodePickStatusIconStyleWithIcon.copy(bitmap, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final BarcodePickStatusIconStyleWithIcon copy(Bitmap icon, String text) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithIcon(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodePickStatusIconStyleWithIcon)) {
                return false;
            }
            BarcodePickStatusIconStyleWithIcon barcodePickStatusIconStyleWithIcon = (BarcodePickStatusIconStyleWithIcon) other;
            return Intrinsics.e(this.icon, barcodePickStatusIconStyleWithIcon.icon) && Intrinsics.e(this.text, barcodePickStatusIconStyleWithIcon.text);
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        public String toString() {
            return "BarcodePickStatusIconStyleWithIcon(icon=" + this.icon + ", text=" + this.text + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodePickStatusIconStyleWithIcon(Bitmap icon, String text) {
            super(null);
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public final Bitmap getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", BarcodePickDeserializer.FIELD_ICON);
            jSONObject.put("text", this.text);
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, BitmapExtensionsKt.toBase64(this.icon));
            String string = jSONObject.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithScanditIcon;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", BarcodePickDeserializer.FIELD_ICON, "", "text", "<init>", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;)V", "toJson", "()Ljava/lang/String;", "component1", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "component2", "copy", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$BarcodePickStatusIconStyleWithScanditIcon;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getIcon", "b", "Ljava/lang/String;", "getText", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BarcodePickStatusIconStyleWithScanditIcon extends BarcodePickStatusIconStyle {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ScanditIcon icon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String text;

        public static /* synthetic */ BarcodePickStatusIconStyleWithScanditIcon copy$default(BarcodePickStatusIconStyleWithScanditIcon barcodePickStatusIconStyleWithScanditIcon, ScanditIcon scanditIcon, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                scanditIcon = barcodePickStatusIconStyleWithScanditIcon.icon;
            }
            if ((i10 & 2) != 0) {
                str = barcodePickStatusIconStyleWithScanditIcon.text;
            }
            return barcodePickStatusIconStyleWithScanditIcon.copy(scanditIcon, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ScanditIcon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final BarcodePickStatusIconStyleWithScanditIcon copy(ScanditIcon icon, String text) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithScanditIcon(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BarcodePickStatusIconStyleWithScanditIcon)) {
                return false;
            }
            BarcodePickStatusIconStyleWithScanditIcon barcodePickStatusIconStyleWithScanditIcon = (BarcodePickStatusIconStyleWithScanditIcon) other;
            return Intrinsics.e(this.icon, barcodePickStatusIconStyleWithScanditIcon.icon) && Intrinsics.e(this.text, barcodePickStatusIconStyleWithScanditIcon.text);
        }

        public int hashCode() {
            return this.text.hashCode() + (this.icon.hashCode() * 31);
        }

        public String toString() {
            return "BarcodePickStatusIconStyleWithScanditIcon(icon=" + this.icon + ", text=" + this.text + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BarcodePickStatusIconStyleWithScanditIcon(ScanditIcon icon, String text) {
            super(null);
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            this.icon = icon;
            this.text = text;
        }

        public final ScanditIcon getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconStyle
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", BarcodePickDeserializer.FIELD_ICON);
            jSONObject.put("text", this.text);
            jSONObject.put(BarcodePickDeserializer.FIELD_ICON, new JSONObject(ScanditIconSerializer.toJson(this.icon)));
            String string = jSONObject.toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\rJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "text", "withIcon", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "", "iconColor", "iconBackgroundColor", "withColors", "(IILjava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodePickStatusIconStyle withIcon(Bitmap icon, String text) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithIcon(icon, text);
        }

        @JvmStatic
        public final BarcodePickStatusIconStyle fromJson(String jsonData) {
            Object objB;
            Intrinsics.j(jsonData, "jsonData");
            JsonValue jsonValue = new JsonValue(jsonData);
            String strRequireByKeyAsString = jsonValue.requireByKeyAsString("type");
            String strRequireByKeyAsString2 = jsonValue.requireByKeyAsString("text");
            if (!Intrinsics.e(strRequireByKeyAsString, BarcodePickDeserializer.FIELD_ICON)) {
                if (Intrinsics.e(strRequireByKeyAsString, "colors")) {
                    return withColors(jsonValue.requireByKeyAsInt("iconColor"), jsonValue.requireByKeyAsInt("iconBackgroundColor"), strRequireByKeyAsString2);
                }
                throw new IllegalStateException((strRequireByKeyAsString + " is not a valid BarcodePickStatusIconStyle type").toString());
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                JsonValue byKeyAsObject = jsonValue.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
                Intrinsics.g(byKeyAsObject);
                objB = Result.b(ScanditIconDeserializer.fromJson(byKeyAsObject.jsonString()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            if (Result.h(objB)) {
                return BarcodePickStatusIconStyle.INSTANCE.withIcon((ScanditIcon) objB, strRequireByKeyAsString2);
            }
            Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(jsonValue.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON));
            if (bitmapBitmapFromBase64 == null) {
                bitmapBitmapFromBase64 = BitmapFactory.decodeResource(AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources(), R.drawable.sc_pick_status_icon_default);
                Intrinsics.i(bitmapBitmapFromBase64, "decodeResource(...)");
            }
            return withIcon(bitmapBitmapFromBase64, strRequireByKeyAsString2);
        }

        @JvmStatic
        public final BarcodePickStatusIconStyle withColors(int iconColor, int iconBackgroundColor, String text) {
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithColors(iconColor, iconBackgroundColor, text);
        }

        @JvmStatic
        public final BarcodePickStatusIconStyle withIcon(ScanditIcon icon, String text) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(text, "text");
            return new BarcodePickStatusIconStyleWithScanditIcon(icon, text);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodePickStatusIconStyle fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    @JvmStatic
    public static final BarcodePickStatusIconStyle withColors(int i10, int i11, String str) {
        return INSTANCE.withColors(i10, i11, str);
    }

    @JvmStatic
    public static final BarcodePickStatusIconStyle withIcon(Bitmap bitmap, String str) {
        return INSTANCE.withIcon(bitmap, str);
    }

    public abstract String toJson();

    @JvmStatic
    public static final BarcodePickStatusIconStyle withIcon(ScanditIcon scanditIcon, String str) {
        return INSTANCE.withIcon(scanditIcon, str);
    }

    public BarcodePickStatusIconStyle(DefaultConstructorMarker defaultConstructorMarker) {
    }
}

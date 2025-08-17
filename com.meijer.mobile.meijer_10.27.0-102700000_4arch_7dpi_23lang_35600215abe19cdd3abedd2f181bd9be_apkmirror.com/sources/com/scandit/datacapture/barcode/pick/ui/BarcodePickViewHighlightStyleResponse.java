package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.icon.ScanditIconDeserializer;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushDeserializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 +2\u00020\u0001:\u0002,+B3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB;\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\r\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000eB;\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0012B'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\r\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0013B'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0014B9\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0006\u001a\u00020\u0015\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0016B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0006\u001a\u00020\u0015\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "brush", "selectedBrush", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", BarcodePickDeserializer.FIELD_ICON, "selectedIcon", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "statusIconStyle", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "Lcom/scandit/datacapture/core/ui/style/Brush;", "Landroid/graphics/Bitmap;", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/style/Brush;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "", "iconResource", "selectedIconResource", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/style/Brush;IILcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "(Lcom/scandit/datacapture/core/ui/style/Brush;Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "(Lcom/scandit/datacapture/core/ui/style/Brush;ILcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "", "toJson", "()Ljava/lang/String;", "a", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "getBrush$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickBrush;", "b", "getSelectedBrush$scandit_barcode_capture", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", "getIcon$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickIcon;", "d", "getSelectedIcon$scandit_barcode_capture", "e", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "getStatusIconStyle$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "Companion", "Builder", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickViewHighlightStyleResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickBrush brush;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickBrush selectedBrush;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickIcon icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickIcon selectedIcon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickStatusIconStyle statusIconStyle;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u000f\u0010\u0012J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\f\u0010\u0015J\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "selectedBrush", "setSelectedBrush", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "setIcon", "(Landroid/graphics/Bitmap;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "selectedIcon", "setSelectedIcon", "", "iconResource", "(I)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "selectedIconResource", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "statusIconStyle", "setStatusIconStyle", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "build", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "com/scandit/datacapture/barcode/pick/ui/A", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Brush f123703a;

        /* renamed from: b, reason: collision with root package name */
        private Brush f123704b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f123705c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap f123706d;

        /* renamed from: e, reason: collision with root package name */
        private int f123707e;

        /* renamed from: f, reason: collision with root package name */
        private int f123708f;

        /* renamed from: g, reason: collision with root package name */
        private ScanditIcon f123709g;

        /* renamed from: h, reason: collision with root package name */
        private ScanditIcon f123710h;

        /* renamed from: i, reason: collision with root package name */
        private BarcodePickStatusIconStyle f123711i;

        /* renamed from: j, reason: collision with root package name */
        private A f123712j;

        /* renamed from: k, reason: collision with root package name */
        private A f123713k;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[A.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    A a10 = A.f123637a;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    A a11 = A.f123637a;
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    A a12 = A.f123637a;
                    iArr[0] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Builder setIcon(Bitmap icon) {
            this.f123705c = icon;
            this.f123712j = A.f123638b;
            return this;
        }

        public final Builder setSelectedIcon(Bitmap selectedIcon) {
            this.f123706d = selectedIcon;
            this.f123713k = A.f123638b;
            return this;
        }

        public final BarcodePickViewHighlightStyleResponse build() {
            BarcodePickIcon barcodePickIconA;
            BarcodePickIcon barcodePickIconA2;
            BarcodePickBrush pVar;
            BarcodePickBrush pVar2;
            int iOrdinal = this.f123712j.ordinal();
            if (iOrdinal == 0) {
                barcodePickIconA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a;
            } else if (iOrdinal == 1) {
                barcodePickIconA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123705c, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a);
            } else if (iOrdinal == 2) {
                barcodePickIconA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123707e, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a);
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                barcodePickIconA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123709g, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a);
            }
            BarcodePickIcon barcodePickIcon = barcodePickIconA;
            int iOrdinal2 = this.f123713k.ordinal();
            if (iOrdinal2 == 0) {
                barcodePickIconA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a;
            } else if (iOrdinal2 == 1) {
                barcodePickIconA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123706d, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a);
            } else if (iOrdinal2 == 2) {
                barcodePickIconA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123708f, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a);
            } else {
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                barcodePickIconA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(this.f123710h, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a);
            }
            BarcodePickIcon barcodePickIcon2 = barcodePickIconA2;
            Brush brush = this.f123703a;
            if (brush == null) {
                pVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
            } else {
                Intrinsics.j(brush, "brush");
                pVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush);
            }
            Brush brush2 = this.f123704b;
            if (brush2 == null) {
                pVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
            } else {
                Intrinsics.j(brush2, "brush");
                pVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush2);
            }
            return new BarcodePickViewHighlightStyleResponse(pVar, pVar2, barcodePickIcon, barcodePickIcon2, this.f123711i);
        }

        public final Builder setBrush(Brush brush) {
            this.f123703a = brush;
            return this;
        }

        public final Builder setSelectedBrush(Brush selectedBrush) {
            this.f123704b = selectedBrush;
            return this;
        }

        public final Builder setStatusIconStyle(BarcodePickStatusIconStyle statusIconStyle) {
            this.f123711i = statusIconStyle;
            return this;
        }

        public Builder() {
            A a10 = A.f123637a;
            this.f123712j = a10;
            this.f123713k = a10;
        }

        public final Builder setIcon(int iconResource) {
            this.f123707e = iconResource;
            this.f123712j = A.f123639c;
            return this;
        }

        public final Builder setSelectedIcon(int selectedIconResource) {
            this.f123708f = selectedIconResource;
            this.f123713k = A.f123639c;
            return this;
        }

        public final Builder setIcon(ScanditIcon icon) {
            Intrinsics.j(icon, "icon");
            this.f123709g = icon;
            this.f123712j = A.f123640d;
            return this;
        }

        public final Builder setSelectedIcon(ScanditIcon selectedIcon) {
            this.f123710h = selectedIcon;
            this.f123713k = A.f123640d;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "builder", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleResponse$Builder;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }

        @JvmStatic
        public final BarcodePickViewHighlightStyleResponse fromJson(String jsonData) {
            Object objB;
            Object objB2;
            Intrinsics.j(jsonData, "jsonData");
            JsonValue json = new JsonValue(jsonData);
            Intrinsics.j(json, "json");
            JsonValue byKeyAsObject = json.getByKeyAsObject("brush", null);
            Brush brushFromJson = byKeyAsObject != null ? BrushDeserializer.fromJson(byKeyAsObject.jsonString()) : null;
            JsonValue byKeyAsObject2 = json.getByKeyAsObject("selectedBrush", null);
            Brush brushFromJson2 = byKeyAsObject2 != null ? BrushDeserializer.fromJson(byKeyAsObject2.jsonString()) : null;
            try {
                Result.Companion companion = Result.INSTANCE;
                JsonValue byKeyAsObject3 = json.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
                Intrinsics.g(byKeyAsObject3);
                objB = Result.b(ScanditIconDeserializer.fromJson(byKeyAsObject3.jsonString()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            if (Result.g(objB)) {
                objB = null;
            }
            ScanditIcon scanditIcon = (ScanditIcon) objB;
            Bitmap bitmapBitmapFromBase64 = scanditIcon == null ? BitmapExtensionsKt.bitmapFromBase64(json.getByKeyAsString(BarcodePickDeserializer.FIELD_ICON, "")) : null;
            try {
                JsonValue byKeyAsObject4 = json.getByKeyAsObject("selectedIcon", null);
                Intrinsics.g(byKeyAsObject4);
                objB2 = Result.b(ScanditIconDeserializer.fromJson(byKeyAsObject4.jsonString()));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objB2 = Result.b(ResultKt.a(th3));
            }
            if (Result.g(objB2)) {
                objB2 = null;
            }
            ScanditIcon scanditIcon2 = (ScanditIcon) objB2;
            Bitmap bitmapBitmapFromBase642 = scanditIcon2 == null ? BitmapExtensionsKt.bitmapFromBase64(json.getByKeyAsString("selectedIcon", "")) : null;
            JsonValue byKeyAsObject5 = json.getByKeyAsObject("statusIconStyle", null);
            BarcodePickStatusIconStyle barcodePickStatusIconStyleFromJson = byKeyAsObject5 != null ? BarcodePickStatusIconStyle.INSTANCE.fromJson(byKeyAsObject5.jsonString()) : null;
            Builder builder = BarcodePickViewHighlightStyleResponse.INSTANCE.builder();
            builder.setBrush(brushFromJson);
            builder.setSelectedBrush(brushFromJson2);
            if (scanditIcon != null) {
                builder.setIcon(scanditIcon);
            } else {
                builder.setIcon(bitmapBitmapFromBase64);
            }
            if (scanditIcon2 != null) {
                builder.setSelectedIcon(scanditIcon2);
            } else {
                builder.setSelectedIcon(bitmapBitmapFromBase642);
            }
            builder.setStatusIconStyle(barcodePickStatusIconStyleFromJson);
            return builder.build();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickViewHighlightStyleResponse(Brush brush, Brush brush2, int i10, int i11, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        BarcodePickBrush pVar;
        BarcodePickBrush pVar2;
        if (brush == null) {
            pVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush, "brush");
            pVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush);
        }
        if (brush2 == null) {
            pVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush2, "brush");
            pVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush2);
        }
        this(pVar, pVar2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(i10, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a), com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(i11, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a), barcodePickStatusIconStyle);
    }

    @JvmStatic
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final BarcodePickViewHighlightStyleResponse fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    /* renamed from: getBrush$scandit_barcode_capture, reason: from getter */
    public final BarcodePickBrush getBrush() {
        return this.brush;
    }

    /* renamed from: getIcon$scandit_barcode_capture, reason: from getter */
    public final BarcodePickIcon getIcon() {
        return this.icon;
    }

    /* renamed from: getSelectedBrush$scandit_barcode_capture, reason: from getter */
    public final BarcodePickBrush getSelectedBrush() {
        return this.selectedBrush;
    }

    /* renamed from: getSelectedIcon$scandit_barcode_capture, reason: from getter */
    public final BarcodePickIcon getSelectedIcon() {
        return this.selectedIcon;
    }

    /* renamed from: getStatusIconStyle$scandit_barcode_capture, reason: from getter */
    public final BarcodePickStatusIconStyle getStatusIconStyle() {
        return this.statusIconStyle;
    }

    public final String toJson() throws JSONException {
        String json;
        JSONObject jSONObject = new JSONObject();
        if (this.brush.asBrush() != null) {
            jSONObject.put("brush", new JSONObject(this.brush.toJson()));
        }
        if (this.selectedBrush.asBrush() != null) {
            jSONObject.put("selectedBrush", new JSONObject(this.selectedBrush.toJson()));
        }
        String json2 = this.icon.toJson();
        if (json2 != null) {
            if (this.icon instanceof com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.n) {
                jSONObject.put(BarcodePickDeserializer.FIELD_ICON, new JSONObject(json2));
            } else {
                jSONObject.put(BarcodePickDeserializer.FIELD_ICON, json2);
            }
        }
        String json3 = this.selectedIcon.toJson();
        if (json3 != null) {
            if (this.icon instanceof com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.n) {
                jSONObject.put("selectedIcon", new JSONObject(json3));
            } else {
                jSONObject.put("selectedIcon", json3);
            }
        }
        BarcodePickStatusIconStyle barcodePickStatusIconStyle = this.statusIconStyle;
        if (barcodePickStatusIconStyle != null && (json = barcodePickStatusIconStyle.toJson()) != null) {
            jSONObject.put("statusIconStyle", new JSONObject(json));
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickViewHighlightStyleResponse(Brush brush, Brush brush2, Bitmap bitmap, Bitmap bitmap2, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        BarcodePickBrush pVar;
        BarcodePickBrush pVar2;
        if (brush == null) {
            pVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush, "brush");
            pVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush);
        }
        if (brush2 == null) {
            pVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush2, "brush");
            pVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush2);
        }
        this(pVar, pVar2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(bitmap, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a), com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(bitmap2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a), barcodePickStatusIconStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickViewHighlightStyleResponse(Brush brush, Brush brush2, ScanditIcon icon, ScanditIcon scanditIcon, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        BarcodePickBrush pVar;
        BarcodePickBrush pVar2;
        Intrinsics.j(icon, "icon");
        if (brush == null) {
            pVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush, "brush");
            pVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush);
        }
        if (brush2 == null) {
            pVar2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush2, "brush");
            pVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p(brush2);
        }
        this(pVar, pVar2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(icon, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.l.f122780a), com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.i.a(scanditIcon, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m.f122781a), barcodePickStatusIconStyle);
    }

    public BarcodePickViewHighlightStyleResponse(BarcodePickBrush brush, BarcodePickBrush selectedBrush, BarcodePickIcon icon, BarcodePickIcon selectedIcon, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        Intrinsics.j(brush, "brush");
        Intrinsics.j(selectedBrush, "selectedBrush");
        Intrinsics.j(icon, "icon");
        Intrinsics.j(selectedIcon, "selectedIcon");
        this.brush = brush;
        this.selectedBrush = selectedBrush;
        this.icon = icon;
        this.selectedIcon = selectedIcon;
        this.statusIconStyle = barcodePickStatusIconStyle;
    }

    public BarcodePickViewHighlightStyleResponse(Brush brush, Bitmap bitmap, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(brush, (Brush) null, bitmap, (Bitmap) null, barcodePickStatusIconStyle);
    }

    public BarcodePickViewHighlightStyleResponse(Brush brush, int i10, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(brush, (Brush) null, i10, 0, barcodePickStatusIconStyle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodePickViewHighlightStyleResponse(Brush brush, ScanditIcon icon, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this(brush, (Brush) null, icon, (ScanditIcon) null, barcodePickStatusIconStyle);
        Intrinsics.j(icon, "icon");
    }
}

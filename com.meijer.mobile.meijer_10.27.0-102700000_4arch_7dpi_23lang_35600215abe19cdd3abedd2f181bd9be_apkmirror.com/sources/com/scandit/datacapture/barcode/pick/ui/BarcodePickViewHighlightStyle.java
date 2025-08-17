package com.scandit.datacapture.barcode.pick.ui;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@ProxyBaseClass(NativeBarcodePickViewHighlightStyle.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "toJson", "", "CustomView", "Dot", "DotWithIcons", "Rectangular", "RectangularWithIcons", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$CustomView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Dot;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$DotWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Rectangular;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$RectangularWithIcons;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodePickViewHighlightStyle {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$CustomView;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;)V", "()V", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "getAsyncCustomViewProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;", "setAsyncCustomViewProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProvider;)V", "asyncCustomViewProvider", "", "<set-?>", "getFitViewsToBarcode", "()Z", "setFitViewsToBarcode", "(Z)V", "fitViewsToBarcode", "", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightHeight", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "minimumHighlightWidth", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "value", "getStatusIconSettings", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "setStatusIconSettings", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;)V", "statusIconSettings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class CustomView implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleCustomViewProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleCustomViewProxyAdapter f123668a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private BarcodePickViewHighlightStyleCustomViewProvider asyncCustomViewProvider;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomView(NativeBarcodePickViewHighlightStyleCustomView impl) {
            Intrinsics.j(impl, "impl");
            this.f123668a = new BarcodePickViewHighlightStyleCustomViewProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getF123680c() {
            return this.f123668a.getF123680c();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleCustomView getF123678a() {
            return this.f123668a.getF123678a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getFitViewsToBarcode", property = "fitViewsToBarcode")
        public boolean getFitViewsToBarcode() {
            return this.f123668a.getFitViewsToBarcode();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f123668a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f123668a.getMinimumHighlightWidth();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setFitViewsToBarcode", property = "fitViewsToBarcode")
        public void setFitViewsToBarcode(boolean z10) {
            this.f123668a.setFitViewsToBarcode(z10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i10) {
            this.f123668a.setMinimumHighlightHeight(i10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i10) {
            this.f123668a.setMinimumHighlightWidth(i10);
        }

        public final BarcodePickViewHighlightStyleCustomViewProvider getAsyncCustomViewProvider() {
            return this.asyncCustomViewProvider;
        }

        public final BarcodePickStatusIconSettings getStatusIconSettings() {
            NativeBarcodePickStatusIconSettings statusIconSettings = getF123678a().getStatusIconSettings();
            Intrinsics.i(statusIconSettings, "getStatusIconSettings(...)");
            return new BarcodePickStatusIconSettings(statusIconSettings);
        }

        public final void setAsyncCustomViewProvider(BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
            this.asyncCustomViewProvider = barcodePickViewHighlightStyleCustomViewProvider;
        }

        public final void setStatusIconSettings(BarcodePickStatusIconSettings value) {
            Intrinsics.j(value, "value");
            getF123678a().setStatusIconSettings(value.getF123644a());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CustomView() {
            NativeBarcodePickViewHighlightStyleCustomView nativeBarcodePickViewHighlightStyleCustomViewCreate = NativeBarcodePickViewHighlightStyleCustomView.create();
            Intrinsics.i(nativeBarcodePickViewHighlightStyleCustomViewCreate, "create(...)");
            this(nativeBarcodePickViewHighlightStyleCustomViewCreate);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        public String toJson() {
            String json = getF123678a().toJson();
            Intrinsics.i(json, "toJson(...)");
            return json;
        }
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0013J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010#J\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010%J\u001f\u0010&\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010 J\u001f\u0010&\u001a\u00020\u00162\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010#J\u001d\u0010&\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00103\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010:\u001a\u0002042\u0006\u00105\u001a\u0002048W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$DotWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotWithIconsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "iconsHolder", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;)V", "()V", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDotWithIcons;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/core/ui/style/Brush;", "getSelectedBrushForState", "brush", "", "setBrushForState", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "setSelectedBrushForState", "", "toJson", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "setIconForState", "(Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "", "iconResource", "(ILcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "setSelectedIconForState", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "getAsyncStyleProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "setAsyncStyleProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;)V", "asyncStyleProvider", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "get_iconsHolder$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "_iconsHolder", "", "<set-?>", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "styleResponseCacheEnabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class DotWithIcons implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleDotWithIconsProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleDotWithIconsProxyAdapter f123671a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final /* synthetic */ BarcodePickHighlightStyleIconsHolder _iconsHolder;

        public DotWithIcons(NativeBarcodePickViewHighlightStyleDotWithIcons nativeBarcodePickViewHighlightStyleDotWithIcons, BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeBarcodePickViewHighlightStyleDotWithIcons, (i10 & 2) != 0 ? new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.f() : barcodePickHighlightStyleIconsHolder);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getF123680c() {
            return this.f123671a.getF123688c();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @NativeImpl
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleDotWithIcons getF123686a() {
            return this.f123671a.getF123686a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "brushForState")
        public Brush getBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123671a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        public Brush getSelectedBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123671a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public boolean getStyleResponseCacheEnabled() {
            return this.f123671a.getStyleResponseCacheEnabled();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(brush, "brush");
            Intrinsics.j(state, "state");
            this.f123671a.setBrushForState(brush, state);
        }

        public final void setIconForState(Bitmap icon, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this.f123671a.setSelectedBrushForState(brush, state);
        }

        public final void setSelectedIconForState(Bitmap icon, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.a(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotWithIconsProxy
        @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public void setStyleResponseCacheEnabled(boolean z10) {
            this.f123671a.setStyleResponseCacheEnabled(z10);
        }

        public final BarcodePickViewHighlightStyleAsyncProvider getAsyncStyleProvider() {
            return this.asyncStyleProvider;
        }

        /* renamed from: get_iconsHolder$scandit_barcode_capture, reason: from getter */
        public final BarcodePickHighlightStyleIconsHolder get_iconsHolder() {
            return this._iconsHolder;
        }

        public final void setAsyncStyleProvider(BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider) {
            this.asyncStyleProvider = barcodePickViewHighlightStyleAsyncProvider;
        }

        public final void setIconForState(int iconResource, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.b(iconResource, state);
        }

        public final void setSelectedIconForState(int iconResource, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.a(iconResource, state);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DotWithIcons(NativeBarcodePickViewHighlightStyleDotWithIcons impl, BarcodePickHighlightStyleIconsHolder iconsHolder) {
            Intrinsics.j(impl, "impl");
            Intrinsics.j(iconsHolder, "iconsHolder");
            this.f123671a = new BarcodePickViewHighlightStyleDotWithIconsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
            this._iconsHolder = iconsHolder;
        }

        public final void setIconForState(ScanditIcon icon, BarcodePickState state) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(state, "state");
            this._iconsHolder.a(icon, state);
        }

        public final void setSelectedIconForState(ScanditIcon icon, BarcodePickState state) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        public String toJson() {
            return com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.b.a(this, getF123686a().toJson());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DotWithIcons() {
            NativeBarcodePickViewHighlightStyleDotWithIcons nativeBarcodePickViewHighlightStyleDotWithIconsCreate = NativeBarcodePickViewHighlightStyleDotWithIcons.create();
            Intrinsics.i(nativeBarcodePickViewHighlightStyleDotWithIconsCreate, "create(...)");
            this(nativeBarcodePickViewHighlightStyleDotWithIconsCreate, null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0013J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010#J\u001d\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010%J\u001f\u0010&\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010 J\u001f\u0010&\u001a\u00020\u00162\b\b\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010#J\u001d\u0010&\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u00103\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u00109\u001a\u00020!2\u0006\u00104\u001a\u00020!8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020!2\u0006\u00104\u001a\u00020!8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010B\u001a\u00020=2\u0006\u00104\u001a\u00020=8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010I\u001a\u00020C2\u0006\u0010D\u001a\u00020C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$RectangularWithIcons;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "iconsHolder", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;)V", "()V", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_highlightStyleImpl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "state", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrushForState", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/core/ui/style/Brush;", "getSelectedBrushForState", "brush", "", "setBrushForState", "(Lcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "setSelectedBrushForState", "", "toJson", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "setIconForState", "(Landroid/graphics/Bitmap;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "", "iconResource", "(ILcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)V", "setSelectedIconForState", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "getAsyncStyleProvider", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;", "setAsyncStyleProvider", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleAsyncProvider;)V", "asyncStyleProvider", "c", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "get_iconsHolder$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightstyle/BarcodePickHighlightStyleIconsHolder;", "_iconsHolder", "<set-?>", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightHeight", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "minimumHighlightWidth", "", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "styleResponseCacheEnabled", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "value", "getStatusIconSettings", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;", "setStatusIconSettings", "(Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettings;)V", "statusIconSettings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class RectangularWithIcons implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleRectangularWithIconsProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter f123675a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private BarcodePickViewHighlightStyleAsyncProvider asyncStyleProvider;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final /* synthetic */ BarcodePickHighlightStyleIconsHolder _iconsHolder;

        public RectangularWithIcons(NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIcons, BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(nativeBarcodePickViewHighlightStyleRectangularWithIcons, (i10 & 2) != 0 ? new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.f() : barcodePickHighlightStyleIconsHolder);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getF123680c() {
            return this.f123675a.getF123694c();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @NativeImpl
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleRectangularWithIcons getF123692a() {
            return this.f123675a.getF123692a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "brushForState")
        public Brush getBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123675a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f123675a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f123675a.getMinimumHighlightWidth();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        public Brush getSelectedBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123675a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public boolean getStyleResponseCacheEnabled() {
            return this.f123675a.getStyleResponseCacheEnabled();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(brush, "brush");
            Intrinsics.j(state, "state");
            this.f123675a.setBrushForState(brush, state);
        }

        public final void setIconForState(Bitmap icon, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i10) {
            this.f123675a.setMinimumHighlightHeight(i10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i10) {
            this.f123675a.setMinimumHighlightWidth(i10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this.f123675a.setSelectedBrushForState(brush, state);
        }

        public final void setSelectedIconForState(Bitmap icon, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.a(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularWithIconsProxy
        @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
        public void setStyleResponseCacheEnabled(boolean z10) {
            this.f123675a.setStyleResponseCacheEnabled(z10);
        }

        public final BarcodePickViewHighlightStyleAsyncProvider getAsyncStyleProvider() {
            return this.asyncStyleProvider;
        }

        public final BarcodePickStatusIconSettings getStatusIconSettings() {
            NativeBarcodePickStatusIconSettings statusIconSettings = getF123692a().getStatusIconSettings();
            Intrinsics.i(statusIconSettings, "getStatusIconSettings(...)");
            return new BarcodePickStatusIconSettings(statusIconSettings);
        }

        /* renamed from: get_iconsHolder$scandit_barcode_capture, reason: from getter */
        public final BarcodePickHighlightStyleIconsHolder get_iconsHolder() {
            return this._iconsHolder;
        }

        public final void setAsyncStyleProvider(BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider) {
            this.asyncStyleProvider = barcodePickViewHighlightStyleAsyncProvider;
        }

        public final void setIconForState(int iconResource, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.b(iconResource, state);
        }

        public final void setSelectedIconForState(int iconResource, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this._iconsHolder.a(iconResource, state);
        }

        public final void setStatusIconSettings(BarcodePickStatusIconSettings value) {
            Intrinsics.j(value, "value");
            getF123692a().setStatusIconSettings(value.getF123644a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RectangularWithIcons(NativeBarcodePickViewHighlightStyleRectangularWithIcons impl, BarcodePickHighlightStyleIconsHolder iconsHolder) {
            Intrinsics.j(impl, "impl");
            Intrinsics.j(iconsHolder, "iconsHolder");
            this.f123675a = new BarcodePickViewHighlightStyleRectangularWithIconsProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
            this._iconsHolder = iconsHolder;
        }

        public final void setIconForState(ScanditIcon icon, BarcodePickState state) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(state, "state");
            this._iconsHolder.a(icon, state);
        }

        public final void setSelectedIconForState(ScanditIcon icon, BarcodePickState state) {
            Intrinsics.j(icon, "icon");
            Intrinsics.j(state, "state");
            this._iconsHolder.b(icon, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        public String toJson() {
            return com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.b.a(this, getF123692a().toJson());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RectangularWithIcons() {
            NativeBarcodePickViewHighlightStyleRectangularWithIcons nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate = NativeBarcodePickViewHighlightStyleRectangularWithIcons.create();
            Intrinsics.i(nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate, "create(...)");
            this(nativeBarcodePickViewHighlightStyleRectangularWithIconsCreate, null, 2, null);
        }
    }

    @NativeImpl
    /* renamed from: _highlightStyleImpl */
    NativeBarcodePickViewHighlightStyle getF123680c();

    String toJson();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0097\u0001J\t\u0010\t\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\u001b\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0097\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Dot;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleDotProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleDot;)V", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Dot implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleDotProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleDotProxyAdapter f123670a;

        /* JADX WARN: Multi-variable type inference failed */
        public Dot(NativeBarcodePickViewHighlightStyleDot impl) {
            Intrinsics.j(impl, "impl");
            this.f123670a = new BarcodePickViewHighlightStyleDotProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getF123680c() {
            return this.f123670a.getF123685c();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @NativeImpl
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleDot getF123683a() {
            return this.f123670a.getF123683a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "brushForState")
        public Brush getBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123670a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        public Brush getSelectedBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123670a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(brush, "brush");
            Intrinsics.j(state, "state");
            this.f123670a.setBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleDotProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this.f123670a.setSelectedBrushForState(brush, state);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Dot() {
            NativeBarcodePickViewHighlightStyleDot nativeBarcodePickViewHighlightStyleDotCreate = NativeBarcodePickViewHighlightStyleDot.create();
            Intrinsics.i(nativeBarcodePickViewHighlightStyleDotCreate, "create(...)");
            this(nativeBarcodePickViewHighlightStyleDotCreate);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        public String toJson() {
            String json = getF123683a().toJson();
            Intrinsics.i(json, "toJson(...)");
            return json;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0012H\u0097\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\u001b\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0097\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle$Rectangular;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyle;", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;)V", "<set-?>", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Rectangular implements BarcodePickViewHighlightStyle, BarcodePickViewHighlightStyleRectangularProxy {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ BarcodePickViewHighlightStyleRectangularProxyAdapter f123674a;

        /* JADX WARN: Multi-variable type inference failed */
        public Rectangular(NativeBarcodePickViewHighlightStyleRectangular impl) {
            Intrinsics.j(impl, "impl");
            this.f123674a = new BarcodePickViewHighlightStyleRectangularProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle, com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProxy
        @NativeImpl
        /* renamed from: _highlightStyleImpl */
        public NativeBarcodePickViewHighlightStyle getF123680c() {
            return this.f123674a.getF123691c();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @NativeImpl
        /* renamed from: _impl */
        public NativeBarcodePickViewHighlightStyleRectangular getF123689a() {
            return this.f123674a.getF123689a();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "brushForState")
        public Brush getBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123674a.getBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
        public int getMinimumHighlightHeight() {
            return this.f123674a.getMinimumHighlightHeight();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
        public int getMinimumHighlightWidth() {
            return this.f123674a.getMinimumHighlightWidth();
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "selectedBrushForState")
        public Brush getSelectedBrushForState(BarcodePickState state) {
            Intrinsics.j(state, "state");
            return this.f123674a.getSelectedBrushForState(state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setBrushForState")
        public void setBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(brush, "brush");
            Intrinsics.j(state, "state");
            this.f123674a.setBrushForState(brush, state);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
        public void setMinimumHighlightHeight(int i10) {
            this.f123674a.setMinimumHighlightHeight(i10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
        public void setMinimumHighlightWidth(int i10) {
            this.f123674a.setMinimumHighlightWidth(i10);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRectangularProxy
        @ProxyFunction(nativeName = "setSelectedBrushForState")
        public void setSelectedBrushForState(Brush brush, BarcodePickState state) {
            Intrinsics.j(state, "state");
            this.f123674a.setSelectedBrushForState(brush, state);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Rectangular() {
            NativeBarcodePickViewHighlightStyleRectangular nativeBarcodePickViewHighlightStyleRectangularCreate = NativeBarcodePickViewHighlightStyleRectangular.create();
            Intrinsics.i(nativeBarcodePickViewHighlightStyleRectangularCreate, "create(...)");
            this(nativeBarcodePickViewHighlightStyleRectangularCreate);
        }

        @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle
        public String toJson() {
            String json = getF123689a().toJson();
            Intrinsics.i(json, "toJson(...)");
            return json;
        }
    }
}

package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationFooter;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationListener;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010#\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010(\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b$\u0010\u001c\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R(\u0010-\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b)\u0010\u001c\u0012\u0004\b,\u0010\"\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R(\u00102\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010\u001c\u0012\u0004\b1\u0010\"\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R7\u0010<\u001a\b\u0012\u0004\u0012\u000204032\f\u00105\u001a\b\u0012\u0004\u0012\u000204038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010A\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u0010\u0014\"\u0004\b?\u0010@R+\u0010H\u001a\u00020B2\u0006\u00105\u001a\u00020B8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010L\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R+\u0010S\u001a\u00020M2\u0006\u00105\u001a\u00020M8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u00107\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR/\u0010Z\u001a\u0004\u0018\u00010T2\b\u00105\u001a\u0004\u0018\u00010T8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u00107\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR/\u0010a\u001a\u0004\u0018\u00010[2\b\u00105\u001a\u0004\u0018\u00010[8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u00107\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010i\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR$\u0010q\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR+\u0010s\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u00107\u001a\u0004\bs\u0010\u001e\"\u0004\bt\u0010 R\"\u0010|\u001a\u00020u8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006}"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArInfoAnnotation;", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotation;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/data/Barcode;)V", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "barcodeLocation", "highlightViewLocation", "Landroid/view/View;", "view", "", "update", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Landroid/view/View;)V", "createView", "()Landroid/view/View;", "", "tipColor$scandit_barcode_capture", "()I", "tipColor", "b", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "", "c", "Z", "getRecreateBody$scandit_barcode_capture", "()Z", "setRecreateBody$scandit_barcode_capture", "(Z)V", "getRecreateBody$scandit_barcode_capture$annotations", "()V", "recreateBody", "d", "getRecreateCommon$scandit_barcode_capture", "setRecreateCommon$scandit_barcode_capture", "getRecreateCommon$scandit_barcode_capture$annotations", "recreateCommon", "e", "getRecreateHeader$scandit_barcode_capture", "setRecreateHeader$scandit_barcode_capture", "getRecreateHeader$scandit_barcode_capture$annotations", "recreateHeader", "f", "getRecreateFooter$scandit_barcode_capture", "setRecreateFooter$scandit_barcode_capture", "getRecreateFooter$scandit_barcode_capture$annotations", "recreateFooter", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationBodyComponent;", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", "getBody", "()Ljava/util/List;", "setBody", "(Ljava/util/List;)V", "body", "h", "getBackgroundColor", "setBackgroundColor", "(I)V", "backgroundColor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "i", "getWidth", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "setWidth", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;)V", "width", "j", "getHasTip", "setHasTip", "hasTip", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "k", "getAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "setAnchor", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;)V", "anchor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationHeader;", "l", "getHeader", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationHeader;", "setHeader", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationHeader;)V", "header", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationFooter;", "m", "getFooter", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationFooter;", "setFooter", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationFooter;)V", "footer", "Lkotlin/Function0;", "o", "Lkotlin/jvm/functions/Function0;", "getOnAnnotationOrElementTap$scandit_barcode_capture", "()Lkotlin/jvm/functions/Function0;", "setOnAnnotationOrElementTap$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "onAnnotationOrElementTap", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationListener;", "p", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationListener;", "getListener", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationListener;", "setListener", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationListener;)V", "listener", "q", "isEntireAnnotationTappable", "setEntireAnnotationTappable", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "r", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getAnnotationTrigger", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "setAnnotationTrigger", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;)V", "annotationTrigger", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeArInfoAnnotation implements BarcodeArAnnotation {

    /* renamed from: w, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f120215w = {a.a(BarcodeArInfoAnnotation.class, "body", "getBody()Ljava/util/List;", 0), a.a(BarcodeArInfoAnnotation.class, "backgroundColor", "getBackgroundColor()I", 0), a.a(BarcodeArInfoAnnotation.class, "width", "getWidth()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", 0), a.a(BarcodeArInfoAnnotation.class, "hasTip", "getHasTip()Z", 0), a.a(BarcodeArInfoAnnotation.class, "anchor", "getAnchor()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", 0), a.a(BarcodeArInfoAnnotation.class, "header", "getHeader()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationHeader;", 0), a.a(BarcodeArInfoAnnotation.class, "footer", "getFooter()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationFooter;", 0), a.a(BarcodeArInfoAnnotation.class, "isEntireAnnotationTappable", "isEntireAnnotationTappable()Z", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final Context f120216a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Barcode barcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean recreateBody;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean recreateCommon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean recreateHeader;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean recreateFooter;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$1 f120222g;

    /* renamed from: h, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$2 f120223h;

    /* renamed from: i, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$3 f120224i;

    /* renamed from: j, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$4 f120225j;

    /* renamed from: k, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$5 f120226k;

    /* renamed from: l, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$6 f120227l;

    /* renamed from: m, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$7 f120228m;

    /* renamed from: n, reason: collision with root package name */
    private final com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.j f120229n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ Function0 onAnnotationOrElementTap;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private BarcodeArInfoAnnotationListener listener;

    /* renamed from: q, reason: collision with root package name */
    private final BarcodeArInfoAnnotation$special$$inlined$distinctObservable$8 f120232q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private BarcodeArAnnotationTrigger annotationTrigger;

    /* renamed from: s, reason: collision with root package name */
    private final i f120234s;

    /* renamed from: t, reason: collision with root package name */
    private final l f120235t;

    /* renamed from: u, reason: collision with root package name */
    private final k f120236u;

    /* renamed from: v, reason: collision with root package name */
    private final j f120237v;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeArInfoAnnotationAnchor.values().length];
            try {
                iArr[BarcodeArInfoAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeArInfoAnnotationAnchor.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getRecreateBody$scandit_barcode_capture$annotations() {
    }

    public static /* synthetic */ void getRecreateCommon$scandit_barcode_capture$annotations() {
    }

    public static /* synthetic */ void getRecreateFooter$scandit_barcode_capture$annotations() {
    }

    public static /* synthetic */ void getRecreateHeader$scandit_barcode_capture$annotations() {
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$7] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$4] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$5] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.scandit.datacapture.barcode.ar.ui.annotations.n] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$8] */
    public BarcodeArInfoAnnotation(Context context, Barcode barcode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        this.f120216a = context;
        this.barcode = barcode;
        this.recreateCommon = true;
        final List listM = CollectionsKt.m();
        Delegates delegates = Delegates.f142874a;
        this.f120222g = new ObservableProperty<List<? extends BarcodeArInfoAnnotationBodyComponent>>(listM) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, List<? extends BarcodeArInfoAnnotationBodyComponent> oldValue, List<? extends BarcodeArInfoAnnotationBodyComponent> newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                this.f120234s.invoke();
                Iterator<T> it = newValue.iterator();
                while (it.hasNext()) {
                    ((BarcodeArInfoAnnotationBodyComponent) it.next()).setPropertyChangedListener$scandit_barcode_capture(this.f120234s);
                }
            }
        };
        final Integer numValueOf = Integer.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBackgroundColor());
        this.f120223h = new ObservableProperty<Integer>(numValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                newValue.intValue();
                this.f120234s.invoke();
            }
        };
        final BarcodeArInfoAnnotationWidthPreset defaultInfoAnnotationWidth = BarcodeArViewDefaults.getDefaultInfoAnnotationWidth();
        this.f120224i = new ObservableProperty<BarcodeArInfoAnnotationWidthPreset>(defaultInfoAnnotationWidth) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArInfoAnnotationWidthPreset oldValue, BarcodeArInfoAnnotationWidthPreset newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                this.f120237v.invoke();
                this.f120234s.invoke();
                this.f120235t.invoke();
                this.f120236u.invoke();
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationHasTip());
        this.f120225j = new ObservableProperty<Boolean>(boolValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                newValue.getClass();
                this.f120237v.invoke();
            }
        };
        final BarcodeArInfoAnnotationAnchor defaultInfoAnnotationAnchor = BarcodeArViewDefaults.getDefaultInfoAnnotationAnchor();
        this.f120226k = new ObservableProperty<BarcodeArInfoAnnotationAnchor>(defaultInfoAnnotationAnchor) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$5
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArInfoAnnotationAnchor oldValue, BarcodeArInfoAnnotationAnchor newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                this.f120237v.invoke();
            }
        };
        final Object obj = null;
        this.f120227l = new ObservableProperty<BarcodeArInfoAnnotationHeader>(obj) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$6
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArInfoAnnotationHeader oldValue, BarcodeArInfoAnnotationHeader newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader barcodeArInfoAnnotationHeader = newValue;
                this.f120235t.invoke();
                if (barcodeArInfoAnnotationHeader != null) {
                    barcodeArInfoAnnotationHeader.setPropertyChangedListener$scandit_barcode_capture(this.f120235t);
                }
            }
        };
        this.f120228m = new ObservableProperty<BarcodeArInfoAnnotationFooter>(obj) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$7
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArInfoAnnotationFooter oldValue, BarcodeArInfoAnnotationFooter newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationFooter barcodeArInfoAnnotationFooter = newValue;
                this.f120236u.invoke();
                if (barcodeArInfoAnnotationFooter != null) {
                    barcodeArInfoAnnotationFooter.setPropertyChangedListener$scandit_barcode_capture(this.f120236u);
                }
            }
        };
        this.f120229n = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.j(new MutablePropertyReference0Impl(this) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.n
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public final Object get() {
                return ((BarcodeArInfoAnnotation) this.receiver).getListener();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl
            public final void set(Object obj2) {
                ((BarcodeArInfoAnnotation) this.receiver).setListener((BarcodeArInfoAnnotationListener) obj2);
            }
        }, new o(this));
        final Boolean boolValueOf2 = Boolean.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationEntireAnnotationTappable());
        this.f120232q = new ObservableProperty<Boolean>(boolValueOf2) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation$special$$inlined$distinctObservable$8
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                newValue.getClass();
                this.f120235t.invoke();
                this.f120236u.invoke();
                this.f120234s.invoke();
                this.f120237v.invoke();
            }
        };
        this.annotationTrigger = BarcodeArViewDefaults.getDefaultInfoAnnotationTrigger();
        this.f120234s = new i(this);
        this.f120235t = new l(this);
        this.f120236u = new k(this);
        this.f120237v = new j(this);
    }

    public static final void access$bodyElementIconTapped(BarcodeArInfoAnnotation barcodeArInfoAnnotation, boolean z10, int i10, BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent) {
        if (z10) {
            barcodeArInfoAnnotation.f120229n.onInfoAnnotationLeftIconTapped(barcodeArInfoAnnotation, barcodeArInfoAnnotationBodyComponent, i10);
        } else {
            barcodeArInfoAnnotation.f120229n.onInfoAnnotationRightIconTapped(barcodeArInfoAnnotation, barcodeArInfoAnnotationBodyComponent, i10);
        }
    }

    public static final BarcodeArInfoAnnotationDataHolder access$getData(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        return new BarcodeArInfoAnnotationDataHolder(barcodeArInfoAnnotation.barcode.getData(), barcodeArInfoAnnotation.getWidth(), barcodeArInfoAnnotation.getAnchor(), barcodeArInfoAnnotation.getHasTip(), barcodeArInfoAnnotation.tipColor$scandit_barcode_capture(), barcodeArInfoAnnotation.isEntireAnnotationTappable(), new m(barcodeArInfoAnnotation));
    }

    public static final void access$headerOrFooterTapped(BarcodeArInfoAnnotation barcodeArInfoAnnotation, boolean z10) {
        if (z10) {
            barcodeArInfoAnnotation.f120229n.onInfoAnnotationHeaderTapped(barcodeArInfoAnnotation);
        } else {
            barcodeArInfoAnnotation.f120229n.onInfoAnnotationFooterTapped(barcodeArInfoAnnotation);
        }
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public View createView() {
        Context context = this.f120216a;
        b bVar = new b(this);
        Context context2 = this.f120216a;
        d bodyProvider = new d(this);
        Intrinsics.j(context2, "context");
        Intrinsics.j(bodyProvider, "bodyProvider");
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.b bVar2 = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.b(context2, bodyProvider);
        Context context3 = this.f120216a;
        e dataFactory = new e(this);
        Intrinsics.j(context3, "context");
        Intrinsics.j(dataFactory, "dataFactory");
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.l lVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.l(context3, dataFactory);
        Context context4 = this.f120216a;
        f dataFactory2 = new f(this);
        Intrinsics.j(context4, "context");
        Intrinsics.j(dataFactory2, "dataFactory");
        z zVar = new z(context, bVar, bVar2, lVar, new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.l(context4, dataFactory2));
        zVar.a(this.recreateBody, this.recreateHeader, this.recreateFooter, this.recreateCommon);
        this.recreateBody = false;
        this.recreateHeader = false;
        this.recreateFooter = false;
        this.recreateCommon = false;
        zVar.setVisibility(4);
        return zVar;
    }

    public final BarcodeArInfoAnnotationAnchor getAnchor() {
        return getValue(this, f120215w[4]);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public BarcodeArAnnotationTrigger getAnnotationTrigger() {
        return this.annotationTrigger;
    }

    public final int getBackgroundColor() {
        return getValue(this, f120215w[1]).intValue();
    }

    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final List<BarcodeArInfoAnnotationBodyComponent> getBody() {
        return (List) getValue(this, f120215w[0]);
    }

    public final BarcodeArInfoAnnotationFooter getFooter() {
        return getValue(this, f120215w[6]);
    }

    public final boolean getHasTip() {
        return getValue(this, f120215w[3]).booleanValue();
    }

    public final BarcodeArInfoAnnotationHeader getHeader() {
        return getValue(this, f120215w[5]);
    }

    public final BarcodeArInfoAnnotationListener getListener() {
        return this.listener;
    }

    public final Function0<Unit> getOnAnnotationOrElementTap$scandit_barcode_capture() {
        return this.onAnnotationOrElementTap;
    }

    /* renamed from: getRecreateBody$scandit_barcode_capture, reason: from getter */
    public final boolean getRecreateBody() {
        return this.recreateBody;
    }

    /* renamed from: getRecreateCommon$scandit_barcode_capture, reason: from getter */
    public final boolean getRecreateCommon() {
        return this.recreateCommon;
    }

    /* renamed from: getRecreateFooter$scandit_barcode_capture, reason: from getter */
    public final boolean getRecreateFooter() {
        return this.recreateFooter;
    }

    /* renamed from: getRecreateHeader$scandit_barcode_capture, reason: from getter */
    public final boolean getRecreateHeader() {
        return this.recreateHeader;
    }

    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return getValue(this, f120215w[2]);
    }

    public final boolean isEntireAnnotationTappable() {
        return getValue(this, f120215w[7]).booleanValue();
    }

    public final void setAnchor(BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor) {
        Intrinsics.j(barcodeArInfoAnnotationAnchor, "<set-?>");
        setValue(this, f120215w[4], barcodeArInfoAnnotationAnchor);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public void setAnnotationTrigger(BarcodeArAnnotationTrigger barcodeArAnnotationTrigger) {
        Intrinsics.j(barcodeArAnnotationTrigger, "<set-?>");
        this.annotationTrigger = barcodeArAnnotationTrigger;
    }

    public final void setBackgroundColor(int i10) {
        setValue(this, f120215w[1], Integer.valueOf(i10));
    }

    public final void setBody(List<BarcodeArInfoAnnotationBodyComponent> list) {
        Intrinsics.j(list, "<set-?>");
        setValue(this, f120215w[0], list);
    }

    public final void setEntireAnnotationTappable(boolean z10) {
        setValue(this, f120215w[7], Boolean.valueOf(z10));
    }

    public final void setFooter(BarcodeArInfoAnnotationFooter barcodeArInfoAnnotationFooter) {
        setValue(this, f120215w[6], barcodeArInfoAnnotationFooter);
    }

    public final void setHasTip(boolean z10) {
        setValue(this, f120215w[3], Boolean.valueOf(z10));
    }

    public final void setHeader(BarcodeArInfoAnnotationHeader barcodeArInfoAnnotationHeader) {
        setValue(this, f120215w[5], barcodeArInfoAnnotationHeader);
    }

    public final void setListener(BarcodeArInfoAnnotationListener barcodeArInfoAnnotationListener) {
        this.listener = barcodeArInfoAnnotationListener;
    }

    public final void setOnAnnotationOrElementTap$scandit_barcode_capture(Function0<Unit> function0) {
        this.onAnnotationOrElementTap = function0;
    }

    public final void setRecreateBody$scandit_barcode_capture(boolean z10) {
        this.recreateBody = z10;
    }

    public final void setRecreateCommon$scandit_barcode_capture(boolean z10) {
        this.recreateCommon = z10;
    }

    public final void setRecreateFooter$scandit_barcode_capture(boolean z10) {
        this.recreateFooter = z10;
    }

    public final void setRecreateHeader$scandit_barcode_capture(boolean z10) {
        this.recreateHeader = z10;
    }

    public final void setWidth(BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset) {
        Intrinsics.j(barcodeArInfoAnnotationWidthPreset, "<set-?>");
        setValue(this, f120215w[2], barcodeArInfoAnnotationWidthPreset);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(com.scandit.datacapture.core.common.geometry.Quadrilateral r8, com.scandit.datacapture.core.common.geometry.Quadrilateral r9, android.view.View r10) {
        /*
            r7 = this;
            java.lang.String r0 = "barcodeLocation"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.j(r10, r0)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.z r10 = (com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.z) r10
            boolean r0 = r7.recreateBody
            boolean r1 = r7.recreateHeader
            boolean r2 = r7.recreateFooter
            boolean r3 = r7.recreateCommon
            r10.a(r0, r1, r2, r3)
            if (r9 != 0) goto L1a
            goto L1b
        L1a:
            r8 = r9
        L1b:
            com.scandit.datacapture.core.common.geometry.Quadrilateral r8 = com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt.orderVerticesByPosition(r8)
            com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor r9 = r7.getAnchor()
            java.lang.String r0 = "quadrilateral"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.lang.String r0 = "anchor"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            int r1 = r10.getWidth()
            float r1 = (float) r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = 4
            r6 = 0
            if (r4 <= 0) goto Lc8
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L44
            goto Lc8
        L44:
            com.scandit.datacapture.core.common.geometry.Size2 r3 = new com.scandit.datacapture.core.common.geometry.Size2
            r3.<init>(r1, r2)
            r10.f121133o = r3
            r10.f121131m = r8
            r10.f121132n = r9
            android.view.ViewParent r8 = r10.getParent()
            boolean r1 = r8 instanceof android.widget.FrameLayout
            if (r1 == 0) goto L5a
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            goto L5b
        L5a:
            r8 = 0
        L5b:
            if (r8 != 0) goto L5e
            goto Lc8
        L5e:
            com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b r1 = r10.f121134p
            r1.a(r10, r8)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a r8 = r10.f121124f
            com.scandit.datacapture.core.common.geometry.Anchor r1 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(r9)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.c.a(r8, r1)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a r8 = r10.f121124f
            com.scandit.datacapture.core.common.geometry.Anchor r1 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(r9)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r8, r2)
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            int[] r0 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.b.f121181a
            int r2 = r1.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto Lac
            r3 = 2
            if (r0 == r3) goto La9
            r3 = 3
            if (r0 == r3) goto La5
            if (r0 != r5) goto L91
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto Lae
        L91:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported anchor: "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La5:
            r0 = 8388627(0x800013, float:1.175497E-38)
            goto Lae
        La9:
            r0 = 81
            goto Lae
        Lac:
            r0 = 49
        Lae:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            kotlin.jvm.internal.Intrinsics.h(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r0
            r8.setLayoutParams(r1)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a r8 = r10.f121124f
            com.scandit.datacapture.core.common.geometry.Anchor r9 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.b.a(r9)
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.c.b(r8, r9)
            goto Lc9
        Lc8:
            r2 = r6
        Lc9:
            r7.recreateBody = r6
            r7.recreateHeader = r6
            r7.recreateFooter = r6
            r7.recreateCommon = r6
            int r8 = r10.getVisibility()
            if (r8 != r5) goto Ldc
            if (r2 == 0) goto Ldc
            r10.setVisibility(r6)
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation.update(com.scandit.datacapture.core.common.geometry.Quadrilateral, com.scandit.datacapture.core.common.geometry.Quadrilateral, android.view.View):void");
    }

    public static final BarcodeArHeaderFooterElementDataHolder access$dataHolderForCurrentFooter(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        BarcodeArInfoAnnotationFooter footer = barcodeArInfoAnnotation.getFooter();
        if (footer == null) {
            return null;
        }
        return new BarcodeArHeaderFooterElementDataHolder(footer.getBackgroundColor(), footer.getIcon(), footer.getText(), footer.getTypeface(), footer.getTextSize(), footer.getTextColor(), barcodeArInfoAnnotation.isEntireAnnotationTappable(), barcodeArInfoAnnotation.getWidth(), false, new g(barcodeArInfoAnnotation));
    }

    public static final BarcodeArHeaderFooterElementDataHolder access$dataHolderForCurrentHeader(BarcodeArInfoAnnotation barcodeArInfoAnnotation) {
        BarcodeArInfoAnnotationHeader header = barcodeArInfoAnnotation.getHeader();
        if (header == null) {
            return null;
        }
        return new BarcodeArHeaderFooterElementDataHolder(header.getBackgroundColor(), header.getIcon(), header.getText(), header.getTypeface(), header.getTextSize(), header.getTextColor(), barcodeArInfoAnnotation.isEntireAnnotationTappable(), barcodeArInfoAnnotation.getWidth(), true, new h(barcodeArInfoAnnotation));
    }

    public final int tipColor$scandit_barcode_capture() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAnchor().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return getBackgroundColor();
            }
            BarcodeArInfoAnnotationFooter footer = getFooter();
            if (footer != null) {
                return footer.getBackgroundColor();
            }
            BarcodeArInfoAnnotationHeader header = getHeader();
            if (header != null && getBody().isEmpty()) {
                return header.getBackgroundColor();
            }
            return getBackgroundColor();
        }
        BarcodeArInfoAnnotationHeader header2 = getHeader();
        if (header2 != null) {
            return header2.getBackgroundColor();
        }
        BarcodeArInfoAnnotationFooter footer2 = getFooter();
        if (footer2 != null && getBody().isEmpty()) {
            return footer2.getBackgroundColor();
        }
        return getBackgroundColor();
    }
}

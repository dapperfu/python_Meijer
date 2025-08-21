package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarDefaults;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarSettings;
import com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.BarcodeCountToolbarView;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.d1;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class BarcodeCountToolbarView extends LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    private static final int f122773p = PixelExtensionsKt.pxFromDp$default(30, (Context) null, 1, (Object) null);

    /* renamed from: q, reason: collision with root package name */
    private static final int f122774q = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);

    /* renamed from: r, reason: collision with root package name */
    private static final int f122775r = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);

    /* renamed from: s, reason: collision with root package name */
    private static final int f122776s = PixelExtensionsKt.pxFromDp$default(36, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    private b f122777a;

    /* renamed from: b, reason: collision with root package name */
    private final View f122778b;

    /* renamed from: c, reason: collision with root package name */
    private final View f122779c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayout f122780d;

    /* renamed from: e, reason: collision with root package name */
    private final a f122781e;

    /* renamed from: f, reason: collision with root package name */
    private final a f122782f;

    /* renamed from: g, reason: collision with root package name */
    private final a f122783g;

    /* renamed from: h, reason: collision with root package name */
    private final a f122784h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f122785i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f122786j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f122787k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f122788l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f122789m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f122790n;

    /* renamed from: o, reason: collision with root package name */
    private final BarcodeCountToolbarDefaults f122791o;

    public final void a(c state) {
        Intrinsics.j(state, "state");
        this.f122786j = state.f122799a;
        this.f122787k = state.f122800b;
        this.f122788l = state.f122801c;
        this.f122789m = state.f122802d;
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeCountToolbarView(Context context, c initialState) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(initialState, "initialState");
        this.f122786j = initialState.f122799a;
        this.f122787k = initialState.f122800b;
        this.f122788l = initialState.f122801c;
        this.f122789m = initialState.f122802d;
        this.f122791o = new BarcodeCountToolbarDefaults();
        View viewInflate = View.inflate(context, R.layout.sc_barcode_count_toolbar, this);
        View viewFindViewById = viewInflate.findViewById(R.id.expand_button);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f122778b = viewFindViewById;
        a();
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: Ot.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeCountToolbarView.a(this.f25112a, view);
            }
        });
        View viewFindViewById2 = viewInflate.findViewById(R.id.collapse_button);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f122779c = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: Ot.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeCountToolbarView.b(this.f25113a, view);
            }
        });
        View viewFindViewById3 = viewInflate.findViewById(R.id.button_container);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f122780d = (LinearLayout) viewFindViewById3;
        int i10 = R.drawable.sc_ic_audio_feedback_selector;
        String string = context.getString(R.string.sc_barcodeCount_toolbar_audio_off);
        Intrinsics.i(string, "getString(...)");
        String string2 = context.getString(R.string.sc_barcodeCount_toolbar_audio_on);
        Intrinsics.i(string2, "getString(...)");
        this.f122781e = a(context, i10, string, string2, this.f122786j, new d(this));
        int i11 = R.drawable.sc_ic_haptic_feedback_selector;
        String string3 = context.getString(R.string.sc_barcodeCount_toolbar_haptic_off);
        Intrinsics.i(string3, "getString(...)");
        String string4 = context.getString(R.string.sc_barcodeCount_toolbar_haptic_on);
        Intrinsics.i(string4, "getString(...)");
        this.f122782f = a(context, i11, string3, string4, this.f122787k, new e(this));
        int i12 = R.drawable.sc_ic_strap_mode;
        String string5 = context.getString(R.string.sc_barcodeCount_toolbar_strap_mode);
        Intrinsics.i(string5, "getString(...)");
        this.f122783g = a(context, i12, string5, string5, this.f122788l, new f(this));
        int i13 = R.drawable.sc_ic_color_filter;
        String string6 = context.getString(R.string.sc_barcodeCount_toolbar_color_filter);
        Intrinsics.i(string6, "getString(...)");
        this.f122784h = a(context, i13, string6, string6, this.f122789m, new g(this));
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BarcodeCountToolbarView this$0) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122778b.setVisibility(this$0.f122785i ? 8 : 0);
        this$0.f122779c.setVisibility(this$0.f122785i ? 0 : 8);
        this$0.f122780d.setVisibility(this$0.f122785i ? 0 : 8);
        a aVar = this$0.f122781e;
        aVar.f122798e = this$0.f122786j;
        aVar.a();
        a aVar2 = this$0.f122782f;
        aVar2.f122798e = this$0.f122787k;
        aVar2.a();
        a aVar3 = this$0.f122783g;
        aVar3.f122798e = this$0.f122788l;
        aVar3.a();
        a aVar4 = this$0.f122784h;
        aVar4.f122798e = this$0.f122789m;
        aVar4.a();
    }

    public final b b() {
        return this.f122777a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(BarcodeCountToolbarView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122785i = false;
        this$0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        post(new Runnable() { // from class: Ot.a
            @Override // java.lang.Runnable
            public final void run() {
                BarcodeCountToolbarView.f(this.f25110a);
            }
        });
    }

    public final void a(d1 d1Var) {
        this.f122777a = d1Var;
    }

    public final void a(boolean z10) {
        if (z10 == this.f122790n) {
            return;
        }
        this.f122790n = z10;
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BarcodeCountToolbarView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122785i = true;
        this$0.c();
    }

    public final void a() {
        int i10;
        View view = this.f122778b;
        int i11 = f122773p;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 17;
        if (this.f122790n) {
            i10 = f122776s;
        } else {
            i10 = f122775r;
        }
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = f122774q;
        view.setLayoutParams(layoutParams);
    }

    private final a a(Context context, int i10, String value, String value2, boolean z10, final Function0 function0) {
        a aVar = new a(context);
        aVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        FS.Resources_setImageResource(aVar.f122794a, i10);
        aVar.a();
        Intrinsics.j(value, "value");
        aVar.f122796c = value;
        aVar.a();
        Intrinsics.j(value2, "value");
        aVar.f122797d = value2;
        aVar.a();
        aVar.f122798e = z10;
        aVar.a();
        aVar.setOnClickListener(new View.OnClickListener() { // from class: Ot.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeCountToolbarView.a(function0, view);
            }
        });
        this.f122780d.addView(aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 onClick, View view) {
        Intrinsics.j(onClick, "$onClick");
        onClick.invoke();
    }

    public final void a(BarcodeCountToolbarSettings settings) {
        Intrinsics.j(settings, "settings");
        a aVar = this.f122781e;
        String value = settings.getAudioOnButtonText();
        if (value == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.f122791o;
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            value = barcodeCountToolbarDefaults.audioOnButtonText(context);
        }
        aVar.getClass();
        Intrinsics.j(value, "value");
        aVar.f122796c = value;
        aVar.a();
        a aVar2 = this.f122781e;
        String value2 = settings.getAudioOffButtonText();
        if (value2 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults2 = this.f122791o;
            Context context2 = getContext();
            Intrinsics.i(context2, "getContext(...)");
            value2 = barcodeCountToolbarDefaults2.audioOffButtonText(context2);
        }
        aVar2.getClass();
        Intrinsics.j(value2, "value");
        aVar2.f122797d = value2;
        aVar2.a();
        a aVar3 = this.f122781e;
        String audioButtonContentDescription = settings.getAudioButtonContentDescription();
        if (audioButtonContentDescription == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults3 = this.f122791o;
            Context context3 = getContext();
            Intrinsics.i(context3, "getContext(...)");
            audioButtonContentDescription = barcodeCountToolbarDefaults3.audioButtonContentDescription(context3);
        }
        aVar3.setContentDescription(audioButtonContentDescription);
        a aVar4 = this.f122782f;
        String value3 = settings.getVibrationOnButtonText();
        if (value3 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults4 = this.f122791o;
            Context context4 = getContext();
            Intrinsics.i(context4, "getContext(...)");
            value3 = barcodeCountToolbarDefaults4.vibrationOnButtonText(context4);
        }
        aVar4.getClass();
        Intrinsics.j(value3, "value");
        aVar4.f122796c = value3;
        aVar4.a();
        a aVar5 = this.f122782f;
        String value4 = settings.getVibrationOffButtonText();
        if (value4 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults5 = this.f122791o;
            Context context5 = getContext();
            Intrinsics.i(context5, "getContext(...)");
            value4 = barcodeCountToolbarDefaults5.vibrationOffButtonText(context5);
        }
        aVar5.getClass();
        Intrinsics.j(value4, "value");
        aVar5.f122797d = value4;
        aVar5.a();
        a aVar6 = this.f122782f;
        String vibrationButtonContentDescription = settings.getVibrationButtonContentDescription();
        if (vibrationButtonContentDescription == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults6 = this.f122791o;
            Context context6 = getContext();
            Intrinsics.i(context6, "getContext(...)");
            vibrationButtonContentDescription = barcodeCountToolbarDefaults6.vibrationButtonContentDescription(context6);
        }
        aVar6.setContentDescription(vibrationButtonContentDescription);
        a aVar7 = this.f122783g;
        String value5 = settings.getStrapModeOnButtonText();
        if (value5 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults7 = this.f122791o;
            Context context7 = getContext();
            Intrinsics.i(context7, "getContext(...)");
            value5 = barcodeCountToolbarDefaults7.strapModeOnButtonText(context7);
        }
        aVar7.getClass();
        Intrinsics.j(value5, "value");
        aVar7.f122796c = value5;
        aVar7.a();
        a aVar8 = this.f122783g;
        String value6 = settings.getStrapModeOffButtonText();
        if (value6 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults8 = this.f122791o;
            Context context8 = getContext();
            Intrinsics.i(context8, "getContext(...)");
            value6 = barcodeCountToolbarDefaults8.strapModeOffButtonText(context8);
        }
        aVar8.getClass();
        Intrinsics.j(value6, "value");
        aVar8.f122797d = value6;
        aVar8.a();
        a aVar9 = this.f122783g;
        String strapModeButtonContentDescription = settings.getStrapModeButtonContentDescription();
        if (strapModeButtonContentDescription == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults9 = this.f122791o;
            Context context9 = getContext();
            Intrinsics.i(context9, "getContext(...)");
            strapModeButtonContentDescription = barcodeCountToolbarDefaults9.strapModeButtonContentDescription(context9);
        }
        aVar9.setContentDescription(strapModeButtonContentDescription);
        a aVar10 = this.f122784h;
        String value7 = settings.getColorSchemeOnButtonText();
        if (value7 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults10 = this.f122791o;
            Context context10 = getContext();
            Intrinsics.i(context10, "getContext(...)");
            value7 = barcodeCountToolbarDefaults10.colorSchemeOnButtonText(context10);
        }
        aVar10.getClass();
        Intrinsics.j(value7, "value");
        aVar10.f122796c = value7;
        aVar10.a();
        a aVar11 = this.f122784h;
        String value8 = settings.getColorSchemeOffButtonText();
        if (value8 == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults11 = this.f122791o;
            Context context11 = getContext();
            Intrinsics.i(context11, "getContext(...)");
            value8 = barcodeCountToolbarDefaults11.colorSchemeOffButtonText(context11);
        }
        aVar11.getClass();
        Intrinsics.j(value8, "value");
        aVar11.f122797d = value8;
        aVar11.a();
        a aVar12 = this.f122784h;
        String colorSchemeButtonContentDescription = settings.getColorSchemeButtonContentDescription();
        if (colorSchemeButtonContentDescription == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults12 = this.f122791o;
            Context context12 = getContext();
            Intrinsics.i(context12, "getContext(...)");
            colorSchemeButtonContentDescription = barcodeCountToolbarDefaults12.colorSchemeButtonContentDescription(context12);
        }
        aVar12.setContentDescription(colorSchemeButtonContentDescription);
        BarcodeCountToolbarDefaults barcodeCountToolbarDefaults13 = new BarcodeCountToolbarDefaults();
        Context context13 = getContext();
        Intrinsics.i(context13, "getContext(...)");
        String strDiscloseButtonContentDescription = barcodeCountToolbarDefaults13.discloseButtonContentDescription(context13);
        if (strDiscloseButtonContentDescription == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults14 = this.f122791o;
            Context context14 = getContext();
            Intrinsics.i(context14, "getContext(...)");
            strDiscloseButtonContentDescription = barcodeCountToolbarDefaults14.discloseButtonContentDescription(context14);
        }
        this.f122778b.setContentDescription(strDiscloseButtonContentDescription);
        this.f122779c.setContentDescription(strDiscloseButtonContentDescription);
    }
}

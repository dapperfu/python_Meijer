package com.scandit.datacapture.barcode.internal.module.ui;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fullstory.FS;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.count.ui.r;
import com.scandit.datacapture.barcode.internal.module.count.ui.s;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class l extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f123345e = LazyKt.b(k.f123344a);

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f123346a;

    /* renamed from: b, reason: collision with root package name */
    public final s f123347b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f123348c;

    /* renamed from: d, reason: collision with root package name */
    public j f123349d;

    public final void a() {
        j userGuidanceState = j.f123339a;
        Intrinsics.j(userGuidanceState, "userGuidanceState");
        a(userGuidanceState, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        setOrientation(1);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = PixelExtensionsKt.pxFromDp$default(10, (Context) null, 1, (Object) null);
        imageView.setLayoutParams(layoutParams);
        setGravity(17);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
        this.f123346a = imageView;
        s sVar = new s(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = PixelExtensionsKt.pxFromDp$default(10, (Context) null, 1, (Object) null);
        sVar.setLayoutParams(layoutParams2);
        sVar.setGravity(17);
        addView(sVar);
        this.f123347b = sVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(((Number) f123345e.getValue()).intValue(), -2);
        layoutParams3.setMarginStart(48);
        layoutParams3.setMarginEnd(48);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        com.scandit.datacapture.barcode.internal.module.count.ui.b.a(textView);
        addView(textView);
        this.f123348c = textView;
    }

    public final void a(j userGuidanceState, String text) {
        Intrinsics.j(userGuidanceState, "userGuidanceState");
        Intrinsics.j(text, "text");
        this.f123349d = userGuidanceState;
        int iOrdinal = userGuidanceState.ordinal();
        if (iOrdinal == 0) {
            setVisibility(8);
        } else if (iOrdinal == 1) {
            setVisibility(0);
            this.f123346a.setVisibility(8);
            this.f123347b.setVisibility(0);
            int i10 = R.drawable.sc_ic_move_away_top;
            int i11 = R.drawable.sc_ic_move_away_mid;
            int i12 = R.drawable.sc_ic_move_away_bot;
            s sVar = this.f123347b;
            FS.Resources_setImageResource(sVar.f121781b, i10);
            FS.Resources_setImageResource(sVar.f121782c, i11);
            FS.Resources_setImageResource(sVar.f121783d, i12);
            s sVar2 = this.f123347b;
            r rVar = r.f121776b;
            sVar2.getClass();
            Intrinsics.j(rVar, "<set-?>");
            sVar2.f121780a = rVar;
        } else if (iOrdinal == 2) {
            setVisibility(0);
            this.f123346a.setVisibility(8);
            this.f123347b.setVisibility(0);
            int i13 = R.drawable.sc_ic_move_closer_top;
            int i14 = R.drawable.sc_ic_move_closer_mid;
            int i15 = R.drawable.sc_ic_move_closer_bot;
            s sVar3 = this.f123347b;
            FS.Resources_setImageResource(sVar3.f121781b, i13);
            FS.Resources_setImageResource(sVar3.f121782c, i14);
            FS.Resources_setImageResource(sVar3.f121783d, i15);
            s sVar4 = this.f123347b;
            r rVar2 = r.f121775a;
            sVar4.getClass();
            Intrinsics.j(rVar2, "<set-?>");
            sVar4.f121780a = rVar2;
        } else if (iOrdinal == 3) {
            setVisibility(0);
            this.f123346a.setVisibility(8);
            this.f123347b.setVisibility(8);
        }
        this.f123348c.setText(text);
        this.f123347b.a();
    }
}

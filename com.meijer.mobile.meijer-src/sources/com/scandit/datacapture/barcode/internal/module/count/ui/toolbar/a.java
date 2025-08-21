package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.radiusnetworks.flybuy.sdk.data.pickup_config.PickupConfig;
import com.scandit.datacapture.barcode.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int f122792f = Color.parseColor("#FBC02C");

    /* renamed from: g, reason: collision with root package name */
    public static final int f122793g = Color.parseColor(PickupConfig.DEFAULT_ACCENT_TEXT_COLOR);

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f122794a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f122795b;

    /* renamed from: c, reason: collision with root package name */
    public String f122796c;

    /* renamed from: d, reason: collision with root package name */
    public String f122797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f122798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f122796c = "";
        this.f122797d = "";
        View viewInflate = View.inflate(context, R.layout.sc_barcode_count_toolbar_item, this);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f122794a = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.title);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f122795b = (TextView) viewFindViewById2;
    }

    public final void a() {
        if (this.f122798e) {
            this.f122794a.setSelected(true);
            ImageView imageView = this.f122794a;
            int i10 = f122792f;
            imageView.setColorFilter(i10);
            this.f122795b.setTextColor(i10);
            this.f122795b.setText(this.f122796c);
            return;
        }
        this.f122794a.setSelected(false);
        ImageView imageView2 = this.f122794a;
        int i11 = f122793g;
        imageView2.setColorFilter(i11);
        this.f122795b.setTextColor(i11);
        this.f122795b.setText(this.f122797d);
    }
}

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

/* loaded from: classes11.dex */
public final class a extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final int f121840f = Color.parseColor("#FBC02C");

    /* renamed from: g, reason: collision with root package name */
    public static final int f121841g = Color.parseColor(PickupConfig.DEFAULT_ACCENT_TEXT_COLOR);

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f121842a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f121843b;

    /* renamed from: c, reason: collision with root package name */
    public String f121844c;

    /* renamed from: d, reason: collision with root package name */
    public String f121845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f121844c = "";
        this.f121845d = "";
        View viewInflate = View.inflate(context, R.layout.sc_barcode_count_toolbar_item, this);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f121842a = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.title);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f121843b = (TextView) viewFindViewById2;
    }

    public final void a() {
        if (this.f121846e) {
            this.f121842a.setSelected(true);
            ImageView imageView = this.f121842a;
            int i10 = f121840f;
            imageView.setColorFilter(i10);
            this.f121843b.setTextColor(i10);
            this.f121843b.setText(this.f121844c);
            return;
        }
        this.f121842a.setSelected(false);
        ImageView imageView2 = this.f121842a;
        int i11 = f121841g;
        imageView2.setColorFilter(i11);
        this.f121843b.setTextColor(i11);
        this.f121843b.setText(this.f121845d);
    }
}

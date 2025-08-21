package com.scandit.datacapture.barcode.internal.module.find.ui.camera;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.Button;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i extends Button {

    /* renamed from: c, reason: collision with root package name */
    public static final int f123155c = Color.parseColor("#40000000");

    /* renamed from: d, reason: collision with root package name */
    public static final int f123156d = Color.parseColor("#FFFBC02C");

    /* renamed from: e, reason: collision with root package name */
    public static final int f123157e = Color.parseColor("#FFFFFFFF");

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123158f = LazyKt.b(f.f123153a);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f123159g = LazyKt.b(g.f123154a);

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f123160a;

    /* renamed from: b, reason: collision with root package name */
    public float f123161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        DecimalFormat decimalFormat = new DecimalFormat("0.#", new DecimalFormatSymbols(Locale.ENGLISH));
        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
        this.f123160a = decimalFormat;
        setPadding(0, 0, 0, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(f123155c);
        gradientDrawable.setCornerRadius(90.0f);
        setBackground(gradientDrawable);
        setAllCaps(false);
        this.f123161b = 1.0f;
    }

    public final void a(float f10) {
        String str = this.f123160a.format(Float.valueOf(f10));
        if (!isSelected()) {
            setText(str);
            return;
        }
        setText(str + 'x');
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z10) {
        int i10;
        Typeface typefaceCreate;
        ViewGroup.LayoutParams layoutParams;
        float f10;
        super.setSelected(z10);
        if (z10) {
            i10 = f123156d;
            typefaceCreate = FS.typefaceCreateDerived(getTypeface(), 1);
            Intrinsics.i(typefaceCreate, "create(...)");
            layoutParams = getLayoutParams();
            Lazy lazy = f123158f;
            layoutParams.width = ((Number) lazy.getValue()).intValue();
            layoutParams.height = ((Number) lazy.getValue()).intValue();
            Intrinsics.i(layoutParams, "also(...)");
            f10 = 13.0f;
        } else {
            i10 = f123157e;
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceCreate = Typeface.create(getTypeface(), HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, false);
                Intrinsics.i(typefaceCreate, "create(...)");
            } else {
                Typeface typefaceTypefaceCreateDerived = FS.typefaceCreateDerived(getTypeface(), 0);
                Intrinsics.g(typefaceTypefaceCreateDerived);
                typefaceCreate = typefaceTypefaceCreateDerived;
            }
            layoutParams = getLayoutParams();
            Lazy lazy2 = f123159g;
            layoutParams.width = ((Number) lazy2.getValue()).intValue();
            layoutParams.height = ((Number) lazy2.getValue()).intValue();
            Intrinsics.i(layoutParams, "also(...)");
            f10 = 12.0f;
        }
        setTextColor(i10);
        setTextSize(2, f10);
        setTypeface(typefaceCreate);
        setLayoutParams(layoutParams);
        a(this.f123161b);
    }
}

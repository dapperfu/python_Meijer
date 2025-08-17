package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.j1;
import com.medallia.digital.mobilesdk.x3;

/* loaded from: classes7.dex */
class k4 extends m4 {

    /* renamed from: k, reason: collision with root package name */
    private static final float f92425k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f92426l = 4.0f;

    /* renamed from: m, reason: collision with root package name */
    private static final int f92427m = 15;

    /* renamed from: n, reason: collision with root package name */
    private static final int f92428n = 10;

    /* renamed from: o, reason: collision with root package name */
    private static final int f92429o = 600;

    /* renamed from: p, reason: collision with root package name */
    private static final double f92430p = 0.2d;

    /* renamed from: q, reason: collision with root package name */
    private static final float f92431q = 0.7f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f92432g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f92433h;

    /* renamed from: i, reason: collision with root package name */
    private x4 f92434i;

    /* renamed from: j, reason: collision with root package name */
    private View f92435j;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            k4 k4Var = k4.this;
            l4 l4Var = k4Var.f92541a;
            if (l4Var != null && l4Var.f92493f) {
                k4Var.f92545e = motionEvent.getAction() == 0;
            }
            return false;
        }
    }

    class b extends v4 {

        class a extends v4 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f92438a;

            a(String str) {
                this.f92438a = str;
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                super.a();
                k4 k4Var = k4.this;
                k4Var.setContentDescription(String.format("%s %s ", this.f92438a, k4Var.f92541a.f92489b));
            }
        }

        b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().c().execute(new a(x3.e().a(k4.h(), k4.this.f92546f, x3.c.ALERT, (x3.a) null)));
        }
    }

    k4(l4 l4Var, Context context, String str) {
        super(l4Var, context, str);
    }

    private int a(int i10) {
        return (i10 * getResources().getDisplayMetrics().densityDpi) / 160;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h() {
        ConfigurationContract configurationContractA = t0.c().a();
        y3 localization = configurationContractA != null ? configurationContractA.getLocalization() : null;
        return (localization == null || localization.f() == null) ? "" : localization.f().getLocalUrl();
    }

    private void i() {
        View view = this.f92435j;
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new a());
    }

    private void j() {
        w7.b().a().execute(new b());
    }

    @Override // com.medallia.digital.mobilesdk.m4
    RelativeLayout b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.medallia_view_banner, (ViewGroup) this.f92542b, false);
        x4 x4Var = new x4(getContext(), null, 0, R.style.MedalliaDefaultShadowStyle);
        this.f92434i = x4Var;
        x4Var.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f92544d.removeAllViews();
        this.f92544d.addView(this.f92434i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        if (this.f92541a.f92492e == j1.c.TOP) {
            layoutParams.setMargins(0, 0, 0, a(10));
        } else {
            layoutParams.setMargins(0, a(10), 0, 0);
        }
        this.f92543c.setLayoutParams(layoutParams);
        this.f92434i.addView(this.f92543c);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.medallia_banner_root_view);
        this.f92435j = viewInflate.findViewById(R.id.text_container);
        i();
        TextView textView = (TextView) viewInflate.findViewById(R.id.medallia_banner_title_text_view);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.medallia_banner_message_text_view);
        this.f92432g = (TextView) viewInflate.findViewById(R.id.medallia_positive_view);
        this.f92433h = (ImageView) viewInflate.findViewById(R.id.medallia_negative_view);
        String str = this.f92541a.f92488a;
        if (str != null) {
            textView2.setText(str);
            textView2.setAlpha(f92431q);
            a(textView2, this.f92541a.f92500m, 0);
        }
        String str2 = this.f92541a.f92489b;
        if (str2 != null) {
            textView.setText(str2);
            j();
            a(textView, this.f92541a.f92500m, 1);
        }
        if (!TextUtils.isEmpty(this.f92541a.f92490c)) {
            try {
                relativeLayout.setBackgroundColor(Color.parseColor(this.f92541a.f92490c));
            } catch (Exception unused) {
                a4.f("Error on set banner background color");
            }
        }
        if (!TextUtils.isEmpty(this.f92541a.f92491d)) {
            try {
                textView.setTextColor(Color.parseColor(this.f92541a.f92491d));
                textView2.setTextColor(Color.parseColor(this.f92541a.f92491d));
            } catch (Exception unused2) {
                a4.f("Error on set banner background color");
            }
        }
        if (this.f92541a.f92493f) {
            this.f92432g.setVisibility(0);
            try {
                a(this.f92432g, this.f92541a.f92500m, 1);
                if (!TextUtils.isEmpty(this.f92541a.f92496i)) {
                    this.f92432g.setBackgroundColor(Color.parseColor(this.f92541a.f92496i));
                }
                if (!TextUtils.isEmpty(this.f92541a.f92495h)) {
                    this.f92432g.setTextColor(Color.parseColor(this.f92541a.f92495h));
                }
                if (!TextUtils.isEmpty(this.f92541a.f92494g)) {
                    this.f92432g.setText(this.f92541a.f92494g);
                }
            } catch (Exception unused3) {
                a4.f("Error on set banner action button");
            }
            this.f92433h.setVisibility(0);
            try {
                Drawable drawableE = i4.c().b() != null ? Z1.b.e(i4.c().b(), R.drawable.md_close_banner) : null;
                if (drawableE != null && !TextUtils.isEmpty(this.f92541a.f92497j)) {
                    drawableE.setColorFilter(Color.parseColor(this.f92541a.f92497j), PorterDuff.Mode.MULTIPLY);
                    this.f92433h.setImageDrawable(drawableE);
                }
            } catch (Exception unused4) {
                a4.c("Error on set banner close button color");
            }
        } else {
            this.f92432g.setVisibility(8);
            this.f92433h.setVisibility(8);
        }
        if (this.f92541a.f92499l) {
            if (getResources().getConfiguration().smallestScreenWidthDp < f92429o || i4.c().b().getResources().getConfiguration().orientation != 2) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f92543c.getLayoutParams();
                layoutParams2.setMargins(a(10), a(10), a(10), a(10));
                this.f92543c.setLayoutParams(layoutParams2);
            } else {
                ((Activity) i4.c().d().getBaseContext()).getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                int i10 = (int) (r9.widthPixels * f92430p);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f92543c.getLayoutParams();
                layoutParams3.setMargins(i10, a(10), i10, a(10));
                this.f92543c.setLayoutParams(layoutParams3);
            }
        }
        a();
        return relativeLayout;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    boolean c() {
        return this.f92541a.f92498k;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    boolean d() {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    View e() {
        return this.f92433h;
    }

    @Override // com.medallia.digital.mobilesdk.m4
    View f() {
        return this.f92432g;
    }

    private GradientDrawable a(int i10, int i11) {
        return a(Integer.valueOf(i10), (float[]) null, i11);
    }

    @Override // com.medallia.digital.mobilesdk.m4
    boolean b() {
        return this.f92541a.f92493f;
    }

    private GradientDrawable a(int i10, String str) {
        float f10 = i10;
        return a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f10, f10, f10, f10}, Color.parseColor(str));
    }

    private GradientDrawable a(Integer num, float[] fArr, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i10);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        if (num != null) {
            gradientDrawable.setCornerRadius(num.intValue());
        }
        return gradientDrawable;
    }

    private GradientDrawable a(float[] fArr, int i10) {
        return a((Integer) null, fArr, i10);
    }

    @Override // com.medallia.digital.mobilesdk.m4
    void a() {
        float f10 = getResources().getDisplayMetrics().density;
        this.f92434i.b(true);
        this.f92434i.b(1.0f * f10);
        this.f92434i.a(f10 * 4.0f);
    }

    private void a(TextView textView, String str, int i10) {
        if (str == null || textView == null) {
            return;
        }
        try {
            textView.setTypeface(Typeface.create(str, i10));
        } catch (Exception unused) {
            a4.c("Failed on setting font: " + str);
        }
    }
}

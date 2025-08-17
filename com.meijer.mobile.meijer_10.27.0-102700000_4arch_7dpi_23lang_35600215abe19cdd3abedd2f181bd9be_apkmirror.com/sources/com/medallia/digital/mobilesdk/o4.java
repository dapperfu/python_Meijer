package com.medallia.digital.mobilesdk;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.io.File;

/* loaded from: classes7.dex */
class o4 extends Dialog {

    /* renamed from: t, reason: collision with root package name */
    private static final int f92648t = 10;

    /* renamed from: u, reason: collision with root package name */
    private static final int f92649u = 25;

    /* renamed from: v, reason: collision with root package name */
    private static final String f92650v = "#004ccb";

    /* renamed from: a, reason: collision with root package name */
    private TextView f92651a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f92652b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f92653c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f92654d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f92655e;

    /* renamed from: f, reason: collision with root package name */
    private ThanksButton f92656f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f92657g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f92658h;

    /* renamed from: i, reason: collision with root package name */
    private View f92659i;

    /* renamed from: j, reason: collision with root package name */
    private final j2 f92660j;

    /* renamed from: k, reason: collision with root package name */
    private final r7 f92661k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f92662l;

    /* renamed from: m, reason: collision with root package name */
    private LinearLayout f92663m;

    /* renamed from: n, reason: collision with root package name */
    private e f92664n;

    /* renamed from: o, reason: collision with root package name */
    private d f92665o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f92666p;

    /* renamed from: q, reason: collision with root package name */
    private v5 f92667q;

    /* renamed from: r, reason: collision with root package name */
    private v5 f92668r;

    /* renamed from: s, reason: collision with root package name */
    private MDAppearanceMode f92669s;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a4.e("Thank You Prompt was closed by close button");
            o4.this.f92664n.close();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a4.e("Thank You Prompt was closed by x button");
            o4.this.f92664n.close();
        }
    }

    class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ URLSpan f92672a;

        c(URLSpan uRLSpan) {
            this.f92672a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (o4.this.f92665o.a(this.f92672a.getURL())) {
                Broadcasts.d.a(Broadcasts.d.a.formBlockedUrl, o4.this.f92660j.getFormId(), o4.this.f92660j.getFormType(), this.f92672a.getURL());
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f92672a.getURL()));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                i4.c().d().startActivity(intent);
                o4.this.f92664n.close();
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    interface d {
        boolean a(String str);
    }

    interface e {
        void close();
    }

    o4(Context context, j2 j2Var, boolean z10, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        super(context, R.style.MedalliaTYPDialog);
        this.f92666p = false;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        setContentView(R.layout.medallia_thank_you_promt_dialog);
        this.f92662l = (RelativeLayout) findViewById(R.id.medallia_thank_you_prompt_root_view);
        this.f92660j = j2Var;
        this.f92661k = j2Var.i();
        d();
        a(z10, v5Var, v5Var2, mDAppearanceMode);
        f();
        a();
        b();
        e();
        c();
    }

    private int a(int i10) {
        return (i10 * i4.c().b().getResources().getDisplayMetrics().densityDpi) / 160;
    }

    private void d() {
        this.f92653c = (ImageView) findViewById(R.id.medallia_logo_image);
        this.f92654d = (TextView) findViewById(R.id.thank_you_title);
        this.f92655e = (TextView) findViewById(R.id.thank_you_subtitle);
        this.f92656f = (ThanksButton) findViewById(R.id.thank_you_button);
        this.f92657g = (TextView) findViewById(R.id.thank_you_power_by);
        this.f92651a = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.f92652b = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.f92658h = (ImageView) findViewById(R.id.powerBy_logo);
        this.f92663m = (LinearLayout) findViewById(R.id.poweredby_container);
        this.f92659i = findViewById(R.id.medallia_delimiter);
    }

    private void e() {
        MDAppearanceMode mDAppearanceMode;
        v5 v5Var;
        r7 r7Var = this.f92661k;
        if (r7Var != null) {
            String strN = r7Var.n();
            String strL = this.f92661k.l();
            String strE = this.f92661k.e();
            String strA = this.f92661k.a();
            try {
                if (this.f92666p && (v5Var = this.f92667q) != null) {
                    strE = v5Var.c().c();
                    strA = this.f92667q.b().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you prompt content text and background dark mode color");
            }
            if (!this.f92660j.isPoweredByVisible()) {
                this.f92657g.setVisibility(8);
                this.f92658h.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f92663m.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, a(f92649u));
                this.f92663m.setLayoutParams(layoutParams);
            } else if (this.f92666p && (mDAppearanceMode = this.f92669s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                FS.Resources_setImageResource(this.f92658h, R.drawable.md_dark_logo_power_by);
                this.f92657g.setTextColor(-1);
            }
            if (TextUtils.isEmpty(strN)) {
                this.f92654d.setVisibility(8);
            } else {
                b(this.f92654d, "<html>" + strN + "</html>");
                a(this.f92654d, this.f92661k.g());
            }
            if (TextUtils.isEmpty(strL)) {
                this.f92655e.setVisibility(8);
            } else {
                b(this.f92655e, "<html>" + strL + "</html>");
                a(this.f92655e, this.f92661k.g());
            }
            if (!TextUtils.isEmpty(strE)) {
                try {
                    this.f92654d.setTextColor(Color.parseColor(strE));
                    this.f92655e.setTextColor(Color.parseColor(strE));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you prompt content color");
                }
            }
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            try {
                this.f92662l.setBackgroundColor(Color.parseColor(strA));
            } catch (Exception unused3) {
                a4.f("Error on set thank you content background color");
            }
        }
    }

    private void f() {
        v5 v5Var;
        String title = this.f92660j.getTitle();
        String titleTextColor = this.f92660j.getTitleTextColor();
        String titleBackgroundColor = this.f92660j.getTitleBackgroundColor();
        try {
            if (this.f92666p && (v5Var = this.f92668r) != null) {
                titleTextColor = v5Var.c().b();
                titleBackgroundColor = this.f92668r.b().b();
                this.f92659i.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            }
        } catch (Exception unused) {
            a4.f("Error on set prompt title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(title)) {
            this.f92651a.setText(title);
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f92651a.setTextColor(Color.parseColor(titleTextColor));
                this.f92652b.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
                r7 r7Var = this.f92661k;
                if (r7Var != null && !TextUtils.isEmpty(r7Var.o())) {
                    this.f92652b.setContentDescription(this.f92661k.o());
                }
            } catch (Exception unused2) {
                a4.f("Error on set prompt title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            this.f92651a.setBackgroundColor(Color.parseColor(titleBackgroundColor));
        } catch (Exception unused3) {
            a4.f("Error on set prompt title background color");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f92656f = null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a4.b("TYP dispatchTouchEvent");
        Broadcasts.j.a(Broadcasts.j.a.TouchEvent, motionEvent.getAction());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        dismiss();
    }

    private void b() {
        MDAppearanceMode mDAppearanceMode;
        r7 r7Var = this.f92661k;
        if (r7Var != null) {
            String strH = r7Var.h();
            String strI = this.f92661k.i();
            MDGifView mDGifView = (MDGifView) findViewById(R.id.GifImageView);
            if (!this.f92661k.q()) {
                this.f92653c.setVisibility(8);
                return;
            }
            this.f92653c.setVisibility(0);
            if (this.f92666p && (mDAppearanceMode = this.f92669s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                FS.Resources_setImageResource(this.f92653c, R.drawable.md_place_dark_holder_image);
                strI = this.f92661k.f();
            }
            if (!TextUtils.isEmpty(strI)) {
                File fileD = g2.d(strI);
                if (fileD.exists()) {
                    if (strI.endsWith(".gif")) {
                        mDGifView.setGifImageUri(Uri.fromFile(fileD));
                        if (!TextUtils.isEmpty(strH)) {
                            mDGifView.setContentDescription(strH);
                        }
                        mDGifView.setVisibility(0);
                        mDGifView.play();
                        this.f92653c.setVisibility(8);
                    } else {
                        this.f92653c.setImageBitmap(BitmapFactory.decodeFile(fileD.getAbsolutePath()));
                        mDGifView.setVisibility(8);
                    }
                }
            }
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            this.f92653c.setContentDescription(strH);
        }
    }

    private void c() {
        this.f92656f.setOnClickListener(new a());
        this.f92652b.setOnClickListener(new b());
    }

    private String a(String str) {
        return str.replace("&lt", "<").replace("&gt&lt/", "</").replace("&gt", ">");
    }

    protected void b(TextView textView, String str) {
        Spannable spannable = (Spannable) Html.fromHtml(a(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannable.length(), URLSpan.class)) {
            a(spannableStringBuilder, uRLSpan);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void a() {
        v5 v5Var;
        r7 r7Var = this.f92661k;
        if (r7Var != null) {
            String strC = r7Var.c();
            String strD = this.f92661k.d();
            String strB = this.f92661k.b();
            try {
                if (this.f92666p && (v5Var = this.f92667q) != null) {
                    strD = v5Var.c().a();
                    strB = this.f92667q.a().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you close button text and background dark mode color");
            }
            if (!this.f92661k.p()) {
                this.f92656f.setVisibility(8);
                return;
            }
            if (!TextUtils.isEmpty(strC)) {
                this.f92656f.setText(strC);
                this.f92656f.setAllCaps(false);
            }
            if (!TextUtils.isEmpty(strD)) {
                try {
                    this.f92656f.setTextColor(Color.parseColor(strD));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you close button text color");
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (TextUtils.isEmpty(strB)) {
                gradientDrawable.setColor(Color.parseColor(f92650v));
            } else {
                try {
                    gradientDrawable.setColor(Color.parseColor(strB));
                } catch (Exception unused3) {
                    a4.f("Error on set thank you close button background color");
                }
            }
            gradientDrawable.setCornerRadius(10.0f);
            this.f92656f.requestFocus();
            this.f92656f.setBackground(gradientDrawable);
        }
    }

    protected void a(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new c(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    private void a(TextView textView, String str) {
        if (str == null || textView == null) {
            return;
        }
        try {
            textView.setTypeface(Typeface.create(str, 0));
        } catch (Exception unused) {
            a4.c("Failed on setting font: " + str);
        }
    }

    protected void a(d dVar) {
        this.f92665o = dVar;
    }

    protected void a(e eVar) {
        this.f92664n = eVar;
    }

    private void a(boolean z10, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        j2 j2Var;
        if (this.f92661k == null || (j2Var = this.f92660j) == null || !j2Var.isDarkModeEnabled()) {
            return;
        }
        this.f92666p = this.f92660j.isDarkModeEnabled();
        if (z10) {
            this.f92667q = v5Var;
            this.f92668r = v5Var2;
            this.f92669s = mDAppearanceMode;
        } else {
            this.f92669s = v7.c().a();
            this.f92667q = v7.c().a(this.f92661k.m());
            this.f92668r = v7.c().a(this.f92660j.getHeaderThemeName());
        }
    }
}

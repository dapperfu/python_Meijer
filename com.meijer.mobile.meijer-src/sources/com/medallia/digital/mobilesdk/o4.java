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

/* loaded from: classes8.dex */
class o4 extends Dialog {

    /* renamed from: t, reason: collision with root package name */
    private static final int f93487t = 10;

    /* renamed from: u, reason: collision with root package name */
    private static final int f93488u = 25;

    /* renamed from: v, reason: collision with root package name */
    private static final String f93489v = "#004ccb";

    /* renamed from: a, reason: collision with root package name */
    private TextView f93490a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f93491b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f93492c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f93493d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f93494e;

    /* renamed from: f, reason: collision with root package name */
    private ThanksButton f93495f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f93496g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f93497h;

    /* renamed from: i, reason: collision with root package name */
    private View f93498i;

    /* renamed from: j, reason: collision with root package name */
    private final j2 f93499j;

    /* renamed from: k, reason: collision with root package name */
    private final r7 f93500k;

    /* renamed from: l, reason: collision with root package name */
    private final RelativeLayout f93501l;

    /* renamed from: m, reason: collision with root package name */
    private LinearLayout f93502m;

    /* renamed from: n, reason: collision with root package name */
    private e f93503n;

    /* renamed from: o, reason: collision with root package name */
    private d f93504o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f93505p;

    /* renamed from: q, reason: collision with root package name */
    private v5 f93506q;

    /* renamed from: r, reason: collision with root package name */
    private v5 f93507r;

    /* renamed from: s, reason: collision with root package name */
    private MDAppearanceMode f93508s;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a4.e("Thank You Prompt was closed by close button");
            o4.this.f93503n.close();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a4.e("Thank You Prompt was closed by x button");
            o4.this.f93503n.close();
        }
    }

    class c extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ URLSpan f93511a;

        c(URLSpan uRLSpan) {
            this.f93511a = uRLSpan;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (o4.this.f93504o.a(this.f93511a.getURL())) {
                Broadcasts.d.a(Broadcasts.d.a.formBlockedUrl, o4.this.f93499j.getFormId(), o4.this.f93499j.getFormType(), this.f93511a.getURL());
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.f93511a.getURL()));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                i4.c().d().startActivity(intent);
                o4.this.f93503n.close();
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
        this.f93505p = false;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        setContentView(R.layout.medallia_thank_you_promt_dialog);
        this.f93501l = (RelativeLayout) findViewById(R.id.medallia_thank_you_prompt_root_view);
        this.f93499j = j2Var;
        this.f93500k = j2Var.i();
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
        this.f93492c = (ImageView) findViewById(R.id.medallia_logo_image);
        this.f93493d = (TextView) findViewById(R.id.thank_you_title);
        this.f93494e = (TextView) findViewById(R.id.thank_you_subtitle);
        this.f93495f = (ThanksButton) findViewById(R.id.thank_you_button);
        this.f93496g = (TextView) findViewById(R.id.thank_you_power_by);
        this.f93490a = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.f93491b = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.f93497h = (ImageView) findViewById(R.id.powerBy_logo);
        this.f93502m = (LinearLayout) findViewById(R.id.poweredby_container);
        this.f93498i = findViewById(R.id.medallia_delimiter);
    }

    private void e() {
        MDAppearanceMode mDAppearanceMode;
        v5 v5Var;
        r7 r7Var = this.f93500k;
        if (r7Var != null) {
            String strN = r7Var.n();
            String strL = this.f93500k.l();
            String strE = this.f93500k.e();
            String strA = this.f93500k.a();
            try {
                if (this.f93505p && (v5Var = this.f93506q) != null) {
                    strE = v5Var.c().c();
                    strA = this.f93506q.b().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you prompt content text and background dark mode color");
            }
            if (!this.f93499j.isPoweredByVisible()) {
                this.f93496g.setVisibility(8);
                this.f93497h.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f93502m.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, a(f93488u));
                this.f93502m.setLayoutParams(layoutParams);
            } else if (this.f93505p && (mDAppearanceMode = this.f93508s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                FS.Resources_setImageResource(this.f93497h, R.drawable.md_dark_logo_power_by);
                this.f93496g.setTextColor(-1);
            }
            if (TextUtils.isEmpty(strN)) {
                this.f93493d.setVisibility(8);
            } else {
                b(this.f93493d, "<html>" + strN + "</html>");
                a(this.f93493d, this.f93500k.g());
            }
            if (TextUtils.isEmpty(strL)) {
                this.f93494e.setVisibility(8);
            } else {
                b(this.f93494e, "<html>" + strL + "</html>");
                a(this.f93494e, this.f93500k.g());
            }
            if (!TextUtils.isEmpty(strE)) {
                try {
                    this.f93493d.setTextColor(Color.parseColor(strE));
                    this.f93494e.setTextColor(Color.parseColor(strE));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you prompt content color");
                }
            }
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            try {
                this.f93501l.setBackgroundColor(Color.parseColor(strA));
            } catch (Exception unused3) {
                a4.f("Error on set thank you content background color");
            }
        }
    }

    private void f() {
        v5 v5Var;
        String title = this.f93499j.getTitle();
        String titleTextColor = this.f93499j.getTitleTextColor();
        String titleBackgroundColor = this.f93499j.getTitleBackgroundColor();
        try {
            if (this.f93505p && (v5Var = this.f93507r) != null) {
                titleTextColor = v5Var.c().b();
                titleBackgroundColor = this.f93507r.b().b();
                this.f93498i.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            }
        } catch (Exception unused) {
            a4.f("Error on set prompt title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(title)) {
            this.f93490a.setText(title);
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f93490a.setTextColor(Color.parseColor(titleTextColor));
                this.f93491b.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
                r7 r7Var = this.f93500k;
                if (r7Var != null && !TextUtils.isEmpty(r7Var.o())) {
                    this.f93491b.setContentDescription(this.f93500k.o());
                }
            } catch (Exception unused2) {
                a4.f("Error on set prompt title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            this.f93490a.setBackgroundColor(Color.parseColor(titleBackgroundColor));
        } catch (Exception unused3) {
            a4.f("Error on set prompt title background color");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f93495f = null;
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
        r7 r7Var = this.f93500k;
        if (r7Var != null) {
            String strH = r7Var.h();
            String strI = this.f93500k.i();
            MDGifView mDGifView = (MDGifView) findViewById(R.id.GifImageView);
            if (!this.f93500k.q()) {
                this.f93492c.setVisibility(8);
                return;
            }
            this.f93492c.setVisibility(0);
            if (this.f93505p && (mDAppearanceMode = this.f93508s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                FS.Resources_setImageResource(this.f93492c, R.drawable.md_place_dark_holder_image);
                strI = this.f93500k.f();
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
                        this.f93492c.setVisibility(8);
                    } else {
                        this.f93492c.setImageBitmap(BitmapFactory.decodeFile(fileD.getAbsolutePath()));
                        mDGifView.setVisibility(8);
                    }
                }
            }
            if (TextUtils.isEmpty(strH)) {
                return;
            }
            this.f93492c.setContentDescription(strH);
        }
    }

    private void c() {
        this.f93495f.setOnClickListener(new a());
        this.f93491b.setOnClickListener(new b());
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
        r7 r7Var = this.f93500k;
        if (r7Var != null) {
            String strC = r7Var.c();
            String strD = this.f93500k.d();
            String strB = this.f93500k.b();
            try {
                if (this.f93505p && (v5Var = this.f93506q) != null) {
                    strD = v5Var.c().a();
                    strB = this.f93506q.a().a();
                }
            } catch (Exception unused) {
                a4.f("Error on set thank you close button text and background dark mode color");
            }
            if (!this.f93500k.p()) {
                this.f93495f.setVisibility(8);
                return;
            }
            if (!TextUtils.isEmpty(strC)) {
                this.f93495f.setText(strC);
                this.f93495f.setAllCaps(false);
            }
            if (!TextUtils.isEmpty(strD)) {
                try {
                    this.f93495f.setTextColor(Color.parseColor(strD));
                } catch (Exception unused2) {
                    a4.f("Error on set thank you close button text color");
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            if (TextUtils.isEmpty(strB)) {
                gradientDrawable.setColor(Color.parseColor(f93489v));
            } else {
                try {
                    gradientDrawable.setColor(Color.parseColor(strB));
                } catch (Exception unused3) {
                    a4.f("Error on set thank you close button background color");
                }
            }
            gradientDrawable.setCornerRadius(10.0f);
            this.f93495f.requestFocus();
            this.f93495f.setBackground(gradientDrawable);
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
        this.f93504o = dVar;
    }

    protected void a(e eVar) {
        this.f93503n = eVar;
    }

    private void a(boolean z10, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        j2 j2Var;
        if (this.f93500k == null || (j2Var = this.f93499j) == null || !j2Var.isDarkModeEnabled()) {
            return;
        }
        this.f93505p = this.f93499j.isDarkModeEnabled();
        if (z10) {
            this.f93506q = v5Var;
            this.f93507r = v5Var2;
            this.f93508s = mDAppearanceMode;
        } else {
            this.f93508s = v7.c().a();
            this.f93506q = v7.c().a(this.f93500k.m());
            this.f93507r = v7.c().a(this.f93499j.getHeaderThemeName());
        }
    }
}

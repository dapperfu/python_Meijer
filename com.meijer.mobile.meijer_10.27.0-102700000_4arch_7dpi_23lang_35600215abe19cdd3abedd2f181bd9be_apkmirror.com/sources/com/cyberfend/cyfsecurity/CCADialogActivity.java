package com.cyberfend.cyfsecurity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import r7.C16728a;
import r7.C16729b;
import r7.C16730c;
import w6.C17780b;
import w6.C17780b.a;
import w6.C17785g;

/* loaded from: classes4.dex */
public class CCADialogActivity extends AppCompatActivity {

    /* renamed from: r, reason: collision with root package name */
    private TextView f64142r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f64143s;

    /* renamed from: t, reason: collision with root package name */
    private Button f64144t;

    /* renamed from: u, reason: collision with root package name */
    private CircleProgressBar f64145u;

    /* renamed from: v, reason: collision with root package name */
    private C17780b.InterfaceC2632b f64146v = new a();

    final class a implements C17780b.InterfaceC2632b {

        /* renamed from: com.cyberfend.cyfsecurity.CCADialogActivity$a$a, reason: collision with other inner class name */
        final class RunnableC1250a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f64148a;

            RunnableC1250a(float f10) {
                this.f64148a = f10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CCADialogActivity.this.f64145u.setProgress(this.f64148a);
            }
        }

        @Override // w6.C17780b.InterfaceC2632b
        public final void a() {
            CCADialogActivity.this.f64145u.f64161k.removeCallbacksAndMessages(null);
            CCADialogActivity.this.finish();
        }

        a() {
        }

        @Override // w6.C17780b.InterfaceC2632b
        public final void a(float f10) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1250a(f10));
        }
    }

    final class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C17780b.c();
            C17780b.e();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C16730c.f157859a);
        setFinishOnTouchOutside(false);
        this.f64145u = (CircleProgressBar) findViewById(C16729b.f157857c);
        String stringExtra = getIntent().getStringExtra("CCA Title");
        String stringExtra2 = getIntent().getStringExtra("CCA Message");
        String stringExtra3 = getIntent().getStringExtra("CCA Cancel Button");
        TextView textView = (TextView) findViewById(C16729b.f157858d);
        this.f64142r = textView;
        textView.setText(stringExtra);
        TextView textView2 = (TextView) findViewById(C16729b.f157856b);
        this.f64143s = textView2;
        textView2.setText(stringExtra2);
        Button button = (Button) findViewById(C16729b.f157855a);
        this.f64144t = button;
        button.setText(stringExtra3);
        this.f64144t.setOnClickListener(new b());
        int intExtra = getIntent().getIntExtra("Theme Color", getResources().getColor(C16728a.f157852a));
        this.f64144t.setTextColor(intExtra);
        this.f64145u.setProgressBarColor(intExtra);
        C17780b c17780bC = C17780b.c();
        c17780bC.f165864a = this.f64146v;
        C17780b.a aVar = c17780bC.new a();
        C17785g c17785gS = C17785g.s();
        String str = c17780bC.f165867d;
        c17785gS.f165893C = aVar;
        int i10 = c17785gS.f165901b;
        if (i10 != 1 && i10 != 3) {
            c17785gS.f165895E = str;
            c17785gS.e(100L, 1);
        }
        c17780bC.f165864a.a(c17780bC.f165866c);
    }
}

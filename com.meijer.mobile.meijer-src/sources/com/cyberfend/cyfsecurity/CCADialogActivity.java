package com.cyberfend.cyfsecurity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import t7.C17202a;
import t7.C17203b;
import t7.C17204c;
import x6.C18107b;
import x6.C18107b.a;
import x6.C18112g;

/* loaded from: classes4.dex */
public class CCADialogActivity extends AppCompatActivity {

    /* renamed from: r, reason: collision with root package name */
    private TextView f64982r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f64983s;

    /* renamed from: t, reason: collision with root package name */
    private Button f64984t;

    /* renamed from: u, reason: collision with root package name */
    private CircleProgressBar f64985u;

    /* renamed from: v, reason: collision with root package name */
    private C18107b.InterfaceC2738b f64986v = new a();

    final class a implements C18107b.InterfaceC2738b {

        /* renamed from: com.cyberfend.cyfsecurity.CCADialogActivity$a$a, reason: collision with other inner class name */
        final class RunnableC1259a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f64988a;

            RunnableC1259a(float f10) {
                this.f64988a = f10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CCADialogActivity.this.f64985u.setProgress(this.f64988a);
            }
        }

        @Override // x6.C18107b.InterfaceC2738b
        public final void a() {
            CCADialogActivity.this.f64985u.f65001k.removeCallbacksAndMessages(null);
            CCADialogActivity.this.finish();
        }

        a() {
        }

        @Override // x6.C18107b.InterfaceC2738b
        public final void a(float f10) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1259a(f10));
        }
    }

    final class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C18107b.c();
            C18107b.e();
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17204c.f162349a);
        setFinishOnTouchOutside(false);
        this.f64985u = (CircleProgressBar) findViewById(C17203b.f162347c);
        String stringExtra = getIntent().getStringExtra("CCA Title");
        String stringExtra2 = getIntent().getStringExtra("CCA Message");
        String stringExtra3 = getIntent().getStringExtra("CCA Cancel Button");
        TextView textView = (TextView) findViewById(C17203b.f162348d);
        this.f64982r = textView;
        textView.setText(stringExtra);
        TextView textView2 = (TextView) findViewById(C17203b.f162346b);
        this.f64983s = textView2;
        textView2.setText(stringExtra2);
        Button button = (Button) findViewById(C17203b.f162345a);
        this.f64984t = button;
        button.setText(stringExtra3);
        this.f64984t.setOnClickListener(new b());
        int intExtra = getIntent().getIntExtra("Theme Color", getResources().getColor(C17202a.f162342a));
        this.f64984t.setTextColor(intExtra);
        this.f64985u.setProgressBarColor(intExtra);
        C18107b c18107bC = C18107b.c();
        c18107bC.f170509a = this.f64986v;
        C18107b.a aVar = c18107bC.new a();
        C18112g c18112gS = C18112g.s();
        String str = c18107bC.f170512d;
        c18112gS.f170538C = aVar;
        int i10 = c18112gS.f170546b;
        if (i10 != 1 && i10 != 3) {
            c18112gS.f170540E = str;
            c18112gS.e(100L, 1);
        }
        c18107bC.f170509a.a(c18107bC.f170511c);
    }
}

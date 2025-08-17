package Pc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: Pc.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC4594y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f25243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f25244b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f25245c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f25246d;

    RunnableC4594y(C4595z c4595z, Context context, String str, boolean z10, boolean z11) {
        this.f25243a = context;
        this.f25244b = str;
        this.f25245c = z10;
        this.f25246d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lc.v.t();
        AlertDialog.Builder builderL = D0.l(this.f25243a);
        builderL.setMessage(this.f25244b);
        if (this.f25245c) {
            builderL.setTitle("Error");
        } else {
            builderL.setTitle("Info");
        }
        if (this.f25246d) {
            builderL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC4593x(this, this.f25243a));
            builderL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}

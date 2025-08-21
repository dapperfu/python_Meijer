package Rc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: Rc.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class RunnableC5215y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f32457a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f32458b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f32459c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f32460d;

    RunnableC5215y(C5216z c5216z, Context context, String str, boolean z10, boolean z11) {
        this.f32457a = context;
        this.f32458b = str;
        this.f32459c = z10;
        this.f32460d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Nc.v.t();
        AlertDialog.Builder builderL = D0.l(this.f32457a);
        builderL.setMessage(this.f32458b);
        if (this.f32459c) {
            builderL.setTitle("Error");
        } else {
            builderL.setTitle("Info");
        }
        if (this.f32460d) {
            builderL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderL.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC5214x(this, this.f32457a));
            builderL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderL.create().show();
    }
}

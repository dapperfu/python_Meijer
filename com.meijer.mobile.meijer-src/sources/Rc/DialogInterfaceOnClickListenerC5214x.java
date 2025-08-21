package Rc;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: Rc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class DialogInterfaceOnClickListenerC5214x implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f32453a;

    DialogInterfaceOnClickListenerC5214x(RunnableC5215y runnableC5215y, Context context) {
        this.f32453a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Nc.v.t();
        D0.u(this.f32453a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

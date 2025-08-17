package Pc;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* renamed from: Pc.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class DialogInterfaceOnClickListenerC4593x implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f25239a;

    DialogInterfaceOnClickListenerC4593x(RunnableC4594y runnableC4594y, Context context) {
        this.f25239a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Lc.v.t();
        D0.u(this.f25239a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

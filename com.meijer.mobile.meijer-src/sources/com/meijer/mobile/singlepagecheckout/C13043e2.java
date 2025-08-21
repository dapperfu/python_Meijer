package com.meijer.mobile.singlepagecheckout;

import android.content.Context;
import android.content.DialogInterface;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.C15485b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lbk/a;", "title", "", "message", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "", "onPositivePressed", "onNegativePressed", "Lkotlin/Function0;", "onCancelListener", "negativeButtonText", "positiveButtonText", "", "isCancelable", "i", "(Lbk/a;Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Z)V", "g", "(Lbk/a;Landroid/content/Context;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.e2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13043e2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(DialogInterface dialog) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    private static final void i(AbstractC6392a abstractC6392a, String str, Context context, final Function1<? super DialogInterface, Unit> function1, final Function1<? super DialogInterface, Unit> function12, final Function0<Unit> function0, String str2, String str3, boolean z10) {
        C15485b positiveButton = new C15485b(context).setCancelable(z10).setTitle(abstractC6392a.b(context)).setMessage(str).setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.b2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C13043e2.l(function1, dialogInterface, i10);
            }
        });
        Intrinsics.i(positiveButton, "setPositiveButton(...)");
        if (function12 != null) {
            positiveButton.setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.c2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C13043e2.m(function12, dialogInterface, i10);
                }
            });
        }
        positiveButton.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.singlepagecheckout.d2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C13043e2.n(function0, dialogInterface);
            }
        });
        positiveButton.show();
    }

    static /* synthetic */ void j(AbstractC6392a abstractC6392a, String str, Context context, Function1 function1, Function1 function12, Function0 function0, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function12 = null;
        }
        i(abstractC6392a, str, context, function1, function12, (i10 & 32) != 0 ? new Function0() { // from class: com.meijer.mobile.singlepagecheckout.Z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13043e2.k();
            }
        } : function0, (i10 & 64) != 0 ? "" : str2, str3, (i10 & 256) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AbstractC6392a abstractC6392a, Context context) {
        String strB = abstractC6392a.b(context);
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        j(companion.d(com.meijer.mobile.meijer.Y.f100323Ab, new Object[0]), strB, context, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13043e2.h((DialogInterface) obj);
            }
        }, null, null, null, companion.d(yr.Q.f171761b, new Object[0]).b(context), false, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Function1 function1, DialogInterface dialogInterface, int i10) {
        Intrinsics.g(dialogInterface);
        function1.invoke(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Function1 function1, DialogInterface dialogInterface, int i10) {
        Intrinsics.g(dialogInterface);
        function1.invoke(dialogInterface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }
}

package com.meijer.mobile.singlepagecheckout;

import ak.AbstractC5607a;
import android.content.Context;
import android.content.DialogInterface;
import je.C14886b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062%\b\u0002\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lak/a;", "title", "", "message", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "", "onPositivePressed", "onNegativePressed", "Lkotlin/Function0;", "onCancelListener", "negativeButtonText", "positiveButtonText", "", "isCancelable", "i", "(Lak/a;Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Z)V", "g", "(Lak/a;Landroid/content/Context;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.c2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12909c2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(DialogInterface dialog) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f142422a;
    }

    private static final void i(AbstractC5607a abstractC5607a, String str, Context context, final Function1<? super DialogInterface, Unit> function1, final Function1<? super DialogInterface, Unit> function12, final Function0<Unit> function0, String str2, String str3, boolean z10) {
        C14886b positiveButton = new C14886b(context).setCancelable(z10).setTitle(abstractC5607a.b(context)).setMessage(str).setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.Z1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C12909c2.l(function1, dialogInterface, i10);
            }
        });
        Intrinsics.i(positiveButton, "setPositiveButton(...)");
        if (function12 != null) {
            positiveButton.setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.singlepagecheckout.a2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    C12909c2.m(function12, dialogInterface, i10);
                }
            });
        }
        positiveButton.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.singlepagecheckout.b2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C12909c2.n(function0, dialogInterface);
            }
        });
        positiveButton.show();
    }

    static /* synthetic */ void j(AbstractC5607a abstractC5607a, String str, Context context, Function1 function1, Function1 function12, Function0 function0, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function12 = null;
        }
        i(abstractC5607a, str, context, function1, function12, (i10 & 32) != 0 ? new Function0() { // from class: com.meijer.mobile.singlepagecheckout.X1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12909c2.k();
            }
        } : function0, (i10 & 64) != 0 ? "" : str2, str3, (i10 & 256) != 0 ? false : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AbstractC5607a abstractC5607a, Context context) {
        String strB = abstractC5607a.b(context);
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        j(companion.d(com.meijer.mobile.meijer.Y.f100419xb, new Object[0]), strB, context, new Function1() { // from class: com.meijer.mobile.singlepagecheckout.Y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12909c2.h((DialogInterface) obj);
            }
        }, null, null, null, companion.d(yr.Q.f170986b, new Object[0]).b(context), false, 112, null);
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

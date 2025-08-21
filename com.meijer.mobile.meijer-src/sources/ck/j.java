package ck;

import android.content.Context;
import android.content.DialogInterface;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import le.C15485b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lle/b;", "Lbk/a;", "formattedString", "d", "(Lle/b;Lbk/a;)Lle/b;", "a", "Landroid/content/DialogInterface$OnClickListener;", "listener", "c", "(Lle/b;Lbk/a;Landroid/content/DialogInterface$OnClickListener;)Lle/b;", "b", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j {
    public static final C15485b a(C15485b c15485b, AbstractC6392a formattedString) {
        Intrinsics.j(c15485b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Context context = c15485b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C15485b message = c15485b.setMessage(formattedString.b(context));
        Intrinsics.i(message, "setMessage(...)");
        return message;
    }

    public static final C15485b b(C15485b c15485b, AbstractC6392a formattedString, DialogInterface.OnClickListener listener) {
        Intrinsics.j(c15485b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Intrinsics.j(listener, "listener");
        Context context = c15485b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C15485b negativeButton = c15485b.setNegativeButton(formattedString.b(context), listener);
        Intrinsics.i(negativeButton, "setNegativeButton(...)");
        return negativeButton;
    }

    public static final C15485b c(C15485b c15485b, AbstractC6392a formattedString, DialogInterface.OnClickListener listener) {
        Intrinsics.j(c15485b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Intrinsics.j(listener, "listener");
        Context context = c15485b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C15485b positiveButton = c15485b.setPositiveButton(formattedString.b(context), listener);
        Intrinsics.i(positiveButton, "setPositiveButton(...)");
        return positiveButton;
    }

    public static final C15485b d(C15485b c15485b, AbstractC6392a formattedString) {
        Intrinsics.j(c15485b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Context context = c15485b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C15485b title = c15485b.setTitle(formattedString.b(context));
        Intrinsics.i(title, "setTitle(...)");
        return title;
    }
}

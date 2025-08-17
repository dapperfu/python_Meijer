package bk;

import ak.AbstractC5607a;
import android.content.Context;
import android.content.DialogInterface;
import je.C14886b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lje/b;", "Lak/a;", "formattedString", "d", "(Lje/b;Lak/a;)Lje/b;", "a", "Landroid/content/DialogInterface$OnClickListener;", "listener", "c", "(Lje/b;Lak/a;Landroid/content/DialogInterface$OnClickListener;)Lje/b;", "b", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j {
    public static final C14886b a(C14886b c14886b, AbstractC5607a formattedString) {
        Intrinsics.j(c14886b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Context context = c14886b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C14886b message = c14886b.setMessage(formattedString.b(context));
        Intrinsics.i(message, "setMessage(...)");
        return message;
    }

    public static final C14886b b(C14886b c14886b, AbstractC5607a formattedString, DialogInterface.OnClickListener listener) {
        Intrinsics.j(c14886b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Intrinsics.j(listener, "listener");
        Context context = c14886b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C14886b negativeButton = c14886b.setNegativeButton(formattedString.b(context), listener);
        Intrinsics.i(negativeButton, "setNegativeButton(...)");
        return negativeButton;
    }

    public static final C14886b c(C14886b c14886b, AbstractC5607a formattedString, DialogInterface.OnClickListener listener) {
        Intrinsics.j(c14886b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Intrinsics.j(listener, "listener");
        Context context = c14886b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C14886b positiveButton = c14886b.setPositiveButton(formattedString.b(context), listener);
        Intrinsics.i(positiveButton, "setPositiveButton(...)");
        return positiveButton;
    }

    public static final C14886b d(C14886b c14886b, AbstractC5607a formattedString) {
        Intrinsics.j(c14886b, "<this>");
        Intrinsics.j(formattedString, "formattedString");
        Context context = c14886b.getContext();
        Intrinsics.i(context, "getContext(...)");
        C14886b title = c14886b.setTitle(formattedString.b(context));
        Intrinsics.i(title, "setTitle(...)");
        return title;
    }
}

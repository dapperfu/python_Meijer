package Qj;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.C15485b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LQj/b;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lle/b;", "Lkotlin/ParameterName;", "name", "event", "", "Lkotlin/ExtensionFunctionType;", "builder", "a", "(LQj/b;Landroid/content/Context;Lkotlin/jvm/functions/Function2;)Lle/b;", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c {
    public static final C15485b a(DialogEvent dialogEvent, Context context, Function2<? super C15485b, ? super DialogEvent, Unit> builder) {
        Intrinsics.j(dialogEvent, "<this>");
        Intrinsics.j(context, "context");
        Intrinsics.j(builder, "builder");
        C15485b c15485b = new C15485b(context);
        ck.j.d(c15485b, dialogEvent.getTitle());
        ck.j.a(c15485b, dialogEvent.getMessage());
        builder.invoke(c15485b, dialogEvent);
        return c15485b;
    }
}

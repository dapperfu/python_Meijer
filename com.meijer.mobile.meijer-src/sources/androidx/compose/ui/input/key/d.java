package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import e1.C13750b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Le1/b;", "", "onPreInterceptKeyBeforeSoftKeyboard", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {
    public static final Modifier a(Modifier modifier, Function1<? super C13750b, Boolean> function1) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, function1));
    }
}

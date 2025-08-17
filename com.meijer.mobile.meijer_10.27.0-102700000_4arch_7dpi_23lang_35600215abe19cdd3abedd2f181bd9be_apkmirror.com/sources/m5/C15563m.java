package m5;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "T", "view", "", "subtractPadding", "Lm5/l;", "a", "(Landroid/view/View;Z)Lm5/l;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: m5.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15563m {
    @JvmOverloads
    @JvmName
    public static final <T extends View> InterfaceC15562l<T> a(T t10, boolean z10) {
        return new C15557g(t10, z10);
    }

    public static /* synthetic */ InterfaceC15562l b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(view, z10);
    }
}

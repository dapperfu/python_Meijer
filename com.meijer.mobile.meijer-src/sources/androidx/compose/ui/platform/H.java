package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import g1.AndroidPointerIcon;
import g1.InterfaceC14319w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/H;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lg1/w;", BarcodePickDeserializer.FIELD_ICON, "Landroid/view/PointerIcon;", "b", "(Landroid/content/Context;Lg1/w;)Landroid/view/PointerIcon;", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;Lg1/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f52042a = new H();

    public final PointerIcon b(Context context, InterfaceC14319w icon) {
        return icon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) icon).getPointerIcon() : icon instanceof g1.AndroidPointerIcon ? PointerIcon.getSystemIcon(context, ((g1.AndroidPointerIcon) icon).getType()) : PointerIcon.getSystemIcon(context, 1000);
    }

    private H() {
    }

    public final void a(View view, InterfaceC14319w icon) {
        PointerIcon pointerIconB = b(view.getContext(), icon);
        if (!Intrinsics.e(view.getPointerIcon(), pointerIconB)) {
            view.setPointerIcon(pointerIconB);
        }
    }
}

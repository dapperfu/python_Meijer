package androidx.compose.ui.platform;

import android.view.MotionEvent;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/V0;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "", "index", "", "a", "(Landroid/view/MotionEvent;I)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public static final V0 f51945a = new V0();

    private V0() {
    }

    public final boolean a(MotionEvent event, int index) {
        if ((Float.floatToRawIntBits(event.getRawX(index)) & a.e.API_PRIORITY_OTHER) < 2139095040 && (Float.floatToRawIntBits(event.getRawY(index)) & a.e.API_PRIORITY_OTHER) < 2139095040) {
            return true;
        }
        return false;
    }
}

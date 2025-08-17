package g1;

import android.view.MotionEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/viewinterop/AndroidViewHolder;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class L {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<MotionEvent, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f132586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AndroidViewHolder androidViewHolder) {
            super(1);
            this.f132586f = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f132586f.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f132586f.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final Modifier a(Modifier modifier, AndroidViewHolder androidViewHolder) {
        K k10 = new K();
        k10.o(new a(androidViewHolder));
        S s10 = new S();
        k10.p(s10);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(s10);
        return modifier.then(k10);
    }
}

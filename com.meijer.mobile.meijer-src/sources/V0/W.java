package V0;

import V0.q1;
import android.graphics.Path;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LV0/q1;", "a", "()LV0/q1;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)LV0/q1;", "", "message", "", "d", "(Ljava/lang/String;)V", "LV0/q1$b;", "Landroid/graphics/Path$Direction;", "e", "(LV0/q1$b;)Landroid/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q1.b.values().length];
            try {
                iArr[q1.b.f39391a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q1.b.f39392b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q1 a() {
        return new Q(null, 1, 0 == true ? 1 : 0);
    }

    public static final q1 c(Path path) {
        return new Q(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction e(q1.b bVar) {
        int i10 = a.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}

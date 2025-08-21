package r5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import m5.C15664c;
import m5.C15669h;
import n5.C15907d;
import n5.EnumC15908e;
import n5.InterfaceC15915l;
import o5.InterfaceC16074d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lm5/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "resId", "default", "c", "(Lm5/h;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Lm5/c;", "a", "Lm5/c;", "b", "()Lm5/c;", "DEFAULT_REQUEST_OPTIONS", "", "(Lm5/h;)Z", "allowInexactSize", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: r5.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16845i {

    /* renamed from: a, reason: collision with root package name */
    private static final C15664c f159233a = new C15664c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: r5.i$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15908e.values().length];
            try {
                iArr[EnumC15908e.f152051a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15908e.f152052b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15908e.f152053c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final C15664c b() {
        return f159233a;
    }

    public static final Drawable c(C15669h c15669h, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C16840d.a(c15669h.getContext(), num.intValue());
    }

    public static final boolean a(C15669h c15669h) {
        int i10 = a.$EnumSwitchMapping$0[c15669h.getPrecision().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            if (c15669h.getDefined().getSizeResolver() == null && (c15669h.getSizeResolver() instanceof C15907d)) {
                return true;
            }
            if (!(c15669h.getTarget() instanceof InterfaceC16074d) || !(c15669h.getSizeResolver() instanceof InterfaceC15915l) || !(((InterfaceC16074d) c15669h.getTarget()).getView() instanceof ImageView) || ((InterfaceC16074d) c15669h.getTarget()).getView() != ((InterfaceC15915l) c15669h.getSizeResolver()).getView()) {
                return false;
            }
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}

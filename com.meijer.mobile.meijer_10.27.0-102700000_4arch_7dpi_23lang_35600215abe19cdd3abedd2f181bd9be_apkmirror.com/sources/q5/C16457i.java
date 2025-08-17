package q5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import l5.C15367c;
import l5.C15372h;
import m5.C15554d;
import m5.EnumC15555e;
import m5.InterfaceC15562l;
import n5.InterfaceC15780d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u0010\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Ll5/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "resId", "default", "c", "(Ll5/h;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Ll5/c;", "a", "Ll5/c;", "b", "()Ll5/c;", "DEFAULT_REQUEST_OPTIONS", "", "(Ll5/h;)Z", "allowInexactSize", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: q5.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16457i {

    /* renamed from: a, reason: collision with root package name */
    private static final C15367c f156785a = new C15367c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.i$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC15555e.values().length];
            try {
                iArr[EnumC15555e.f149839a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15555e.f149840b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15555e.f149841c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final C15367c b() {
        return f156785a;
    }

    public static final Drawable c(C15372h c15372h, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return C16452d.a(c15372h.getContext(), num.intValue());
    }

    public static final boolean a(C15372h c15372h) {
        int i10 = a.$EnumSwitchMapping$0[c15372h.getPrecision().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            if (c15372h.getDefined().getSizeResolver() == null && (c15372h.getSizeResolver() instanceof C15554d)) {
                return true;
            }
            if (!(c15372h.getTarget() instanceof InterfaceC15780d) || !(c15372h.getSizeResolver() instanceof InterfaceC15562l) || !(((InterfaceC15780d) c15372h.getTarget()).getView() instanceof ImageView) || ((InterfaceC15780d) c15372h.getTarget()).getView() != ((InterfaceC15562l) c15372h.getSizeResolver()).getView()) {
                return false;
            }
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}

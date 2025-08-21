package d5;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u000e\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"Ld5/m;", "", "mimeType", "", "c", "(Ld5/m;Ljava/lang/String;)Z", "", "a", "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "Ld5/k;", "b", "(Ld5/k;)Z", "isSwapped", "isRotated", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f128067a = SetsKt.i("image/jpeg", "image/webp", "image/heic", "image/heif");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.f128061b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.f128060a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.f128062c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean c(m mVar, String str) {
        int i10 = a.$EnumSwitchMapping$0[mVar.ordinal()];
        if (i10 == 1) {
            return str != null && f128067a.contains(str);
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean a(C13627k c13627k) {
        if (c13627k.getRotationDegrees() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(C13627k c13627k) {
        if (c13627k.getRotationDegrees() != 90 && c13627k.getRotationDegrees() != 270) {
            return false;
        }
        return true;
    }
}

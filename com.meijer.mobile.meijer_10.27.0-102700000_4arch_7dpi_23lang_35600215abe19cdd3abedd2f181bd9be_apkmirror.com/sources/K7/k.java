package K7;

import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v7.EnumC17520e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv7/e;", "", "a", "(Lv7/e;)Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17520e.values().length];
            try {
                iArr[EnumC17520e.f164590a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17520e.f164591b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17520e.f164592c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17520e.f164593d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17520e.f164594e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(EnumC17520e enumC17520e) {
        Intrinsics.j(enumC17520e, "<this>");
        int i10 = a.$EnumSwitchMapping$0[enumC17520e.ordinal()];
        if (i10 == 1) {
            return "wifi";
        }
        if (i10 == 2) {
            return "cell";
        }
        if (i10 == 3) {
            return "wired";
        }
        if (i10 == 4) {
            return zzbz.UNKNOWN_CONTENT_TYPE;
        }
        if (i10 == 5) {
            return "unavailable";
        }
        throw new NoWhenBranchMatchedException();
    }
}

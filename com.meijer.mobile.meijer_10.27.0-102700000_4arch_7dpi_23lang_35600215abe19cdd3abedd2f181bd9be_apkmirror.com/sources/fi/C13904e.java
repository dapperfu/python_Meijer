package fi;

import Fc.a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJI\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfi/e;", "", "<init>", "()V", "Lfi/f;", "ads", "", "c", "(Lfi/f;)Ljava/lang/String;", "gamAds", "pageType", "", "isGamEnabled", "LFc/a$a;", "builder", "shopperId", "", "adSlotPosition", "Lfi/d;", "a", "(Lfi/f;Ljava/lang/String;ZLFc/a$a;Ljava/lang/String;Ljava/lang/Integer;)Lfi/d;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fi.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13904e {

    /* renamed from: a, reason: collision with root package name */
    public static final C13904e f131155a = new C13904e();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fi.e$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC13905f.values().length];
            try {
                iArr[EnumC13905f.f131156d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13905f.f131157e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13905f.f131158f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13905f.f131159g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC13905f.f131160h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC13905f.f131161i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ GoogleAdData b(C13904e c13904e, EnumC13905f enumC13905f, String str, boolean z10, a.C0145a c0145a, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            c0145a = new a.C0145a();
        }
        a.C0145a c0145a2 = c0145a;
        if ((i10 & 32) != 0) {
            num = null;
        }
        return c13904e.a(enumC13905f, str, z11, c0145a2, str2, num);
    }

    private final String c(EnumC13905f ads) {
        switch (a.$EnumSwitchMapping$0[ads.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Medium Rectangle";
            case 4:
                return "Horizontal Leaderboard";
            case 5:
                return "";
            case 6:
                return "Fluid Ad";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final GoogleAdData a(EnumC13905f gamAds, String pageType, boolean isGamEnabled, a.C0145a builder, String shopperId, Integer adSlotPosition) {
        String str;
        Intrinsics.j(gamAds, "gamAds");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(builder, "builder");
        if (!isGamEnabled) {
            return null;
        }
        Fc.a aVarI = builder.g("pos", gamAds.getPlacementPosition()).h("lang", CollectionsKt.e("en")).g(PlaceTypes.STORE, "meijer-us").g("page_type", pageType).i();
        Intrinsics.i(aVarI, "build(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("/22908976526/");
        sb2.append(pageType);
        if (adSlotPosition != null) {
            str = String.format("/adSlot-%d", Arrays.copyOf(new Object[]{Integer.valueOf(adSlotPosition.intValue())}, 1));
            Intrinsics.i(str, "format(...)");
        } else {
            str = "";
        }
        sb2.append(str);
        String string = sb2.toString();
        return new GoogleAdData(aVarI, gamAds.getAdSize(), null, string, new GoogleAdAnalytics(c(gamAds), pageType, gamAds.getAdDisplaySize(), string, shopperId), 4, null);
    }

    private C13904e() {
    }
}

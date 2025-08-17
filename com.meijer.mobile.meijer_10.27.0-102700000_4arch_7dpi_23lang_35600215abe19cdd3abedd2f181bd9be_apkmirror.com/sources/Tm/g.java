package Tm;

import H1.v;
import H1.w;
import Ji.LocalThemeScope;
import Ji.T;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import com.meijer.mobile.meijer.activity.find.model.ChartDataType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "LH1/v;", "fontSize", "Landroidx/compose/ui/text/AnnotatedString;", "b", "(DJ)Landroidx/compose/ui/text/AnnotatedString;", "LJi/M;", "Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;", "chartType", "LJi/T;", "a", "(LJi/M;Lcom/meijer/mobile/meijer/activity/find/model/ChartDataType;)LJi/T;", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChartDataType.values().length];
            try {
                iArr[ChartDataType.MPERKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartDataType.COUPONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChartDataType.SPECIALS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChartDataType.TEAM_MEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChartDataType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final T a(LocalThemeScope localThemeScope, ChartDataType chartType) {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(chartType, "chartType");
        int i10 = a.$EnumSwitchMapping$0[chartType.ordinal()];
        if (i10 == 1) {
            return localThemeScope.getAdsColors().getAcresGradientBlueStart();
        }
        if (i10 == 2) {
            return localThemeScope.getAdsColors().getAdsColorBrandSecondary();
        }
        if (i10 == 3) {
            return localThemeScope.getAdsColors().getAdsColorBrandPrimary();
        }
        if (i10 == 4) {
            return localThemeScope.getAdsColors().getAdsColorsDisabled();
        }
        if (i10 == 5) {
            return localThemeScope.getAdsColors().getAdsColorPlaceholder();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AnnotatedString b(double d10, long j10) {
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g("$");
        List listA1 = StringsKt.a1(String.valueOf(d10), new String[]{"."}, false, 0, 6, null);
        String str = (String) listA1.get(0);
        String str2 = (String) listA1.get(1);
        bVar.g(str);
        float fC = F1.a.INSTANCE.c();
        w.b(j10);
        bVar.n(new SpanStyle(0L, w.k(v.f(j10), (float) (v.h(j10) * 0.66d)), null, null, null, null, null, 0L, F1.a.d(fC), null, null, 0L, null, null, null, null, 65277, null));
        bVar.g(StringsKt.J1(str2, 2));
        if (str2.length() == 1) {
            bVar.g("0");
        }
        return bVar.q();
    }
}

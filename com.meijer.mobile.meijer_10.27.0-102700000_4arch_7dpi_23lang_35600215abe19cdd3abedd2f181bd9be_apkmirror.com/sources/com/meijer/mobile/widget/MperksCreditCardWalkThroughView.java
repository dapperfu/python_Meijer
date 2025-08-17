package com.meijer.mobile.widget;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/widget/MperksCreditCardWalkThroughView;", "Lcom/meijer/mobile/widget/WalkThroughView;", "Lcom/meijer/mobile/core/design/widget/howTo/WalkthroughFragment$a;", "<init>", "()V", "", "n1", "", "url", "i0", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "textView", "G", "(Landroid/widget/TextView;)V", "q", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MperksCreditCardWalkThroughView extends WalkThroughView implements WalkthroughFragment.a {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f119515r = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/widget/MperksCreditCardWalkThroughView$a;", "", "<init>", "()V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "", "forceShow", "fromSectionWalkthrough", "cancelable", "canDismissViaBackground", "Lcom/meijer/mobile/widget/MperksCreditCardWalkThroughView;", "a", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZZZ)Lcom/meijer/mobile/widget/MperksCreditCardWalkThroughView;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.widget.MperksCreditCardWalkThroughView$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MperksCreditCardWalkThroughView a(WalkThroughType walkThroughType, boolean forceShow, boolean fromSectionWalkthrough, boolean cancelable, boolean canDismissViaBackground) {
            Intrinsics.j(walkThroughType, "walkThroughType");
            MperksCreditCardWalkThroughView mperksCreditCardWalkThroughView = new MperksCreditCardWalkThroughView();
            mperksCreditCardWalkThroughView.setArguments(WalkThroughView.INSTANCE.a(walkThroughType, forceShow, fromSectionWalkthrough, cancelable, canDismissViaBackground));
            return mperksCreditCardWalkThroughView;
        }
    }

    @Override // com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment.a
    public void G(TextView textView) {
        Intrinsics.j(textView, "textView");
    }

    @Override // com.meijer.mobile.core.design.widget.howTo.WalkthroughFragment.a
    public void i0(String url) {
        Intrinsics.j(url, "url");
        Cl.e meijerIntent = getMeijerIntent();
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        meijerIntent.d0(contextRequireContext, url);
    }

    @Override // com.meijer.mobile.widget.WalkThroughView
    protected void n1() throws Resources.NotFoundException {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.i(childFragmentManager, "getChildFragmentManager(...)");
        m1(new Cn.a(childFragmentManager, Sn.a.e()));
        O0().f22203E.setAdapter(Y0());
        O0().f22202D.setupWithViewPager(O0().f22203E);
    }
}

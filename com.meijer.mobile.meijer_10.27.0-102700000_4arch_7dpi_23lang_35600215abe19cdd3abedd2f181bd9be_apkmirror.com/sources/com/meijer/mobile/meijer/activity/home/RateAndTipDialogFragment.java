package com.meijer.mobile.meijer.activity.home;

import Ji.LocalThemeScope;
import Mn.AbstractC4238h1;
import ak.AbstractC5607a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment;
import com.meijer.mobile.meijer.activity.home.decorators.RateAndTipDialogDecorator;
import km.C15194s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ol.TipData;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;", "listener", "setListener", "(Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;)V", "Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "decorator", "Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "getDecorator", "()Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;", "setDecorator", "(Lcom/meijer/mobile/meijer/activity/home/decorators/RateAndTipDialogDecorator;)V", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;", "LMn/h1;", "binding", "LMn/h1;", "getBinding", "()LMn/h1;", "setBinding", "(LMn/h1;)V", "Companion", "Callback", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class RateAndTipDialogFragment extends MeijerDialogFragment {
    public static final String KEY_TIP_DATA = "keyTipData";
    public static final String TAG = "RateAndTipDialogFragment";
    public AbstractC4238h1 binding;
    public RateAndTipDialogDecorator decorator;
    private Callback listener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Callback;", "", "updateRateAndTipNotification", "", "orderId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "externalShopperId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "shouldNavigate", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void updateRateAndTipNotification(String orderId, String externalShopperId, boolean shouldNavigate);

        static /* synthetic */ void updateRateAndTipNotification$default(Callback callback, String str, String str2, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRateAndTipNotification");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            callback.updateRateAndTipNotification(str, str2, z10);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment$Companion;", "", "<init>", "()V", "Lol/a;", "tipData", "Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "newInstance", "(Lol/a;)Lcom/meijer/mobile/meijer/activity/home/RateAndTipDialogFragment;", "", "TAG", "Ljava/lang/String;", "KEY_TIP_DATA", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RateAndTipDialogFragment newInstance(TipData tipData) {
            Intrinsics.j(tipData, "tipData");
            RateAndTipDialogFragment rateAndTipDialogFragment = new RateAndTipDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(RateAndTipDialogFragment.KEY_TIP_DATA, tipData);
            rateAndTipDialogFragment.setArguments(bundle);
            return rateAndTipDialogFragment;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment$a$a, reason: collision with other inner class name */
        static final class C1665a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RateAndTipDialogFragment f109727a;

            C1665a(RateAndTipDialogFragment rateAndTipDialogFragment) {
                this.f109727a = rateAndTipDialogFragment;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(487611666, i10, -1, "com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment.onCreateView.<anonymous>.<anonymous> (RateAndTipDialogFragment.kt:59)");
                }
                AbstractC5607a shopperName = this.f109727a.getDecorator().getShopperName();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f109727a);
                final RateAndTipDialogFragment rateAndTipDialogFragment = this.f109727a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.c1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RateAndTipDialogFragment.a.C1665a.e(rateAndTipDialogFragment);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f109727a);
                final RateAndTipDialogFragment rateAndTipDialogFragment2 = this.f109727a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.d1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RateAndTipDialogFragment.a.C1665a.f(rateAndTipDialogFragment2);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(this.f109727a);
                final RateAndTipDialogFragment rateAndTipDialogFragment3 = this.f109727a;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.e1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RateAndTipDialogFragment.a.C1665a.g(rateAndTipDialogFragment3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C15194s.e(AdsTheme, shopperName, null, function0, function02, (Function0) objB3, composer, (i10 & 14) | LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(RateAndTipDialogFragment rateAndTipDialogFragment) {
                Callback callback = rateAndTipDialogFragment.listener;
                if (callback != null) {
                    callback.updateRateAndTipNotification(rateAndTipDialogFragment.getDecorator().getRateAndTipBuilder().getOrderId(), rateAndTipDialogFragment.getDecorator().getExternalShopperId(), true);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(RateAndTipDialogFragment rateAndTipDialogFragment) {
                Callback callback = rateAndTipDialogFragment.listener;
                if (callback != null) {
                    Callback.updateRateAndTipNotification$default(callback, rateAndTipDialogFragment.getDecorator().getRateAndTipBuilder().getOrderId(), rateAndTipDialogFragment.getDecorator().getExternalShopperId(), false, 4, null);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(RateAndTipDialogFragment rateAndTipDialogFragment) {
                Callback callback = rateAndTipDialogFragment.listener;
                if (callback != null) {
                    Callback.updateRateAndTipNotification$default(callback, rateAndTipDialogFragment.getDecorator().getRateAndTipBuilder().getOrderId(), rateAndTipDialogFragment.getDecorator().getExternalShopperId(), false, 4, null);
                }
                return Unit.f142422a;
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(237811009, i10, -1, "com.meijer.mobile.meijer.activity.home.RateAndTipDialogFragment.onCreateView.<anonymous> (RateAndTipDialogFragment.kt:58)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(487611666, true, new C1665a(RateAndTipDialogFragment.this), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public final AbstractC4238h1 getBinding() {
        AbstractC4238h1 abstractC4238h1 = this.binding;
        if (abstractC4238h1 != null) {
            return abstractC4238h1;
        }
        Intrinsics.y("binding");
        return null;
    }

    public final RateAndTipDialogDecorator getDecorator() {
        RateAndTipDialogDecorator rateAndTipDialogDecorator = this.decorator;
        if (rateAndTipDialogDecorator != null) {
            return rateAndTipDialogDecorator;
        }
        Intrinsics.y("decorator");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        setBinding(AbstractC4238h1.K0(inflater));
        getBinding().f20660z.setContent(ComposableLambdaKt.composableLambdaInstance(237811009, true, new a()));
        View root = getBinding().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    public final void setBinding(AbstractC4238h1 abstractC4238h1) {
        Intrinsics.j(abstractC4238h1, "<set-?>");
        this.binding = abstractC4238h1;
    }

    public final void setDecorator(RateAndTipDialogDecorator rateAndTipDialogDecorator) {
        Intrinsics.j(rateAndTipDialogDecorator, "<set-?>");
        this.decorator = rateAndTipDialogDecorator;
    }

    public final void setListener(Callback listener) {
        Intrinsics.j(listener, "listener");
        this.listener = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        setCancelable(false);
        setStyle(0, Bj.p.f3066j);
        Bundle arguments = getArguments();
        TipData tipData = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable(KEY_TIP_DATA, TipData.class);
            } else {
                ?? parcelable2 = arguments.getParcelable(KEY_TIP_DATA);
                if (parcelable2 instanceof TipData) {
                    tipData = parcelable2;
                }
                parcelable = tipData;
            }
            tipData = (TipData) parcelable;
        }
        if (tipData != null) {
            setDecorator(RateAndTipDialogDecorator.INSTANCE.decorate(tipData));
        }
    }
}
